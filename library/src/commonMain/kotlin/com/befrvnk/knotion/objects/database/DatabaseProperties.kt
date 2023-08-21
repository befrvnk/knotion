package com.befrvnk.knotion.objects.database

import com.befrvnk.knotion.objects.richtext.RichText
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class DatabaseProperties(
    val title: String?,
    @JsonNames("rich_text")
    val richText: List<RichText>?,
    val number: DatabaseNumber?,
    @JsonNames("select")
    val selectOptions: List<SelectOption>?,
    @JsonNames("multi_select")
    val multiSelectOptions: List<SelectOption>?,
    val formula: Formula?,
    val relation: Relation?,
    val rollup: RollupFunction?,
)