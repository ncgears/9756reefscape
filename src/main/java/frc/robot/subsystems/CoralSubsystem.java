
package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * This subsystem handles managing the Template.
 * It is responsible for doing some stuff.
 * @param <SparkMax>
 */
public class CoralSubsystem<SparkMax> extends SubsystemBase {
	private static CoralSubsystem instance;
  private SparkMax m_motor = new SparkMax(1, MotorType.kBrushed);
  //private and public variables defined here

  /**
	 * Returns the instance of the CoralSubsystem subsystem.
	 * The purpose of this is to only create an instance if one does not already exist.
	 * @return CoralSubsystem instance
	 */
  public static CoralSubsystem getInstance() {
		if (instance == null)
			instance = new CoralSubsystem();
		return instance;
	}
  
  public CoralSubsystem() {
    //initialize values for private and public variables, etc.
  	
    init();
  }

  // @Override
  // public void initSendable(SendableBuilder builder) {
  //   super.initSendable(builder);
  //   builder.setActuator(false); //true if this subsystem can move something on the robot
  //   builder.addStringProperty("String Value", null, null);
  // }
  
  /**
   * The init method resets and operational state of the subsystem
   */
  public void init() {
    // set initial stuff, etc.
    // NCDebug.Debug.debug("Template: Initialized");
    //m_motor.setInverted(false);
  }
  
  @Override
  public void periodic() {
  }

  public void runMotor() {
    //m_motor.set(0.25);
  }
  public void stopMotor() {
    //m_motor.set(0);
  }

}
