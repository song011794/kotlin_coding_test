package baek_2562

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val arr = IntArray(9)

    repeat(9) {
        arr[it] = br.readLine().toInt()
    }

    var maxValue = 0
    var maxCount = 0

    arr.mapIndexed() { index, it ->
        if (it > maxValue) {
            maxValue = it
            maxCount = index +1
        }

    }

    bw.write("${maxValue}\n")
    bw.write("${maxCount}\n")

    bw.flush()
    bw.close()
}