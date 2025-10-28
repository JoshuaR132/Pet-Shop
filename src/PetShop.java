public class PetShop {
    private Pet[] stock;

    public PetShop() {
        stock = new Pet[10];
        stock[0] = new Cat("Whiskers", 2, 45.0);
        stock[1] = new Dog("Buddy", 3, 70.0);
        stock[2] = new Goldfish("Goldie", 1, 15.0);
        stock[3] = new Cat("Mittens", 4, 50.0);
        stock[4] = new Dog("Rex", 5, 80.0);
        stock[5] = new Goldfish("Bubbles", 2, 12.0);
        stock[6] = new Cat("Shadow", 1, 40.0);
        stock[7] = new Dog("Max", 2, 65.0);
        stock[8] = new Goldfish("Splash", 3, 10.0);
        stock[9] = new Dog("Rocky", 4, 75.0);
    }

    public Pet buyCat() {
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] instanceof Cat) {
                Pet pet = stock[i];
                stock[i] = null;
                return pet;
            }
        }
        return null;
    }

    public Pet buyDog() {
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] instanceof Dog) {
                Pet pet = stock[i];
                stock[i] = null;
                return pet;
            }
        }
        return null;
    }

    public Pet buyGoldfish() {
        for (int i = 0; i < stock.length; i++) {
            if (stock[i] instanceof Goldfish) {
                Pet pet = stock[i];
                stock[i] = null;
                return pet;
            }
        }
        return null;
    }

    public Pet buyPetByCost(double budget) {
        Pet bestOption = null;
        for (Pet pet : stock) {
            if (pet != null && pet.getCost() <= budget) {
                if (bestOption == null || pet.getCost() > bestOption.getCost()) {
                    bestOption = pet;
                }
            }
        }

        if (bestOption != null) {
            for (int i = 0; i < stock.length; i++) {
                if (stock[i] == bestOption) {
                    stock[i] = null;
                    break;
                }
            }
        }

        return bestOption;
    }
}