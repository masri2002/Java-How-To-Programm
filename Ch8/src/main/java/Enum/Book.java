package Enum;

public enum Book {

    JHTP("Java How To Prgramm" , "2015"),
    CHTP("C How to Program", "2013"),
    IW3HTP("Internet & World Wide Web How to Program", "2012"),
    CPPHTP("C++ How to Program", "2014"),
    VBHTP("Visual Basic How to Program", "2014"),
    CSHARPHTP("Visual C# How to Program", "2014");
    private final String title;
    private final String year;
    Book(String name ,String year){
      this.title=name;
      this.year=year;
    }

    public String getTitle() {
        return title;
    }

    public String getYear() {
        return year;
    }
}
