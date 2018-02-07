
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
	 * or observer methods of class PhD */ 
	
    /**Constructor: an instance for a person with name n, 
     * PhD month m, PhD year y. Its advisors are unknown, 
     * and it has no advisees. 
     * Precondition: n has at least 1 char and m is in 1..12 */
	public PhD(String n, int m, int y) {
		name = ""+n;
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
	
	/**Group B: the setter/mutator methods */
	
	/**Add p as the first advisor of this person.
	 * Precondition: the first advisor is unknown 
	 * and p is not null.
	 */
	public void setAdvisor1(PhD p) {
		advisor1 = p;
		++p.numAdvisees;
	}
	/**Add p as the second advisor of this person.
	 * Precondition: the first advisor is unknown,
	 * the second advisor is unknown, p is not null,
	 * and p is different from the first advisor
	 */
	public void setAdvisor2(PhD p) {
		advisor2 = p;
		++p.numAdvisees;
	}
	
	/**Group C: Two more constructors */
	/**Constructor: a PhD with name n, PhD month m, 
	 * PhD year y, first advisor adv1, and no second advisor.
	 * Precondition: n has at least 1 char, m is in 1..12, 
	 * and adv1 is not null
	 */
	public PhD(String n, int m, int y, PhD adv1) {
		name = n;
		month = m;
		year = y;
		setAdvisor1(adv1);
		setAdvisor2(null);
	}
	/**Constructor: a PhD with name n, PhD month m, 
	 * PhD year y, first advisor adv1, and second advisor adv2.
	 * Precondition: n has at least 1 char, m is in 1..12, 
	 * adv1 and adv2 are not null, and adv1 and adv2 are different
	 */
	public PhD(String n, int m, int y, PhD adv1, PhD adv2) {
		name = n;
		month = m;
		year = y;
		setAdvisor1(adv1);
		setAdvisor2(adv2);
	}
	
	/** Group D: Write three functions */
	/**Return value of "this PhD has at least one advisee", 
	 * i.e. true if this PhD has at least one advisee 
	 * and false otherwise
	 */
	public boolean hasAdvisee() {
		return numAdvisees() != 0;
	}
	/**Return value of "p is not null and 
	 * this person got the PhD after p.”/
	 */
	public boolean gotAfter(PhD p) {
		return (p != null) && ((year() > p.year()) 
				|| ((year() == p.year()) && (month() > p.month())));
	}
	/**Return value of "this person and p are intellectual siblings."
	 * Precondition: p is not null
	 */
	public boolean areSiblings(PhD p) {
		return (p.name() != name()) && ((advisor1() == p.advisor1()) 
				|| (advisor1() == p.advisor2()) 
				|| (advisor2() == p.advisor1())
				|| (advisor2() == p.advisor2()));
	}
}
