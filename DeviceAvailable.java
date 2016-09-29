class Electronicdevices
{
public void speaker()
{
System.out.println("Speakers");
}

public void details()
{
System.out.println("Tv radio Cellphone");
}
}

class Radio extends Electronicdevices
{
public void speaker()
{
System.out.println("Radio Speakers");
}
public void Antenna()
{
System.out.println("long rod");
}
}
class Tv extends Electronicdevices
{
public void speaker()
{
System.out.println("Tv Speakers");
}
public void bigScreen()
{
System.out.println("picture tube");
}
}
class CellPhone extends Electronicdevices
{
public void speaker()
{
System.out.println("CellPhone Speakers");
}
public void Touch()
{
System.out.println("Swipe");
}
}
class DeviceAvailable
{
public static void main(String args[])
{
Electronicdevices e = new Radio();
System.out.println("--------------Dynamic Method Invocation output--------------");

e.speaker();/*invoking overriden  method*/

e.details();/*invoking base class method*/

Radio ar = (Radio)e;

System.out.println("---------------------Casting output----------------------");

ar.details();/*invoking base class method*/

ar.speaker();/*invoking overriden  method*/

ar.Antenna();/*invoking child class method*/
}
}