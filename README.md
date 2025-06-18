# LynkIdSDK - Official Releases

![Version](https://img.shields.io/github/v/release/yourusername/your-sdk-releases)
![Downloads](https://img.shields.io/github/downloads/yourusername/your-sdk-releases/total)
![License](https://img.shields.io/github/license/yourusername/your-sdk-releases)

Official distribution repository for LynkIdSDK Android library.

## 🚀 Quick Start

### Gradle Integration (Recommended)
```gradle
// Project-level build.gradle
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}

// App-level build.gradle
dependencies {
    implementation 'com.github.tuan-708:lynkid-sdk-releases:v1.0.0'
}
```

## Manual Installation

- Download AAR from Releases
- Copy to app/libs/ folder
- Add to build.gradle:

```
dependencies {
    implementation files('libs/sdk-v1.0.0-release.aar')
}
```