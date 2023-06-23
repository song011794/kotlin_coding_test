package baek_2720

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    repeat(br.readLine().toInt()) {
        val money = br.readLine().toInt()

        val quarter = money/25
        val dime = (money%25) / 10
        val nickel = ((money%25) % 10) /5
        val penny = (((money%25) % 10) %5) /1

        bw.write("$quarter $dime $nickel $penny\n")
    }

    bw.flush()
    bw.close()
}