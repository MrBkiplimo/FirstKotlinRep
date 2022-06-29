fun main(args: Array<String>) {
//    /If statement
    var marks=110
    var results=if  (marks<50){
        "E"
    }else if (marks<60){
        "D"
    }else if (marks<70){
        "C"
    }else if (marks<80){
        "B"
    }else{
        "A"
    }
    println(results)
//    When statement
    var bettingnumber:Int=3
     var bettingResult=when(bettingnumber){
         1->{
           "oops you lost"
         }
         2->{
             "ooops you lost"
         }
         3->{
            "Hurray! you won!"
         }
         4->{
             "ooops you lost"
         }
         else->{
             "Enter a valid number"
         }
     }
    println(bettingResult)

}