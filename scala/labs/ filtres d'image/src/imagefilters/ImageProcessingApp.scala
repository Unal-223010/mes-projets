package imagefilters

import isc.graphics.ImageGraphics

object ImageProcessingApp extends App {

	val imageFile = "./res/collins_eileen.png"
	val org = new ImageGraphics(imageFile, "Original", -500, -250)
	val dest = new ImageGraphics(imageFile, "Duplicate", 0, -250)

    // Simple copy and display
	val newPixels = ImageFilters.duplicate(org.getPixelsBW())
	dest.setPixelsBW(newPixels)
}
