fun main(args:Array<String>)
{
    //programa en el cual se ingresen cuatro numeros enteros, calcular e imprimir
    //la suma de los dos primeros y el producto del tercero  y el cuarto
    println("Ingrese primer valor:")
    val v1 = readln()!!.toInt()
    println("Ingrese segundo valor:")
    val v2 = readln()!!.toInt()
    println("Ingrese tercero valor:")
    val v3 = readln()!!.toInt()
    println("Ingrese cuarto valor:")
    val v4 = readln()!!.toInt()
    val suma = v1 +v2
    println("la suma de $v1 + $v2 es $suma")
    val producto = v3 * v4
    println("el producto de $v3 x $v4 es $producto")
}