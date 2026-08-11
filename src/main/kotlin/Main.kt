import java.nio.file.Path
import kotlin.io.path.*

val root = Path(".")
val problems = root / "problems"
val solutions = root / "src" / "main" / "kotlin" / "solutions"
val leetcodeTypes = root / "src" / "main" / "kotlin" / "leetcodeTypes"
val tests = root / "src" / "test" / "kotlin" / "solutions"

fun countFiles(directory: Path, pattern: String): Int {
    return directory.listDirectoryEntries(pattern).size
}

fun main() {
    val problemsCount       = countFiles(problems, "*.md")
    val solutionsCount      = countFiles(solutions, "*.kt")
    val leetcodeTypesCount  = countFiles(leetcodeTypes, "*.kt")
    val testsCount          = countFiles(tests, "*Test.kt")

    println()
    println("LeetCode Solutions in Kotlin/Java")
    println()
    println("Problems       : ${problems.toString().padEnd(31)} : $problemsCount")
    println("Solutions      : ${solutions.toString().padEnd(31)} : $solutionsCount")
    println("LeetCode Types : ${leetcodeTypes.toString().padEnd(31)} : $leetcodeTypesCount")
    println("Tests          : ${tests.toString().padEnd(31)} : $testsCount")
    println()
    println("Run all tests:")
    println("   ./gradlew test")
    println()
    println("Run a specific test:")
    println("   ./gradle test ?")
    println()
    println("Run a specific unit test:")
    println("   ./gradle test ?")
}