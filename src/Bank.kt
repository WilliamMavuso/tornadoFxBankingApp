import AccountTypes.EasySavings as EasySavings

fun main(){
    var account = Account(1, 5000f)
//    var balance = account.getBalance()
//    account.deposit(1000)

//    println(balance)
//    println(account.id())
    println(account.balance())

    account.eposit(900)

    println(account.balance())


    account.eposit(900)

    println(account.balance())
}