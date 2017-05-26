#/bin/bash
cd "$(dirname "$0")"
javac -cp ojdbc6.jar -cp antlr-4.5.3-complete.jar:xsd-gen-0.2.1-jar-with-dependencies.jar com/abassi/team4A/*.java

