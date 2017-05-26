Natanael Mengesha
Robin Hall
Jeremial Akins
Mohammed Salman Khan
Jesus Madrigal

=======

SQL to XML Converter
Language: Java

Dependencies:
ANTLRv4
xml-to-xsd
Oracle Driver
SQLite Driver

=======

File Manifest:
com/abassi/TeamA4/*: Source Files
oracle/*: Oracle Driver Classes
antlr-4.5.3-complete.jar: ANTLR dependency
ojdbc6.jar: Oracle dependency
sqlite-jdbc-3.15.1.jar: SQLite Driver
xsd-gen-0.2.1-jar-with-dependencies.jar: XSD Generator
runprogram.sh: Runs a source build of the program.
build.sh: Builds a full (with sqlite) version of the program.
build_nosqlite.sh: Builds a version of the program without sqlite.
runprogram_nosqlite.sh: Runs the program without the sqlite driver.
readme.txt: This file.
ForDevelopers.txt: Notes for developers.
ExampleQueries.txt: Example queries with accompanying generated XML and XSD files.
clean.sh: Deletes class files from the com/abassi/TeamA4 folder.
AbassiDB.db: Example SQLite database

=======

Instructions & Notes: 

Only the source build is included with this release, due to space constraints on Osprey. 


======

JAR

THE PRE-BUILT JAR FILE WAS NOT INCLUDED DUE TO SPACE ISSUES ON OSPREY. IT WILL BE INCLUDED WITH THE BLACKBOARD RELEASE.
FOLLOW THE SOURCE INSTRUCTIONS INSTEAD.

The JAR comes with all of the drivers and dependencies pre-installed and is ready to run out-of-the-box. 


Navigate to the directory the jar is contained in and type: “java -jar AbassiProject.jar”


To use included SQLite support, supply the following command line arguments: “java -jar AbassiProject.jar sqlite <database_name>

Where <database_name> is the name of the database you want to connect to. Note that the database must be present in the directory you are running the JAR from.

======

Source

The source build is provided for advanced users that want to modify and/or tinker with this software.

In order to build from source, the dependencies must be downloaded, if you do not already have them.

ANTLRv4: http://www.antlr.org/download/antlr-4.5.3-complete.jar
Oracle Driver (Included with the package)
SQLite Driver (If you wish to use provided SQLite support): https://github.com/xerial/sqlite-jdbc/releases/tag/3.15.1
XML to XSD: https://github.com/wiztools/xsd-gen/releases/download/xsd-gen-0.2.1/xsd-gen-0.2.1-jar-with-dependencies.jar

If you are downloading drivers that have different versions or filenames from the ones provided, you must edit the shell scripts to match the updated dependency names.

Navigate to the directory you extracted the source code to.

Remember to check the permissions on the *.sh files before you run them. Use "ls -l" or "ll". If the permissions are not correct, use the command:

chmod 755 *.sh

In order to compile, two shell scripts are supplied:
./build.sh: Builds the entire program, with Oracle and SQLite.
./build_nosqlite.sh: Builds the entire program without the SQLite driver.


If the build succeeds, then run:
./runprogram.sh: Runs the program.
./runprogram_nosqlite.sh: Runs the program without sqlite support.

SQLite support, if compiled into the program, can be utilized by typing: “./runprogram.sh sqlite <database_name>”

======

ADDITIONAL NOTES:

It is highly advised that you use the JAR release, as that can be located anywhere and comes with all the necessary dependencies. The source release is intended for advanced users that are making active changes to the program source.

The Oracle JDBC driver is the default driver, and will be loaded on program launch. The connection to Oracle is set on load by entering the URI, alongside the username and password. If a URI of ‘default’ is entered, it will automatically use the default URI, which connects to Olympia.

The user only needs to enter the URI, Username, and Password. The program will close if a connection cannot be established, or credentials are invalid.  then the user will be logged into the database and the program main menu will be shown.

When SQLite support is used, there will be no login information required. The program will go straight to the main menu.

The program does not show the XML straight after generation. You can view the XML by selecting the appropriate option from the main menu.

XSD is generated when the XML is generated, but the XSD is shown and saved to disk separately. This is because some users might not want nor need the XSD. Therefore, saving it is optional.

Entering ‘0’ will show the main menu again.

