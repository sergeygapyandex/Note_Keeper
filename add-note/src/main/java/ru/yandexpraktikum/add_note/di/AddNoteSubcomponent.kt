package ru.yandexpraktikum.add_note.di

import dagger.Subcomponent

@Subcomponent(modules = [AddNoteModule::class])
@AddNoteScope
interface AddNoteSubcomponent {


    @Subcomponent.Factory
    interface Factory {
        fun create(): AddNoteSubcomponent
    }
}