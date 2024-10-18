fun main(args:Array<String>) {
    //region Data types and Variables
    println("Hello World!")
    val num:Int=4;//immutable variable,used explicit type specification
    //num++ can not be reassigned
    var mynum:Int=5;//mutable variable
    mynum++
    println("Final num is $mynum")

    //Data types
    val a=346L; //long
    val b=34.6; //double
    val c=34.5F; //float
    val d="Hello"; //string

    //endregion
    //region Loops
    val name="Murad"
    for(i in 1..10){
        println(name)
    }
    for(j in 1 until 10) println(name)

    for(k in 1..10 step 2){
        println(name+" hi")
    }
    //endregion
}