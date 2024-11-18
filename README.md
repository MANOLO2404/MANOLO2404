fun main(args:Array<String>)
{
    println("Ingrese el precio del producto:")
    val precio = readLine()!!.toDouble()
    println("Ingrese la cantidad de producto:")
    val cantidad = readLine()!!.toInt()
    val total = precio * cantidad
    println("El total a pagar es $total")

}
