fun main(args: Array<String>) {
    motto()
    userverification(username = "Brian",email = "bk@gmail.com")
    average(2.0,10,20.0f)
    println(addition(30,30.0))
    login("king")
    login("king","jk")

}
fun motto(){
    println("Hello, this is our motto")
}

fun userverification(username:String,email:String){
    println("hello $username  you email is $email")

}
fun average(x:Double, y:Int,z:Float){
    var result=(x+y+z)/3
    println("your average is $result")
}
fun addition(x:Int,y:Double):Double{
    var answer= x+y
    return answer
}
//Function overloadin
//1.
fun login(name:String){
    println("Hello ur name is $name")
}
//2.
fun login(email:String,password:String){
    println("Hello ur email is $email and pw is $password")
}

