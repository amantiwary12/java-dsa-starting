package oops;

// encapsulation 
public class carr {
    // class is blue print of objects. it define the structure of field and behaviour method of object

        private int speed;
        private String color;

        public carr(String color){
            this.color = color;
        }
        public void setspeed( int speed){
            if (speed<0) {
                System.out.println("not possible ");
            }else{

                this.speed = speed;
                System.out.println("driving at" + speed);
            }
        }
    }

