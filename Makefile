all:
	javac -cp processing-core.jar:. Sketch.java

run:
	java -cp processing-core.jar:. Sketch
