AppiumDemo
==========
## Testing Mobile App using Appium

## Objective
 Intent of this project is to illustrate how **Appium** can be used to test mobile application **Android** 

## Tech stacks

- [`Appium`](http://appium.io)
- JAVA
- MAVEN as Build tool
## What app can perfrom
1. Launch App
2. Verify splash screen
3. Swipe


## 2.0 Setup
### Dev Setup 
* Download Android Studio(https://developer.android.com/studio/index.html)<br />
* How to set environment variable https://stackoverflow.com/questions/28296237/set-android-home-environment-variable-in-mac/28296325
- /Users/trishachetani/Library/Android/sdk
- Android Setup via command line 
``` 
#!/bin/bash
npm install -g appium
path=$($HOME)
echo $path
cd $path
mkdir appiumAndroidSetup
cd appiumAndroidSetup
echo "Downloading Android SDK ...."
curl -O 'https://dl.google.com/android/repository/sdk-tools-darwin-3859397.zip'
mkdir android
mv sdk-tools-darwin-*.zip android/
cd android
unzip sdk-tools-darwin-*.zip
echo "Accepting Android SDK licenses"
yes Yes | tools/bin/sdkmanager --licenses
echo "updating the Android sdk manager"
yes Yes | tools/bin/sdkmanager --update
echo "Downloading other tools ..."
tools/bin/sdkmanager "platforms;android-25" "build-tools;25.0.2" "extras;google;m2repository" "extras;android;m2repository"
rm sdk-tools-darwin-*.zip
echo "Set below path as ANDROID_HOME"
pwd
````
- references : [https://github.com/tech-tock-tech/AppiumSetup/blob/master/android_appium_setup.sh]
-  IOS setup via command line 
````
#!/bin/bash
echo "$1" | sudo -S chown -R `whoami` /usr/local
npm install -g appium
npm install -g authorize-ios
echo "$1" | sudo -S authorize-ios
echo "$1" | sudo -S xcode-select -s /Applications/Xcode.app/Contents/Developer
npm install -g ios-deploy
echo "$1" | gem install xcpretty
brew install carthage
brew install libimobiledevice --HEAD
brew upgrade libimobiledevice --HEAD
brew install ideviceinstaller
brew upgrade ideviceinstaller
brew install ios-webkit-debug-proxy
brew upgrade ios-webkit-debug-proxy
echo "$1" | sudo -S chmod +x /var/db/lockdown
cd /usr/local/lib/node_modules/appium/node_modules/appium-xcuitest-driver/WebDriverAgent/
mkdir -p Resources/WebDriverAgent.bundle
./Scripts/bootstrap.sh -d
open WebDriverAgent.xcodeproj

````

- Install appium via command line.
````npm install -g Appium````

- Check devices connected 
```adb devices ```



###  RUN 

- Notes : Change the capabilities present in AndroidSetUp.java as per the your needs (For emulator/real devices)

* How to run the app on emulator - Run the AppiumTest.java classFile
* How to run your app on real device - Run the AppiumTest.java classfile

#### Video of Running Test

https://www.dropbox.com/s/0drwssyk6umkgde/WhatsApp%20Video%202018-04-12%20at%205.46.22%20PM.mp4?dl=0

### Find Locators
- [http://toolsqa.com/mobile-automation/appium/how-to-inspect-and-automate-webview-in-hybrid-app/]










 






