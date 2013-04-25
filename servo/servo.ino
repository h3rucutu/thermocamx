#include <Servo.h>
Servo Sx;
Servo Sy;
int i = 0, j = 5;

void setup() {
  Sx.attach(9); //Attaching servo into PWN pin
  Sy.attach(10);
}

void loop() {
  Sy.write(0); //Setting Servo-Y to 0 degree
  delay(100);
  while(j <= 60) {                //Starting one-loop system (capture)
    for(i = 0; i <= 70; i += 1) {   //Servo-X start to move clockwise
      if(i == 70) {               //If Servo-X have reached 70 degree,
        Sy.write(j);              //Servo-Y will write the increase
        delay(100);               //degree.
      }
      else {
        Sx.write(i);
        delay(200);
      }
    }
    j += 5;
    for(i = 70; i >= 0; i -= 1) {   //Servo-X start to move back counterclockwise
      if(i == 0) {                //If Servo-X have reached 0 degree,
        Sy.write(j);              //Servo-Y will write the increase
        delay(100);               //degree.
      }
      else {
        Sx.write(i);
        delay(200);
      }
    }
    j += 5;
  }
}
