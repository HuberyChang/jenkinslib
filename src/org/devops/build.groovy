package org.devops

// 构建类型
def Build(buildType, buildShell) {
    def buildTools=["maven":"M2","gradle":"Gradle","npm":"Npm","ant":"Ant"]
    buildHome = tool buildTools[buildType]

    sh  "${buildHome}/bin/${buildType} ${buildShell}"
        
}