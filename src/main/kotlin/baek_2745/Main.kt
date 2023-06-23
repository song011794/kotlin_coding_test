package baek_2745

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer
import kotlin.math.pow


fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val token = StringTokenizer(br.readLine())

    val digit = token.nextToken().toCharArray()
    val number = token.nextToken().toInt()

    digit.reverse()

    var result = 0.0

    for(i in digit.indices) {
        result += if (number > 10 && digit[i].code >= 65) {
            (digit[i].code - 55) * (number.toDouble().pow(i))
        }else{
            digit[i].digitToInt() *(number.toDouble().pow(i))
        }
    }

    bw.write("${result.toInt()}")

    bw.flush()
    bw.close()
}