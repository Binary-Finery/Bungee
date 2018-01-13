# Bungee

[![Android Arsenal](https://img.shields.io/badge/Android%20Arsenal-Bungee-brightgreen.svg?style=flat)](https://android-arsenal.com/details/1/6625)
- min SDK 16 (Android Jellybean 4.1)
- written in Java

A lightweight, easy-to-use Android library that provides awesome activity transition animations.

To download the demo app for this library from Google Playstore so you can see it in action, [click here](https://play.google.com/store/apps/details?id=com.spencerstudios.bungeelibrarydemo)    
# Sample Demo   
![demo](image/Bungee.gif)


## Installation

Add this into your root build.gradle file:

```java
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Add the dependency to your module build.gradle:

```java
dependencies {
	        compile 'com.github.Binary-Finery:Bungee:master-SNAPSHOT'
	}
```

## Usage

Bungee has 9 different activity transition animations:

- slide left
- slide right
- slide up
- slide down
- zoom
- fade
- spin
- diagonal
- windmill

Using Bungee is extremely simple, A single short line of code following startActivity(...) is all that's needed, for example:

```java
startActivity(new Intent(context, TargetActivity.class));
Bungee.zoom(context);  //fire the zoom animation
```

Another example, this time firing the animation when the back button is pressed:

```java
@Override
public void onBackPressed(){
  super.onBackPressed();
  Bungee.slideLeft(context); //fire the slide left animation
}
```
All the available methods for this library:

```java
Bungee.slideLeft(context); 
Bungee.slideRight(context); 
Bungee.slideDown(context);
Bungee.slideUp(context);
Bungee.fade(context);
Bungee.zoom(context);
Bungee.windmill(context);
Bungee.diagonal(context);
Bungee.spin(context);
```

