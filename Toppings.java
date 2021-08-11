class Tofu extends ToppingDecorator {
    ThaiDish tofu;
    public Tofu(ThaiDish tofu) {
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
    ThaiDish chicken;
    public Chicken(ThaiDish chicken) {
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
    ThaiDish beef;
    public Beef(ThaiDish beef) {
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
    ThaiDish pork;
    public Pork(ThaiDish pork) {
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
    ThaiDish shrimp;
    public Shrimp(ThaiDish shrimp) {
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
    ThaiDish duck;
    public Duck(ThaiDish duck) {
        this.duck = duck;
    }
    public String getItemName() {
        return duck.getItemName() + " with Duck ";
    }
    public int price() {
        return 5 + duck.price();
    }
}
