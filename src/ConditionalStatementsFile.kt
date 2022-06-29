fun main(args: Array<String>) {
    var age=18

    if (age<18){
        println("Go home")
    }else{
        println("Welcome to the party")
    }
//    GRADING SYSTEM
    var marks=64
    if (marks<40){
        println("E")
    }else if (marks<50){
         println("D")
    }else if (marks<60){
        println("C")
    }else if (marks<70){
        println("You have a grade B")
    }else{
        println("A")
    }
//    BETTING SYSTEM
    var bettingNumber=3
    when(bettingNumber){
        1->{
            println("ooops you lost")
        }
        2->{
          println("ooops you lost")
        }
        3->{
            println("you won!")
        }
        4->{
            println("ooops you lost")
        }
        else->{
             println("Enter a valid number")
        }
    }
}
