class Account (private var AccountNumber:Int, private var Balance:Float):Transaction{


    private var accountBalance:Float = Balance
    private var accountNumber:Int = AccountNumber
    private var freeTransaction = 0
    private var transactionFee:Int = 0


//    fun deposit(amount:Int) {
//        var amount = amount
//        val fl = amount + this.balance()
//        this.balance = { fl }
//    }


    fun  setAccountNumber(number:Int){
        this.AccountNumber = number
    }

    fun  getAccountNumber():Int{
        return AccountNumber
    }

    fun setBalance(balance:Float){
    if (balance <= 0f){
        this.accountBalance = balance
        }
    }

   var balance = fun ():Float{
        return accountBalance
    }


}