package People

import Person

class Employee (override var name: String, override var surname: String, override var idNumber: Int, override var cellphoneNumber: Int, var emailAddress: String) : Person(name, surname, idNumber, cellphoneNumber, emailAddress) {
}