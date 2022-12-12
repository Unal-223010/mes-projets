package isc.graphics

import java.awt._
import java.awt.image.BufferedImage
import java.io.{File, FileInputStream}
import javax.imageio.ImageIO
import javax.swing.{JFrame, JPanel}

/**
 * [ImageGraphics] helpers functions in companion object.
 */
object ImageGraphics {
	/**
	 * Converts a color array to a black-or-white array
	 *
	 * @param c The color array
	 * @return The array converted to BW
	 */
	def convertToGray(c: Array[Array[Color]]): Array[Array[Color]] = {
		val w = c.length
		val h = c(0).length
		val values = Array.ofDim[Color](w, h)

		// FIXME this is slow
		for (i <- 0 until w) {
			for (j <- 0 until h) {
				val col = c(i)(j)
				val intColor = (0.3 * col.getRed + 0.59 * col.getGreen + 0.11 * col.getBlue).toInt
				values(i)(j) = new Color(intColor, intColor, intColor)
			}
		}
		values
	}

	def convertToGrayInt(c: Array[Array[Color]]): Array[Array[Int]] = {
		val w = c.length
		val h = c(0).length
		val values = Array.ofDim[Int](w, h)
		for (i <- 0 until w) {
			for (j <- 0 until h) {
				val col = c(i)(j)
				val intColor = (0.3 * col.getRed + 0.59 * col.getGreen + 0.11 * col.getBlue).toInt
				values(i)(j) = intColor
			}
		}
		values
	}

	def main(args: Array[String]): Unit = {
		val imageUsed = "res/grace_hopper.jpg"
		val org = new ImageGraphics(imageUsed, "Original", 0, 0)
	}
}

/**
 * This class was made to deal with images as multidimensional arrays.
 * Mainly used in the <code>ImageProcessing</code> lab. It expects the images to reside in the <code>src</code> directory
 *
 * @author Pierre-André Mudry
 * @version 1.0
 * @constructor
 *
 * @param filePath        the path of the file, relative to the project. For instance, "./res/grace_hopper.jpg"
 * @param windowTitle     the title
 * @param xPositionOffset the x offset
 * @param yPositionOffset the y offet
 */
class ImageGraphics(val filePath: String, val windowTitle: String,
						  val xPositionOffset: Int, val yPositionOffset: Int) extends JFrame {

	private var imgBuffer: BufferedImage = null
	private var w = 0
	private var h = 0

	class ImgPanel extends JPanel {
		override def paint(g: Graphics): Unit = {
			super.paint(g)
			g.drawImage(imgBuffer, 0, 0, null)
			g.dispose()
		}
	}

	val imgPanel = new ImgPanel()

	try { // Fill the frame content with the image
		try {
			imgBuffer = ImageIO.read(new FileInputStream(new File(filePath)))
			w = imgBuffer.getWidth
			h = imgBuffer.getHeight
		} catch {
			case e: Exception =>
				println("Could not load directly, using classpath.")
		}

		// If the first technique failed, try using resource instead
		if (imgBuffer == null) {
			try {
				imgBuffer = ImageIO.read(classOf[ImageGraphics].getResource(filePath))
				w = imgBuffer.getWidth
				h = imgBuffer.getHeight
			} catch {
				case e: Exception =>
					System.err.println("Could not find image " + filePath + ", exiting !")
					e.printStackTrace()
					System.exit(-1)
			}
		}

		this.setResizable(false)
		this.setTitle(windowTitle)
		this.setLayout(new BorderLayout())
		this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE)

		imgPanel.setPreferredSize(new Dimension(imgBuffer.getWidth, imgBuffer.getHeight))
		this.add(imgPanel, BorderLayout.CENTER)
		this.pack()

		// Get the size of the screen
		val dim = Toolkit.getDefaultToolkit.getScreenSize

		// Determine the new location of the window
		val lw = this.getSize.width
		val lh = this.getSize.height
		val x = (dim.width - lw) / 2 + xPositionOffset
		val y = (dim.height - lh) / 2 + yPositionOffset

		// Move the window
		this.setLocation(x, y)
		this.setVisible(true)
	} catch {
		case e: Exception =>
			e.printStackTrace()
	}

	/**
	 * Sets a grayscale pixel, does not sets values for invalid pixels
	 * outside the screen. Does not repaint the screen either because it
	 * is slow.
	 *
	 * @param x
	 * @param y
	 * @param intensity
	 */
	def setPixelBW(x: Int, y: Int, intensity: Int): Unit = {
		if (!((x < 0) || (y < 0) || (x >= w) || (y >= h)))
			imgBuffer.setRGB(x, y, intensity << 16 | intensity << 8 | intensity)
	}

	/**
	 * Sets an array of grayscale pixels (from 0 to 255) and displays them
	 *
	 * @param pixels
	 */
	def setPixelsBW(pixels: Array[Array[Int]]): Unit = {
		try {
			if (pixels(0).length != h || pixels.length != w) throw new Exception("Invalid size of the pixel array !")
			for (i <- 0 until w) {
				for (j <- 0 until h) {
					val c = pixels(i)(j) << 16 | pixels(i)(j) << 8 | pixels(i)(j)
					imgBuffer.setRGB(i, j, c)
				}
			}
			this.repaint()
		} catch {
			case e: Exception =>
				e.printStackTrace()
		}
	}

	/**
	 * Sets an array of pixels of Color and displays them
	 *
	 * @param pixels
	 */
	def setPixelsColor(pixels: Array[Array[Color]]): Unit = {
		try {
			if (pixels(0).length != h || pixels.length != w) throw new Exception("Invalid size of the pixel array !")

			for (i <- 0 until w) {
				for (j <- 0 until h) {
					imgBuffer.setRGB(i, j, pixels(i)(j).getRGB)
				}
			}
			this.repaint()
		} catch {
			case e: Exception =>
				e.printStackTrace()
		}
	}

	/**
	 * Gets a single pixel from the background image and returns its
	 * grayscale value
	 *
	 * @param x the x coordinate
	 * @param y the y coordinate
	 * @return the pixel
	 */
	def getPixelBW(x: Int, y: Int): Int =
		if ((x < 0) || (y < 0) || (x >= w) || (y >= h)) {
			0
		}
		else {
			// Inside the image. Make the gray conversion and return the value
			val c = new Color(imgBuffer.getRGB(x, y))
			(0.3 * c.getRed + 0.59 * c.getGreen + 0.11 * c.getBlue).toInt
		}

	/**
	 * Gets the array of the pixels (which have been converted to grayscale
	 * if required)
	 *
	 * @return The arrays of gray pixels
	 */
	def getPixelsBW(): Array[Array[Int]] = {
		val values = Array.ofDim[Int](w, h)

		for (i <- 0 until w) {
			for (j <- 0 until h) {
				val c = new Color(imgBuffer.getRGB(i, j))
				values(i)(j) = (0.3 * c.getRed + 0.59 * c.getGreen + 0.11 * c.getBlue).toInt
			}
		}
		values
	}

	/**
	 * Gets the array of the pixels as Colors (see #Color)
	 *
	 * @return The arrays of pixels
	 */
	def getPixelsColor(): Array[Array[Color]] = {
		val values = Array.ofDim[Color](w, h)
		for (i <- 0 until w) {
			for (j <- 0 until h) {
				values(i)(j) = new Color(imgBuffer.getRGB(i, j))
			}
		}
		values
	}
}
