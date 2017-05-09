using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Interface_Csharp
{
    class Program : Engine
    {
        String modelSetting = "";
        int powerSetting = 0;

        public void model(String newModel)
        {
            modelSetting = newModel;
        }
        public void power(int newPower)
        {
            powerSetting = newPower;
        }

        public void printing()
        {
            Console.WriteLine("The model has been set to {0} and the power is {1}\n", modelSetting, powerSetting);
        }

        static void Main(string[] args)
        {
            Program obj = new Program();
            obj.model("ABC Model");
            obj.power(4000);
            obj.printing();
        }
    }
}
