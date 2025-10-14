package network.chaintech.cmp_autocomplete_search_box_demo

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import cmp_autocomplete_search_box.composeapp.generated.resources.Res
import cmp_autocomplete_search_box.composeapp.generated.resources.banner_img
import org.jetbrains.compose.ui.tooling.preview.Preview
import network.chaintech.autocompletesearchbox.Helper.HexColor
import network.chaintech.autocompletesearchbox.Model.*
import network.chaintech.autocompletesearchbox.ui.SearchBox
import org.jetbrains.compose.resources.painterResource

@Composable
@Preview
fun App() {
    MaterialTheme {
        val searchText1 = remember { mutableStateOf(TextFieldValue("")) }
        val searchText2 = remember { mutableStateOf(TextFieldValue("")) }
        val searchText3 = remember { mutableStateOf(TextFieldValue("")) }
        val items = listOf("Kotlin", "Compose", "Android")

        Column(modifier = Modifier
            .background(HexColor.fromHex("#FCFEE1"))
            .padding(top = 50.dp)
            .safeContentPadding()
            .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(0.dp)
        ) {


    Image(
        painter = painterResource(Res.drawable.banner_img),
        contentDescription = null,
        modifier = Modifier
            .height(118.dp)
            .fillMaxSize(),
        contentScale = ContentScale.Crop
    )

            Text("CMP Library",
                fontFamily = FontFamily.Default,
                fontSize = 30.sp,
                fontWeight = FontWeight.SemiBold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(bottom = 13.dp)
            )

            Text("Try to search anything, it will shows auto suggestions",
                fontFamily = FontFamily.Default,
                fontSize = 18.sp,
                fontWeight = FontWeight.Normal,
                color = Color.Gray,
                modifier = Modifier
                    .padding(bottom = 13.dp)
            )

            Column(
                verticalArrangement = Arrangement.spacedBy(40.dp)
            ) {
                SearchBox(
                    suggestions = items,
                    searchText = searchText1,
                    sizes = SearchBoxSizes(
                        cornerRadius = 10.dp
                    ),
                    colors = SearchBoxColors(
                        borderColor = HexColor.fromHex("#A8C0FF"),
                        suggestionBoxBGColor = HexColor.fromHex("#DCE5FF")
                    )
                )

                SearchBox(
                    suggestions = items,
                    searchText = searchText2,
                    colors = SearchBoxColors(
                        borderColor = HexColor.fromHex("#DAC7F9"),
                        suggestionBoxBGColor = HexColor.fromHex("#C9A9FF"),
                        suggestionBoxTintColor = Color.White,
                        suggestionBoxTextColor = Color.White,
                        suggestionBoxSecondaryTextColor = Color.White
                    )
                )

                SearchBox(
                    suggestions = items,
                    searchText = searchText3,
                    colors = SearchBoxColors
                        (
                        backgroundColor = HexColor.fromHex("#EAECCA"),
                        borderColor = HexColor.fromHex("#E0E3A7"),
                        suggestionBoxBGColor = HexColor.fromHex("#CED576"),
                        suggestionBoxTintColor = Color.White,
                        suggestionBoxTextColor = Color.White,
                        suggestionBoxSecondaryTextColor = Color.White
                    )
                )
            }


        }
    }
}