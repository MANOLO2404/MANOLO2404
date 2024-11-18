fun main(args:Array<String>)
{
// suma y producto
    println("ingrese primer valor:")
    val valor1 = readLine()!!.toInt()
    println("ingrese segundo valor")
    val valor2 = readLine()!!.toInt()
    val suma = valor1 + valor2
    println("la suma de $valor1 y $valor2 es $suma")
    val producto = valor1 + valor2
    println("El producto de $valor1 y $valor2 es $producto")

}