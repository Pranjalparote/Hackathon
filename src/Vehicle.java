/*Inheritance Challenge
Start with a base class of a Vehicle, then create a Car class that inherits from this base class. Finally, create another class, a specific type of Car (Say Honda City) that inherits from the Car class. You should be able to hand steering, changing gears, and moving (speed in other words).
You will want to decide where to put the appropriate state and behaviours (fields and methods).
As mentioned above, changing gears, increasing/decreasing speed should be included.
For specific type of vehicle you will want to add something specific for that type of car.
*/

class Vehicle
{
    public String getVehicleType()
    {
        System.out.println("Enter type of vehicle");
        return "Car";
    }


}


  class car extends Vehicle
{
    public Integer getSpeed(int a)
    {
     int speed=a;
     return speed;
    }

}

class HondaCity extends car
{
    public static void main(String args[]) {
        HondaCity hondacity = new HondaCity();
        hondacity.getSpeed(20);
        hondacity.getVehicleType();
    }
}
