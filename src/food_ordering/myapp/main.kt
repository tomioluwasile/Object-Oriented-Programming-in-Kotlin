package food_ordering.myapp

// Order items you want here
fun main() {
    // Store all the orders in one mutable list
    val ordersList = mutableListOf<Order>()

    // Add items individually using .addItem
    val orderForElon = Order(1)
    orderForElon.addItem(Vegetables("onions", "cabbage"))
    orderForElon.addItem(Noodles())
    orderForElon.addItem(Soda())
    // add new order to the orders list
    ordersList.add(orderForElon)

    // Add all items using addAll
    val orderForBezos = Order(2)
    orderForBezos.addAll(listOf((Vegetables("cabbage")), Noodles()))
    // add new order to the orders list
    ordersList.add(orderForBezos)

    // Here is a chained order call
    val orderForJack = Order(3).addItem(Vegetables()).addItem(Soda())
    //add new order to the orders list
    ordersList.add(orderForJack)

    // Here is a better way to make orders without creating variable names
    ordersList.add(
        Order(4)
            .addItem(Soda())
            .addItem(Vegetables("tomato"))
    )

    // This function prints the entire orders list and tags each order
    fun print() {
        for (order in ordersList) {
            order.print()
            println()
        }
    }
    print()
}