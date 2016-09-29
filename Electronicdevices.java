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
}
class Tv extends Electronicdevices
{
public void speaker()
{
System.out.println("Tv Speakers");
}
}
class CellPhone extends Electronicdevices
{
public void speaker()
{
System.out.println("CellPhone Speakers");
}
}
class DeviceAvailable
{
public static void main(String args[])
{
Electronicdevices e = new Radio();
e.speaker();e.details();
}
}