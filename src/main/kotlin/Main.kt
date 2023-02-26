 fun main(){
     var name="Mary"
      name ="Anna"
     println(name)

     val person="John"
     println(person)

     var year:Byte=40
     println(year)

     var yaer1First:Byte=-111
     println(yaer1First)

     var year2=30
     println(year2)
     var v =number("Angeth ",50)
     println(v)
      people("Becky ","John")
     student()
     var m=man("Jok ","dav ",40)
     println(m)
     friends()
     var a =addition(89,56)
     println(a)
     modulus()
     difference(990,56)
     years()
     weight()
     letters()
     alphabet()
     numerical()
     comparison()
     sign()
     quotation()
     printName("Deng")
     mummy("Achan")
     var y=substraction(89,56)
     println(y)
     println("James " + "John")
     compass()
     fruit()
     fruits()
     interpolate()
     sudanese("Atong","Aluel")
     manipulte()
     president()
     place()
     country()
     word()


 }
 fun number(me:String,num1:Int):String{
     var sentence=me+num1
     return sentence
 }
fun people(person1:String,person2:String){
    println(person1+person2)

}
 fun student(){
     var age:Byte=30
     println(age)
 }
 fun man(man1:String,man2:String,man3:Int):String{
     var male=man1+man2+man3
     return male

 }
fun friends(){
    val friend = arrayOf("Faith","Betty","Esther")
    println(friend)

}
 fun addition(num3:Int,num4:Int):Int{
     var addition=num3+num4
     return addition
 }
 fun modulus(){
     var num5=42
     var num6=8
     var remainder=num5%num6
     println(remainder)
 }
 fun difference(num7:Int,num8:Int){
     var difference=num7-num8
     println(difference)
 }
 fun years(){
     var age=19
     ++age
     println(age)
 }
 fun weight(){
     var kilograms=78
     --kilograms
     println(kilograms)
 }
 fun letters(){
     var a=45
     var b=20
     a>b
     println(a>b)
 }
 fun alphabet(){
     var c=24
     var d=20
     c<d
     println(c<d)
 }
 fun numerical(){
     var e=46
     var f=36
     e>=f
     println(e>=f)
 }
 fun comparison(){
     var g=67
     var h=58
     g<=h
     println(g<=h)
 }
 fun sign(){
     var i=69
     var j=56
     i==j
     println(i==j)
 }
 fun quotation(){
     var k=89
     var l=90
     k!=l
     println(k!=l)
 }
 fun average(m:Double,n:Double):Double{
     return m+n
 }
 fun printName(name:String){
     println("Hello,my name is "+name)
 }
fun mummy(name:String){
    println("My mummy's name is "+name)
}
 fun substraction(num9: Int,num10:Int):Int{
     return num9-num10
 }
 fun fullName(firstName: String,secondName:String):String{
     var fullName=firstName+secondName
     return fullName
 }
 fun compass(){
     var x="My compass name is "
     var name="AkiraChix"
     println(x +"" + name)
 }
 fun fruit(){
     var f="Banana"
     println(f[0])
     println(f[1])
     println(f[2])
     println(f[3])
     println(f[4])
     println(f[5])
 }
 fun fruits(){
     var text="Apple"
     println(text.indexOf("A"))
     println(text.indexOf("p"))
     println(text.indexOf("p"))
     println(text.indexOf("l"))
     println(text.indexOf("e"))
     println(text.lastIndexOf("p"))
 }
 fun interpolate(){
     var lawyer="Ajak"
     var place="Kenya"
     var age=28
     var sentence="$lawyer lives in $place, he is a $age years old."
     println(sentence)
 }
 fun sudanese(sud1:String,sud2:String){
     var sud1 ="Atong"
     var sud2="Cynthia"
     if (sud1==sud2)
         println("That's one of them!")
     else{
         println("Confused nationality!!")
     }
 }
 fun manipulte(){
     var known="Africa inventor"
     println(known.uppercase())
     println(known.lowercase())
     println(known.capitalize())
     println(known.decapitalize())
 }
 fun president(){
     var him=" Salva Mayardit "
     println(him.trimStart())
     println(him.trimEnd())
     println(him.trimMargin())
     println(him.trim())
 }
 fun place(){
     var location="Nairobi"
     println(location.startsWith("i"))
     println(location.endsWith("u"))
     println(location.startsWith("N"))
 }
 fun country(){
     var text="Uganda comes from Sudan"
     println(text.replace("Uganda","South Sudan"))
 }
 fun word(){
     val birds="hen,chicken,falcon,owl,eagle"
     val word=birds.split("chicken")
     println(birds)
     println(birds[1])
 }

