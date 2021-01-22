package lista

open class Person(name: String, height: Double) {
    constructor(name: String, height: Double, birthday: String) : this(name, height) {
        this.name = name;
        this.height = height;
        this.birthday = birthday
    }

    var name: String? = null
    var birthday: String? = null
    var age: Int? = null
    var height: Double? = null

    init {
        this.name = name;
        this.height = height;
    }

    private fun calcAge(birthday: Int): Int {
        return (2021 - birthday);
    }

    override fun toString(): String {
        return "$name ($birthday, $height)"
    }
}