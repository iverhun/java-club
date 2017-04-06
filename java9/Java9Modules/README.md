# Expectations

1. JDK 9 is installed and `JAVA_HOME=/usr/local/java/jdk-9`
1. `JDK_HOME\bin` is in your $PATH

# Resources
1. https://blog.codecentric.de/en/2015/11/first-steps-with-java9-jigsaw-part-1/

# Some of the commands we used during this workshop:

```

8  echo $JAVA_HOME 
9  java --version
21  echo $PATH
57  cd Java9Modules
70  javac -version
71  javac -cp . -d ../build/ com/community/modules/module2/User
72  javac -cp . -d ../build/ com/community/modules/module2/User.java 
76  javac -cp . -d ../build/ com/community/modules/module2/UserService.java 
118  javac --module-path . -d ../build/ com/community/modules/module2/UserService.java
130  jar --create --file=moduule2.jar -C build/
131  jar --create --file=moduule2.jar -C build/ .
135  javac --module-path . -d ../build/ com/community/modules/module2/UserService.java module-info.java 
138  jar --create --file=moduule2.jar -C build/ .
142  javac --module-path . -d ../build/ $(find . -name "*.java") 
144  javac --module-path . -d ../build/ $(find . -name "*.java") 
145  javac --module-path .:../Module2/ -d ../build/ $(find . -name "*.java") 
148  javac --module-path .:../../Module2/ -d ../build/ $(find . -name "*.java") 
150  javac --module-path .:../../Module2/ -d ../build/ $(find . -name "*.java") 
153  jar --create --file=build/moduule1.jar -C build/ .
156  jar --main-class=com.community.modules.module1.Main --create --file=build/module1.jar -C build/ .
159  java --module-path build:../Module2 -m com.community.modules.module1
160  java --module-path build:../Module2/module2.jar -m com.community.modules.module1
166  java --module-path build:../Module2/moduule2.jar -m com.community.modules.module1
168  java --module-path modules -m com.community.modules.module1
180  jlink --module-path /usr/local/java/jdk-9/jmods/:modules --add-modules com.community.modules.module1 --output linkedjdk
197  jlink --module-path /usr/local/java/jdk-9/jmods/:modules --add-modules com.community.modules.module2 --output linkedjdk
202  ./bin/java --list-modules 
204  ./bin/java -jar ../../Module1/build/module1.jar 

```
