package by.htp.les05.main;
//7. На плоскости заданы своими координатами n точек. 
//Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние. Указание. Координаты точек занести в массив.

import java.util.Random;

public class Task7 {

	public static void main(String[] args) {
		int s;
		s = 10;
		double [] coord = new double[s];
		Random ran = new Random();

		for (int i = 0; i < coord.length; i++) {
			coord[i] = ran.nextDouble();
		}

		double max = 0;
		int in_i = 0;
		int in_j = 0;

		for (int i = 0; i < coord.length - 1; i+=2) {
			for (int j = i + 2; j < coord.length - 1; j+=2){

				double currentDist;
				currentDist = dist(coord[i], coord[i + 1], coord[j], coord[j + 1]);

				if (max < currentDist) {
					max = currentDist;
					in_i = i;
					in_j = j;
				}
			}
		}

		System.out.println("Самое большое расстояние между точками: А(" + coord[in_i] + ", " +  coord[in_i + 1] + ") и B(" + coord[in_j] + "," + coord[in_j + 1] + ")");
	}

	public static double dist (double x1, double y1, double x2, double y2) {
		double dist;
		dist = Math.sqrt((Math.pow(x2, 2) - Math.pow(x1, 2)) - (Math.pow(y2, 2) - Math.pow(y1, 2)));
		return dist;
	}
}


