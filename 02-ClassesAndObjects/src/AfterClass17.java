public class AfterClass17 {
    static class Counter {
        int initValue;
        int endValue;

        public Counter(int endValue) {
            this.initValue = 0;
            this.endValue = endValue;
        }

        void resetInitValue() {
            this.initValue = 0;
        }

        void counterIncrement() {
            this.initValue += 1;
        }

        void counterUpByTen() {
            this.initValue += 10;
        }

        void counterDecrement() {
            this.initValue -= 1;
        }

        void counterDownByTen() {
            this.initValue -= 10;
        }

        void count() {
            while (initValue != endValue) {
                if (endValue > 0) {
                    if ((endValue - initValue) >= 10) {
                        counterUpByTen();
                    } else {
                        counterIncrement();
                    }
                } else {
                    if ((endValue - initValue) <= -10) {
                        counterDownByTen();
                    } else {
                        counterDecrement();
                    }
                }
                System.out.println(initValue);
            }
        }
    }

    public static void main(String[] args) {
        Counter counterOne = new Counter(23);
        Counter counterTwo = new Counter(-47);

        counterOne.count();
        System.out.println();
        counterTwo.count();

    }
}
