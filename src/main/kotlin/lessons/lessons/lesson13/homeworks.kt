package org.example.lessons.lessons.lesson13

fun main() {

}

//1
fun one(testTimes: Map<String, Double>): Double {
    if (testTimes.isEmpty()) return 0.0
    return testTimes.values.average()
}

//2
fun two(testMetadata: Map<String, String>) {
    testMetadata.keys.forEach { testMethod ->
        println(testMethod)
    }
}

//3
fun three(testResults: MutableMap<String, Boolean>, testName: String, result: Boolean) {
    testResults[testName] = result
}

//4
fun four(testResults: Map<String, String>): Int {
    return testResults.count { it.value == "passed" }
}

//5
fun five(bugTracker: MutableMap<String, String>, bugName: String) {
    bugTracker.remove(bugName)
}

//6
fun six(pageResults: Map<String, String>) {
    pageResults.forEach { (url, status) ->
        println("Страница: $url - Статус: $status")
    }
}

//7
fun seven(serviceResponseTimes: Map<String, Double>, threshold: Double): Map<String, Double> {
    return serviceResponseTimes.filter { it.value > threshold }
}

//8
fun eight(apiResults: Map<String, String>, endpoint: String): String {
    return apiResults[endpoint] ?: "не был протестирован"
}

//9
fun nine(config: Map<String, String>): String {
    return config.getValue("browserType")
}

//10
fun ten(originalVersions: Map<String, String>, newVersion: String, versionNumber: String): Map<String, String> {
    return originalVersions + (versionNumber to newVersion)
}

//11
fun eleven(deviceSettings: Map<String, String>, deviceModel: String, defaultSettings: String = "resolution=1080x1920,os=android,timeout=30"): String {
    return deviceSettings.getOrDefault(deviceModel, defaultSettings)
}

//12
fun twelve(errorDictionary: Map<String, String>, errorCode: String): Boolean {
    return errorCode in errorDictionary
}

//13
fun threeteen(testScenarios: Map<String, String>, targetVersion: String): Map<String, String> {
    return testScenarios.filter { (testId, _) ->
        testId.contains("_$targetVersion") || testId.endsWith("_$targetVersion")
    }
}

//14
fun fourteen(moduleResults: Map<String, String>): Boolean {
    return moduleResults.containsValue("Failed")
}

//15
fun fiveteen(mainSettings: MutableMap<String, Any>, additionalSettings: Map<String, Any>) {
    mainSettings.putAll(additionalSettings)
}

//16
fun sixteen(bugs1: Map<String, String>, bugs2: Map<String, String>): Map<String, String> {
    return bugs1 + bugs2
}

//17
fun seventeen(testRunData: MutableMap<String, Any>) {
    testRunData.clear()
}

//18
fun eighteen(testReport: Map<String, String>): Map<String, String> {
    return testReport.filter { (_, status) -> status != "skipped" }
}

//19
fun nineteen(originalConfig: Map<String, String>, keysToRemove: List<String>): Map<String, String> {
    return originalConfig - keysToRemove
}

//20
fun twenty(testResults: Map<String, String>): List<String> {
    return testResults.map { (testId, result) -> "Test ID: $testId - $result" }
}

//21
fun twentione(mutableResults: MutableMap<String, Any>): Map<String, Any> {
    return mutableResults.toMap()
}

//22
fun twentitwo(testData: Map<Int, Any>): Map<String, Any> {
    return testData.mapKeys { it.key.toString() }
}

//23
fun twentithree(performanceScores: Map<String, Double>): Map<String, Double> {
    return performanceScores.mapValues { it.value * 1.10 }
}

//24
fun twentifour(errorDictionary: Map<String, String>): Boolean {
    return errorDictionary.isEmpty()
}

//25
fun twentifive(loadTestResults: Map<String, Any>): Boolean {
    return loadTestResults.isNotEmpty()
}