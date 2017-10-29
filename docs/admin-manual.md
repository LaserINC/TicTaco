TicTacToe
=========

#### Admin Manual

The programs needed to develop and run this program are:

	Git
	Java JDK 8 (For Windows it is critical to add java to the path)
	JUnit
	Gradle
	Travis
	Heroku
	Chrome driver

1. Installation of programs needed.

The following lists instructions to install vital programs.

1.1. Install and setup Git: https://help.github.com/articles/set-up-git/

1.1.2 Install and setup Java: https://www.java.com/en/download/help/windows_manual_download.xml

1.1.3 Install and setup Gradle: https://gradle.org/install/#helpful-information

1.1.4 Install and setup Travis: https://travis-ci.org/

1.1.5 Install and setup Heroku: https://signup.heroku.com/dc

1.1.5 Install and setup Chrome driver: https://sites.google.com/a/chromium.org/chromedriver/getting-started

Clone the project to your computer by running this command: git clone git@github.com:[yourUsername]/[projectName].git

To set the Heroku key for Travis, you will need to run the following commands:

To connect Travis account with your Github give Travis permission to your repository and sync

Make a .travis.yml file in the root of the project add the following line to the file "language: java"

Now you should be able to run the program. All changes to the code requests a pull requests on GitHub.
After the project has passed all tests it should be up and on your heroku apps at http:/[youHerokuAppName].herokuapp.com