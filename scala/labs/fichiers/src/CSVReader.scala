import hevs.graphics.FunGraphics

import java.awt.{Color, Dimension, Point}
import java.io.{File, FileNotFoundException, IOException}

object CSVReader {

	def parseFile(in: String): Array[Line] = { // Line.scala file`daki Line class`i.
		// This vector hold the lines .Bu vektör çizgileri tutar
		var textLines: Array[String] = Array.empty[String]

		try {
			// Read the CSV File
			val buf = scala.io.Source.fromFile(in)
			textLines = buf.getLines().toArray
			buf.close()
		} catch {

			case e: FileNotFoundException =>
				System.err.println("Bad input file " + in + " !\n")
				e.printStackTrace()
				System.exit(-1)

			case e: IOException =>
				System.err.println("Error reading file " + " !\n")
				e.printStackTrace()
				System.exit(-1)
		}

		println(textLines.length + " shapes found in csv file.")
		val lines: Array[Line] = new Array[Line](textLines.length)

		// TODO: complete with your code here to fill the lines array
		for ((a, b) <- textLines.zipWithIndex) {
			val kk: Array[Int] = a.split(";").map(Integer.parseInt)
			lines(b) = new Line(
				new Point(kk(0), kk(1)),
				new Point(kk(2), kk(3)),
				new Color(kk(4), kk(5), kk(6))
			)
		}
		lines
	}

	/**
	 * Writes the lines to an SVG file !
	 *
	 * @param lines
	 */
	def writeSVG(lines: Array[Line]): Unit = {

		val SVG_FILENAME = "drawingTest.svg"

		/**
		 * Write the SVG File
		 */
		try {
			val svgWriter = new SVGWriter(new File(SVG_FILENAME))
			svgWriter.writeHeader(getDimensions(lines))
			svgWriter.writeLines(lines)
			svgWriter.close()

		} catch {
			case e: FileNotFoundException =>
				System.err.println("Bad output file " + SVG_FILENAME + " !\n")
				e.printStackTrace()
				System.exit(-1)
		}
	}

	/**
	 * Computes the required space on the screen for the given lines
	 *
	 * @param lines Different vector lines
	 * @return The space required to display that on screen
	 */
	def getDimensions(lines: Array[Line]): Dimension = {
		// The dimension of the image, used for SVG output & the view Frame. SVG çıktısı ve görünüm Çerçevesi için kullanılan görüntünün boyutu.
		val imgDim = new Dimension

		/**
		 * Compute the image dimension
		 */
		for (i <- lines.indices) {
			imgDim.height = Math.max(imgDim.height, lines(i).p2.x)
			imgDim.width = Math.max(imgDim.width, lines(i).p2.y)
		}

		imgDim.height += 50;
		imgDim.width += 50
		imgDim
	}

	/**
	 * Displays a vector of lines on a graphical window
	 *
	 * @param lines
	 */
	def displayLines(lines: Array[Line]): Unit = {

		// Compute the dimensions of the window
		val imgDim = getDimensions(lines)

		// The window to display our lines
		val display = new FunGraphics(imgDim.height, imgDim.width, "CSV File Drawing")

		/**
		 * Display the lines
		 */
		for (p <- lines) {
			display.setColor(p.color)
			display.drawLine(p.p1.x, p.p1.y, p.p2.x, p.p2.y)
		}
	}

	/**
	 * Entry point of the program
	 */
	def main(args: Array[String]): Unit = {
		val theLines = parseFile("res/drawingTest.csv")

		// Display what we read on the display
		displayLines(theLines)

		// Convert to SVG
		writeSVG(theLines)
	}
}
