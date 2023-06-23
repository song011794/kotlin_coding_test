package baec_1316

import java.io.BufferedReader
import java.io.BufferedWriter
import java.io.InputStreamReader
import java.io.OutputStreamWriter

fun main() {
    val br = BufferedReader(InputStreamReader(System.`in`))
    val bw = BufferedWriter(OutputStreamWriter(System.out))

    var cnt = 0

    repeat(br.readLine().toInt()){
        val input = br.readLine().toCharArray()

        var isGroup = false
        val sameIndexList = mutableListOf<Int>()

        for (k in input.indices) {
            for (j in k + 1 until input.size) {
                if (input[k] == input[j]) {
                    sameIndexList.add(j)
                }
            }
        }

        if (sameIndexList.size == 0) {
            isGroup = true
        } else {
            for (listValue in sameIndexList) {
                if (input[listValue] != input[listValue-1]) {
                    isGroup = false
                    break
                }
                else {
                    isGroup = true
                }
            }
        }

        if (isGroup)
            cnt++

    }

    bw.write("$cnt\n")

    bw.flush()
    bw.close()
}

