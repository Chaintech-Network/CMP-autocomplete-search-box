# 🧩 CMPAutocompleteSearchBox  
> A clean, customizable **Jetpack Compose Multiplatform** search box with auto-complete suggestions.

<p align="center">
  <img src="https://img.shields.io/badge/Compose-Multiplatform-blue?logo=jetpackcompose&logoColor=white" />
  <img src="https://img.shields.io/badge/Android-UI-green?logo=android&logoColor=white" />
  <img src="https://img.shields.io/badge/iOS-UI-silver?logo=apple&logoColor=white" />
  <img src="https://img.shields.io/badge/Version-1.0.0-orange" />
</p>

<p align="center">
  <img src="assets/CMP_autocomplete_search_box.png" alt="ComposeAutocompleteSearchBox" width="800"/>
</p>

---



## ✨ Features

✅ Customizable design (colors, icons, fonts, and sizes)  
✅ Smart auto-suggestion logic (`startsWith`)  
✅ Integrated clear and search icons  
✅ Keyboard “Done” handling included  
✅ Compose Multiplatform support (Android, Desktop, Web coming soon)

---

## 📦 Installation

Add the dependency to your **Gradle** module:

```kotlin
dependencies {
    implementation("network.chaintech:cmp-autocomplete-search-box:1.0.0")
}
```


---

## 🚀 Quick Start

```kotlin
@Composable
fun MyScreen() {
    val searchText =  remember { mutableStateOf(TextFieldValue("")) }
    val suggestions = listOf("Kotlin", "Compose", "Android")

    SearchBox(
        searchText = searchText,
        suggestions = suggestions,
        onSearchTextChanged = {
            // Optional: trigger filtering logic here
        },
        onItemSelected = {
            // Handle selection (e.g., search or filter results)
        }
    )
}
```

---

## 🎨 Customization

### 🎨 Colors

Use `SearchBoxColors` to customize all color properties:

```kotlin
val customColors = SearchBoxColors(
    textColor = Color.Black,
    placeholderColor = Color.Gray,
    cursorColor = Color.DarkGray,
    backgroundColor = Color.White,
    borderColor = Color.LightGray,
    suggestionBoxBGColor = Color(0xFFEFEFEF)
)
```

### 📏 Sizes

Control the height, border, and spacing via `SearchBoxSizes`:

```kotlin
val customSizes = SearchBoxSizes(
    height = 56.dp,
    borderWidth = 1.5.dp,
    cornerRadius = 20.dp,
    horizontalPadding = 16.dp
)
```

### 🖼️ Icons

Provide your own composables for the icons using `SearchBoxIcons`:

```kotlin
val customIcons = SearchBoxIcons(
    searchIcon = { modifier ->
        Icon(Icons.Default.Search, contentDescription = "Search", modifier = modifier)
    },
    clearIcon = { modifier ->
        Icon(Icons.Default.Close, contentDescription = "Clear", modifier = modifier)
    }
)
```

Usage:

```kotlin
SearchBox(
    searchText = searchText,
    suggestions = suggestions,
    colors = customColors,
    sizes = customSizes,
    icons = customIcons
)
```

---

## ⚙️ Parameters Reference

| Name | Type | Description |
|------|------|-------------|
| `searchText` | `MutableState<String>` | Current text entered in the box |
| `suggestions` | `List<String>` | Suggestion list used for autocomplete |
| `onSearchTextChanged` | `() -> Unit` | Triggered whenever text changes |
| `onItemSelected` | `() -> Unit` | Called when a suggestion is selected |
| `placeholder` | `String` | Placeholder text for the field |
| `suggestionPlaceholder` | `String` | Placeholder text shown beside suggestion |
| `fontFamily` | `FontFamily` | Font for text and placeholders |
| `colors` | `SearchBoxColors` | Defines all UI colors |
| `sizes` | `SearchBoxSizes` | Controls layout spacing and dimensions |
| `icons` | `SearchBoxIcons` | Provides composables for search/clear icons |

---

## 🧠 Preview Example

```kotlin
@Preview
@Composable
fun SearchBoxPreview() {
    val searchState =  remember { mutableStateOf(TextFieldValue("")) }
    val sampleSuggestions = listOf("Kotlin", "Compose", "Android")

    SearchBox(
        searchText = searchState,
        suggestions = sampleSuggestions,
        placeholder = "Search topics..."
    )
}
```
<p align="center">
   <h3 align="center">Expected Output</h3>
  <p align="center">
  <img src="/assets/preview.png" alt="SearchBox Screenshot" width="200"/>
</p>


## 🧩 Components Overview

| Component | Description |
|------------|-------------|
| `SearchBox` | Main composable function |
| `SearchBoxColors` | Color customization class |
| `SearchBoxSizes` | Size customization class |
| `SearchBoxIcons` | Icon customization class |

---

## 🧑‍💻 Author

**Chaintech Network**  
[![GitHub](https://img.shields.io/badge/GitHub-Chaintech--Network-black?logo=github)](https://github.com/Chaintech-Network)  
[![LinkedIn](https://img.shields.io/badge/LinkedIn-Connect-blue?logo=linkedin)](https://www.linkedin.com/showcase/mobile-innovation-network)  
[![Medium](https://img.shields.io/badge/medium-Follow-blue?logo=medium)](https://medium.com/mobile-innovation-network)


## 🌟 Support

If you find this library useful:  
⭐ **Star** the repo → it helps others discover it!  
💬 Open an issue or PR if you’d like to contribute.
