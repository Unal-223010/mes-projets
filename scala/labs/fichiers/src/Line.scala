import java.awt.{Color, Point}

/**
 * This class stores the information corresponding to a line
 */
class Line(var p1: Point, var p2: Point, var color: Color) {
	override def toString: String = {
		return "Line from " + p1.x + "-" + p1.y + " to " + p2.x + "-" + p2.y
	}
}
