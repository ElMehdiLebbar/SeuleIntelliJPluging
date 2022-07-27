package com.github.elmehdilebbar.seuleintellijpluging.services

import com.intellij.openapi.project.Project
import com.github.elmehdilebbar.seuleintellijpluging.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
