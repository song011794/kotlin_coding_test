package baek_10811

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter
import java.util.StringTokenizer

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var token = StringTokenizer(br.readLine())
    val bucketCnt = token.nextToken().toInt()
    val count = token.nextToken().toInt()

    val arr = Array(bucketCnt){i->i +1}


    repeat(count) {
        token = StringTokenizer(br.readLine())

        val startRange = token.nextToken().toInt()
        val endRange = token.nextToken().toInt()

        val tempSize = endRange - startRange
        val tempArr = IntArray(tempSize+1)

        for((j, i) in (endRange downTo startRange).withIndex()){
            tempArr[j] = arr[i-1]
        }

        for((j, i) in (startRange-1 until endRange).withIndex()){
            arr[i] =tempArr[j]
        }

    }

    arr.map { bw.write("$it ") }

    bw.flush()
    bw.close()
}