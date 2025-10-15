# 🧩 CMPAutocompleteSearchBox  
> A clean, customizable **Jetpack Compose Multiplatform** search box with auto-complete suggestions.

[![Maven Central](https://img.shields.io/maven-central/v/network.chaintech/cmp-autocomplete-search-box.svg)](https://central.sonatype.com/artifact/network.chaintech/cmpautocompletesearchbox)
[![Kotlin](https://img.shields.io/badge/kotlin-v2.2.0-blue.svg?logo=kotlin)](http://kotlinlang.org)
[![Compose Multiplatform](https://img.shields.io/badge/Compose%20Multiplatform-v1.8.2-blue)](https://github.com/JetBrains/compose-multiplatform)
[![License](https://img.shields.io/github/license/Chaintech-Network/CMP-autocomplete-search-box)](http://www.apache.org/licenses/LICENSE-2.0)

![badge-android](http://img.shields.io/badge/platform-android-3DDC84.svg?style=flat)
![badge-ios](http://img.shields.io/badge/platform-ios-FF375F.svg?style=flat)


<p align="center">
  <img src="assets/CMP_autocomplete_search_box.gif" alt="ComposeAutocompleteSearchBox" width="960"/>
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
  <img src="/assets/preview.gif" alt="SearchBox Screenshot" width="250"/>
</p>


## 🧩 Components Overview

| Component | Description |
|------------|-------------|
| `SearchBox` | Main composable function |
| `SearchBoxColors` | Color customization class |
| `SearchBoxSizes` | Size customization class |
| `SearchBoxIcons` | Icon customization class |

---
## 📖 Detailed Explanation

For an in-depth guide and detailed explanation, check out our comprehensive Medium Blog Post.

[![Medium](https://img.shields.io/badge/Medium-12100E?style=for-the-badge&logo=medium&logoColor=white)](https://medium.com/mobile-innovation-network/cmpautocompletesearchbox-38c74215b22a)

## 🧑‍💻 Author

**Chaintech Network**  

Stay connected and keep up with our latest innovations! 💼 Let's innovate together!

[![GitHub](https://img.shields.io/badge/GitHub-Chaintech--Network-black?logo=github)](https://github.com/Chaintech-Network)  
[![LinkedIn](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/showcase/mobile-innovation-network)
[![Medium](https://img.shields.io/badge/Medium-12100E?style=for-the-badge&logo=medium&logoColor=white)](https://medium.com/mobile-innovation-network)

<br>

## 🌟 Support

If you find this library useful:  
⭐ **Star** the repo → it helps others discover it!  
💬 Open an issue or PR if you’d like to contribute.

## 📄 License

```
Copyright 2025 Mobile Innovation Network

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

   http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

