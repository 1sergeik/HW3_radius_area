import kotlin.math.*

fun main() {
    println("Enter the radius of the circle:")
    val radiusText_= readLine()
    val radiusText = radiusText_.toString()
    val radius: Float = radiusText.toFloat()
    println("The circle area is:")
    circleArea(radius)
    println("The circle perimeter is:")
    circlePerimeter(radius)
}
fun circleArea(radiusA:Float){
    val circleAreaA= PI*(radiusA.pow(2))
    println(circleAreaA)
}
fun circlePerimeter(radiusP:Float){
    val circlePerimeterP= 2*PI*radiusP
    println(circlePerimeterP)
}