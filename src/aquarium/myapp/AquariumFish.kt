package aquarium.myapp

abstract class AquariumFish {
    // an abstract class which contains subclasses Shark and Plecostomus
    abstract val colour: String

    /** interface is similar to abstract. Just like class "Shark" and "Plecostomus" were created
     * from abstract class "AquariumFish", "eat" function was created from interface "FishAction".
     * However, abstract classes can have constructors while interfaces cannot.
     */
    interface FishAction {
        fun eat()
    }

    class Shark: AquariumFish(), FishAction {
        override val colour = "grey"
        override fun eat() {
            println("Hunt and eat fish")
        }
    }

    class Plecostomus: AquariumFish(), FishAction {
        override val colour = "gold"
        override fun eat() {
            println("Eat algae")
        }
    }
}