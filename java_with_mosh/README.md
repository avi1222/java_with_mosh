#java_with_mosh



double result = (double)10 / (double)3;
        System.out.println(result);


        sint x=1;
        int y = x++;
        System.out.println(x);
        System.out.println(y);
        //result is 2 and 1 because x is incremented after y is assigned the value of x


        int x=1;
        x+=2;
        int y=x;
        System.out.println(x);
        System.out.println(y);
        // Here we can see that the value of x is 3 and y is also 3. This is because when we assign y=x, we are copying the value of x into y. So, if we change the value of x later, it will not affect the value of y.








        //implicit casting
        double x =1.1;
        double y = x + 2;
        System.out.println(y);
        //result: 3.1

        //explicit casting
        double a = 1.1;
        int b = (int) a + 2;
        System.out.println(b);
        //result: 3

        //byte, short, int, long, float, double.




        //string casting
        String x = "1";
        int y= Integer.parseInt(x)+1;
        System.out.println(y);



        System.out.println("Enter your age: ");
        Scanner scanner = new Scanner(System.in);
        byte age = scanner.nextByte();
        System.out.println("You are " + age + " years old.");
        scanner.close();




        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your Name: ");
        String name = scanner.nextLine().trim();
        System.out.println("Hello, " + name + "!");
        scanner.close();