#include <Servo.h>
Servo Sx;
Servo Sy;
int i = 0, p = 0;

void setup() {
  Sx.attach(9);
  Sy.attach(10);
}

/*void loop() {
  for(p = 0; p <= 60; p +=5) {
    for(i = 0; i <= 70; p += 1) {
      if(i == 70) {
        Sy.write(p);
        delay(1000);
      }
      else {
        Sx.write(i);
        delay(200);
      }
    }
    for(i = 70; i >= 0; i -= 1) {
      if(i == 0) {
        Sy.write(p);
        delay(1000);
      }
      else {
        Sx.write(i);
        delay(200);
      }
    }
  }
}
*/

void loop() {
  for(i = 0; i <= 70; i += 1) {
    if(i == 70) {
      for(p = 0; p <= 60; p += 5) {
      Sy.write(p);
      delay(200);
      }
    }
    else {
      Sx.write(i);
      delay(200);
    }
  }
  for(i = 70; i >= 0; i -= 1) {
    if(i == 0) {
      for(p = 0; p <= 60; p += 5) {
      Sy.write(p);
      delay(200);
      }
    }
    else {
      Sx.write(i);
      delay(200);
    }
  }
}
