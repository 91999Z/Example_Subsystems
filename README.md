# FRC Subsystem Skeleton (Java)

A reusable, command-based WPILib project scaffold for starting future FRC robot code. The project deliberately contains no autonomous routines, robot behavior, or vendor libraries. All subsystem classes are inert placeholders and require no connected hardware.

## Project layout

- `src/main/java/frc/robot` — robot entry point, lifecycle, container, and constants.
- `src/main/java/frc/robot/subsystems` — one minimal class for each commonly used mechanism.
- `src/main/java/frc/robot/commands` — intentionally empty command package for future work.
- `build.gradle` — GradleRIO and WPILib dependencies only.

## Getting started

Open the project in WPILib VS Code or build with a compatible Gradle installation using `./gradlew build` (after generating the standard wrapper with WPILib tools if needed). Update the roboRIO team number in `build.gradle` before deploying.

All motor, controller, and sensor examples are comments only. To add real hardware, add the appropriate vendor dependency, uncomment and configure the relevant declarations, then implement the TODOs. Remove unused subsystem instances from `RobotContainer` and unused nested constants/classes as a team settles on its robot design.

No build or deployment has been run as part of generating this scaffold.
