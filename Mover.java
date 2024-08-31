import processing.core.PVector;

public class Mover {
	PVector position;
	Sketch sketch;

	Mover(Sketch sketch) {
		this.sketch = sketch;
		position = new PVector(sketch.width / 2, sketch.height / 2);
	}

	void display() {
		sketch.fill(255);
		sketch.ellipse(position.x, position.y, 50, 50);
	}

}
