package com.github.karlmanong.mybatisplugin.services

import com.intellij.openapi.project.Project
import com.github.karlmanong.mybatisplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
