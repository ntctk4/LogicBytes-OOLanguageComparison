# Properties

## Java

The closest thing to Properties in Java is to have a private backing variable with your own public methods for getting and setting.  Computed properties can be simulated with a get method.

    public class MyClass {
        // backing variable
        private int someInt;

        [...]

        public int getSomeInt() {
            return someInt;
        }

        public void setSomeInt(int someInt) {
            this.someInt = someInt;
        }
        
        // Method Simulation of Computed Property
        public boolean someIntIsGreaterThanTen() {
            // by computing this when requested, don't have to hold a boolean variable and set/unset it
            return (someInt > 10);
        }
    }


## C# 

C# has actual Properties ([External Link: MSDN C# Properties](https://msdn.microsoft.com/en-us/library/x9fsa0sw.aspx).  Default get and set methods are provided, but can be overridden to provide computed properties or constraints on setting.  You can use a backing variables, but if you do, you must link them to the Properties with overridden getters and setters.

    public class MyClass {
        // Backing Variable
        private int _someInt;
        // Variable Backed Property simple linking
        public int SomeInt { get { return _someInt; } set { _someInt = value; }
        
        // default getters and setters, value is not backed
        public double X { get; set; }
        
        private double _y;
        // Constraints on Y value (must be greater than 10)
        public double Y {
            get { return _y; }
            set {
                if (value > 10) {
                    _y = value;
                }
            }
        }
        
        // Computed Property
        public bool SomeIntGreaterThanTen => _someInt > 10;
    }

[Home](../README.md)
