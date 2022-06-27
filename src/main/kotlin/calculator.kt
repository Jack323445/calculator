import java.util.*

fun main(args : Array<String>) {
    val reader =Scanner(System.`in`)
    print("Enter first number:")
    var num1= reader.nextDouble()
    println("First number:"+num1)
    print("Enter second number:")
    var num2= reader.nextDouble()
    println("Second number:"+num2)
    print("Enter an operator('+','/','-','*'):")
    var optr= reader.next()[0]
    //var function= readLine()

    /*
    when(optr){'+'-> (ans)= num1 + num2}
    when(optr) {'/'-> (ans) = num1 / num2 }
    when(optr){'-'-> (ans)= num1 - num2}
    when(optr){'*'->(ans)= num1 * num2}
*/

    val ans: Double
    when (optr){
        '+'-> ans=num1+num2
        '-'-> ans=num1-num2
        '*'-> ans=num1*num2
        '/'-> ans=num1/num2

        else ->{
            System.out.printf("Error. Enter an operator!")
            return
        }
    }
    System.out.printf("%.1f %c %.1f=%.1f",num1, optr, num2, ans)
}