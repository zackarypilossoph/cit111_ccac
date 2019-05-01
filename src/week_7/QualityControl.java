Zack Pilossoph
package week_7;

import java.util.Random;

/**
 *
 * @author zackary.pilossoph
 */
public class QualityControl {

    public static void main(String[] args) {
        final int UPPER_END_OF_RANGE = 100;
        int unitQuality = 0;
        final int QUALITY_THRESHOLD = 50;
        final int UNITS_TO_MAKE = 50;
        int totalFailures = 0;
        int totalUnitsMade = 0;

        // creating random generator object
        Random randGenerator = new Random();
        while (totalUnitsMade < UNITS_TO_MAKE) {

            unitQuality = randGenerator.nextInt(UPPER_END_OF_RANGE);

            if (unitQuality < QUALITY_THRESHOLD) {
                totalFailures++;
                totalUnitsMade++;
                System.out.println("Unit Quality: " + unitQuality + " " 
                        + "Quality is below threshold ");
                System.out.println("Total failures: " + totalFailures + " " 
                        + totalUnitsMade);
            } else {
                totalUnitsMade++;
                System.out.println("Unit Quality: " + unitQuality + " " 
                        + "Quality is above threshold ");
                System.out.println("Quality meets the standard threshold: " 
                        + totalFailures);

            }
        }

    }
}
