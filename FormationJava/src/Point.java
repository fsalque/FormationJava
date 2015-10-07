
public class Point {
	public int x,y;
	
	public void afficher(){
		System.out.println("X: " + x + ", Y: " + y);
	}
	
	public void deplacer(int newX, int newY){
		this.x = newX;
		this.y = newY;
	}
	
	public int getX(){
		return this.x;
	}
	
	public int getY(){
		return this.y;
	}

}
