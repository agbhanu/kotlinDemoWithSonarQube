public fun main(args:Array<String>){
    var helloWorld=HelloWorld()
    println(helloWorld.sumOfTwoNum(2,4))
}

class HelloWorld{
    public fun sumOfTwoNum(a:Int,b:Int):Int{
        return a+b
    }
}