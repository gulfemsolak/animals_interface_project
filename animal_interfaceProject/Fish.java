package animals_interface_project.animal_interfaceProject;

public class Fish implements Prey,Predator{

    @Override
    public void flee() {
        System.out.println("The smaller fish escape from the bigger fish. ");
    }

    @Override
    public void hunt() {
        System.out.println("The bigger fish hunts smaller fish.");
    }
    
}
