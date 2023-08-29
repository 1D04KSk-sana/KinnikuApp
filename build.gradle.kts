// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.1.0" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false

    //serialization
    id("org.jetbrains.kotlin.plugin.serialization") version "1.8.10" apply false
    
    //FireStore
    id("com.google.gms.google-services") version "4.3.15" apply false
}