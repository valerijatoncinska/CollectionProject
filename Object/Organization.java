package CollectionProject.Object;

public class Organization {
    private static long counter;
    private Long id; //Поле не может быть null, Значение поля должно быть больше 0, Значение этого поля должно быть уникальным, Значение этого поля должно генерироваться автоматически
    private String name; //Поле не может быть null, Строка не может быть пустой
    private Long employeesCount; //Поле не может быть null, Значение поля должно быть больше 0
    private OrganizationType type; //Поле может быть null
    private Address postalAddress; //Поле может быть null

    public Organization(String name, long employeesCount, OrganizationType type, Address postalAddress) {
        Organization.counter++;
        this.id = 400 + Organization.counter;
        this.name = name;
        this.employeesCount = employeesCount;
        this.type = type;
        this.postalAddress = postalAddress;
    }
}


    /*
    Потом нужно будет сделать REFACTOR этого класса под имя клавного объекта, с которым будем работать, вот
    Мб в будущем нужно сделать отдельные классы для класса/конструктора/методов для всего остального здесь,
    если понадобится
    */