![issues](https://img.shields.io/github/issues/mbpatel6245/cdp)
![Forks](https://img.shields.io/github/forks/mbpatel6245/cdp)
![Stars](https://img.shields.io/github/stars/mbpatel6245/cdp)
[![](https://jitpack.io/v/mbpatel6245/cdp.svg)](https://jitpack.io/#mbpatel6245/cdp)
![License](https://img.shields.io/github/license/mbpatel6245/cdp)

# cdp - A Composable Scalable Size Unit
An android lib that provides a new size unit - cdp (compose dp). This size unit scales with the screen size for Jetpack Compose Structure. It can help Android developers with supporting multiple screens for Compose structure.

for text views please refer to [csp](https://github.com/mbpatel6245/csp) which is based on the sp size unit for texts.

# Attention
Use it carefully! for example, in most cases you still need to design a different layout for tablets.

# Example
Here is a single layout built using **cdp**:

![cdp example](https://github.com/mbpatel6245/cdp/blob/master/cdp_example.png)

And Here is the same layout built using **dp**:

![dp example](https://github.com/mbpatel6245/cdp/blob/master/dp_example.png)

You can see that cdp scales with the screen size and the dp stays with the same size on all screen sizes.

# Getting Started
To add cdp to your project (Using Android Studio and Gradle):

**Step 1.** Add it in your root build.gradle at the end of repositories:
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```

**Step 2.** Add the dependency
```
dependencies {
    implementation 'com.github.mbpatel6245:cdp:ReleaseVersion'
}
```

**Step 3.** Provide type to your composable theme
```
ProvideDimens(dimensions = getDimensType()) {
    MaterialTheme(
        ...
    )
}
```
**Step 4.** Use on Widget
```
Spacer(modifier = Modifier.height(CDP.dimens._15cdp))
```

# Note
The cdp size unit calculation includes some approximation due to some performance and usability constraints.