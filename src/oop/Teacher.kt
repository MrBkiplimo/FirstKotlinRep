package oop

fun main(args: Array<String>) {
  var fisrtStudent=Teacher("Brian",100)
    fisrtStudent.vieweresults()

  var fisrtBoardmember=Boardmember("Linnet",100)
    fisrtBoardmember.publishMagazine()
}

open class Teacher(open var  name:String, open var age:Int) {
    fun vieweresults(){

        println("Hello $name, you can view results.")

    }
    fun publishMagazine(){

        println("Hello $name,you are $age years old and you can publish a magazine.")

    }
}
//class student
open class Student(name: String,age: Int):Teacher(name,age){
    fun sitForExams(){
        println("Hello,I can sit for exams")
    }
}
//class Boardmember
class Boardmember(name: String,age: Int):Teacher(name,age){

}
