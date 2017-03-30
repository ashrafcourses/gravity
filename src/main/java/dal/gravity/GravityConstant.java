package dal.gravity;

public class GravityConstant implements GravityModel {
	private double g;
	public static final double EARTH_GRAVITY = 9.80655;
	public GravityConstant(double g){
		if(g>0){
			this.g=g;
		}
		else{
			throw new IllegalArgumentException ("invalid local gravitational field: " + g);
		}
	}
	public double getGravitationalField(){
			return g;		
	}
}
