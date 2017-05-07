using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace CSharpListenerExample
{
    /// <summary>
    /// Interaction logic for MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        String[] nameList = {"Nathan", "Scott", "Luke", "Reem"};
        int old_i = -1;
        public MainWindow()
        {
            InitializeComponent();
            //added a new event here instead of the xaml 
            //to better show off this handler
            cs4330Button.Click += new RoutedEventHandler(CS4330ButtonClick);
        }

        private void Button_Click(object sender, EventArgs e)
        {
            throw new NotImplementedException();
        }

        private void CS4330ButtonClick(object sender, EventArgs e)
        {
            Random rand = new Random();
            int i = rand.Next(0, 4);
            while(i.CompareTo(old_i) == 0)
            {
                i = rand.Next(0, 4);
            }
            old_i = i;
            cs4330Button.Content = nameList[i];
        }
    }
}
