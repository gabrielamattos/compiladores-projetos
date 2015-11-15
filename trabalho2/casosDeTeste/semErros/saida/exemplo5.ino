#include <Wire.h>
#include "rgb_lcd.h"

rgb_lcd lcd;

const int tempo = 1000;
const int pinoPot = A1;
const int pinoLCD = 21;

float y;


void imprimeLCD(float y)
{
	String mensagem;

	mensagem = "Potencia dada é " + y;
	lcd.print(mensagem);
}

void setup()
{	
	pinMode(pinoPot, INPUT);
	pinMode(pinoLCD, OUTPUT);

	lcd.begin(16,2);
}

void loop()
{
	y = analogRead(pinoPot);
	y = map(y, 0, 1023, 0, 255);

	lcd.setRGB(10, 10, 10);
	imprimeLCD(y);
	delay(tempo);

}
