void setup() {
	size(400, 400);
}

void draw() {
  background(255);
  ellipseMode(CENTER);
  ellipse(mouseX, mouseY, 1, 1);
  println(mouseX, mouseY);
  rectMode(CENTER);
 
  //Make a creature!!! 
  //all of your programming should be after this 👍
  
 // I dont know if im supposed to draw the creature on the png or not
  //the creatures name is bob
  //create creatures head
  ellipse(200 , 200, 100, 100)
  //create creatures eye
  ellipse(180, 180, 20, 40)
 //create creature second eye
  ellipse(220, 180, 20, 40)
 // create pupil
  ellipse(180, 180, 10, 20)
// create pupil(2)
  ellipse(220, 180, 10, 20)
// create mouth 
	rect(200, 220, 70, 1)
  
  fill(100)
  //create body and legs
  rect(80, 220, 10, 50)
  rect(120, 220, 10, 50)
  rect(110, 200, 80, 40)

}

