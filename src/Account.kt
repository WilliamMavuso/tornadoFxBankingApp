
open class Account(private var AccountNumber: Int, private var Balance:Float):Transactions {

    private var accountBalance:Float = Balance
    private var accountNumber: Int = AccountNumber
    private var freeTransaction = 0
    private var transactionFee:Int = 0

    override fun deposit(amount: Int) {
        val newBalance = amount + this.balance()
        this.balance = { newBalance }
    }

    override fun withdraw(amount: Int) {
        val newBalance = amount - this.balance()
        this.balance = { newBalance }
    }

  private  fun  setAccountNumber(number:Int){
        this.AccountNumber = number
    }

    var AccNumber = fun () : Int {
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