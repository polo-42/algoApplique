package algoapplique
object TP1Solution{

    def isPrimary(number: Int): Boolean = {
        for (div <- 2 until number){
            if (number % div == 0){
                return false
            }
        }
        return true
    }

    def getFirstPrimaryNumbers(numberOfPrimaryNumbers: Int): Array[Int] = {
        val primaryNumbers = Array.fill(numberOfPrimaryNumbers){ -1 }
        var currentNumber = 2
        var index = 0

        while (index < numberOfPrimaryNumbers){
            if (isPrimary(currentNumber)){
                primaryNumbers(index) = currentNumber
                index += 1
            }
            currentNumber += 1
        }

        return primaryNumbers
    }

    def getFirstTwinPrimes(numberOfTwins: Int): Array[Array[Int]] = {
        val twins: Array[Array[Int]] = Array.fill(numberOfTwins){ null }
        var index = 0
        var currentNumber = 2
        while (index < numberOfTwins){
            if (isPrimary(currentNumber) && isPrimary((currentNumber+2))){
                twins(index) = Array(currentNumber,currentNumber+2)
                index += 1
            }
            currentNumber += 1
        }
        return twins
    }
        
}