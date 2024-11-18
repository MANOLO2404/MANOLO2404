//muestra el > de 3 numeros
fun main(args:Array<String>)
{
    println("ingrese primer valor:")
    val num1= readLine()!!.toInt()
    println("ingrese segundo valor")
    val num2 = readLine()!!.toInt()
    println("ingrese tercer valor")
    val num3 = readLine()!!.toInt()
    if (num1 > num2 && num1 > num3)
        println(num1)
    else
        if (num2 > num3)
            println(num2)
        else
            println(num3);
}