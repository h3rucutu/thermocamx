#include <Servo.h>
Servo Sx;
int i = 0;

void setup() {
  Sx.attach(9);
}

void loop() {
  for(i = 0; i <= 70; i += 1){
    Sx.write(i);
    delay(200);
  }
  for(i = 70; i >= 0; i -= 1){
    Sx.write(i);
    delay(200);
  }
}
