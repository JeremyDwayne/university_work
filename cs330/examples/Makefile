ANTLR_JAR = antlr-4.5.2-complete.jar

Interpreter.class: BooLexer.java BooParser.java Interpreter.java

BooLexer.java BooParser.java: Boo.g
	java -cp ${ANTLR_JAR} org.antlr.v4.Tool Boo.g

%.class: %.java
	javac -cp ${ANTLR_JAR}:. $<

clean:
	rm -rf *.class BooLexer.java BooParser.java BooBaseListener.java BooListener.java *.tokens
