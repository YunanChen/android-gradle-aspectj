package com.archinamon.api

import org.gradle.api.internal.file.AbstractFileCollection
import org.gradle.api.tasks.TaskDependency
import java.io.File
import java.util.Collections

class ClasspathFileCollection(
        private val files: Set<File>
) : AbstractFileCollection() {

    override fun getFiles() = files.toMutableSet()
    override fun getBuildDependencies() = TaskDependency { Collections.emptySet() }

    override fun getDisplayName() = DISPLAY_NAME

    private companion object {
        const val DISPLAY_NAME = "aspectjClasspath"
    }
}