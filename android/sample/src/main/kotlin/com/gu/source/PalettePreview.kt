package com.gu.source

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.luminance
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.gu.source.presets.palette.*
import com.gu.source.presets.typography.HeadlineBold20
import com.gu.source.presets.typography.TextSans14
import com.gu.source.presets.typography.TextSansBold14

private data class Colour(
    val name: String,
    val colour: Color,
)

private val colours = mapOf(
    "Brand" to listOf(
        Colour("Brand100", Source.Palette.Brand100),
        Colour("Brand300", Source.Palette.Brand300),
        Colour("Brand400", Source.Palette.Brand400),
        Colour("Brand500", Source.Palette.Brand500),
        Colour("Brand600", Source.Palette.Brand600),
        Colour("Brand800", Source.Palette.Brand800),
    ),
    "BrandAlt" to listOf(
        Colour("BrandAlt200", Source.Palette.BrandAlt200),
        Colour("BrandAlt300", Source.Palette.BrandAlt300),
        Colour("BrandAlt400", Source.Palette.BrandAlt400),
    ),
    "Neutral" to listOf(
        Colour("Neutral0", Source.Palette.Neutral0),
        Colour("Neutral7", Source.Palette.Neutral7),
        Colour("Neutral10", Source.Palette.Neutral10),
        Colour("Neutral20", Source.Palette.Neutral20),
        Colour("Neutral38", Source.Palette.Neutral38),
        Colour("Neutral46", Source.Palette.Neutral46),
        Colour("Neutral60", Source.Palette.Neutral60),
        Colour("Neutral73", Source.Palette.Neutral73),
        Colour("Neutral86", Source.Palette.Neutral86),
        Colour("Neutral93", Source.Palette.Neutral93),
        Colour("Neutral97", Source.Palette.Neutral97),
        Colour("Neutral100", Source.Palette.Neutral100),
    ),
    "Error" to listOf(
        Colour("Error400", Source.Palette.Error400),
        Colour("Error500", Source.Palette.Error500),
    ),
    "Success" to listOf(
        Colour("Success300", Source.Palette.Success300),
        Colour("Success400", Source.Palette.Success400),
        Colour("Success500", Source.Palette.Success500),
    ),
    "News" to listOf(
        Colour("News100", Source.Palette.News100),
        Colour("News200", Source.Palette.News200),
        Colour("News300", Source.Palette.News300),
        Colour("News400", Source.Palette.News400),
        Colour("News500", Source.Palette.News500),
        Colour("News550", Source.Palette.News550),
        Colour("News600", Source.Palette.News600),
        Colour("News800", Source.Palette.News800),
    ),
    "Opinion" to listOf(
        Colour("Opinion100", Source.Palette.Opinion100),
        Colour("Opinion200", Source.Palette.Opinion200),
        Colour("Opinion300", Source.Palette.Opinion300),
        Colour("Opinion400", Source.Palette.Opinion400),
        Colour("Opinion450", Source.Palette.Opinion450),
        Colour("Opinion500", Source.Palette.Opinion500),
        Colour("Opinion550", Source.Palette.Opinion550),
        Colour("Opinion600", Source.Palette.Opinion600),
        Colour("Opinion800", Source.Palette.Opinion800),
    ),
    "Sport" to listOf(
        Colour("Sport100", Source.Palette.Sport100),
        Colour("Sport200", Source.Palette.Sport200),
        Colour("Sport300", Source.Palette.Sport300),
        Colour("Sport400", Source.Palette.Sport400),
        Colour("Sport500", Source.Palette.Sport500),
        Colour("Sport600", Source.Palette.Sport600),
        Colour("Sport800", Source.Palette.Sport800),
    ),
    "Culture" to listOf(
        Colour("Culture50", Source.Palette.Culture50),
        Colour("Culture100", Source.Palette.Culture100),
        Colour("Culture200", Source.Palette.Culture200),
        Colour("Culture300", Source.Palette.Culture300),
        Colour("Culture400", Source.Palette.Culture400),
        Colour("Culture450", Source.Palette.Culture450),
        Colour("Culture500", Source.Palette.Culture500),
        Colour("Culture600", Source.Palette.Culture600),
        Colour("Culture700", Source.Palette.Culture700),
        Colour("Culture800", Source.Palette.Culture800),
    ),
    "Lifestyle" to listOf(
        Colour("Lifestyle100", Source.Palette.Lifestyle100),
        Colour("Lifestyle200", Source.Palette.Lifestyle200),
        Colour("Lifestyle300", Source.Palette.Lifestyle300),
        Colour("Lifestyle400", Source.Palette.Lifestyle400),
        Colour("Lifestyle450", Source.Palette.Lifestyle450),
        Colour("Lifestyle500", Source.Palette.Lifestyle500),
        Colour("Lifestyle600", Source.Palette.Lifestyle600),
        Colour("Lifestyle800", Source.Palette.Lifestyle800),
    ),
    "SpecialReport" to listOf(
        Colour("SpecialReport100", Source.Palette.SpecialReport100),
        Colour("SpecialReport200", Source.Palette.SpecialReport200),
        Colour("SpecialReport300", Source.Palette.SpecialReport300),
        Colour("SpecialReport400", Source.Palette.SpecialReport400),
        Colour("SpecialReport500", Source.Palette.SpecialReport500),
        Colour("SpecialReport800", Source.Palette.SpecialReport800),
    ),
)

@Preview
@Composable
internal fun Palette(modifier: Modifier = Modifier) {
    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(vertical = 8.dp),
        modifier = modifier,
    ) {
        item {
            Text(
                text = "Palette",
                style = Source.Typography.HeadlineBold20,
                modifier = Modifier.padding(8.dp),
            )
        }
        colours.keys.forEachIndexed { paletteIndex, palette ->
            item(span = { GridItemSpan(2) }) {
                Column {
                    Spacer(modifier = Modifier.height(8.dp))
                    HorizontalDivider()
                    Text(
                        text = palette,
                        style = Source.Typography.TextSansBold14,
                        modifier = Modifier.padding(8.dp),
                    )
                }
            }
            items(colours[palette].orEmpty()) { colour ->
                Box(
                    modifier = Modifier
                        .height(50.dp)
                        .fillMaxWidth()
                        .background(colour.colour),
                ) {
                    Text(
                        text = colour.name,
                        modifier = Modifier.align(Alignment.Center),
                        style = Source.Typography.TextSans14,
                        color = if (colour.colour.luminance() > 0.5f) Color.Black else Color.White,
                    )
                }
            }
        }
    }
}