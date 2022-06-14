fun main() {
    val minTransfer = 3500
    val amount = 12000
    val commission = 0.0075

    if (amount >= minTransfer) {
        val resultCommission = ((((amount / 100 * commission) * 100).toLong()) / 100.0)
        println("Result is commission: $resultCommission rub.")
    } else {
        println("[Error] Minimum transfer 35 rub.")
    }
}