public class Cinema {
	public static void main(String[] args) {
		int maxVan3d = 500;
		int maxAnd2d = 400;
		int minKat = 300;
		int vikAdd = 200;
		final double discount = 0.15;
		final int price3d = 35;
		final int price2d = 27;

		
		int possible3dPrice = 0;
		for (int price = 35; price <= maxVan3d; price += price3d) {
			if (price > minKat){
				possible3dPrice = price;
				break;
			}
		}
		int possible2dPrice = 0;
		for (int price = 27; price <= maxAnd2d; price += price2d) {
			if (price > minKat){
				possible2dPrice = price;
				break;
			}
		}
		//рассчитаем скидку 
		if (possible2dPrice > 0){
			double discountnew = 1 - discount;
			double priceVanVikKat = possible2dPrice * discountnew;
			int andrwithoutdiscount = 200 + vikAdd;
			System.out.println("Выбрали 2D фильм:");
			System.out.println("Цена билета без скидки:" + possible2dPrice + "рублей");
			System.out.println("Цена билета со скидки:" + priceVanVikKat + "рублей");


		} 

		if (possible3dPrice > 0){
			double discountnew = 1 - discount;
			double priceVanVikKat = possible3dPrice * discountnew;
			int andrwithoutdiscount = 200 + vikAdd;
			System.out.println("Выбрали 3D фильм:");
			System.out.println("Цена билета без скидки:" + possible3dPrice + "рублей");
			System.out.println("Цена билета со скидки:" + priceVanVikKat + "рублей");

		}

	}

}