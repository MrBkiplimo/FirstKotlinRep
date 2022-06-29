package oop

fun main(args: Array<String>) {
    var fisrtAdmin=Admin("Brian",90000.00,"b@gmail.com")
    fisrtAdmin.registeruser()
    println(fisrtAdmin.name)
    fisrtAdmin.setIdnumber("123456")
    println(fisrtAdmin.getIdnumber())
}


class Admin {
    //    These are the user properties
    var name:String
    var Salary:Double
    var email:String
    private  var phoneNumber:String=""
     private  var Idnumber:String=""
    //    This is the constructor
    constructor(name: String,Salary:Double,email: String){
        this.name=name
        this.Salary=Salary
        this.email=email
    }
    //    These are the functionalities
    fun registeruser(){
        println("I can register")
    }
    fun suspendEmployee(){
        println("Yeah, I can suspend an employee")
    }
//    encapsulation
//    1.phonenumber
    fun setphonenumber(phoneNumber:String){
        this.phoneNumber=phoneNumber
    }
    fun getphonenumber():String{
         return this.phoneNumber

    }
    //    2.Idnumber
    fun setIdnumber(Idnumber:String){
        this.Idnumber=Idnumber
    }
    fun getIdnumber():String{
         return this.Idnumber

    }


}