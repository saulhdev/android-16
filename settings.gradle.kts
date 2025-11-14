pluginManagement {
    repositories {
        mavenCentral()
        google()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        mavenCentral()
        google()
        maven(url = "https://jitpack.io")
    }
}
include(":iconloaderlib")
project(":iconloaderlib").projectDir = File(rootDir, "libs_systemui/iconloaderlib")

include(":animationlib")
project(":animationlib").projectDir = File(rootDir, "libs_systemui/animationlib")

include(":flags")
project(":flags").projectDir = File(rootDir, "flags")

include(":hidden-api")
project(":hidden-api").projectDir = File(rootDir, "hidden-api")

include (":plugin")
project(":plugin").projectDir = File(rootDir, "libs_systemui/plugin")

include(":plugincore")
project(":plugincore").projectDir = File(rootDir, "libs_systemui/plugin_core")

include(":log")
project(":log").projectDir = File(rootDir, "libs_systemui/log")

include(":common")
project(":common").projectDir = File(rootDir, "libs_systemui/common")

include(":utils")
project(":utils").projectDir = File(rootDir, "libs_systemui/utils")
include(":anim")
project(":anim").projectDir = File(rootDir, "libs_systemui/anim")

include(":wmshell")
project(":wmshell").projectDir = File(rootDir, "wmshell")

rootProject.name = "Neo Launcher"