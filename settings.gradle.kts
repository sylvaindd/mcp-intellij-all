plugins {
    // Lets Gradle locate/provision JVM toolchains. The JDK 21 already under ~/.jdks is
    // auto-detected; the resolver is the fallback if a toolchain isn't found locally.
    // 1.0.0 (was 0.9.0): 0.9.0 still referenced JvmVendorSpec.IBM_SEMERU, which Gradle 9 removed —
    // the wrapper here is Gradle 9.3.0, so settings evaluation died with NoSuchFieldError.
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

rootProject.name = "mcp-intellij-all"
