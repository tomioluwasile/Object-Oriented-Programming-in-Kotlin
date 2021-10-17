package food_ordering.myapp

// This class creates customer orders by adding and printing summary
class Order (val orderNumber: Int) {
    private val itemList = mutableListOf<Item>()

    // This function adds a single newItem to the empty mutable list
    fun addItem(newItem: Item): Order {
        itemList.add(newItem)
        return this
    }

    // This function collates all the items into one single list
    fun addAll(newItems: List<Item>): Order {
        itemList.addAll(newItems)
        return this
    }

    // Print order
    fun print() {
        println("Order No.$orderNumber")
        var total = 0
        for (item in itemList) {
            println("${item}: $${item.price}")
            total += item.price
        }
        println("Your order total: $$total")
    }
}