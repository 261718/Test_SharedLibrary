// def call(Map config = [:]) {
 // sh "echo Hello ${config.name}. Today is ${config.dayofweek}."
// }

 //def call(String name, String dayofweek) {                  
// sh "echo Hello ${name}. Today is ${dayofweek}."
 // }
// helloWorld("Sowmitri","Tuesday")  

def call(Map config = [:]) {
sh "echo Hello ${config.name}. Today is ${config.dayofweek}."
}
helloWorld(name: "Sowmitri", dayofweek: "Tuesday")  

 

// def call(String name, String dayofweek) {
    
//    println "Hello ${name}. Today is ${dayofweek}."
//    sh "echo Hello ${name}. Today is ${dayofweek}."
//}

// def call(Map config = [:]) {
//     sh "echo Hello ${config.name}. Today is ${config.dayofweek}."
// }

// class Example {
//    static void main(String[] args) {
//       // Using a simple println statement to print output to the console
//       println('Hello World');
//    }
// }

// class Simple{  
//     public static void main(String args[]){  
//      System.out.println("Hello Java");  
//     }  
// } 
