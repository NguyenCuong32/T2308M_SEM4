import 'package:flutter/material.dart';
import 'package:stepper_touch/stepper_touch.dart';

class CustomStepCounter extends StatelessWidget {
  const CustomStepCounter({super.key});

  @override
  Widget build(BuildContext context) {
    return StepperTouch(
      initialValue: 0,
      direction: Axis.horizontal,
      withSpring: false,
      onChanged: (int value) => print('new value $value'),
    );
  }
}
