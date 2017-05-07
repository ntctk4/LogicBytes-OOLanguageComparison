# Implementation of Listeners and Event Handlers
*Listeners and Event Handlers wait until there is a specified event that happens and reacts to that event based on what is in the method.
*Java
	*In this example, every time the mouse passes through the button a message is printed out.
```java
	//the btn object now listens for when the mouse hovers over
        //the button. When it does, the anonymous class handles the event
        //and prints out a message
        btn.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                System.out.println("The Mouse has entered the button's space!");
            }
            
        });
```

*C#
	*In this example, every time the button is clicked one of the group member's names will be the new content of the button.
```csharp
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
```
[Home](../README.md)
