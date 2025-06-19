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
       maven {
            url = uri("https://raw.githubusercontent.com/tuan-708/lynkid-sdk-releases/main/build/repo/")
            content {
                includeGroup("vn.linkid")
            }
        }
    }
}

// App-level build.gradle
dependencies {
    implementation 'vn.linkid:sdk:1.0.0'
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