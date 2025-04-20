package com.cts.creatio.crm.language.basics;

import java.util.ArrayList;
import java.util.List;

public class Assignment4_Collections {

	public static void main(String[] args) {

		/*
		 * Create Lists with area of top 5 largest cities. Print the total area of the
		 * 3rd and 4th cities combined.
		 */

		List<Double> areaOfCity = new ArrayList<Double>();
		areaOfCity.add(5000.05); // Ahmedabad
		areaOfCity.add(1000.10); // Jaipur
		areaOfCity.add(6001.70); // Mumbai
		areaOfCity.add(7005.75); // Hydrabad
		areaOfCity.add(4500.96); // Noida

		System.out.println("Size of Array List : " + areaOfCity.size());
		System.out.println("All List : " + areaOfCity);

		System.out.println(
				"Third area of city :  " + areaOfCity.get(2) + "  &   Fourth area of City  : " + areaOfCity.get(3));

		double combinedareaofcity = areaOfCity.get(2) + areaOfCity.get(3);

		System.out.println("combinedareaofcity : " + combinedareaofcity);

		System.out.println("*****************************************************************************");

		/*
		 * Create a set of the top 10 most visited tourist attractions in the world and
		 * print out all of them and its size.
		 */

		List<String> touristPlaces = new ArrayList<String>();
		touristPlaces.add("Time Sqaure, NewYork");
		touristPlaces.add("EffileTower,Peris");
		touristPlaces.add("LondonEye,UK");
		touristPlaces.add("Waterfall,Canada");
		touristPlaces.add("BurjKhalifa,Dubai");
		touristPlaces.add("Skyscrapers tower,Bankok");
		touristPlaces.add("Rome,Italy");
		touristPlaces.add("Madrid,Spain");
		touristPlaces.add("Tokyo,Japan");
		touristPlaces.add("Berlin,Germany");

		System.out.println("Size of Array List : " + touristPlaces.size());
		System.out.println("All List: " + touristPlaces);

		System.out.println("*****************************************************************************");

		/*
		 * Create an array of 10 numbers (any 10 numbers) and print out the Average of
		 * 5th and 6th Value.
		 */

		List<Integer> numbers = new ArrayList<Integer>();
		numbers.add(5);
		numbers.add(7);
		numbers.add(9);
		numbers.add(20);
		numbers.add(45);
		numbers.add(75);
		numbers.add(78);
		numbers.add(96);
		numbers.add(101);
		numbers.add(90);

		System.out.println("Size of Array List : " + numbers.size());
		System.out.println("All List: " + numbers);
		int thirdvalue = numbers.get(4);
		int fifthvalue = numbers.get(5);
		int sum = thirdvalue + fifthvalue;
		int average = sum / 2;

		System.out.println("Average of numbers : " + average);

		System.out.println("*****************************************************************************");

		/*
		 * Create a list of the top 5 highest-grossing movies of all time and print out
		 * the third movie on the list.
		 */

		List<String> movies = new ArrayList<String>();
		movies.add("Kalki");
		movies.add("Avengers");
		movies.add("Titanic");
		movies.add("Star Wars");
		movies.add("Avatar");

		System.out.println("Size of Array List : " + movies.size());
		System.out.println("All List: " + movies);
		System.out.println("Third Movie : " + movies.get(2));

	}

}
