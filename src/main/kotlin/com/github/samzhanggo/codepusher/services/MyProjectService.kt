package com.github.samzhanggo.codepusher.services

import com.intellij.openapi.project.Project
import com.github.samzhanggo.codepusher.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
