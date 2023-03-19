package AbstractFactory;

public class Main {
    public static void main(String args[])
    {
        AbstractFactory abstractFactory = AbstractFactoryProducer.getProfession(true);
        Profession TraineeEngineer = abstractFactory.getProfession("Engineer");
        Profession TraineeTeacher = abstractFactory.getProfession("Teacher");
        TraineeEngineer.print();
        TraineeTeacher.print();
    } 
}
