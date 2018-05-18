package ok.lesson13;


public enum Phone {

    APPLE {
        @Override
        public int getPrice() {
            return 2500;
        }
    },
    SAMSUNG {
        @Override
        public int getPrice() {
            return 1500;
        }
    },
    HTC {
        @Override
        public int getPrice() {
            return 2000;
        }
    },
    LG {
        @Override
        public int getPrice() {
            return 500;
        }
    };

    public abstract int getPrice();
}
