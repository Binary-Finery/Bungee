# Bungee

[![](https://jitpack.io/v/Binary-Finery/Bungee.svg)](https://jitpack.io/#Binary-Finery/Bungee)

- mid SDK 16 (Android Jellybean 4.1)
- written in Java

A lightweight, easy-to-use Android library that makes awesome activity transition animations super simple.

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
	        compile 'com.github.Binary-Finery:Bungee:1.0'
	}
```

## Usage

Bungee has 6 different activity transition animations:

- slide left
- slide right
- slide up
- slide down
- zoom
- fade

Using Bungee is extremely simple, A single short line of code following startActivity(...) is all that's needed, for example:

```java
startActivity(new Intent(context, TargetActivity.class));
Bungee.zoom(context);  //fires the zoom animation
```

Another example, this time firing the animation when the back button is pressed:

```java
@Override
public void onBackPressed(){
  super.onBackPressed();
  Bungee.slideLeft(context); //fire the slide left animation
}
```

