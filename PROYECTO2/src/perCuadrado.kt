fun main(args:Array<String>)
{
    println("Ingrese la medida del lado del cuadrado:")
    val lado = readLine()!!.toInt()
    val perimetro = lado * 4
    println("el perimetro del cuadrado es $perimetro")
}