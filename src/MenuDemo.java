//Arben AKil
import java.awt.*;
import java.awt.event.*;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.ButtonGroup;
import javax.swing.JMenuBar;
import javax.swing.KeyStroke;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JFrame;

public class MenuDemo implements ActionListener, ItemListener {
    JTextArea output;
    JScrollPane scrollPane;
    String newline = "\n";
    String restaurantNumber = PhoneNumber.getRestaurantNumber();
    String calling = PhoneNumber.Calling();
    String hangup = PhoneNumber.HangUp();
    String directions = Address.directions();
    String address = Address.getRestaurantAddress();
    MenuFactory factory = new MenuFactory();
    StrategyAddtoCart SA = new StrategyAddtoCart();
    Context context = new Context(new StrategyAddtoCart()); // Strategy	
    Beer beer = new Beer();
    Coffee coffee = new Coffee();
    Hot_Chocolate hotC = new Hot_Chocolate();
    Liqueur liqueur = new Liqueur();
    Smoothie smoothie = new Smoothie();
    Soda soda = new Soda();
    Tea tea =  new Tea();
    Water water =  new Water();
    Wine wine = new Wine();
    Decorate_with_Sugar with_sugar = new Decorate_with_Sugar(new Coffee());
    Decorate_with_Sugar with_sugar2 = new Decorate_with_Sugar(new Tea());
    Decorate_with_Ice with_ice = new Decorate_with_Ice(new Soda());
    Decorate_with_Ice with_ice2 = new Decorate_with_Ice(new Water());

