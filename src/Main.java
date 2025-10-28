public class Main {
    public static void main(String[] args) {
        PetShop shop = new PetShop();

        Pet boughtCat = shop.buyCat();
        if (boughtCat != null) {
            System.out.println("Bought a cat: " + boughtCat.getName());
            if (boughtCat instanceof Strokeable) {
                ((Strokeable) boughtCat).stroke();
            }
        } else {
            System.out.println("No cats available.");
        }

        Pet boughtDog = shop.buyDog();
        if (boughtDog != null) {
            System.out.println("Bought a dog: " + boughtDog.getName());
            if (boughtDog instanceof Strokeable) {
                ((Strokeable) boughtDog).stroke();
            }
        } else {
            System.out.println("No dogs available.");
        }

        Pet boughtFish = shop.buyGoldfish();
        if (boughtFish != null) {
            System.out.println("Bought a goldfish: " + boughtFish.getName());
            boughtFish.makeNoise();
        } else {
            System.out.println("No goldfish available.");
        }

        Pet affordablePet = shop.buyPetByCost(50.0);
        if (affordablePet != null) {
            System.out.println("Bought a pet within budget: " + affordablePet.getName() + " for $" + affordablePet.getCost());
            affordablePet.makeNoise();
        } else {
            System.out.println("No pets available within budget.");
        }
    }
}