package baek_3052

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val resultSet = mutableSetOf<Int>()

    repeat(10) {
        resultSet.add(br.readLine().toInt() % 42)
    }

    bw.write("${resultSet.size}")

    bw.flush()
    bw.close()
}