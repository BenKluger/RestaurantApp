class Tofu extends ToppingDecorator {
    MainDish tofu;
    public Tofu(MainDish tofu) {
        this.tofu = tofu;
    }
    public String getItemName() {
        return tofu.getItemName() + " with Tofu ";
    }
    public int price() {
        return 0 + tofu.price();
    }
}

class Chicken extends ToppingDecorator {
    MainDish chicken;
    public Chicken(MainDish chicken) {
        this.chicken = chicken;
    }
    public String getItemName() {
        return chicken.getItemName() + " with Chicken ";
    }
    public int price() {
        return 1 + chicken.price();
    }
}

class Beef extends ToppingDecorator {
    MainDish beef;
    public Beef(MainDish beef) {
        this.beef = beef;
    }
    public String getItemName() {
        return beef.getItemName() + " with Beef ";
    }
    public int price() {
        return 3 + beef.price();
    }
}

class Pork extends ToppingDecorator {
    MainDish pork;
    public Pork(MainDish pork) {
        this.pork = pork;
    }
    public String getItemName() {
        return pork.getItemName() + " with Pork ";
    }
    public int price() {
        return 3 + pork.price();
    }
}

class Shrimp extends ToppingDecorator {
    MainDish shrimp;
    public Shrimp(MainDish shrimp) {
        this.shrimp = shrimp;
    }
    public String getItemName() {
        return shrimp.getItemName() + " with Shrimp ";
    }
    public int price() {
        return 4 + shrimp.price();
    }
}

class Duck extends ToppingDecorator {
    MainDish duck;
    public Duck(MainDish duck) {
        this.duck = duck;
    }
    public String getItemName() {
        return duck.getItemName() + " with Duck ";
    }
    public int price() {
        return 5 + duck.price();
    }
}
