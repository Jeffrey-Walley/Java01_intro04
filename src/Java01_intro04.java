public class Java01_intro04 {
}


// JAVA METHODS -- block of code that runs when called (a function)
  //  pass data known as parameters into a 'method' -- methods are reusable code that we can use many times

// CREATE a Method - a 'method' must be declared within the class. it is defined with the name of the 'method'
    //                         followed by (). Java has pre-defined methods, such as System.out.println()

/*
    public class Main {
        static void myMethod() {
          code block;
          }
     }
                1. myMethod() is the method name
                2. 'static' means the method belongs to the Main class
                3. 'void' means the method does not have a return value

 call a method using the method name followed by '()' and ';' -- ex:  myMethod(); will call the above method

        ex:
          public class Main {
          static void myMethod() {
            System.out.println("I just got executed!");
            }

         public static void main(String[] args) {
           myMethod();
           }
        }   // outputs "I just got executed!"

   -- you can call the same method multiple times
 */

// JAVA METHODS PARAMETERS and ARGUMENTS  - info is passed to methods as parameters which act as variables in the method
         /* parameters are specified after the method name inside the parentheses. parmeters are separated with commas.

         ex:
            public class Main {
                static void myMethod(String fname) {
                  System.out.println(fname + " Walley");
                  }
             public static void main(String[] args) {
                        myMethod("Trelvyn");
                        myMethod("James");
                        myMethod("J S");
                    }
                 }  // ouputs: Trelvyn Walley
                               James Walley
                               J S Walley

         ** when a 'parameter' is passed to the method it is called an 'argument' in the example above:
                        fname is the 'parameter' and 'Trelvyn, James, J S' are 'arguements'


  // JAVA METHODS Multiple Parameters
            ex:
           public class Main {
            static void myMethod(String fname, int age) {
             System.out.println{fname + " is " + age);
             )

             public class static void main(String[] args) {
                myMethod("Trelvyn", 6);
                myMethod("James", 15);
                myMethod("J S", 45);
              }
              }         //outputs:  Trelvyn is 6
                                    James is 15
                                    J S is 45


 // RETURN VALUES -- the 'void' keyword keeps the method from returning value. If you need the method to return
                        a value then you use a primitive data type (int, char, etc...) instead of 'void' and use
                           the 'return' keyword.
  ex:

                 public class Main {
                 static int myMethod(int x) {
                 return 5 + x;
                 }

                    public static void main(String[] args) {
                    System.out.println(myMethod(3));
                    }
                 }      // will output 8  (5 + 3)



 ex with 2 parameters:

               public class Main {
                static int myMethod(int x, int y) {
                    return x + y;
                    }

                public static void main(String[] args) {
                    System.out.println(myMethod(5, 3));
                    }
                }     // Outputs 8 (5 + 3)


ex of STORING RESULT as VARIABLE (RECOMMENDED way to do it)
      public class Main {
        static int myMethod(int x, int y) {
            return x + y;
            }

        public static void main(String[] args) {
            int z = myMethod(5, 3);
            System.out.println(z);
            }
        }  // Outputs 8 (5 + 3)

 // METHOD with IF... ELSE 'if... else'

          public class Main {
       //Create checkAge() method with int variable 'age'
                static void checkAGE(int age) {

       // if less than 18 then print 'access denied'
                 if (age < 18) {
                 System.out.println("Access Denied - You are Under 18");

       // if equal to or greater than 18 then print 'access granted'
                if (age >= 18) {
                System.out.println("Access Granted - Time to shake those tits");
                }
              }

           public static void main(String[] args) {
                 checkAge(20); // calls checkAge() method and passes value of '20' to age
                }
             }                  // output "Access Granted - Time to shake those tits"



// METHOD OVERLOADING - multiple methods have the same name with different parameters

            static int plusMethod(int x, int y) {
             return x + y;
                }

            static double plusMethod(double x, double y) {
                return x + y;
                }

            public static void main(String[] args) {
                int myNum1 = plusMethod(8, 5);
                  double myNum2 = plusMethod(4.3, 6.26);
                    System.out.println("int: " + myNum1);
                    System.out.println("double: " + myNum2);
                }

      // in the example above we 'Overload' the 'plusMethod()' to work for both 'int' and 'double'


 // JAVA SCOPE - variables are only accessible inside the region they are created

     // METHOD Scope -- variables declared inside the 'method' are available anywhere in the 'method' AFTER declared
        ex:
                         public class Main {
                        public static void main(String[] args) {

            // Code here CANNOT use x

                         int x = 100;

             // Code here can use x
                        System.out.println(x);
                         }
                    }

   // BLOCK SCOPE - all code inside the {}. Variables declared inside blocks of code are only accessible between {}
          ex:
                  public class Main {
                    public static void main(String[] args) {

                 // Code here CANNOT use x

                { // This is a block

                 // Code here CANNOT use x

                    int x = 100;

                    // Code here CAN use x
                         System.out.println(x);

                         } // The block ends here

                        // Code here CANNOT use x

                                }
                            }

   //  blocks of code may exist on own or belong to an 'if', 'while' or 'for' statement. In the case of 'for' statements,
                variables declared in the statement itself are also available inside the block's scope.


// JAVA Recursion - technique of making a function call itself. breaks complicated problems down to simple problems that
                    are easier to solve.
          ex:  adding a range of #s together is easy with recursion

             /* public class Main {
                public static void main(String[] args) {
                 int result = sum(10);
                 System.out.println(result);
                 }

                public static int sum(int k) {
                 if (k > 0) {
                 return k + sum(k - 1);
                 } else {
                 return 0;
                 }
               }
             } // when the 'sum()' function is called it adds 'parameter' 'k' to the sum of all numbers smaller than k
                        and returns the result. when 'k' becomes 0 the function then returns '0'
                      ** since the function does not call itself when k = 0 then it stops there and returns that result
          */

// HALTING CONDITION - recursive functions can run into 'infinite recursion' when the function (method) never stops
                /* calling itself. 'recursive functions' should always have a halting condition. in the above example
                            the Halting Condition was when k == 0.



    // ex: using Recursion to add all numbers between 5 - 10

            public class Main {
             public static void main(String[] args) {
                int result = sum(5, 10);
                System.out.println(result);
            }
            public static int sum(int start, int end) {
            if (end > start) {
            return end + sum(start, end - 1);
            } else {
            return end;
                 }
              }
            }

                 */
