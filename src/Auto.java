public class Auto 
{
    public class Motor
    {
        private String tipoMotor;
        public Motor(String tipoMotor)
        {
            this.tipoMotor = tipoMotor;
        }
        public String getTipoMotor()
        {
            return this.tipoMotor;
        }
    }
        private Motor motor;
        public Auto(String tipoMotor)
        {
            this.motor = new Motor(tipoMotor);
        }
            public void mostrarTipoMotor()
            {
               System.out.println("El tipo de motor es :" + this.motor.getTipoMotor());
            }
    }
