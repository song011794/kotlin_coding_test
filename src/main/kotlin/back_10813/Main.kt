package back_10813


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

    for(i :Int in arr.indices){
        arr[i] = i
    }

    var copyArr = arr.copyOf()

    repeat(count) {
        token = StringTokenizer(br.readLine())

        val firstBucket = token.nextToken().toInt()
        val secondBucket = token.nextToken().toInt()

        arr[firstBucket-1] = copyArr[secondBucket-1]
        arr[secondBucket-1] = copyArr[firstBucket-1]

        copyArr = arr.copyOf()
    }

    arr.map { bw.write("${it+1} ") }

    bw.flush()
    bw.close()
}