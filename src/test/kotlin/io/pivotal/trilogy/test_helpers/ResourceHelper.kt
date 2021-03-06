package io.pivotal.trilogy.test_helpers

import java.net.URL

object ResourceHelper {
    fun getResourceUrl(path: String): URL {
        return ResourceHelper::class.java.getResource(path)
    }

    fun getResourceAsText(name: String): String {
        return ResourceHelper::class.java
                .getResourceAsStream(name)
                .reader().readText()
    }

    fun getTestCaseByName(name: String): String {
        return getResourceAsText("/testcases/$name.stt")
    }

    fun getTestByName(name: String): String {
        return getResourceAsText("/tests/$name.md")
    }

    fun getScriptByName(name: String): String {
        return getResourceAsText("/scripts/$name.sql")
    }

}