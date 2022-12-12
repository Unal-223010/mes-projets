package livefilter

import com.github.sarxos.webcam.WebcamPanel.DrawMode
import com.github.sarxos.webcam.{Webcam, WebcamImageTransformer, WebcamPanel, WebcamResolution}

import java.awt.image.BufferedImage
import java.awt.{Color, Dimension}
import java.io.{File, FileInputStream}
import javax.imageio.ImageIO
import javax.swing.JFrame

object LiveFilter {
	def main(args: Array[String]): Unit = {
		new LiveFilter()
	}
}

/**
 * A live filter class using VGA resolution
 */
class LiveFilter extends WebcamImageTransformer {
	val size: Dimension = WebcamResolution.VGA.getSize

	val MASK: String = "./res/mask640x480.png"
	val videoMask: Array[Array[Int]] = toBW(ImageIO.read(new FileInputStream(new File(MASK))))

	// Gets default webcam and sets image transformer to this (transformer will modify
	// image after it's been received from webcam, in this case it will rotate it)
	val webcam: Webcam = Webcam.getDefault

	//val webcam: Webcam = Webcam.getWebcamByName("/dev/video2")

	webcam.setViewSize(size)
	println(size)
	webcam.setImageTransformer(this)
	webcam.open

	// Create a window
	val window = new JFrame("Test filter")

	// Creates a panel to put the webcam image in it
	val panel = new WebcamPanel(webcam)
	panel.setFPSDisplayed(true)
	panel.setDrawMode(DrawMode.FIT)

	// Add panel to window
	window.add(panel)
	window.pack()
	window.setVisible(true)

	window.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE)

	def toBW(img: BufferedImage): Array[Array[Int]] = {
		val o = Array.ofDim[Int](img.getWidth(), img.getHeight())
		for (x <- o.indices) {
			for (y <- o(0).indices) {
				val c = new Color(img.getRGB(x, y))
				o(x)(y) = (0.3 * c.getRed + 0.59 * c.getGreen + 0.11 * c.getBlue).toInt
			}
		}
		o
	}

	def toArray(image: BufferedImage): Array[Array[Color]] = {
		val out = Array.ofDim[Color](image.getWidth, image.getHeight)

		for (x <- out.indices; y <- out(0).indices) {
			out(x)(y) = new Color(image.getRGB(x, y))
		}

		out
	}

	private def updateImage(in: Array[Array[Color]], out: BufferedImage): Unit = {
		for (x <- in.indices; y <- in(0).indices) {
			out.setRGB(x, y, in(x)(y).getRGB)
		}
	}

	/**
	 * Applies the various filters to the buffer
	 *
	 * @param image The input image
	 * @return The filtered image
	 */
	override def transform(image: BufferedImage): BufferedImage = {
		val img: Array[Array[Color]] = toArray(image)

		// TODO Complete here by changing the assignment with your filters
		val filtered: Array[Array[Color]] = img

		updateImage(filtered, image)
		return image
	}
}