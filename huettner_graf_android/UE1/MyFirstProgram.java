<<<<<<< HEAD
/*Fehlerbeschreibung Aufgabe 1 	Philipp Graf 1510237040
  Fehler 1: Variablendeklaration mit int, nicht integer
  Fehler 2: Variablenbezeichnung numberOfOutputs
  Fehler 3: <= sonst nur 4 Outputs
  Fehler 3: Z�hlvariable i, nicht j
*/

public class MyFirstProgram {

	public static void main(String[] args) {

		int numberOfOutputs; // Fehler 1
		//kommentar
		Out.print("Please enter the number of outputs: ");
		numberOfOutputs = In.readInt(); // Fehler 2
		for (int i = 1; i <= numberOfOutputs; i++) { // Fehler 3
			Out.print("Output number ");
			Out.print(i); // Fehler 4
			Out.println(": Hello World!");
		} // for

	public void thisIsANewMethod() { }
	} // main
} // MyFirstProgram
	Out.println(": Hello World!");
		} // for
	} // main
} // MyFirstProgram
>>>>>>> 046b3d2f83b1577047e03a5327da53e4d89e64c4
