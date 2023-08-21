import com.vanniktech.maven.publish.MavenPublishBaseExtension
import com.vanniktech.maven.publish.SonatypeHost
import de.jensklingenberg.ktorfit.gradle.KtorfitGradleConfiguration

plugins {
//    alias(libs.plugins.dokka)
    alias(libs.plugins.kotlin.multiplatform)
    alias(libs.plugins.kotlin.serialization)
    alias(libs.plugins.ksp)
    alias(libs.plugins.ktorfit)
    alias(libs.plugins.publish)
}

configure<KtorfitGradleConfiguration> {
    enabled = true
    version = libs.versions.ktorfit.asProvider().get()
}

ksp {
    arg("Ktorfit_Errors", "1")
}

kotlin {
    jvm()
}

extensions.configure(MavenPublishBaseExtension::class.java) {
    publishToMavenCentral(SonatypeHost.S01, automaticRelease = true)
    signAllPublications()
}

dependencies {
    commonMainApi(libs.ktorfit.lib)
    commonMainImplementation(libs.ktor.content.negotiation)
    commonMainImplementation(libs.ktor.serialization.kotlinx.json)
    commonMainImplementation(libs.kotlinx.datetime)
    kspCommonMainMetadata(libs.ktorfit.ksp)
    add("kspJvm", libs.ktorfit.ksp)

    commonTestImplementation(libs.kotest.assertions.core)
    commonTestImplementation(libs.kotest.runner.junit5)
    commonTestImplementation(libs.okio)
}

tasks.named<Test>("jvmTest") {
    useJUnitPlatform()
}
