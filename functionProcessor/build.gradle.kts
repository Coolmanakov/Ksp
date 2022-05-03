plugins {
    kotlin("jvm")
}
dependencies {
//    implementation(kotlin("stdlib"))
    implementation ("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.squareup:kotlinpoet:1.8.0")
    implementation("com.google.devtools.ksp:symbol-processing-api:1.6.21-1.0.5")
}