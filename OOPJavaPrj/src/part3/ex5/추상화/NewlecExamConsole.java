package part3.ex5.추상화;

import part3.ex2.메소드.Exam;
import part3.ex2.메소드.ExamConsole;

public class NewlecExamConsole extends ExamConsole {

	@Override
	protected Exam makeExam() {
		return new NewlecExam();
	}

}
