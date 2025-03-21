# Laws Of UX



## Overview



## Table of Contents

1. [Background](#Background)
2. [Architecture](#Architecture)
3. [Tests](#Tests)
4. [Screenshots](#Screenshots)
5. [Tools and Libraries](#Tools-and-Libraries)
6. [Trivia](#Trivia)
7. [Future](#Future)

## Background



## Architecture

- The app uses a Multi-Module Architecture based on the Model-View-ViewModel (MVVM) Architectural Pattern...
- The product is divided into the following modules:

### 1. :app

- This module contains the MainActivity, Manifest, and the Application class...

### 2. :commons

- This module has the Shared Components (UI) that are used by the other modules in the app...

### 3. :home

- This module represents the Home feature...

### 4. :merchandise

- This module will provide the Merchandise feature...

### 5. :settings

- This module represents the Settings feature...

### 6. :notifications

- This module represents the Notifications feature...

## Tests



## Screenshots

## Tools and Libraries

- This project has been developed and supported by the following Tools, Technologies, and Libraries:

### 1. Jetpack Compose

- The app's User Interface (UI) has been built using [Jetpack Compose](https://developer.android.com/compose) which is Google's Kotlin-first UI toolkit...
- The app also has other Compose-specific dependencies such as [Type-Safe Compose Navigation](https://developer.android.com/guide/navigation/design/type-safety) that provides a simple and type-safe way to enable Navigation in the app using Kotlin...

### 2. Firebase

- The app's backend is provided by [Firebase](https://firebase.google.com/docs/android/setup)...

### 3. MockK, Compose UI Test, and Kotlin Coroutines Test

- [MockK](https://mockk.io/) has been used to mock various dependencies that were required during the Unit Tests in an efficient and Kotlin-first manner...
- [Compose UI Test](https://developer.android.com/develop/ui/compose/testing) has been used to test the User Interfaces (UIs)...
- [Kotlin Coroutines Test](https://kotlinlang.org/api/kotlinx.coroutines/kotlinx-coroutines-test/) enables the testing of dependencies that involved Kotlin Coroutines...

### 4. Coil

- [Coil](https://coil-kt.github.io/coil/) has been used for Image Loading...

### 5. Koin

- [Koin](https://insert-koin.io) was used for Dependency Injection due to its simplicity and seamless integration with Kotlin...

### 6. KSP

- [Kotlin Symbol Processor (KSP)](https://kotlinlang.org/docs/ksp-overview.html) was used to handle the annotations used for example in the Room Entities with Performance as the priority...

### 7. Kotlin Serialisation Plugin

- [Kotlin Serialisation Plugin](https://github.com/Kotlin/kotlinx.serialization) was used to serialise and deserialise the Navigation routes...

### 8. LeakCanary

- To detect and fix Memory Leaks, the product utilises [LeakCanary](https://square.github.io/leakcanary/)...

### 9. AppSweep

- After the release variant is built and the app bundle generated and signed, it gets scanned by [AppSweep](https://www.guardsquare.com/appsweep-mobile-application-security-testing) to check for and patch up Security Vulnerabilities...

### 10. ktlint, detekt, and spotless

- [ktlint](https://github.com/JLLeitschuh/ktlint-gradle) and [spotless](https://github.com/diffplug/spotless) has been used to format the code...
- [detekt](https://detekt.dev/) has been used to perform Static Code Analysis...

### 11. Timber

- [Timber](https://github.com/JakeWharton/timber) has been used for logging...

### 12. Splash Screen

- [AndroidX Splash Screen](https://developer.android.com/develop/ui/views/launch/splash-screen) has been used to easily configure the Splash Screen...

### Trivia


### Future

