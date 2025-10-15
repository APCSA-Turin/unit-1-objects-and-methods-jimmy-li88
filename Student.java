public class Student {
        private String name;
        private String gender;
        private float height;
        private float weight;

        public Student(String studentName, String studentGender, float studentHeight, float studentWeight) {
            name = studentName;
            gender = studentGender;
            height = studentHeight;
            weight = studentWeight;
        }
        public void bmi() {
            System.out.println("name: " + name);
            System.out.println("gender: " + gender);
            System.out.println("height: " + height);
            System.out.println("weight: " + weight);
            if (gender.equals("male")){
                if (height <= 67 && weight >= 164){
                    System.out.println(name + " is overweight");
            }
                else if (height <= 67 && weight < 164){
                    System.out.println(name + " is healthy / underweight");
            }
                else if (height < 67 && weight >= 189){
                    System.out.println(name + " is overweight");
            }
        }
            else if (gender.equals("female")){
                if (height <= 62 && weight >= 140){
                    System.out.println(name + " is overweight");
            }
                else if (height <= 62 && weight < 140){
                        System.out.println(name + " is healthy / underweight");
                }
                else if (height < 62 && weight >= 164){
                    System.out.println(name + " is overweight");
            }
        }
        }
    }
