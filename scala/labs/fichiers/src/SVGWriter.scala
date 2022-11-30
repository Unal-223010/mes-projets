import java.awt.Dimension
import java.io.{BufferedOutputStream, File, FileOutputStream, PrintStream}

/**
 * This class writes SVG files with proper header and footers
 */
class SVGWriter(val svgFile: File) {
	val svgOut = new PrintStream(new BufferedOutputStream(new FileOutputStream(svgFile)))

	/**
	 * Writes the SVG header to the file
	 *
	 * @param imgDim Dimension of the image
	 */
	def writeHeader(imgDim: Dimension): Unit = {
		// Print XML Header
		svgOut.println("<?xml version=\"1.0\" standalone=\"no\"?>")
		svgOut.println("<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.1//EN\" \"http://www.w3.org/Graphics/SVG/1.1/DTD/svg11.dtd\">")
		svgOut.print("<svg width=\"")
		svgOut.print(imgDim.height)
		svgOut.print("\" height=\"")
		svgOut.print(imgDim.width)
		svgOut.println("\" version=\"1.1\" xmlns=\"http://www.w3.org/2000/svg\">")
	}

	/**
	 * Writes the footer, flushes the data and close the file
	 */
	def close(): Unit = {

		// Print XML Footer
		svgOut.println("</svg>")
		if (svgOut != null) {
			svgOut.flush()
			svgOut.close()
		}
	}

	/**
	 * Write the shapes contained in the dynamic list in the SVG file.
	 *
	 * @param lines A lines of shapes to be drawn
	 */
	def writeLines(lines: Array[Line]): Unit = {

		// TODO: Complete the code hereunder
	}
}
