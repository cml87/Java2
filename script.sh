#!/bin/bash

ERROR(){
	echo ERROR - Value of out range of a byte [0 to 255]
}

OK(){
	echo OK - Conversion allowed
}

END(){
	echo TERMINATION CODE [$1]
}

java -cp /home/camilo/my_java_projects/Java2/out/production/Java2 Main  ##call the Java program 'Main'
EC=$?

if [ $EC -eq 0 ]; then OK; fi
if [ $EC -eq 119 ]; then ERROR; fi
END $EC	

