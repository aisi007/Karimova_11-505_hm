public class Cinematwo{
	public static void main(String[] args) {
		int maxVan3d = 500;
		int maxAnd2d = 400;
		int minKat = 300;
		int vikAdd = 200;
		final double discount = 0.15;
		final int price3d = 35;
		final int price2d = 27;

		boolean[] occupied = new boolean[31];

		for (int i = 1; i <= 7; i++) occupied[i] = true;
		for (int i = 11; i <= 13; i++) occupied[i] = true;
		for (int i = 15; i <= 17; i++) occupied[i] = true;
		for (int i = 22; i <= 24; i++) occupied[i] = true;
		for (int i = 26; i <= 30; i++) occupied[i] = true;

		int startSeat = -1;
		for (int i = 1; i <= 27; i++) {
			boolean freeSeat = true;
			for (int j = i; j < i + 4; j++){
				if (occupied[j]) {
					freeSeat = false;
					break;
				}
			}
			if (freeSeat){
				startSeat = i;
				break;
			}
		}	
		double basePrice = 315;
		double studentPrice = 267.75;
        double totalCost = 0;
        
        for (int i = startSeat; i < startSeat + 4; i++) {
            double seatPrice = basePrice;
            
            int personIndex = i - startSeat;
            if (personIndex != 1) { 
                seatPrice = studentPrice;
            }
            
           
            if (i >= 10 && i <= 20) {
                seatPrice *= 1.05;
            }
            
            totalCost += seatPrice;
        }
        
        
        System.out.print("Номера посадочных мест: ");
        for (int i = startSeat + 3; i >= startSeat; i--) {
            System.out.print(i);
            if (i > startSeat) System.out.print(", ");
        }
        System.out.println();
        System.out.println("Общая стоимость: " + totalCost + " руб.");
    }
}


