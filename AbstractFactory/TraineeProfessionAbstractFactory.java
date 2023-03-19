package AbstractFactory;


public class TraineeProfessionAbstractFactory extends AbstractFactory{
    public Profession getProfession(String typeOfProfession)
    {
        if( typeOfProfession.equals("Engineer"))
            return new TraineeEngineer();
        else if( typeOfProfession.equals("Teacher"))
            return new TraineeTeacher();
        else 
            return null;
    }
    
}
