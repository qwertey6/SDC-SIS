/**
 * 
 */

/**
 * @author qwertey6
 *
 */
public class Example_Thermo_Submodule extends Module implements Thermo {

	/**
	 * 
	 */
	public Example_Thermo_Submodule(double mass_of_part) {
		// We fill out all of the super-ed fields.
		
		
		//super(mass); // do we need to super?
		
		mass = mass_of_part;
	}

	/* (non-Javadoc)
	 * @see Thermo#get_thermal_reading()
	 */
	@Override
	public double get_thermal_reading() {
		// TODO Auto-generated method stub
		
		//this would return the parts thermal reading
		
		return 0;
	}

}
