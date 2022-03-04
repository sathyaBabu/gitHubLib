# gitHubLib
My Toast dependency - Sathya

Step 1 .  Add it in your root system.settings  at the end of repositories:

dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
    }
}
  
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.sathyaBabu:gitHubLib:1.0.1
	}
  
