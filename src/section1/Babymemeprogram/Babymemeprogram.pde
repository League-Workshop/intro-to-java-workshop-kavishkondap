void setup(){
  size(500,500);
  PImage baby = loadImage("babymeme.png");
  baby.resize (width,height);
  background (baby);
 fill(0);
 textSize(40);
  text ("TESTED MY PROGRAM",50,75);
 
}
void draw(){
   if (mousePressed){
  textSize(40);
   fill(#FA0000);
  text ("IT WORKED FIRST TIME", 40,450);
}}
