
public class PhD {
	private String name; //Name of the person with a PhD, 
	//a String of length > 0
	private int month;   // month PhD was awarded. 
	//In 1..12, with 1 meaning January, etc.
	private int year;    //year PhD was awarded
	private PhD advisor1; //The first PhD advisor
	private PhD advisor2; //The second PhD advisor
	private int numAdvisees; //number of PhD advisees

	/**Group A: The first constructor and the getter
	 * /observer methods of class PhD */ 
	
    /**Constructor: an instance for a person with name n, 
     * PhD month m, PhD year y. Its advisors are unknown, 
     * and it has no advisees. Precondition: n has 
     * at least 1 char and m is in 1..12. */
	public PhD(String n, int m, int y) {
		name = n;
		month = m;
		year = y;
	}
	/**Return the name of this person*/
	public String name() {
		return name;
	}
	/**Return the month this person got their PhD*/
	public int month() {
		return month;
	}
	/**Return the year this person got their PhD*/
	public int year() {
		return year;
	}
	/**Return the first advisor of this PhD 
	 * (null if unknown)
	 */
	public PhD advisor1() {
		return advisor1;
	}
	/**Return the second advisor of this PhD
	 * (null if unknown or non-existent)
	 */
	public PhD advisor2() {
		return advisor2;
	}
	/**Return the number of PhD advisees of this person*/
	public int numAdvisees() {
		return numAdvisees;
	}
	
	/**Group B: the setter/mutator methods. 
	 * Note: methods setAdvisor1 and setAdvisor2
	 * must change fields of both this PhD and its advisor 
	 * in order to maintain the class invariant
	 */
	
}
