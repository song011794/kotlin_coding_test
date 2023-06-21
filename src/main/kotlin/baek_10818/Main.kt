package baek_10818

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    val count = br.readLine().toInt()
    val arr = IntArray(count)

    val token = StringTokenizer(br.readLine())

    repeat(count) {
        arr[it] = token.nextToken().toInt()
    }

    bw.write("${arr.min()} ${arr.max()}")

    bw.flush()
    bw.close()
}