fun main(args:Array<String>)
{
    println("Ingrese el sueldo del empleado:")
    val sueldo = readLine()!!.toDouble()
    if (sueldo > 3000)
    {
        println("debe pagar impuestos")
    }
    else
    {
        println("NO paga impuestos")
    }
}