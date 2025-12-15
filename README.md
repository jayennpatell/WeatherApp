# 🌦️ Weather App GUI

A minimal Java-based Weather Application that fetches real-time weather data from an external API and displays it using a graphical user interface (GUI).

---

## Overview

The Weather App allows users to enter a location and view:
- Temperature
- Weather condition
- Humidity
- Wind speed

It demonstrates how Java applications interact with APIs and parse JSON data.

---

## Technologies Used

- Java 18  
- HTTPURLConnection  
- JSON Simple (1.1.1)  
- Java Swing (GUI)

---

## Project Structure

- **AppLauncher** – Application entry point  
- **WeatherAppGui** – Handles the GUI and user interaction  
- **WeatherApp** – Backend logic, API calls, and JSON parsing  

---

## What I Learned

- Making API calls using HTTP GET requests  
- Handling HTTP response codes  
- Parsing JSON data using JSON Simple  
- Working with HTTPURLConnection in Java  
- Compiling Java with external libraries  
- Using `-Xlint:deprecation` to handle deprecated APIs  


## Compile & Run

### Download JSON Simple
```bash
curl -L -o json-simple-1.1.1.jar \
https://repo1.maven.org/maven2/com/googlecode/json-simple/json-simple/1.1.1/json-simple-1.1.1.jar


javac -cp .:json-simple-1.1.1.jar WeatherAppBackend.java App.java WeatherApp.java


java -cp .:json-simple-1.1.1.jar App
