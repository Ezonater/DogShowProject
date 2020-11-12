import java.util.Random;
public class RandomDogFactory {

        enum DogTypes {
            Poodle,Beagle,Basenji,Chihuahua
        };

        public ShowDog createShowDog(){
            ShowDog showDog = null;
            Random rg = new Random();
            DogTypes dt = DogTypes.values()[rg.nextInt(DogTypes.values().length)]; //one of the enum values at random
            String dtString = dt.toString();
            try{
                showDog = (ShowDog)Class.forName(dtString).newInstance();
            }
            catch(Exception e){

            }

            showDog.setName(showDog.getClass().getSimpleName() + rg.nextInt(1000));
            return showDog;
        }
    }

