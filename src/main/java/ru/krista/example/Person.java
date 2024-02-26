package ru.krista.example;

public class Person {
    public int yearBirth;
    public String name;

    public static void main(String[] args) {
      Person person = new Person();
      String name = person.getName();
      System.out.println(name);

      person.printPersonFieldValues();
    }
   
    public String getName() {
      if (this.name == null) {
        return "Я не знаю как меня зовут";
      }
      return "Меня зовут " + this.name;
    }

    public void printPersonFieldValues() {
      System.out.println(this.yearBirth);
      System.out.println(this.name);
    }
}
