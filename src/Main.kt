import java.util.Scanner

fun main(args:Array<String>) {
    //region Data types and Variables
//    println("Hello World!")
//    val num:Int=4;//immutable variable,used explicit type specification
//    //num++ can not be reassigned
//    var mynum:Int=5;//mutable variable
//    mynum++
//    println("Final num is $mynum")
//
//    //Data types
//    val a=346L; //long
//    val b=34.6; //double
//    val c=34.5F; //float
//    val d="Hello"; //string

    //endregion
    //region Loops
//    val name="Murad"
//    for(i in 1..10){
//        println(name)
//    }
//    for(j in 1 until 10) println(name)
//
//    for(k in 1..10 step 2){
//        println(name+" hi")
//    }
    //endregion
    //region Conditionals and Conditional Expressions
//    print("I print to the same line")
//    val name= readLine()
//    if(name=="Linus Torvalds"){
//        println("You invented Linux OS")
//    }
//    else{
//        println("You are just some regular guy")
//    }
//
//   val reader=Scanner(System.`in`)
//    val numb=reader.nextInt()
//    val result=if(numb>0) "Positive"
//    else if(numb<0) "Negative"
//    else "Zero"
//    println(result)
//
//    val num=reader.nextInt()
//    when(num%2==0){
//        true->println("Even number")
//        false->{
//            println("Odd number")
//            println("Two line example")
//        }
//        else-> println("Not included")
//    }

    //endregion
    //region Kotlin Type Conversion
    //we have also implicit,like converting byte to long
//    val num=16.00
//    val innum=num.toInt() //explicit
//    println(innum)
    //endregion
    //region Arrays
//    val nums= arrayOf(1,2,3)
//    val names= arrayOfNulls<String>(4)
//    names[0]="Murad"
//    for(name in names) println(name)
//    var result=if(1 in nums) println("Correct") else println("Not Correct")
//    println(result)
//    println(nums.joinToString())
//
//    val values=Array(5){i->(i*i).toString()}
//    values.forEach {
//        println(it)
//    }
//    val twodimension=Array(2){Array<Int>(3){0}}
//    println(twodimension.contentDeepToString())
    //endregion
    //region Nullable variable,self access operator and Elvis operator
//    val text:String?=null;
//    println(text?.length?:"It is null")
    //endregion
    //region Functions invoking
//    printInfo(name ="Hi Murad", age = 21)
//    println( getName("Murad"))
//    println(pow(5))
    //endregion
    //region Classes and data classes,interfaces,inheritance initialization
//    val person=Person()
//    val person1=Person(surname = "Mammadzada", name = "Murad", age = 21)
//    println("${person1.name} ${person1.surname} ${person1.age}")
//    println("${person.age}")
//    val data=PersonDto(1234)
//    println(data.number)
//    person1.run(data)
    //endregion
}
//region Functions Declaration
//fun getName(name:String):String{
//    return name
//}
//fun printInfo(age:Int=20,name:String="Murad"):Unit{
//    println("My name is $name,I am $age years old")
//}
//
//fun pow(num:Int):Int=num*num
//endregion
//region class Declaration
//primary constructor
//open class Person(val name:String,val surname:String,var age:Int):IPerson{
//    init{
//        println("Kotlin is not C#")
//    }
//    constructor():this("","",0){
//        //secondary constructor
//    }
//
//    override fun run(person: PersonDto) {
//       println("Person \n${person.surname} ${person.name}" +
//               " with ${person.age} age and ${person.number} number " +
//               "is running")
//    }
//}
//data class PersonDto(val number:Int):Person("Messi","Lionel",37)
//interface  IPerson{
//    fun run(person: PersonDto)
//}
//endregion