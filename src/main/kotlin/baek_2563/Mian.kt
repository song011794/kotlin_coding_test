package baek_2563

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val count = br.readLine().toInt()

    val arr = Array(100) { IntArray(100) }

    var result = 0

    repeat(count) {
        val token = StringTokenizer(br.readLine())

        val x = token.nextToken().toInt()
        val y = token.nextToken().toInt()

        for (i in 0 until 10) {
            for (j in 0 until 10) {
                if (++arr[x - 1 + i][y - 1 + j] == 1)
                    result++

            }
        }
    }

    bw.write("$result")

    bw.flush()
    bw.close()
}