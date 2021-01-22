import lista.Agenda
import lista.Person

fun main() {
    val banana: Person;
    val pipoca: Person;
    val uva: Person;
    banana = Person(name = "banana", height = 1.77, birthday = "1998");
    pipoca = Person(name = "pipoca", height = 1.65, birthday = "2000");
    uva = Person(name = "uva", height = 1.57, birthday = "1999");
    var agenda: Agenda;
    agenda = Agenda();
    agenda.add(pipoca);
    agenda.add(banana);
    agenda.add(uva);

    println(agenda.printAgenda());
    println(agenda.printPerson(2))
    println(agenda.searchPerson("banana"))

    println(agenda.removePerson("banana"));

    println(agenda.printAgenda());
}