public class UD5Tarea34 {
    static class Forma {
        String nombre;
        private int area;

        public Forma(String nombre){
            this.nombre = nombre;

        }

        @Override
        public String toString() {
            return nombre;
        }

        public double area() {
            this.area = area;
            return 0;

        }
        static class Esfera extends Forma{
            private double radio;
            private double area;
            public Esfera(double radio) {
                super("Esfera");
                this.radio = radio;
            }

            public double area() {
                return 4 * Math.PI * Math.pow(radio, 2);
            }

            @Override
            public String toString() {
                return "Esfera{" +
                        "nombre='" + nombre + '\'' +
                        ", radio=" + radio +
                        ", area=" + area +
                        '}';
            }
        }

        static class Rectángulo extends Forma{
            public Rectángulo(double longitud, double ancho) {
                super("Rectángulo");
                this.longitud = longitud;
                this.ancho = ancho;
            }
            private double longitud;
            private double ancho;

            public double area(){
                return longitud * ancho;
            }

            @Override
            public String toString() {
                return "Rectángulo{" +
                        "nombre='" + nombre + '\'' +
                        ", longitud=" + longitud +
                        ", ancho=" + ancho +
                        '}';
            }
        }

        static class Cilindro extends Forma{
            public Cilindro(double radio, int altura) {
                super("Cilindro");
                this.altura = altura;
                this.radio = radio;
            }
            private double radio;
            private double altura;

            public double area(){
                return 2 * Math.PI * Math.pow(radio, 2) * altura;
            }

            @Override
            public String toString() {
                return "Cilindro{" +
                        "nombre='" + nombre + '\'' +
                        ", radio=" + radio +
                        ", altura=" + altura +
                        '}';
            }
        }

        static class Pintura {
            private double cobertura;

            public Pintura(double cobertura){
                this.cobertura = cobertura;
            }

            public double cantpint (Forma Objeto){
                return Objeto.area() / cobertura;
            }


        }

        public static class MainPintura{
            public static void main(String[] args) {
                Pintura pintura = new Pintura(250);
                Forma esfera = new Esfera(15);
                Forma rectangulo = new Rectángulo(20,35);
                Forma cilindro = new Cilindro(10, 30);

                System.out.println(rectangulo.toString());
                System.out.println(pintura.cantpint(rectangulo));
                System.out.println(esfera.toString());
                System.out.println(pintura.cantpint((esfera)));
                System.out.println(cilindro.toString());
                System.out.println(pintura.cantpint(cilindro));

            }

        }
    }
}
