# android-toast-utils

### Library for android [`Toast`](https://github.com/dasBikash84/android-toast-utils/blob/master/app/src/main/java/com/dasbikash/android_toast_utils/ToastUtils.kt)

[![](https://jitpack.io/v/dasBikash84/android-toast-utils.svg)](https://jitpack.io/#dasBikash84/android-toast-utils)

## Dependency

Add this in your root `build.gradle` file (**not** your module `build.gradle` file):

```gradle
allprojects {
	repositories {
        maven { url "https://jitpack.io" }
    }
}
```

Then, add the library to your module `build.gradle`
```gradle
dependencies {
    implementation 'com.github.dasBikash84:android-toast-utils:latest.release.here'
}
```

## Features
- Toast will always run on main thread no matter from which thread it is called.
- Extension functions provided for direct calling from `Activity` / `AppCompatActivity` / `Fragment` class body.
- If toast launched using `Activity` / `AppCompatActivity` / `Fragment` extension function, then it will be shown only if subject component is not destroyed.

## Usage Example

##### To display toast message from `Activity` / `AppCompatActivity` / `Fragment` class body
```
    //To show short toast of given message
    showShortToast(message)
	//or
    //To show short toast of given message string resource
    showShortToast(messageId)
	//or
    //To show long toast of given message
    showLongToast(message)
	//or
    //To show long toast of given message string resource
    showLongToast(messageId)
```


##### To display toast message from Any class
```
    //To show short toast of given message
    ToastUtils.showShortToast(context,message)
	//or    
    //To show short toast of given message string resource
    ToastUtils.showShortToast(context,messageId)
	//or    
    //To show long toast of given message
    ToastUtils.showLongToast(context,message)
	//or    
    //To show long toast of given message string resource
    ToastUtils.showLongToast(context,messageId)
```

##  License
--------

    Copyright 2020 Bikash Das(das.bikash.dev@gmail.com)

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
