
package frc.robot.subsystems;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkBase.ResetMode;
import com.revrobotics.spark.SparkBase.PersistMode;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.SparkMaxConfig;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * This subsystem handles managing the Template.
 * It is responsible for doing some stuff.
 * @param <SparkMax>
 */
public class CoralSubsystem extends SubsystemBase {
	private static CoralSubsystem instance;
  private SparkMax m_motor; 
  // new SparkMax(1, com.revrobotics.spark.SparkLowLevel.MotorType.kBrushed);
  
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

  /**
   * The init method resets and operational state of the subsystem
   */
  public void init() {
    // set initial stuff, etc.
    SparkMaxConfig defaultConfig = new SparkMaxConfig();
    defaultConfig
      .smartCurrentLimit(50)
      .idleMode(IdleMode.kBrake)
      .inverted(false);

      m_motor = new SparkMax(1, MotorType.kBrushed);
      m_motor.configure(defaultConfig, ResetMode.kResetSafeParameters, PersistMode.kPersistParameters);
    //m_motor.setInverted(false);
  }
  
  @Override
  public void periodic() {
  }

  public void runMotor() {
    m_motor.set(0.25);
  }
  public void stopMotor() {
    m_motor.set(0);
  }

}
