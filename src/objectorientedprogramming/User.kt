package objectorientedprogramming

fun main(args: Array<String>) {
    var firstuser=User("Brian","e@gmail","123","123")
    firstuser.register()
    firstuser.login()




    var seconduser= User("Brian","e@gmail","123","123")

    seconduser.login()

}


class User {
//    These are the user properties
    var name:String
    var email:String
    var password:String
    var Confirmedpassword:String

//    This is the constructor
    constructor(name:String, email:String, password:String, Confirmedpassword:String){
                this.name=name
                this.email=email
                this.password=password
                this.Confirmedpassword=Confirmedpassword
    }
//    These are the functionalities
    fun register(){
        if(!password.equals(Confirmedpassword)){
            println("Passwords dont match")
        }else{
            println("User registered successfully")
        }


    }
    fun login(){
        if (email.equals("e@gmail") && password.equals("123")){
            println("Log in successful")
        }else{
            println("Login failed")
        }
    }
}
