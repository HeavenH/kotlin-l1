package lista

class Agenda {

    private var persons = mutableListOf<Person>();

     fun add(person: Person): Person {
        persons.add(person)
        return person;
    }

    fun printAgenda() {
        for (per in persons) {
            println(per)
        }
    }

    fun printPerson(index: Int) {
        if (index > persons.size) {
            println("não é possivel printar")
        } else {
            println(persons[index]);
        }
    }

    fun searchPerson(name: String): Person? {
        var personFind = persons.find { person -> person.name.equals(name) }
        return personFind;
    }

    fun removePerson(name: String) {
        persons.removeIf { t: Person -> t.name.equals(name) };
    }
}