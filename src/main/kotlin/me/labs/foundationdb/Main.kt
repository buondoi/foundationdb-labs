package me.labs.foundationdb

import com.apple.foundationdb.FDB
import com.apple.foundationdb.tuple.Tuple


/**
 * Created on 5/11/18.
 */

fun main(args: Array<String>) {

    val fdb = FDB.selectAPIVersion(510)

    fdb.open().use { db ->
        // Run an operation on the database
        db.run<Any> { tr ->
            tr.set(Tuple.from("hello").pack(), Tuple.from("world").pack())
            null
        }

        // Get the value of 'hello' from the database
        val hello = db.run { tr ->
            val result = tr.get(Tuple.from("hello").pack()).join()
            Tuple.fromBytes(result).getString(0)
        }

        println("Hello $hello")
    }
}


