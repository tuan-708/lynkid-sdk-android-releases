# LynkIdSDK - Official Releases

Official distribution repository for LynkIdSDK Android library.

## 🚀 Quick Start

### Gradle Integration (Recommended)
```gradle
// Project-level build.gradle
allprojects {
    repositories {
       maven {
            url = uri("https://raw.githubusercontent.com/tuan-708/lynkid-sdk-releases/main/build/repo/")
            content {
                includeGroup("vn.lynkid")
            }
        }
    }
}

// App-level build.gradle
dependencies {
    implementation 'vn.lynkid:sdk:1.0.0'
}
```

## Manual Installation

- Download AAR from Releases
- Copy to app/libs/ folder
- Add to build.gradle:

```
dependencies {
    implementation files('libs/sdk-1.0.0.aar')
}
```

## Refresh dependencies

```
./gradlew build --refresh-dependencies
```