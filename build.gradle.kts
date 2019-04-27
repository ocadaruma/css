plugins {
    java

    application
}

repositories {
    jcenter()
}

dependencies {
    testImplementation("junit:junit:4.12")
}

application {
    mainClassName = "com.mayreh.css.App"
}
