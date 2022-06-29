package oop

fun main(args: Array<String>) {
    var fisrtschool= School()
    fisrtschool.motto()
    println(fisrtschool.motto())
}

interface FisrtInterface {
    var age:Int
    fun login():String
    fun motto(){
        println("Hello, this is our motto")
    }
}

class School():FisrtInterface{
    override var age: Int=100
    override fun login(): String {
        val loginstatement="Yeah,i can log in"
        return loginstatement
    }

}