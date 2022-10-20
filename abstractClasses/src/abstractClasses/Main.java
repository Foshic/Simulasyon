package abstractClasses;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WomanGameCalculator womanGameCalculator=new WomanGameCalculator();
		womanGameCalculator.hesapla();
		womanGameCalculator.gameOver();
		
		GameCalculator gameCalculators=new ManGameCalculator();
		gameCalculators.hesapla();
		gameCalculators.gameOver();
		
		GameCalculator gameCalculatorK=new KidsGameCalculator();
		gameCalculatorK.hesapla();
		gameCalculatorK.gameOver();

	}

}
