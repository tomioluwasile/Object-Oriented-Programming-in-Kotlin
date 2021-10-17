package food_ordering.myapp

open class Item (val name: String, val price: Int)

/** vararg means variable arguments. It allows you to pass multiple arguments of
 * the same type into a function */
class Vegetables(vararg val toppings: String) : Item("Vegetables", 4) {
    // override toString() to return your desired value and not memory address
    override fun toString(): String {
        if (toppings.isEmpty()) {
            return "$name - Chef's choice"
        } else {
            return name + " " + toppings.joinToString()
        }
    }
}

class Noodles : Item("Noodles", 8) {
    // override toString() to return your desired value and not memory address
    override fun toString(): String {
        return name
    }
}

class Soda : Item("Coca-cola", 5) {
    override fun toString(): String {
        return name
    }
}