## Example
![Error](https://github.com/SudoAjay/LoadingAnimation-Android/blob/master/LoadingAnimation-Example/src/main/res/drawable/loadinganimation.gif)
      
### To get a Git project into your build

#### Step 1. Add the JitPack repository to your build file

Add it in your root build.gradle at the end of repositories:

```Java
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
#### Step 2. Add the dependency


```Java
dependencies {
	 	implementation 'com.github.SudoAjay:LoadingAnimation-Android:v3.1'

	}
```

### After Adding dependencies

#### Add Xml to Layout

```XML
 <com.sudoajay.lodinganimation.LoadingAnimation
        android:id="@+id/loadingAnimation"
        android:layout_width="0dp"
        android:layout_height="0dp"/>
```

If you want to modify or want some changes in loadingAnimation . So follow below properties to do it.
### Xml
```XML
 	app:la_set_alpha="700"
        app:la_set_color="@android:color/black"
        app:la_set_reduce_alpha="18"
        app:la_set_angle_point="0"
        app:la_set_main_radius="80"
        app:la_set_other_radius="20"
        app:la_set_reduce_other_radius="1"
```

### Java

```Java
        final LoadingAnimation loadingAnimation = findViewById(R.id.loadingAnimation);
        loadingAnimation.setColor(Color.BLACK); // default Black
        loadingAnimation.setAlpha(700); // default 700
        loadingAnimation.setReduceAlpha(18); // default 18
        loadingAnimation.setAnglePoint(0); // default 0 
        loadingAnimation.setMainRadius(80);  // default 80
        loadingAnimation.setOtherRadius(20); // default 20
        loadingAnimation.setReduceOtherRadius(1); // default 1
	loadingAnimation.setTiming(1000); // 1 sec
```
### LICENCE
LoadingAnimation by Sudo Ajay v3.1 

