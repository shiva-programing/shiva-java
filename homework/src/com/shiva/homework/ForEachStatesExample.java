package com.shiva.homework;

public class ForEachStatesExample {
	public static void main(String[] args) {

	String[] States = { "AP", "Arunachal Pradesh", "Assam", "Bihar", "Chhattisgarh", "Goa", "Gujarat", "Haryana",
				"Himachal Pradesh", "Jammu and Kashmir", "Jharkhand", "Karnataka", "Kerala", "Madya Pradesh",
				"Maharashtra", "Manipur", "Meghalaya", "Mizoram", "Nagaland", "Orissa", "Punjab", "Rajasthan", "Sikkim",
				"Tamil Nadu", "Telangana", "Tripura", "Uttaranchal", "Uttar Pradesh", "West Bengal" };

	String[] Capitals = { "Amaravati", "Itangar", "Dispur", "Patna", "Raipur", "Panaji", "Gandhinagar",
				"Chandigarh", "Shimla", "Srinagar and Jammu", "Ranchi", "Bangalore", "Thiruvananthapuram",
				"Bhopal", "Mumbai", "Imphal", "Shillong", "Aizawi", "Kohima", "Bhubaneshwar", "Chandigarh", "Jaipur",
				"Gangtok", "Chennai", "Hyderabad", "Agartala", "Dehradun", "Lucknow", "Kolkata" };

	// for (String State : States) {
	// if(State == "Telangana") {
	// continue;
	// }

	// System.out.println(State);

	for(
	String capital:Capitals)
	{
		System.out.println(capital);
	}
}

}
