package com.befrvnk.knotion.objects

import com.befrvnk.knotion.objects.other.File
import com.befrvnk.knotion.objects.other.Icon
import com.befrvnk.knotion.objects.other.Parent
import com.befrvnk.knotion.objects.richtext.RichText
import com.befrvnk.knotion.objects.user.User
import kotlinx.datetime.Instant
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.Serializable
import kotlinx.serialization.json.JsonNames

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class Page(
    val id: String,
    @JsonNames("created_time")
    val createdTime: Instant,
    @JsonNames("created_by")
    val createdBy: User,
    @JsonNames("last_edited_time")
    val lastEditedTime: Instant,
    val archived: Boolean,
    val icon: Icon?,
    val cover: File?,
    val properties: PageProperties,
    val parent: Parent,
    val url: String,
)

@OptIn(ExperimentalSerializationApi::class)
@Serializable
data class PageProperties(
    @JsonNames("Task completed")
    val checkbox: CheckboxProperty?,
    @JsonNames("created_by")
    val createdBy: CreatedByProperty?,
    @JsonNames("Created time")
    val createdTime: CreatedTimeProperty?,
    @JsonNames("Due date")
    val date: DateProperty?,
    @JsonNames("Email")
    val email: EmailProperty?,
    @JsonNames("Blueprint")
    val files: FilesProperty?,
    @JsonNames("Days until launch")
    val formula: FormulaProperty?,
    @JsonNames("Last edited by column name")
    val lastEditedBy: LastEditedByProperty?,
    @JsonNames("Last edited time")
    val lastEditedTime: LastEditedTimeProperty?,
    @JsonNames("multi_select")
    val multiSelect: MultiSelectProperty?,
    @JsonNames("Number of subscribers")
    val numberOfSubscribers: NumberOfSubscribersProperty?,
    @JsonNames("people")
    val people: PeopleProperty?,
    @JsonNames("Contact phone number")
    val contactPhoneNumber: ContactPhoneNumberProperty?,
    @JsonNames("Related tasks")
    val relatedTasks: RelatedTasksProperty?,
    @JsonNames("Description")
    val description: DescriptionProperty?,
    @JsonNames("title")
    val title: TitleProperty?,
)

@Serializable
sealed class Property

@Serializable
class CheckboxProperty

@Serializable
class CreatedByProperty

@Serializable
class CreatedTimeProperty

@Serializable
class DateProperty

@Serializable
class EmailProperty

@Serializable
class FilesProperty

@Serializable
class FormulaProperty

@Serializable
class LastEditedByProperty

@Serializable
class LastEditedTimeProperty

@Serializable
class MultiSelectProperty

@Serializable
class NumberOfSubscribersProperty

@Serializable
class PeopleProperty

@Serializable
class ContactPhoneNumberProperty

@Serializable
class RelatedTasksProperty

@Serializable
class DescriptionProperty

@Serializable
data class TitleProperty(
    val title: List<RichText>,
)
