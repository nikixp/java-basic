package com.example.basics9;

/**
 *
 * @author Student
 */
public class Earth {

    class Oceans {

        class AtlanticOcean {
        }

        class PasificOcean {
        }

    }

    class Continentals {

        final Counter c = new Counter();

        public Continentals(int id) {
            System.out.println("Continentals constructor... id=" + id);
        }

        public Continentals() {
            c.increase();
            System.out.println("Continentals constructor..." + c.count);
        }

        class Europe {

            Continentals c;

            public Europe(Continentals c) {
                System.out.println("Europe constructor...");
                this.c = c;
            }

            public Continentals getC() {
                return c;
            }

            public void setC(Continentals c) {
                this.c = c;
            }

        }

        class Africa {

            public Africa() {
                System.out.println("Africa constructor...");
            }
        }

        class Asia {
        }

        class Australia {
        }

        class NorthAmerica {
        }

        class SouthAmerica {
        }
    }

}
