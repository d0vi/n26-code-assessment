plugins {
    kotlin("jvm") version "2.0.20"
    application
}

repositories {
    mavenCentral()
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useKotlinTest("2.0.20")
        }
    }
}

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(22)
    }
}
