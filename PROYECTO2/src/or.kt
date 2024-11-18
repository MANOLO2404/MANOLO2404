//determina el trimestre
fun main(args:Array<String>)
{
    println("ingrese dia:")
    val dia = readLine()!!.toInt()
    println("ingresa mes:")
    val mes = readLine()!!.toInt()
    println("ingresa año:")
    val año = readLine()!!.toInt()
    if (mes == 1 || mes == 2 || mes == 3)
        println("corresponde al primer trimestre")
}