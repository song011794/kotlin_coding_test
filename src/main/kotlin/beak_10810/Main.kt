package beak_10810

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

    val arr = IntArray(bucketCnt)

    repeat(count) {
        token = StringTokenizer(br.readLine())

        val firstBucket = token.nextToken().toInt()
        val lastBucket = token.nextToken().toInt()
        val ballNumber = token.nextToken().toInt()

       for(i:Int in firstBucket-1 until lastBucket)
           arr[i] = ballNumber
    }

    arr.map { bw.write("$it ") }

    bw.flush()
    bw.close()
}