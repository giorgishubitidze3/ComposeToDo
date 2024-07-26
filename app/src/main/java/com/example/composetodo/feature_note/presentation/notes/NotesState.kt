package com.example.composetodo.feature_note.presentation.notes


import androidx.compose.ui.Modifier
import com.example.composetodo.feature_note.domain.model.Note
import com.example.composetodo.feature_note.domain.util.NoteOrder
import com.example.composetodo.feature_note.domain.util.OrderType

data class NotesState(
    val notes: List<Note> = emptyList(),
    val noteOrder: NoteOrder = NoteOrder.Date(OrderType.Descending),
    val isOrderSectionVisible: Boolean = false
)
