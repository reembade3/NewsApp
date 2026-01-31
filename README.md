# NewsApp
Android News App built with Kotlin using MVVM architecture, Retrofit, Room Database, and Coroutines.

A simple **Android News App** built using **Kotlin** and **XML**.  
This project is designed for **learning Android development** and practicing **clean architecture** using **MVVM**.

---

## Project Goal

The main goal of this project is to practice:
- How to build a real Android app
- How to fetch data from an API
- How to save data locally
- How to structure the app using MVVM

---

## App Screens

1️⃣ **Headlines Screen**
- Shows the latest news from an API

2️⃣ **Search Screen**
- Search news articles by keyword

3️⃣ **Favorites Screen**
- Save favorite articles locally using Room Database

---

## Features

- Fetch news from a remote API
- Search for news articles
- Save & delete favorite articles
- Offline access for saved news
- Clean and simple UI
- Beginner-friendly code structure

---

## 🛠 Tech Stack (Simple Explanation)

- **Kotlin**  
  → Programming language used for the app

- **XML**  
  → Used to design the UI layouts

- **MVVM Architecture**  
  → Helps organize the code and separate responsibilities

- **Retrofit**  
  → Used to make network requests and fetch news from API

- **Room Database**  
  → Used to save favorite articles locally

- **Kotlin Coroutines**  
  → Used for background tasks (network & database operations)

- **ViewModel & LiveData**  
  → Used to manage UI-related data safely

---

## Architecture Overview (MVVM)

- **Model**
  - Data classes
  - API responses
  - Room entities

- **View**
  - Activities / Fragments
  - XML layout files

- **ViewModel**
  - Handles business logic
  - Calls repository
  - Exposes LiveData to UI

- **Repository**
  - Single source of data
  - Decides whether data comes from API or Room DB

##  Project Structure

│
├── adapters
│ └── NewsAdapter
│
├── api
│ ├── NewsAPI
│ └── RetrofitInstance
│
├── db
│ ├── ArticleDAO
│ ├── ArticleDatabase
│ └── Converter
│
├── models
│ ├── Article
│ ├── NewsResponse
│ └── Source
│
├── repository
│ └── NewsRepository
│
├── ui
│ ├── fragments
│ │ ├── ArticleFragment
│ │ ├── FavouriteFragment
│ │ ├── HeadlinesFragment
│ │ └── SearchFragment
│ │
│ ├── NewsActivity
│ ├── NewsViewModel
│ └── NewsViewModelProviderFactory
│
└── util
├── Constants
└── Resource



