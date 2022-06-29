fun main(args: Array<String>) {
//    while loop
    var countOne=0
    while (countOne<=5){
        println(countOne)
        countOne++
    }
    println("...............................")

//    Do while loop
    var countTwo=0
    do{
        println(countTwo)
        countTwo++
    }while (countTwo<=10)

    println("...............................")

//    Repeat loop
    repeat(5){
        println("Good Morning")
    }
      println("...............................")
//    For in loop
    var names= arrayOf("king","linet","shanky","Masetu")
                            //    names.sort()
                            //    names.sortDescending()
    for (jina in names){
        println(jina)
    }
    println("...............................")
    var ascendingnumbers=0..20
    for (nambari in ascendingnumbers ){
        println(nambari)
    }
    println("...............................")
    var descendingnumbers=20 downTo 0
    for (n in descendingnumbers ){
        println(n)
    }
}