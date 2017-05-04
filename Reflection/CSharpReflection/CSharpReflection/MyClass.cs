using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace CSharpReflection
{
    
    class MyClass
    {
        private bool canYouSeeMe;
        public int someNum;
        public double someOtherNum;
        public bool someOtherVariable;
        private bool myPrivateVariable;

        public MyClass()
        {
            someNum = 0;
            someOtherNum = 0.0;
            someOtherVariable = false;
        }

        public MyClass(int someNum, double someOtherNum, bool someOtherVariable)
        {
            this.someNum = someNum;
            this.someOtherNum = someOtherNum;
            this.someOtherVariable = someOtherVariable;
        }

        public int squareSomeNum()
        {
            return someNum * someNum;
        }

        public bool someOtherFunction(int someThing)
        {
            return someOtherVariable;
        }
    }
}
