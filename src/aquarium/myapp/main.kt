package aquarium.myapp

fun buildAquarium() {
    // bezosAquarium is created from the main class "Aquarium" which is rectangular in shape
    val bezosAquarium = Aquarium(length = 30, width = 15, height = 40)
    bezosAquarium.printSize()

    // elonAquarium is created from the subclass "TowerTank" which is cylindrical in shape
    val elonAquarium = Aquarium.TowerTank(height = 40, diameter = 20)
    elonAquarium.printSize()

}

fun makeFish() {
    val shark = AquariumFish.Shark()
    val pleco = AquariumFish.Plecostomus()

    println("Shark: ${shark.colour}")
    shark.eat()
}

fun main() {
    //buildAquarium()
    makeFish()
}