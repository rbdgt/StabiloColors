import stabilocolors.library.*;

Stabilo stabilo = new Stabilo(this);
int[] colors = {
  11, 13, 16, 17, 19, 22, 24, 26, 29, 30, 31, 32, 33, 36, 38, 40, 41, 43, 44, 45, 46, 48, 50, 51, 53, 54, 55, 56, 57, 58, 59, 63, 65, 75, 88, 89, 94, 95, 96, 97, 98
}; // array of colorcodes

void setup() {
  size(400, 250);
  background(255);
}

void draw() {
  drawLinesS68();
  drawLinesS88();
  getColorNames();
  getColorCodes();
  noLoop();
}

void drawLinesS68() {
  strokeWeight(5);
  int d = 40;
  for (int i : colors) { // iterate over colorcodes 
    stroke(stabilo.s68(i)); // pass colorcode to s68-function
    line(0+d, 20, 0+d, 120);
    d+=(width-80)/40;
  }
}

// Not all colors are available for this pen, this is reflected by messages in the console...
void drawLinesS88() {
  strokeWeight(2);
  int d = 40;
  for (int i : colors) { // iterate over colorcodes 
    stabilo.getColorName(i);
    stroke(stabilo.s88(i)); // pass colorcode to s88-function
    line(0+d, 130, 0+d, 230);
    d+=(width-80)/40;
  }
}

void getColorNames() {
  println(stabilo.getColorName(11)); // returns string: ice_blue
  println(stabilo.getColorName(24)); // returns string: lemon_yellow
  println(stabilo.getColorName(48)); // returns string: carmine
  println(stabilo.getColorName(50)); // returns string: crimson_red
  println(stabilo.getColorName(1337)); // returns string: NO_COLOR (colorcode doesn't exist)
}

void getColorCodes() {
  println(stabilo.getColorCode("ice_blue")); // returns int: 11
  println(stabilo.getColorCode("lemon_yellow")); // returns int: 24
  println(stabilo.getColorCode("carmine")); // returns int: 48
  println(stabilo.getColorCode("crimson_red")); // returns int: 50
  println(stabilo.getColorCode("unicorn")); // returns int: 0 (colorname doesn't exist)
}