    public JMenuBar createMenuBar() {
        JMenuBar menuBar;
        JMenu menu, submenu;
        JMenuItem menuItem;
        JRadioButtonMenuItem rbMenuItem;
        JCheckBoxMenuItem cbMenuItem;
 
        //Create the menu bar
        menuBar = new JMenuBar();

        //Build the first menu
        menu = new JMenu("Order");
        menu.setMnemonic(KeyEvent.VK_A);
        menuBar.add(menu);

        //images
        ImageIcon icon = createImageIcon("img/fork.png");
        ImageIcon icon2 = createImageIcon("img/water.png");
        ImageIcon icon3 = createImageIcon("img/soda.png");
        ImageIcon icon4 = createImageIcon("img/smoothie.png");
        ImageIcon icon5 = createImageIcon("img/coffee.png");
        ImageIcon icon6 = createImageIcon("img/Hot Chocolate.png");
        ImageIcon icon7 = createImageIcon("img/Tea.png");
        ImageIcon icon8 = createImageIcon("img/water with ice.png");
        ImageIcon icon9 = createImageIcon("img/wine.png");
        ImageIcon icon10 = createImageIcon("img/beer.png");
        ImageIcon icon11 = createImageIcon("img/liqueur.png");
        
        //Menu part
        submenu = new JMenu("Group 4 menu");
        submenu.setMnemonic(KeyEvent.VK_S);
        
        menuItem = new JMenuItem("Vegan Menu", icon);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.SHIFT_MASK));
        menuItem.addActionListener(this);
        submenu.add(menuItem);
        
        menuItem = new JMenuItem("Seafood Menu", icon);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_2, ActionEvent.SHIFT_MASK));
        menuItem.addActionListener(this);
        submenu.add(menuItem);
        
        menu.add(submenu);
        menu.addSeparator();
        
        //Beverages part
        //cold
        submenu = new JMenu("Cold Beverages");
        submenu.setMnemonic(KeyEvent.VK_S);
        
        menuItem = new JMenuItem("Smoothie - " + smoothie.cost(), icon4);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.SHIFT_MASK));
        menuItem.addActionListener(this);
        submenu.add(menuItem);
        
        menuItem = new JMenuItem("Soda - " + soda.cost(), icon3);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_2, ActionEvent.SHIFT_MASK));
        menuItem.addActionListener(this);
        submenu.add(menuItem);
        
        menuItem = new JMenuItem("Soda with Ice - " + with_ice.cost(), icon3);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_2, ActionEvent.SHIFT_MASK));
        menuItem.addActionListener(this);
        submenu.add(menuItem);
        
        menuItem = new JMenuItem("Water - " + water.cost(), icon2);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_3, ActionEvent.SHIFT_MASK));
        menuItem.addActionListener(this);
        submenu.add(menuItem);
        
        menuItem = new JMenuItem("Water with Ice - " + water.cost(), icon8);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_3, ActionEvent.SHIFT_MASK));
        menuItem.addActionListener(this);
        submenu.add(menuItem);
       
        menu.add(submenu);
        menu.addSeparator();
        
        //hot
        submenu = new JMenu("Hot Beverages");
        submenu.setMnemonic(KeyEvent.VK_S);
        
        menuItem = new JMenuItem("Coffee - " + coffee.cost(), icon5);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.SHIFT_MASK));
        menuItem.addActionListener(this);
        submenu.add(menuItem);
        
        menuItem = new JMenuItem("Coffee with Sugar - " +  with_sugar.cost(), icon5);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_2, ActionEvent.SHIFT_MASK));
        menuItem.addActionListener(this);
        submenu.add(menuItem);
        
        menuItem = new JMenuItem("Hot Chocolate - " + hotC.cost(), icon6);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_3, ActionEvent.SHIFT_MASK));
        menuItem.addActionListener(this);
        submenu.add(menuItem);
        
        menuItem = new JMenuItem("Tea - " + tea.cost(), icon7);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_4, ActionEvent.SHIFT_MASK));
        menuItem.addActionListener(this);
        submenu.add(menuItem);
        
        menuItem = new JMenuItem("Tea with Sugar - " + with_sugar2.cost(), icon7);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_5, ActionEvent.SHIFT_MASK));
        menuItem.addActionListener(this);
        submenu.add(menuItem);
       
        menu.add(submenu);
        menu.addSeparator();
        
        //alcoholic Beverages
        submenu = new JMenu("Alcoholic Beverages");
        submenu.setMnemonic(KeyEvent.VK_S);
        
        menuItem = new JMenuItem("Beer - " + beer.cost(), icon10);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_1, ActionEvent.SHIFT_MASK));
        menuItem.addActionListener(this);
        submenu.add(menuItem);
        
        menuItem = new JMenuItem("Liqueur - " + liqueur.cost(), icon11);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_2, ActionEvent.SHIFT_MASK));
        menuItem.addActionListener(this);
        submenu.add(menuItem);
        
        menuItem = new JMenuItem("Wine - " + wine.cost(), icon9);
        menuItem.setAccelerator(KeyStroke.getKeyStroke(
                KeyEvent.VK_3, ActionEvent.SHIFT_MASK));
        menuItem.addActionListener(this);
        submenu.add(menuItem);
       
        menu.add(submenu);
        menu.addSeparator();

        //radio button menu items
        menu.addSeparator();
        ButtonGroup group = new ButtonGroup();

        rbMenuItem = new JRadioButtonMenuItem("Checkout");
        rbMenuItem.setSelected(false);
        rbMenuItem.setMnemonic(KeyEvent.VK_R);
        group.add(rbMenuItem);
        rbMenuItem.addActionListener(this);
        menu.add(rbMenuItem);


        rbMenuItem = new JRadioButtonMenuItem("Student Discount");
        rbMenuItem.setSelected(false);
        rbMenuItem.setMnemonic(KeyEvent.VK_R);
        group.add(rbMenuItem);
        rbMenuItem.addActionListener(this);
        menu.add(rbMenuItem);



        //check box menu items
        menu.addSeparator();
        cbMenuItem = new JCheckBoxMenuItem("Call Resaurant");
        cbMenuItem.setMnemonic(KeyEvent.VK_C);
        cbMenuItem.addItemListener(this);
        menu.add(cbMenuItem);

        cbMenuItem = new JCheckBoxMenuItem("Directions");
        cbMenuItem.setMnemonic(KeyEvent.VK_H);
        cbMenuItem.addItemListener(this);
        menu.add(cbMenuItem);

        menu = new JMenu("Careers");
        menu.setMnemonic(KeyEvent.VK_N);
        menuBar.add(menu);

        menuItem = new JMenuItem("Join Group4", KeyEvent.VK_Y);
        menuItem.setMnemonic(KeyEvent.VK_Y);
        menuItem.addActionListener(this);
        menu.add(menuItem);

        return menuBar; 
    }

    public Container createContentPane() {
        JPanel contentPane = new JPanel(new BorderLayout());

        contentPane.setOpaque(true);

        //Create a scrolled text area
        output = new JTextArea(5, 30);
        output.setEditable(false);
        scrollPane = new JScrollPane(output);
        contentPane.add(scrollPane, BorderLayout.CENTER);

        return contentPane;
    }

    public void actionPerformed(ActionEvent e) {

        JMenuItem source = (JMenuItem)(e.getSource());
        String s = "";

        if(source.getText().equals("Vegan Menu")){
        	s = factory.makeMenu(2) + newline;
        }
        
        if(source.getText().equals("Seafood Menu")){
        	s = factory.makeMenu(1) + newline;
        }
        
        if(source.getText().equals("Coffee - "  + coffee.cost())){
        	s = coffee.serve() + newline;
        	//SA.doOP(coffee);
                context.executeStrategy(coffee);
        }
        
        if(source.getText().equals("Coffee with Sugar - " + with_sugar.cost())){
        	s = coffee.serve() + newline + with_sugar.serve();
        	//SA.doOP(with_sugar);
                context.executeStrategy(with_sugar);        // Strategy
        }
        
        if(source.getText().equals("Hot Chocolate - "  + hotC.cost())){
        	s = hotC.serve() + newline;
        	//SA.doOP(hotC);
                context.executeStrategy(hotC);
        }
        
        if(source.getText().equals("Tea - "  + tea.cost())){
        	s = tea.serve() + newline;
        	//SA.doOP(tea);
                context.executeStrategy(tea);
        }
        
        if(source.getText().equals("Tea with Sugar - " + with_sugar2.cost())){
        	s = tea.serve() + newline + with_sugar2.serve();
        	//SA.doOP(with_sugar2);
                context.executeStrategy(with_sugar2);
        }
        
        if(source.getText().equals("Beer - "  + beer.cost())){
        	s = beer.serve() + newline;
        	//SA.doOP(beer);
                context.executeStrategy(beer);
        }
        
        if(source.getText().equals("Liqueur - "  + liqueur.cost())){
        	s = liqueur.serve() + newline;
        	//SA.doOP(liqueur);
                context.executeStrategy(liqueur);
        }
        
        if(source.getText().equals("Wine - "  + wine.cost())){
        	s = wine.serve() + newline;
        	//SA.doOP(wine);
                context.executeStrategy(wine);
        }
        
        if(source.getText().equals("Smoothie - "  + smoothie.cost())){
        	s = smoothie.serve() + newline;
        	//SA.doOP(smoothie);
                context.executeStrategy(smoothie);
        }
        
        if(source.getText().equals("Soda - "  + soda.cost())){
        	s = soda.serve() + newline;
        	//SA.doOP(soda);
                context.executeStrategy(soda);
        }
        
        if(source.getText().equals("Water - "  + water.cost())){
        	s = water.serve() + newline;
        	//SA.doOP(water);
                context.executeStrategy(water);
        }
        
        if(source.getText().equals("Soda with Ice - " + with_ice.cost())){
        	s = soda.serve() + newline + with_ice.serve();
        	//SA.doOP(with_ice);
                context.executeStrategy(with_ice);
        }
        
        if(source.getText().equals("Water with Ice - "  + with_ice2.cost())){
        	s = water.serve() + newline + with_ice2;
        	//SA.doOP(with_ice2);
                context.executeStrategy(with_ice2);
        }
        

        if(source.getText().equals("Checkout")){ s = "Your Total Bill: " + context.totalCostt();}
      
        if(source.getText().equals("Join Group4")){ s = "Sorry We are Full!"; }

        output.append(s + newline);
        output.setCaretPosition(output.getDocument().getLength());
    }

    public void itemStateChanged(ItemEvent e) {
        JMenuItem source = (JMenuItem)(e.getSource());
        if(source.getText().equals("Call Resaurant"))
        {
        String s = "" + newline
                   + "    Event State: " + source.getText()
                   + newline
                   + "    Now: "
                   + ((e.getStateChange() == ItemEvent.SELECTED) ? calling:hangup);
        output.append(s + newline);
        output.setCaretPosition(output.getDocument().getLength());
        }
        
        if(source.getText().equals("Directions"))
        {
        String v = "The address is ";
        String s = "" + newline
                   + "    Event State: " + source.getText()
                   + newline
                   + ((e.getStateChange() == ItemEvent.SELECTED) ? directions: v + address);
        output.append(s + newline);
        output.setCaretPosition(output.getDocument().getLength());
        }
    }

    protected String getClassName(Object o) {
        String classString = o.getClass().getName();
        int dotIndex = classString.lastIndexOf(".");
        return classString.substring(dotIndex+1);
    }

    protected static ImageIcon createImageIcon(String path) {

        java.net.URL imgURL = MenuDemo.class.getResource(path);

        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    }

    protected static void createAndShowGUI() {
        JFrame frame = new JFrame("Group4");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MenuDemo demo = new MenuDemo();

        frame.setJMenuBar(demo.createMenuBar());
        frame.setContentPane(demo.createContentPane());
        frame.setSize(850, 460);
        frame.setVisible(true);
    }
}