package com.example.demo.repository

import com.example.demo.model.Note
import org.springframework.data.repository.CrudRepository

/**
 * Created by sara on abr, 2019
 */
interface NoteRepository : CrudRepository<Note, Long>