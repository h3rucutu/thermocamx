#include <Servo.h>
Servo Sx;
Servo Sy;
int i = 0, j = 5;

void setup() {
  Sx.attach(9);
  Sy.attach(10);
}

void loop() {
  Sy.write(0);
  delay(100);
  while(j <= 60) {
    for(i = 0; i <= 70; i += 1) {
      if(i == 70) {
        Sy.write(j);
        delay(100);
      }
      else {
        Sx.write(i);
        delay(200);
      }
    }
    j += 5;
    for(i = 70; i >= 0; i -= 1) {
      if(i == 0) {
        Sy.write(j);
        delay(100);
      }
      else {
        Sx.write(i);
        delay(200);
      }
    }
    j += 5;
  }
}
