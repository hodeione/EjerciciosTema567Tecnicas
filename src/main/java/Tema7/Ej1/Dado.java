package Tema7;
import java.util.Random;

public class Dado {


        private int num_caras;
        private int ultima_cara;

        public Dado() {
            this.num_caras = 6;
            this.ultima_cara = 0;
        }

        public Dado(int num_caras) {
            this.num_caras = num_caras;
            this.ultima_cara = 0;
        }

        public int getNumCaras() {
            return this.num_caras;
        }

        public int getUltimaCara() {
            return this.ultima_cara;
        }

        public void setNumCaras(int num_caras) {
            this.num_caras = num_caras;
        }

        public int tirar() {
            Random rand = new Random();
            this.ultima_cara = rand.nextInt(this.num_caras) + 1;
            return this.ultima_cara;
        }
    }

