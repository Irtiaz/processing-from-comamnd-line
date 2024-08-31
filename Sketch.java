import processing.core.PApplet;

public class Sketch extends PApplet {

	Mover mover;

	@Override
	public void settings() {
		size(400, 400);
	}

	public void setup() {
		mover = new Mover(this);
	}

	@Override
	public void draw() {
		background(51);
		mover.display();
	}

	public static void main(String[] args) {
		Sketch sketch = new Sketch();
		PApplet.runSketch(new String[]{"Sketch"}, sketch);
	}
}
