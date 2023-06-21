package beak_1546


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

    val maxScore = arr.max()

    val sumScore = arr.fold(0.0) { total, value ->
        total + ((value / maxScore.toDouble()) * 100)
    }

    bw.write("${sumScore/count.toDouble()}\n")

    bw.flush()
    bw.close()
}