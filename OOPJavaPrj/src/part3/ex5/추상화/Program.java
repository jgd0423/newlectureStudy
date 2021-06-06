package part3.ex5.추상화;

import part3.ex2.메소드.ExamConsole;

public class Program {
	public static void main(String[] args) {
		ExamConsole console = new NewlecExamConsole();
		console.input();
		console.print();

	}

}
