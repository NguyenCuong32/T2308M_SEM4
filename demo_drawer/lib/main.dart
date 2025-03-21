import 'package:flutter/material.dart';

void main() {
  runApp(const MyApp());
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  // This widget is the root of your application.
  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Flutter Demo 1',
      theme: ThemeData(

        colorScheme: ColorScheme.fromSeed(seedColor: Colors.red),
        useMaterial3: true,
      ),
      home: const HomePage(title: 'Facebook'),
    );
  }
}

class HomePage extends StatefulWidget {
  const HomePage ({super.key, required this.title});
  final String title;

  @override
  State<StatefulWidget> createState() {
   return _HomePageState();
  }
}
class _HomePageState extends State<HomePage>{
  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: Text("Home Page",style: TextStyle(color: Colors.white,fontSize: 30),),
        backgroundColor: Colors.red,
      ),
      body: Center(
        child: Text("This is body",style: TextStyle(color: Colors.green,fontSize: 40),),
      ),
    );
  }

}

