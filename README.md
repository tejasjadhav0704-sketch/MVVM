# Android MVVM Architecture (Kotlin)

A beginner-friendly Android application demonstrating the **Model-View-ViewModel (MVVM)** architecture using Kotlin. This project showcases how to separate UI, business logic, and data management to build clean, maintainable, and scalable Android applications.

## Features

* MVVM Architecture
* ViewModel and LiveData
* RecyclerView for displaying data
* Repository Pattern
* View Binding
* Lifecycle-aware components
* Clean and organized project structure

## Technologies Used

* Kotlin
* Android Studio
* AndroidX
* ViewModel
* LiveData
* RecyclerView
* View Binding

## Project Structure

```text
app
│
├── Model
│   └── Data classes
│
├── Repository
│   └── Handles data source
│
├── ViewModel
│   └── Business logic & LiveData
│
├── View
│   ├── MainActivity
│   └── Adapter
│
└── res
    ├── layout
    └── drawable
```

## MVVM Flow

```text
User
   ↓
View (Activity/Fragment)
   ↓
ViewModel
   ↓
Repository
   ↓
Model (Data)
   ↑
Repository
   ↑
ViewModel
   ↑
LiveData
   ↑
View (UI Updates)
```

## Learning Outcomes

* Understanding MVVM Architecture
* Separating UI from business logic
* Using ViewModel to survive configuration changes
* Observing data with LiveData
* Implementing the Repository pattern
* Displaying dynamic data using RecyclerView
* Writing cleaner and more maintainable Android code

## Future Improvements

* Room Database
* Retrofit API Integration
* Coroutines
* Hilt Dependency Injection
* Navigation Component
* Paging 3
* Unit Testing

## 👨‍💻 Author

**Tejas Jadhav**

GitHub: https://github.com/tejasjadhav0704-sketch

---

## ⭐ Support

If you found this project useful, consider giving it a star on GitHub!
