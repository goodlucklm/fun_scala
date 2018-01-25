class BankAccount(initialBalance: Double) {
  private var balance = initialBalance

  def currentBalance = balance

  def deposit(amount: Double) = {
    balance += amount
    balance
  }

  def withdraw(amount: Double) = {
    balance -= amount
    balance
  }
}

class CheckingAccount(initialBalance: Double) extends BankAccount(initialBalance: Double) {
  private var balance = initialBalance

  override def deposit(amount: Double): Double = {
    balance += amount - 1
    balance
  }

  override def withdraw(amount: Double): Double = {
    balance -= amount - 1
    balance
  }

  override def currentBalance: Double = balance
}

class SavingAccount(initialBalance: Double) extends BankAccount(initialBalance: Double) {
  private var balance = initialBalance
  private var numOfFreeTransactions = 3

  def earnMonthlyInterest(): Double = {
    numOfFreeTransactions = 3
    val interest = balance * 0.1
    balance += interest
    interest
  }

  override def deposit(amount: Double): Double = {
    balance += amount
    if (numOfFreeTransactions == 0)
      balance -= 1
    else
      numOfFreeTransactions -= 1
    balance
  }

  override def withdraw(amount: Double): Double = {
    balance -= amount
    if (numOfFreeTransactions == 0)
      balance -= 1
    else
      numOfFreeTransactions -= 1
    balance
  }

  override def currentBalance: Double = balance
}

object cool extends App {
  val ca = new CheckingAccount(98.98)
  println(ca.deposit(76))
  println(ca.currentBalance)
}