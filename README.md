# gitHubLib
My Toast dependency - Sathya

Step 1 .  Add it in your root build.gradle at the end of repositories:
   DEPRECIATED

	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
	USe the Following instead
	settings.gradle add maven...
	
	dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}


  
Step 2. Add the dependency

	dependencies {
	        implementation 'com.github.sathyaBabu:gitHubLib:1.0.1'
	}
  
