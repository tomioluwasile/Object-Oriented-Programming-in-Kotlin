package aquarium.myapp

import kotlin.math.PI

open class Aquarium (open var length: Int = 200, open var width: Int = 40, open var height: Int = 80) {
    /** class and its properties are marked open to allow other subclasses to be created.
    Here, cylindrical aquarium would be created as a subclass. */

    init {
        println("Aquarium initializing")
    }

    // volume is a property with a getter that returns calculated volume (in litres) of the aquarium
    open var volume: Int
        get() = length * width * height / 1000 // 1 liter = 1000 cm^3

        // This is a property setter for the height.
        set (value) {
            // Recalculate the height based on the supplied volume of water
            height = (value * 1000) / (width * length)
        }

    // water is a property with a getter that returns 90% of the volume of the Aquarium
    open val shape = "Rectangle"
    open var water: Double = 0.0
        get() = volume * 0.9

    // Secondary constructor to calculate volume of aquarium based on the number of fish
    constructor (numberOfFish: Int) : this() {
        // Assume 2 litres of water per fish + some extra room
        val tank = numberOfFish * 2000 * 1.1

        // calculate the height needed
        height = (tank / (length * width)).toInt()
    }

    class TowerTank (override var height: Int, var diameter: Int):
        Aquarium(length = diameter, width = diameter, height = height) {
        /** The default shape of the aquarium class is rectangle, therefore create a subclass with a cylindrical
         * shape called TowerTank. The "override" keyword overrides the height property created earlier in the
         * constructor
         */

        override var volume: Int
            // ellipse area is PI * r1 * r2
            get () = length/2 * width/2

            // This is a property setter for the height.
            set (value) {
                // Recalculate the height based on the supplied volume of water
                height = ((value * 1000) / (PI * length/2 * width/2)).toInt()
            }

        // Override the shape and water properties. Water should now be at 80% of the volume
        override val shape = "Cylinder"
        override var water = volume * 0.8
    }

    // Print properties of the aquarium
    fun printSize() {
        println("Shape: $shape")
        println("Length: $length cm " +
                "Width: $width cm " +
                "Height: $height cm"
        )
        println("Volume: $volume l  Water: $water l  @${water/volume * 100}% full")
    }
}