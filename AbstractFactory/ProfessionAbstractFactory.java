package AbstractFactory;


public class ProfessionAbstractFactory extends AbstractFactory{
    public Profession getProfession( String typeOfProfession )
    {
        if( typeOfProfession.equals("Engineer"))
        {
            return new Engineer();
        }
        else if( typeOfProfession.equals("Teacher"))
        {
            return new Teacher();
        }
        else
            return null;
    }
    
}
