import 'package:flutter/material.dart';
import 'package:stepper_touch/stepper_touch.dart';
void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo',
      theme: ThemeData(
        colorScheme: ColorScheme.fromSeed(seedColor: Colors.deepPurple),
        useMaterial3: true,
      ),
      home: const CustomStepCounter(),
    );
  }
}

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