#include <Servo.h>

Servo Sx;
int i;

void setup()
{
Sx.attach(9);
}

void loop()
{
  for(i=55;i<=125;i=i+2)
  {
    Sx.write(i);
  delay(200);
  }
  for(i=125;i>=55;i=i-2)
  {
    Sx.write(i);
  delay(200);
  }
}
