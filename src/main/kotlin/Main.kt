import javax.security.auth.login.AccountException

fun main() {
    var char =character("Leila")
    println(char)
    println()



}
//Write and invoke one function that takes in a random string and returns the
//following values: first character, last character, length of the string and
//whether it begins with a vowel or not. (6pts)
fun character(name: String):String{
 var len=name.length
    return "len"
     fun str (name: String): Triple<Char, Char, Int> {
        val firstChar = name.first()
        val lastChar = name.last()
        val length = name.length
        val startsWithVowel = firstChar in setOf('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U')
         println(startsWithVowel)

        return Triple(firstChar, lastChar, length, )




//Create a function that takes in a password as a parameter. For a password to
//be valid it must meet the following conditions:
//1. Must be at least 8 characters long
//2. Must be at most 16 characters long
//3. Must not be “password”
//4. Must contain a digit
//Your function should determine whether the password provided is valid or not.
//The function returns true/false
fun pass(password:Boolean):Boolean {

    //}
//Create a function that prints out multiples of 6 and 8 between 1 and 1000. For
//multiples of both 6 and 8 it should print out “Bingo!”
    fun multiplication() {
        for (i in 1..1000) {
            when {
                i % 6 == 0 && i % 8 == 0 -> println("Bingo!")
                i % 6 == 0 -> println(i)
                i % 8 == 0 -> println(i)
            }
        }
    }


//Create a class CurrentAccount with the following attributes: account number,
//account name, balance. It has the following functions:
//a. deposit(amount: Double) - Increments the balance by the amount
//deposited
//b. withdraw(amount: Double) - Decrements the balance by the amount
//withdrawn
//c. details() - Prints out the account number and balance and name in
//this format: “Account number x with balance y is operated by z”

    class CurrentAccount(var accountNumber: Int, var accountName: String, var balance: Double) {


        fun deposit(amount: Double) {
            balance += amount
            println(balance)
        }

        fun withdraw(amount: Double) {
            balance -= amount
            println(balance)
        }

        fun details() {

            var x = accountNumber
            var y = balance
            var z = "Leila"
            println("AccountNumber $x with balance $y is operated by $z")
        }

}
//    Create another class SavingsAccount. It has the same functions and
//attributes as the current account except for one attribute, withdrawals: Int.
//Withdrawals is a counter variable that is used to keep track of how many
//withdrawals have been made from the account in a year. The only other
//difference is that the savings account withdraw() method first checks if the
//number of withdrawals is less than 4 for it to allow one to withdraw money
//from the account. It also increments the withdrawals attribute after a
//successful withdrawal
//class SavingAccount(var accountNumber:Int,var accountName:String,var balance:Double,var widhdrawal:Int)

//fun widhdrawal(){


//}







