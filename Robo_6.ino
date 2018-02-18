#include <LiquidCrystal.h>
const int rs = 7, en = 6, d4 = 5, d5 = 4, d6 = 3, d7 = 2;
LiquidCrystal lcd(rs, en, d4, d5, d6, d7);

int pin1=12;
int pin2=11;
int pin3=10;
int pin4=9;

void setup() 
{
  pinMode(pin1, OUTPUT);
  pinMode(pin2, OUTPUT);
  pinMode(pin3, OUTPUT);
  pinMode(pin4, OUTPUT);
  Serial.begin(9600);
  lcd.begin(16, 2);
  lcd.print("Initializing...");
  delay(2500);
  lcd.clear();
  lcd.print("Hello,I am Robo6");
}

void loop()
{
  if(Serial.available()>0)
  {
    unsigned char data=Serial.read();
    switch(data)
    {
    case 'F':
      digitalWrite(12,HIGH);
      digitalWrite(11,LOW);
      digitalWrite(10,HIGH);
      digitalWrite(9,LOW);
      Serial.println("FORWARD");
      lcd.setCursor(0,1);
    lcd.print("Forward         ");
    break;
    
    case 'B':
      digitalWrite(12,LOW);
      digitalWrite(11,HIGH);
      digitalWrite(10,LOW);
      digitalWrite(9,HIGH);
      Serial.println("BACKWARD");
      lcd.setCursor(0,1);
     lcd.print("Backward       ");
    break;
    
    case 'R':
      digitalWrite(12,HIGH);
      digitalWrite(11,LOW);
      digitalWrite(10,LOW);
      digitalWrite(9,HIGH);
      Serial.println("RIGHT");
      lcd.setCursor(0,1);
    lcd.print("Right           ");
    break;
    
    case 'L':
      digitalWrite(12,LOW);
      digitalWrite(11,HIGH);
      digitalWrite(10,HIGH);
      digitalWrite(9,LOW);
      Serial.println("LEFT");
      lcd.setCursor(0,1);
     lcd.print("Left           ");
    break;
    
    case 'G':
      digitalWrite(12,LOW);
      digitalWrite(11,LOW);
      digitalWrite(10,HIGH);
      digitalWrite(9,LOW);
      Serial.println("FORWARD LEFT");
      lcd.setCursor(0,1);
    lcd.print("Left            ");
    break;
    
    case 'I':
      digitalWrite(12,HIGH);
      digitalWrite(11,LOW);
      digitalWrite(10,LOW);
      digitalWrite(9,LOW);
      Serial.println("FORWARD RIGHT");
      lcd.setCursor(0,1);
    lcd.print("Right           ");
    break;
    
    case 'S':
      digitalWrite(12,LOW);
      digitalWrite(11,LOW);
      digitalWrite(10,LOW);
      digitalWrite(9,LOW);
      Serial.println("STOP");
      lcd.setCursor(0,1);
    lcd.print("Stop            ");
    break;
    
    default : 
      digitalWrite(12, 0);
      Serial.println("INVALID CHOICE");
    }
  }
}
