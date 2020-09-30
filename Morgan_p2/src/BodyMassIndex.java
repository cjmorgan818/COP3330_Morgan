import java.util.Scanner;

public class BodyMassIndex {
    private double weight;
    private double height;
    private double bmi;
    private int choice;
    private double userHeight;
    private double userWeight;
    private boolean moreInput;

    public void moreInput(){

    }
    public BodyMassIndex(double userHeight, double userWeight) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            // Getting the input entered by the user
            System.out.print("Enter Weight (in Pounds):");
            this.userWeight = userWeight;

            System.out.print("Enter Height (in inches):");
            this.userHeight = userHeight;

            break;
        }
    }

    public boolean isUserInput() {
        return moreInput;
    }

    public void setUserInput(boolean userInput) {
        this.moreInput = moreInput;
    }


    public double getUserHeight() {
        return userHeight;
    }

    public double getUserWeight() {
        return userWeight;
    }

    public void setUserHeight(double userHeight) {
        this.userHeight = userHeight;
    }

    public void setUserWeight(double userWeight) {
        this.userWeight = userWeight;
    }


    public void calculateBMI() {
        if (choice == 1) {

            bmi = (weight * 703) / (height * height);

        } else {
            bmi = weight / (height * height);

        }
    }

    public void displayBmi() {
        String category = "";
        if (bmi < 18.5)
            category = "UnderWeight";
        else if (bmi >= 18.5 && bmi <= 24.9)
            category = "Normal";
        else if (bmi >= 25 && bmi <= 29.9)
            category = "OverWeight";
        else if (bmi >= 30)
            category = "Obese";
        System.out.println("YOur BMI:" + bmi);
        System.out.println("You are " + category);

    }
}



