Задача 1: (за домашно)
Да се декларират 3 обекта от класовете Сфера, Пирамида и Призма (наследяващи общ клас – например Shape3D). 
Да се напише метод, който да връща обект от тип Сфера.
Shape3D sphere = getSphere(Shape3D shapeOne, Shape3D shapeTwo, Shape3D shapeThree);

Задача 2: (за работа в час!)
1. Нека са дадени класовете Sphere, Pyramid, Prism и Shape3D, и интерфейсите 
	IDrawable (с метод public void draw(); ) 	и 
	IPrintable (с метод public void print();), 
	като (като метода draw изписва "изчертава се обекта с обем ХХХ", а
	метода print изписва съобщението: „Отпечатва се обекта (от тип…сфера/ prism) с обем YYY).
2. Класа Shape3D има метод public void play(); 
	- ако обекта е от тип IDrawable да извиква метода draw, 
	- ако е IPrintable, да се вика метода print();
	- (a ако има и двата интерфейса – да се викат и двата метода);
3. Класа Sphere да наследява класа Shape3D и да имплементира интерфейса IDrawable
4. Класа Pyramid да наследява класа Shape3D и да имплементира интерфейса IPrintable
5. Класа Prism да наследява класа Shape3D и да имплементира интерфейсите IDrawable и IPrintable
6. Класа Shape3D има метод public static void dumpShapes3D(Shapes3D [] shapes);
	- ако обекта е от тип IDrawable да извиква метода draw, 
	- ако е IPrintable, да се вика метода print(); 
	- (a ако има и двата интерфейса – да се викат и двата метода);
7. Да се напише тестов клас Shapes3DTest, в който е main функцията, 
   в която се прави масив от 10 обекта, и да се извика функцията dumpShapes3D (който е статичен).