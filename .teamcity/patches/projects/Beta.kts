package patches.projects

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.Project
import jetbrains.buildServer.configs.kotlin.v2019_2.ui.*

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, change the project with id = 'Beta'
accordingly, and delete the patch script.
*/
changeProject(RelativeId("Beta")) {
    params {
        expect {
            param("VCS.Branches", "+:refs/heads/testing/(*)")
        }
        update {
            param("VCS.Branches", """
                +:refs/heads/testing/(*)
                -:refs/heads/%Default.Branch%
            """.trimIndent())
        }
        expect {
            text("env.crowdinKey", "credentialsJSON:57fbe4f4-13dd-4c72-b6b3-3cc1e3a8240e", label = "Crowdin key", description = "The API key for crowdin to pull translations", allowEmpty = true)
        }
        update {
            text("env.crowdinKey", "credentialsJSON:d7587d96-844a-42fc-85b2-5a16006514a3", label = "Crowdin key", description = "The API key for crowdin to pull translations", allowEmpty = true)
        }
    }
}
