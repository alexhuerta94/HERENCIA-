
package herencia;


public class Dog2 extends Dog {

	private double portion;

	public double getPortion() {
		return portion;
	}
        
	public void setPortion(double portion) {
		this.portion = portion;
	}

    public void setPortion(Double aDouble) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
