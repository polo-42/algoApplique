package algoapplique
import scala.collection.mutable.ArrayBuffer;

object TP2Solution{

    def getNthFibonacciNumber(nth: Int): Int  = {
        if (nth < 1){
            return -1
        }

        var fibonnaciNumber = ArrayBuffer(0,1,2);
        var currentNth = 4
        
        while (currentNth <= nth){
            fibonnaciNumber += fibonnaciNumber(currentNth-1-1) + fibonnaciNumber(currentNth-1-2)
            currentNth += 1
        }
        return fibonnaciNumber(nth - 1)
    } 

    def getNthFibonacciNumber2(nth: Int, currentNth: Int = 4 , fibonnaciNumber: ArrayBuffer[Int] = ArrayBuffer(0,1,2)): Int = {
        fibonnaciNumber += fibonnaciNumber(currentNth-1-1) + fibonnaciNumber(currentNth-1-2)
        if (currentNth >= nth){
            return fibonnaciNumber(nth-1)
        }
        return getNthFibonacciNumber2(nth, currentNth + 1, fibonnaciNumber)
    }
}