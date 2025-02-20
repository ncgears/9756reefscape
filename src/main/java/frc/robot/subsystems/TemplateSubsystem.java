
package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * This subsystem handles managing the Template.
 * It is responsible for doing some stuff.
 */
public class TemplateSubsystem extends SubsystemBase {
	private static TemplateSubsystem instance;
  //private and public variables defined here

  /**
	 * Returns the instance of the TemplateSubsystem subsystem.
	 * The purpose of this is to only create an instance if one does not already exist.
	 * @return TemplateSubsystem instance
	 */
  public static TemplateSubsystem getInstance() {
		if (instance == null)
			instance = new TemplateSubsystem();
		return instance;
	}
  
  public TemplateSubsystem() {
    //initialize values for private and public variables, etc.
  	
    init();
  }

  
  /**
   * The init method resets and operational state of the subsystem
   */
  public void init() {
    // set initial stuff, etc.
  }
  
  @Override
  public void periodic() {
  }

}
