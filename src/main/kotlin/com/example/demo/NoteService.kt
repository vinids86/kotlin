package com.example.demo

import com.example.demo.model.Note
import com.example.demo.repository.NoteRepository
import org.springframework.stereotype.Service

/**
 * Created by sara on abr, 2019
 */
@Service
class NoteService(
        private val noteRepository: NoteRepository) {

    fun all(): List<Note> {
        return noteRepository.findAll().toList()
    }

    fun deleteById(id: Long) {
        noteRepository.deleteById(id)
    }

    fun existsById(id: Long) : Boolean {
        return noteRepository.existsById(id)
    }

    fun save(note: Note) : Note {
        return noteRepository.save(note)
    }

    fun alter(id: Long, note: Note): Note {
        var safeNote = note.copy(id = id)
        return save(safeNote)
    }
}