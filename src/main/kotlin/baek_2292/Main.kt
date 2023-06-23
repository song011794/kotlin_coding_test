package baek_2292

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val input = br.readLine().toInt()

    var cnt = 1
    var number = 1

    if (input == 1) {
        bw.write("$number\n")
    } else {
        while (true) {
            number += cnt * 6

            if (number >= input) {
                cnt++
                break
            }
            cnt++
        }

        bw.write("$cnt\n")
    }
    bw.flush()
    bw.close()
}