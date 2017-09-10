import java.awt.EventQueue;
import javax.swing.JFrame;
import java.awt.Choice;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;
import java.awt.Font;
import java.awt.Label;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;





public class MainWindow {

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    MainWindow window = new MainWindow();
                    window.frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the application.
     */
    public MainWindow() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setBounds(100, 100, 731, 445);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
                
                JMenuBar menuBar = new JMenuBar();
                menuBar.setBorderPainted(false);
                menuBar.setBounds(0, 0, 48, 23);
                frame.getContentPane().add(menuBar);
                
                JMenu mnNewMenu = new JMenu("Menu");
                mnNewMenu.setHorizontalAlignment(SwingConstants.CENTER);
                menuBar.add(mnNewMenu);
                
                JMenuItem MenuAbout = new JMenuItem("About");
                mnNewMenu.add(MenuAbout);
                
                JSeparator separator = new JSeparator();
                mnNewMenu.add(separator);
                
                JMenuItem MenuVersion = new JMenuItem("Version No.");
                mnNewMenu.add(MenuVersion);
                
                JSeparator separator_1 = new JSeparator();
                separator_1.setBounds(0, 24, 715, 2);
                frame.getContentPane().add(separator_1);
                
                Label CISI = new Label("Can I Shoot It?");
                CISI.setFont(new Font("Arial", Font.BOLD, 26));
                CISI.setAlignment(Label.CENTER);
                CISI.setBounds(40, 10, 635, 100);
                frame.getContentPane().add(CISI);
        
        
        
        
                JLabel Animal = new JLabel("Select an Animal");
                Animal.setHorizontalAlignment(SwingConstants.CENTER);
                Animal.setBounds(496, 129, 120, 20);
                frame.getContentPane().add(Animal);

        Choice animal = new Choice();


        animal.setBounds(442, 155, 232, 22);
        frame.getContentPane().add(animal);
        
                JLabel Ammunition = new JLabel("Select Ammunition Type");
                Ammunition.setHorizontalAlignment(SwingConstants.CENTER);
                Ammunition.setBounds(77, 132, 152, 14);
                frame.getContentPane().add(Ammunition);

        Choice ammo = new Choice();


        ammo.setBounds(39, 155, 232, 22);
        frame.getContentPane().add(ammo);

        JLabel txtrYesNo = new JLabel();
        txtrYesNo.setHorizontalAlignment(SwingConstants.CENTER);
        txtrYesNo.setFont(new Font("Arial", Font.BOLD, 23));
        txtrYesNo.setBackground(SystemColor.info);
        txtrYesNo.setBounds(89, 216, 536, 123);
        frame.getContentPane().add(txtrYesNo);
        
        Label Xey = new Label("By: Xeygwyn");
        Xey.setAlignment(Label.RIGHT);
        Xey.setBounds(458, 382, 247, 14);
        frame.getContentPane().add(Xey);
        frame.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[]{ammo, animal}));
       
       ammo.addItemListener(new ItemListener() {
        	public void itemStateChanged(ItemEvent e) {
        		txtrYesNo.setText("");
        	}
        });


        animal.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {

             
                if (ammo.getSelectedItem() == ".45-70 Government") {
                    if (animal.getSelectedItem() == "Bison" ||
                        animal.getSelectedItem() == "Black Bear" ||
                        animal.getSelectedItem() == "Brown Bear" ||
                        animal.getSelectedItem() == "Feral Hog" ||
                        animal.getSelectedItem() == "Grizzly Bear" ||
                        animal.getSelectedItem() == "Moose" ||
                        animal.getSelectedItem() == "Polar Bear" ||
                        animal.getSelectedItem() == "Red Deer" ||
                        animal.getSelectedItem() == "Rocky Mountain Elk" ||
                        animal.getSelectedItem() == "Roosevelt Elk" ||
                        animal.getSelectedItem() == "Wild Boar") {
                        txtrYesNo.setText("Yes");
                    } else {
                    	txtrYesNo.setText("No");
                    }
                } else if (ammo.getSelectedItem() == ".340 Weatherby Magnum") {
                    if (animal.getSelectedItem() == "Bison" ||
                        animal.getSelectedItem() == "Black Bear" ||
                        animal.getSelectedItem() == "Brown Bear" ||
                        animal.getSelectedItem() == "Feral Hog" ||
                        animal.getSelectedItem() == "Grizzly Bear" ||
                        animal.getSelectedItem() == "Moose" ||
                        animal.getSelectedItem() == "Polar Bear" ||
                        animal.getSelectedItem() == "Red Deer" ||
                        animal.getSelectedItem() == "Rocky Mountain Elk" ||
                        animal.getSelectedItem() == "Roosevelt Elk" ||
                        animal.getSelectedItem() == "Wild Boar") {
                        txtrYesNo.setText("Yes");
                    } else {
                    	txtrYesNo.setText("No");
                    }
                } else if (ammo.getSelectedItem() == ".30-06 Round Nose") {
                    if (animal.getSelectedItem() == "Alpine Ibex" ||
                        animal.getSelectedItem() == "Bighorn Sheep" ||
                        animal.getSelectedItem() == "Black Bear" ||
                        animal.getSelectedItem() == "Blacktail Deer" ||
                        animal.getSelectedItem() == "Brown Bear" ||
                        animal.getSelectedItem() == "Coyote" ||
                        animal.getSelectedItem() == "Dall Sheep" ||
                        animal.getSelectedItem() == "Feral Goat" ||
                        animal.getSelectedItem() == "Feral Hog" ||
                        animal.getSelectedItem() == "Grey Wolf" ||
                        animal.getSelectedItem() == "Grizzly Bear" ||
                        animal.getSelectedItem() == "Moose" ||
                        animal.getSelectedItem() == "Mule Deer" ||
                        animal.getSelectedItem() == "Polar Bear" ||
                        animal.getSelectedItem() == "Red Deer" ||
                        animal.getSelectedItem() == "Red Kangaroo" ||
                        animal.getSelectedItem() == "Reindeer" ||
                        animal.getSelectedItem() == "Rocky Mountain Elk" ||
                        animal.getSelectedItem() == "Roe Deer" ||
                        animal.getSelectedItem() == "Roosevelt Elk" ||
                        animal.getSelectedItem() == "Sitka Deer" ||
                        animal.getSelectedItem() == "Whitetail Deer" ||
                        animal.getSelectedItem() == "Wild Boar") {
                        txtrYesNo.setText("Yes");
                    } else {
                    	txtrYesNo.setText("No");
                    }
                } else if (ammo.getSelectedItem() == "7.62x54R SP") {
                    if (animal.getSelectedItem() == "Alpine Ibex" ||
                        animal.getSelectedItem() == "Bighorn Sheep" ||
                        animal.getSelectedItem() == "Black Bear" ||
                        animal.getSelectedItem() == "Blacktail Deer" ||
                        animal.getSelectedItem() == "Brown Bear" ||
                        animal.getSelectedItem() == "Coyote" ||
                        animal.getSelectedItem() == "Dall Sheep" ||
                        animal.getSelectedItem() == "Feral Goat" ||
                        animal.getSelectedItem() == "Feral Hog" ||
                        animal.getSelectedItem() == "Grey Wolf" ||
                        animal.getSelectedItem() == "Grizzly Bear" ||
                        animal.getSelectedItem() == "Moose" ||
                        animal.getSelectedItem() == "Mule Deer" ||
                        animal.getSelectedItem() == "Red Deer" ||
                        animal.getSelectedItem() == "Red Kangaroo" ||
                        animal.getSelectedItem() == "Reindeer" ||
                        animal.getSelectedItem() == "Rocky Mountain Elk" ||
                        animal.getSelectedItem() == "Roe Deer" ||
                        animal.getSelectedItem() == "Roosevelt Elk" ||
                        animal.getSelectedItem() == "Sitka Deer" ||
                        animal.getSelectedItem() == "Whitetail Deer" ||
                        animal.getSelectedItem() == "Wild Boar") {
                        txtrYesNo.setText("Yes");
                    } else {
                    	txtrYesNo.setText("No");
                    }
                } else if (ammo.getSelectedItem() == ".303 British") {
                    if (animal.getSelectedItem() == "Alpine Ibex" ||
                        animal.getSelectedItem() == "Bighorn Sheep" ||
                        animal.getSelectedItem() == "Black Bear" ||
                        animal.getSelectedItem() == "Blacktail Deer" ||
                        animal.getSelectedItem() == "Brown Bear" ||
                        animal.getSelectedItem() == "Coyote" ||
                        animal.getSelectedItem() == "Dall Sheep" ||
                        animal.getSelectedItem() == "Feral Goat" ||
                        animal.getSelectedItem() == "Feral Hog" ||
                        animal.getSelectedItem() == "Grey Wolf" ||
                        animal.getSelectedItem() == "Grizzly Bear" ||
                        animal.getSelectedItem() == "Moose" ||
                        animal.getSelectedItem() == "Mule Deer" ||
                        animal.getSelectedItem() == "Red Deer" ||
                        animal.getSelectedItem() == "Red Kangaroo" ||
                        animal.getSelectedItem() == "Reindeer" ||
                        animal.getSelectedItem() == "Rocky Mountain Elk" ||
                        animal.getSelectedItem() == "Roe Deer" ||
                        animal.getSelectedItem() == "Roosevelt Elk" ||
                        animal.getSelectedItem() == "Sitka Deer" ||
                        animal.getSelectedItem() == "Whitetail Deer" ||
                        animal.getSelectedItem() == "Wild Boar") {
                        txtrYesNo.setText("Yes");
                    } else {
                    	txtrYesNo.setText("No");
                    }
                } else if (ammo.getSelectedItem() == "7mm Magnum") {
                    if (animal.getSelectedItem() == "Alpine Ibex" ||
                        animal.getSelectedItem() == "Bighorn Sheep" ||
                        animal.getSelectedItem() == "Bison" ||
                        animal.getSelectedItem() == "Black Bear" ||
                        animal.getSelectedItem() == "Blacktail Deer" ||
                        animal.getSelectedItem() == "Brown Bear" ||
                        animal.getSelectedItem() == "Coyote" ||
                        animal.getSelectedItem() == "Dall Sheep" ||
                        animal.getSelectedItem() == "Feral Goat" ||
                        animal.getSelectedItem() == "Feral Hog" ||
                        animal.getSelectedItem() == "Grey Wolf" ||
                        animal.getSelectedItem() == "Grizzly Bear" ||
                        animal.getSelectedItem() == "Moose" ||
                        animal.getSelectedItem() == "Mule Deer" ||
                        animal.getSelectedItem() == "Polar Bear" ||
                        animal.getSelectedItem() == "Red Deer" ||
                        animal.getSelectedItem() == "Red Kangaroo" ||
                        animal.getSelectedItem() == "Reindeer" ||
                        animal.getSelectedItem() == "Rocky Mountain Elk" ||
                        animal.getSelectedItem() == "Roe Deer" ||
                        animal.getSelectedItem() == "Roosevelt Elk" ||
                        animal.getSelectedItem() == "Sitka Deer" ||
                        animal.getSelectedItem() == "Whitetail Deer" ||
                        animal.getSelectedItem() == "Wild Boar") {
                        txtrYesNo.setText("Yes");
                    } else {
                    	txtrYesNo.setText("No");
                    }
                } else if (ammo.getSelectedItem() == ".30-30 Nosler Partition") {
                    if (animal.getSelectedItem() == "Alpine Ibex" ||
                        animal.getSelectedItem() == "Bighorn Sheep" ||
                        animal.getSelectedItem() == "Blacktail Deer" ||
                        animal.getSelectedItem() == "Coyote" ||
                        animal.getSelectedItem() == "Dall Sheep" ||
                        animal.getSelectedItem() == "Feral Goat" ||
                        animal.getSelectedItem() == "Feral Hog" ||
                        animal.getSelectedItem() == "Grey Wolf" ||
                        animal.getSelectedItem() == "Mule Deer" ||
                        animal.getSelectedItem() == "Red Deer" ||
                        animal.getSelectedItem() == "Red Kangaroo" ||
                        animal.getSelectedItem() == "Reindeer" ||
                        animal.getSelectedItem() == "Roe Deer" ||
                        animal.getSelectedItem() == "Sitka Deer" ||
                        animal.getSelectedItem() == "Whitetail Deer" ||
                        animal.getSelectedItem() == "Wild Boar") {
                        txtrYesNo.setText("Yes");
                    } else {
                    	txtrYesNo.setText("No");
                    }
                } else if (ammo.getSelectedItem() == ".22 Air Rifle Pellet") {
                    if (animal.getSelectedItem() == "American Black Duck" ||
                        animal.getSelectedItem() == "Cottontail Rabbit" ||
                        animal.getSelectedItem() == "European Rabbit" ||
                        animal.getSelectedItem() == "Gadwall" ||
                        animal.getSelectedItem() == "Mallard" ||
                        animal.getSelectedItem() == "Northern Pintail" ||
                        animal.getSelectedItem() == "Pheasant" ||
                        animal.getSelectedItem() == "Rock Ptarmigan" ||
                        animal.getSelectedItem() == "Snowshoe Hare" ||
                        animal.getSelectedItem() == "White-Tailed Ptarmigan" ||
                        animal.getSelectedItem() == "Willow Ptarmigan") {
                        txtrYesNo.setText("Yes");
                    } else {
                    	txtrYesNo.setText("No");
                    }
                } else if (ammo.getSelectedItem() == "6.5X55 Nosler AccuBond") {
                	if (animal.getSelectedItem() == "Alpine Ibex" || 
						animal.getSelectedItem() == "Bighorn Sheep" || 
						animal.getSelectedItem() == "Blacktail Deer" || 
						animal.getSelectedItem() == "Coyote" || 
						animal.getSelectedItem() == "Dall Sheep" || 
						animal.getSelectedItem() == "Feral Goat" || 
						animal.getSelectedItem() == "Feral Hog" || 
						animal.getSelectedItem() == "Grey Wolf" || 
						animal.getSelectedItem() == "Mule Deer" || 
						animal.getSelectedItem() == "Red Deer" || 
						animal.getSelectedItem() == "Red Kangaroo" || 
						animal.getSelectedItem() == "Reindeer" || 
						animal.getSelectedItem() == "Roe Deer" || 
						animal.getSelectedItem() == "Sitka Deer" || 
						animal.getSelectedItem() == "Whitetail Deer" ||
						animal.getSelectedItem() == "Wild Boar") {
                		txtrYesNo.setText("Yes");
                	} else {
                		txtrYesNo.setText("No");
                	}
            	} else if (ammo.getSelectedItem() == ".223 Nosler Ballistic Tip") {
            		if (animal.getSelectedItem() == "Arctic Fox" || 
						animal.getSelectedItem() == "Coyote" || 
						animal.getSelectedItem() == "Dall Sheep" || 
						animal.getSelectedItem() == "Feral Goat" || 
						animal.getSelectedItem() == "Grey Wolf" || 
						animal.getSelectedItem() == "Red Fox" || 
						animal.getSelectedItem() == "Red Kangaroo" || 
						animal.getSelectedItem() == "Roe Deer" || 
						animal.getSelectedItem() == "Turkey") {
            			txtrYesNo.setText("Yes");
            		} else {
            			txtrYesNo.setText("No");
            		}
        		} else if (ammo.getSelectedItem() == "9.3x62 Nosler Partition") {
        			if (animal.getSelectedItem() == "Alpine Ibex" || 
    					animal.getSelectedItem() == "Bighorn Sheep" || 
    					animal.getSelectedItem() == "Bison" || 
    					animal.getSelectedItem() == "Black Bear" || 
    					animal.getSelectedItem() == "Blacktail Deer" || 
    					animal.getSelectedItem() == "Brown Bear" || 
    					animal.getSelectedItem() == "Coyote" || 
    					animal.getSelectedItem() == "Dall Sheep" || 
    					animal.getSelectedItem() == "Feral Goat" || 
    					animal.getSelectedItem() == "Feral Hog" || 
    					animal.getSelectedItem() == "Grey Wolf" || 
    					animal.getSelectedItem() == "Grizzly Bear" || 
    					animal.getSelectedItem() == "Moose" || 
    					animal.getSelectedItem() == "Mule Deer" || 
    					animal.getSelectedItem() == "Polar Bear" || 
    					animal.getSelectedItem() == "Red Deer" || 
    					animal.getSelectedItem() == "Red Kangaroo" || 
    					animal.getSelectedItem() == "Reindeer" || 
    					animal.getSelectedItem() == "Rocky Mountain Elk" ||  
    					animal.getSelectedItem() == "Roe Deer" || 
    					animal.getSelectedItem() == "Roosevelt Elk" || 
    					animal.getSelectedItem() == "Sitka Deer" || 
    					animal.getSelectedItem() == "Whitetail Deer" ||
    					animal.getSelectedItem() == "Wild Boar") {
        				txtrYesNo.setText("Yes");
        			} else {
        				txtrYesNo.setText("No");
        				}
        			} else if (ammo.getSelectedItem() == "8x57 IS Nosler Partition") {
    					if (animal.getSelectedItem() == "Alpine Ibex" || 
						animal.getSelectedItem() == "Bighorn Sheep" || 
						animal.getSelectedItem() == "Bison" || 
						animal.getSelectedItem() == "Black Bear" || 
						animal.getSelectedItem() == "Blacktail Deer" || 
						animal.getSelectedItem() == "Brown Bear" || 
						animal.getSelectedItem() == "Coyote" || 
						animal.getSelectedItem() == "Dall Sheep" || 
						animal.getSelectedItem() == "Feral Goat" || 
						animal.getSelectedItem() == "Feral Hog" || 
						animal.getSelectedItem() == "Grey Wolf" || 
						animal.getSelectedItem() == "Grizzly Bear" || 
						animal.getSelectedItem() == "Moose" || 
						animal.getSelectedItem() == "Mule Deer" || 
						animal.getSelectedItem() == "Polar Bear" || 
						animal.getSelectedItem() == "Red Deer" || 
						animal.getSelectedItem() == "Red Kangaroo" || 
						animal.getSelectedItem() == "Reindeer" || 
						animal.getSelectedItem() == "Rocky Mountain Elk" ||  
						animal.getSelectedItem() == "Roe Deer" || 
						animal.getSelectedItem() == "Roosevelt Elk" || 
						animal.getSelectedItem() == "Sitka Deer" || 
						animal.getSelectedItem() == "Whitetail Deer" ||
						animal.getSelectedItem() == "Wild Boar") {
						txtrYesNo.setText("Yes");
					} else {
						txtrYesNo.setText("No");
					}
    			} else if (ammo.getSelectedItem() == ".308 Nosler Partition") {
    				if (animal.getSelectedItem() == "Alpine Ibex" || 
						animal.getSelectedItem() == "Bighorn Sheep" || 
						animal.getSelectedItem() == "Black Bear" || 
						animal.getSelectedItem() == "Blacktail Deer" || 
						animal.getSelectedItem() == "Brown Bear" || 
						animal.getSelectedItem() == "Coyote" || 
						animal.getSelectedItem() == "Dall Sheep" || 
						animal.getSelectedItem() == "Feral Goat" || 
						animal.getSelectedItem() == "Feral Hog" || 
						animal.getSelectedItem() == "Grey Wolf" || 
						animal.getSelectedItem() == "Grizzly Bear" || 
						animal.getSelectedItem() == "Moose" || 
						animal.getSelectedItem() == "Mule Deer" || 
						animal.getSelectedItem() == "Polar Bear" || 
						animal.getSelectedItem() == "Red Deer" || 
						animal.getSelectedItem() == "Red Kangaroo" || 
						animal.getSelectedItem() == "Reindeer" || 
						animal.getSelectedItem() == "Rocky Mountain Elk" ||  
						animal.getSelectedItem() == "Roe Deer" || 
						animal.getSelectedItem() == "Roosevelt Elk" || 
						animal.getSelectedItem() == "Sitka Deer" || 
						animal.getSelectedItem() == "Whitetail Deer" ||
						animal.getSelectedItem() == "Wild Boar") {
    					txtrYesNo.setText("Yes");
    				} else {
    					txtrYesNo.setText("No");
    				}
    			} else if (ammo.getSelectedItem() == ".270 Nosler Ballistic Tip") {
    				if (animal.getSelectedItem() == "Alpine Ibex" || 
						animal.getSelectedItem() == "Bighorn Sheep" || 
						animal.getSelectedItem() == "Blacktail Deer" || 
						animal.getSelectedItem() == "Coyote" || 
						animal.getSelectedItem() == "Dall Sheep" || 
						animal.getSelectedItem() == "Feral Goat" || 
						animal.getSelectedItem() == "Feral Hog" || 
						animal.getSelectedItem() == "Grey Wolf" || 
						animal.getSelectedItem() == "Mule Deer" || 
						animal.getSelectedItem() == "Red Deer" || 
						animal.getSelectedItem() == "Red Kangaroo" || 
						animal.getSelectedItem() == "Reindeer" || 
						animal.getSelectedItem() == "Roe Deer" || 
						animal.getSelectedItem() == "Sitka Deer" || 
						animal.getSelectedItem() == "Whitetail Deer" ||
						animal.getSelectedItem() == "Wild Boar") {
    					txtrYesNo.setText("Yes");
    				} else {
    					txtrYesNo.setText("No");
    				}
    			} else if (ammo.getSelectedItem() == ".30-06 Nosler Partition") {
    				if (animal.getSelectedItem() == "Alpine Ibex" || 
						animal.getSelectedItem() == "Bighorn Sheep" || 
						animal.getSelectedItem() == "Black Bear" || 
						animal.getSelectedItem() == "Blacktail Deer" || 
						animal.getSelectedItem() == "Brown Bear" || 
						animal.getSelectedItem() == "Coyote" || 
						animal.getSelectedItem() == "Dall Sheep" || 
						animal.getSelectedItem() == "Feral Goat" || 
						animal.getSelectedItem() == "Feral Hog" || 
						animal.getSelectedItem() == "Grey Wolf" || 
						animal.getSelectedItem() == "Grizzly Bear" || 
						animal.getSelectedItem() == "Moose" || 
						animal.getSelectedItem() == "Mule Deer" || 
						animal.getSelectedItem() == "Polar Bear" || 
						animal.getSelectedItem() == "Red Deer" || 
						animal.getSelectedItem() == "Red Kangaroo" || 
						animal.getSelectedItem() == "Reindeer" || 
						animal.getSelectedItem() == "Rocky Mountain Elk" ||  
						animal.getSelectedItem() == "Roe Deer" || 
						animal.getSelectedItem() == "Roosevelt Elk" || 
						animal.getSelectedItem() == "Sitka Deer" || 
						animal.getSelectedItem() == "Whitetail Deer" ||
						animal.getSelectedItem() == "Wild Boar") {
    					txtrYesNo.setText("Yes");
    				} else {
    					txtrYesNo.setText("No");
    				}
    			} else if (ammo.getSelectedItem() == ".300 Nosler AccuBond") {
    				if (animal.getSelectedItem() == "Alpine Ibex" || 
						animal.getSelectedItem() == "Bighorn Sheep" || 
						animal.getSelectedItem() == "Bison" || 
						animal.getSelectedItem() == "Black Bear" || 
						animal.getSelectedItem() == "Blacktail Deer" || 
						animal.getSelectedItem() == "Brown Bear" || 
						animal.getSelectedItem() == "Coyote" || 
						animal.getSelectedItem() == "Dall Sheep" || 
						animal.getSelectedItem() == "Feral Goat" || 
						animal.getSelectedItem() == "Feral Hog" || 
						animal.getSelectedItem() == "Grey Wolf" || 
						animal.getSelectedItem() == "Grizzly Bear" || 
						animal.getSelectedItem() == "Moose" || 
						animal.getSelectedItem() == "Mule Deer" || 
						animal.getSelectedItem() == "Polar Bear" || 
						animal.getSelectedItem() == "Red Deer" || 
						animal.getSelectedItem() == "Red Kangaroo" || 
						animal.getSelectedItem() == "Reindeer" || 
						animal.getSelectedItem() == "Rocky Mountain Elk" ||  
						animal.getSelectedItem() == "Roe Deer" || 
						animal.getSelectedItem() == "Roosevelt Elk" || 
						animal.getSelectedItem() == "Sitka Deer" || 
						animal.getSelectedItem() == "Whitetail Deer" ||
						animal.getSelectedItem() == "Wild Boar") {
    					txtrYesNo.setText("Yes");
    				} else {
    					txtrYesNo.setText("No");
    				}
    			} else if (ammo.getSelectedItem() == ".243 Nosler Ballistic Tip") {
    				if (animal.getSelectedItem() == "Alpine Ibex" || 
						animal.getSelectedItem() == "Arctic Fox" || 
						animal.getSelectedItem() == "Bighorn Sheep" || 
						animal.getSelectedItem() == "Blacktail Deer" || 
						animal.getSelectedItem() == "Coyote" || 
						animal.getSelectedItem() == "Dall Sheep" || 
						animal.getSelectedItem() == "Feral Goat" || 
						animal.getSelectedItem() == "Grey Wolf" || 
						animal.getSelectedItem() == "Mule Deer" || 
						animal.getSelectedItem() == "Red Fox" || 
						animal.getSelectedItem() == "Red Kangaroo" || 
						animal.getSelectedItem() == "Roe Deer" || 
						animal.getSelectedItem() == "Sitka Deer" || 
						animal.getSelectedItem() == "Whitetail Deer") {
    					txtrYesNo.setText("Yes");
    				} else {
    					txtrYesNo.setText("No");
    				}
    			} else if (ammo.getSelectedItem() == "10mm Auto") {
    				if (animal.getSelectedItem() == "Alpine Ibex" || 
						animal.getSelectedItem() == "Bighorn Sheep" || 
						animal.getSelectedItem() == "Black Bear" || 
						animal.getSelectedItem() == "Blacktail Deer" || 
						animal.getSelectedItem() == "Coyote" || 
						animal.getSelectedItem() == "Dall Sheep" || 
						animal.getSelectedItem() == "Feral Goat" || 
						animal.getSelectedItem() == "Feral Hog" || 
						animal.getSelectedItem() == "Grey Wolf" || 
						animal.getSelectedItem() == "Mule Deer" || 
						animal.getSelectedItem() == "Red Deer" || 
						animal.getSelectedItem() == "Red Kangaroo" || 
						animal.getSelectedItem() == "Reindeer" || 
						animal.getSelectedItem() == "Rocky Mountain Elk" ||  
						animal.getSelectedItem() == "Roe Deer" || 
						animal.getSelectedItem() == "Roosevelt Elk" || 
						animal.getSelectedItem() == "Sitka Deer" || 
						animal.getSelectedItem() == "Whitetail Deer" ||
						animal.getSelectedItem() == "Wild Boar") {
    					txtrYesNo.setText("Yes");
    				} else {
    					txtrYesNo.setText("No");
    				}
    			} else if (ammo.getSelectedItem() == ".45 Long Colt Handgun") {
    				if (animal.getSelectedItem() == "Black Bear" || 
						animal.getSelectedItem() == "Brown Bear" || 
						animal.getSelectedItem() == "Feral Hog" || 
						animal.getSelectedItem() == "Grizzly Bear" || 
						animal.getSelectedItem() == "Moose" || 
						animal.getSelectedItem() == "Polar Bear" || 
						animal.getSelectedItem() == "Red Deer" || 
						animal.getSelectedItem() == "Reindeer" || 
						animal.getSelectedItem() == "Rock Ptarmigan" || 
						animal.getSelectedItem() == "Rocky Mountain Elk" ||  
						animal.getSelectedItem() == "Roe Deer" || 
						animal.getSelectedItem() == "Roosevelt Elk" || 
						animal.getSelectedItem() == "Sitka Deer" || 
						animal.getSelectedItem() == "Snowshoe Hare" || 
						animal.getSelectedItem() == "Turkey" || 
						animal.getSelectedItem() == "White-Tailed Ptarmigan" || 
						animal.getSelectedItem() == "Whitetail Deer" ||
						animal.getSelectedItem() == "Wild Boar" || 
						animal.getSelectedItem() == "Willow Ptarmigan") {
    					txtrYesNo.setText("Yes");
    				} else {
    					txtrYesNo.setText("No");
    				}
    			} else if (ammo.getSelectedItem() == ".22 LR") {
    				if (animal.getSelectedItem() == "Arctic Fox" || 
						animal.getSelectedItem() == "Canada Goose" || 
						animal.getSelectedItem() == "Cottontail Rabbit" || 
						animal.getSelectedItem() == "European Rabbit" || 
						animal.getSelectedItem() == "Gadwall" || 
						animal.getSelectedItem() == "Mallard" || 
						animal.getSelectedItem() == "Northern Pintail" || 
						animal.getSelectedItem() == "Pheasant" || 
						animal.getSelectedItem() == "Rock Ptarmigan" || 
						animal.getSelectedItem() == "Snowshoe Hare" || 
						animal.getSelectedItem() == "Turkey" || 
						animal.getSelectedItem() == "White-Tailed Ptarmigan" || 
						animal.getSelectedItem() == "Willow Ptarmigan") {
    					txtrYesNo.setText("Yes");
    				} else {
    					txtrYesNo.setText("No");
    				}
    			} else if (ammo.getSelectedItem() == ".454 Nosler Custom Handgun") {
    				if (animal.getSelectedItem() == "Bison" || 
						animal.getSelectedItem() == "Black Bear" || 
						animal.getSelectedItem() == "Brown Bear" || 
						animal.getSelectedItem() == "Feral Hog" || 
						animal.getSelectedItem() == "Grizzly Bear" || 
						animal.getSelectedItem() == "Moose" || 
						animal.getSelectedItem() == "Polar Bear" || 
						animal.getSelectedItem() == "Red Deer" || 
						animal.getSelectedItem() == "Rocky Mountain Elk" ||  
						animal.getSelectedItem() == "Roosevelt Elk" || 
						animal.getSelectedItem() == "Wild Boar") {
    					txtrYesNo.setText("Yes");
    				} else {
    					txtrYesNo.setText("No");
    				}
    			} else if (ammo.getSelectedItem() == ".44 Nosler Sporting Handgun") {
    				if (animal.getSelectedItem() == "Alpine Ibex" || 
						animal.getSelectedItem() == "Bighorn Sheep" || 
						animal.getSelectedItem() == "Black Bear" || 
						animal.getSelectedItem() == "Blacktail Deer" || 
						animal.getSelectedItem() == "Coyote" || 
						animal.getSelectedItem() == "Dall Sheep" || 
						animal.getSelectedItem() == "Feral Goat" || 
						animal.getSelectedItem() == "Feral Hog" || 
						animal.getSelectedItem() == "Grey Wolf" || 
						animal.getSelectedItem() == "Mule Deer" || 
						animal.getSelectedItem() == "Red Deer" || 
						animal.getSelectedItem() == "Red Kangaroo" || 
						animal.getSelectedItem() == "Reindeer" || 
						animal.getSelectedItem() == "Rocky Mountain Elk" ||  
						animal.getSelectedItem() == "Roe Deer" || 
						animal.getSelectedItem() == "Roosevelt Elk" || 
						animal.getSelectedItem() == "Sitka Deer" || 
						animal.getSelectedItem() == "Whitetail Deer" ||
						animal.getSelectedItem() == "Wild Boar") {
    					txtrYesNo.setText("Yes");
    				} else {
    					txtrYesNo.setText("No");
    				}
    			} else if (ammo.getSelectedItem() == ".357 Nosler Sporting Handgun") {
    				if (animal.getSelectedItem() == "Alpine Ibex" || 
						animal.getSelectedItem() == "Arctic Fox" || 
						animal.getSelectedItem() == "Bighorn Sheep" || 
						animal.getSelectedItem() == "Blacktail Deer" || 
						animal.getSelectedItem() == "Canada Goose" || 
						animal.getSelectedItem() == "Coyote" || 
						animal.getSelectedItem() == "Dall Sheep" || 
						animal.getSelectedItem() == "Feral Goat" || 
						animal.getSelectedItem() == "Grey Wolf" || 
						animal.getSelectedItem() == "Mule Deer" || 
						animal.getSelectedItem() == "Red Fox" || 
						animal.getSelectedItem() == "Red Kangaroo" || 
						animal.getSelectedItem() == "Roe Deer" || 
						animal.getSelectedItem() == "Sitka Deer" || 
						animal.getSelectedItem() == "Turkey" || 
						animal.getSelectedItem() == "Whitetail Deer") {
    					txtrYesNo.setText("Yes");
    				} else {
    					txtrYesNo.setText("No");
    				}
    			} else if (ammo.getSelectedItem() == "16 GA Birdshot") {
    				if (animal.getSelectedItem() == "American Black Duck" || 
						animal.getSelectedItem() == "Canada Goose" || 
						animal.getSelectedItem() == "Cottontail Rabbit" || 
						animal.getSelectedItem() == "European Rabbit" || 
						animal.getSelectedItem() == "Gadwall" || 
						animal.getSelectedItem() == "Mallard" || 
						animal.getSelectedItem() == "Northern Pintail" || 
						animal.getSelectedItem() == "Pheasant" || 
						animal.getSelectedItem() == "Rock Ptarmigan" || 
						animal.getSelectedItem() == "Snowshoe Hare" || 
						animal.getSelectedItem() == "Turkey" || 
						animal.getSelectedItem() == "White-Tailed Ptarmigan" || 
						animal.getSelectedItem() == "Willow Ptarmigan") {
    					txtrYesNo.setText("Yes");
    				} else {
    					txtrYesNo.setText("No");
    				}
    			} else if (ammo.getSelectedItem() == "16 GA Buckshot") {
    				if (animal.getSelectedItem() == "Alpine Ibex" || 
						animal.getSelectedItem() == "Arctic Fox" || 
						animal.getSelectedItem() == "Bighorn Sheep" || 
						animal.getSelectedItem() == "Blacktail Deer" || 
						animal.getSelectedItem() == "Coyote" || 
						animal.getSelectedItem() == "Dall Sheep" || 
						animal.getSelectedItem() == "Feral Goat" || 
						animal.getSelectedItem() == "Grey Wolf" || 
						animal.getSelectedItem() == "Mule Deer" || 
						animal.getSelectedItem() == "Red Fox" || 
						animal.getSelectedItem() == "Red Kangaroo" || 
						animal.getSelectedItem() == "Roe Deer" || 
						animal.getSelectedItem() == "Sitka Deer" || 
						animal.getSelectedItem() == "Whitetail Deer") {
    					txtrYesNo.setText("Yes");
    				} else {
    					txtrYesNo.setText("No");
    				}
    			} else if (ammo.getSelectedItem() == "20 GA Birdshot") {
    				if (animal.getSelectedItem() == "American Black Duck" || 
						animal.getSelectedItem() == "Canada Goose" || 
						animal.getSelectedItem() == "Cottontail Rabbit" || 
						animal.getSelectedItem() == "European Rabbit" || 
						animal.getSelectedItem() == "Gadwall" || 
						animal.getSelectedItem() == "Mallard" || 
						animal.getSelectedItem() == "Northern Pintail" || 
						animal.getSelectedItem() == "Pheasant" || 
						animal.getSelectedItem() == "Rock Ptarmigan" || 
						animal.getSelectedItem() == "Snowshoe Hare" || 
						animal.getSelectedItem() == "Turkey" || 
						animal.getSelectedItem() == "White-Tailed Ptarmigan" || 
						animal.getSelectedItem() == "Willow Ptarmigan") {
    					txtrYesNo.setText("Yes");
    				} else {
    					txtrYesNo.setText("No");
    				}
    			} else if (ammo.getSelectedItem() == "12 GA Slug") {
    				if (animal.getSelectedItem() == "Alpine Ibex" || 
						animal.getSelectedItem() == "Bighorn Sheep" || 
						animal.getSelectedItem() == "Black Bear" || 
						animal.getSelectedItem() == "Blacktail Deer" || 
						animal.getSelectedItem() == "Brown Bear" || 
						animal.getSelectedItem() == "Coyote" || 
						animal.getSelectedItem() == "Dall Sheep" || 
						animal.getSelectedItem() == "Feral Goat" || 
						animal.getSelectedItem() == "Feral Hog" || 
						animal.getSelectedItem() == "Grey Wolf" || 
						animal.getSelectedItem() == "Grizzly Bear" || 
						animal.getSelectedItem() == "Moose" || 
						animal.getSelectedItem() == "Mule Deer" || 
						animal.getSelectedItem() == "Polar Bear" || 
						animal.getSelectedItem() == "Red Deer" || 
						animal.getSelectedItem() == "Red Kangaroo" || 
						animal.getSelectedItem() == "Reindeer" || 
						animal.getSelectedItem() == "Rocky Mountain Elk" ||  
						animal.getSelectedItem() == "Roe Deer" || 
						animal.getSelectedItem() == "Roosevelt Elk" || 
						animal.getSelectedItem() == "Sitka Deer" || 
						animal.getSelectedItem() == "Whitetail Deer" ||
						animal.getSelectedItem() == "Wild Boar") {
    					txtrYesNo.setText("Yes");
    				} else {
    					txtrYesNo.setText("No");
    				}
    			} else if (ammo.getSelectedItem() == "12 GA Buckshot") {
    				if (animal.getSelectedItem() == "Alpine Ibex" || 
						animal.getSelectedItem() == "Arctic Fox" || 
						animal.getSelectedItem() == "Bighorn Sheep" || 
						animal.getSelectedItem() == "Blacktail Deer" || 
						animal.getSelectedItem() == "Coyote" || 
						animal.getSelectedItem() == "Dall Sheep" || 
						animal.getSelectedItem() == "Feral Goat" || 
						animal.getSelectedItem() == "Grey Wolf" || 
						animal.getSelectedItem() == "Mule Deer" || 
						animal.getSelectedItem() == "Red Fox" || 
						animal.getSelectedItem() == "Red Kangaroo" || 
						animal.getSelectedItem() == "Roe Deer" || 
						animal.getSelectedItem() == "Sitka Deer" || 
						animal.getSelectedItem() == "Whitetail Deer") {
    					txtrYesNo.setText("Yes");
    				} else {
    					txtrYesNo.setText("No");
    				}
    			} else if (ammo.getSelectedItem() == "12 GA Birdshot") {
    				if (animal.getSelectedItem() == "American Black Duck" || 
						animal.getSelectedItem() == "Canada Goose" || 
						animal.getSelectedItem() == "Cottontail Rabbit" || 
						animal.getSelectedItem() == "European Rabbit" || 
						animal.getSelectedItem() == "Gadwall" || 
						animal.getSelectedItem() == "Mallard" || 
						animal.getSelectedItem() == "Northern Pintail" || 
						animal.getSelectedItem() == "Pheasant" || 
						animal.getSelectedItem() == "Rock Ptarmigan" || 
						animal.getSelectedItem() == "Snowshoe Hare" || 
						animal.getSelectedItem() == "Turkey" || 
						animal.getSelectedItem() == "White-Tailed Ptarmigan" || 
						animal.getSelectedItem() == "Willow Ptarmigan") {
    					txtrYesNo.setText("Yes");
    				} else {
    					txtrYesNo.setText("No");
    				}
    			} else if (ammo.getSelectedItem() == "Cable Backed Bow Arrows") {
    				if (animal.getSelectedItem() == "Alpine Ibex" || 
						animal.getSelectedItem() == "Arctic Fox" || 
						animal.getSelectedItem() == "American Black Duck" || 
						animal.getSelectedItem() == "Bighorn Sheep" || 
						animal.getSelectedItem() == "Black Bear" || 
						animal.getSelectedItem() == "Blacktail Deer" || 
						animal.getSelectedItem() == "Brown Bear" || 
						animal.getSelectedItem() == "Canada Goose" || 
						animal.getSelectedItem() == "Cottontail Rabbit" || 
						animal.getSelectedItem() == "Coyote" || 
						animal.getSelectedItem() == "Dall Sheep" || 
						animal.getSelectedItem() == "European Rabbit" || 
						animal.getSelectedItem() == "Feral Goat" || 
						animal.getSelectedItem() == "Feral Hog" || 
						animal.getSelectedItem() == "Gadwall" || 
						animal.getSelectedItem() == "Grey Wolf" || 
						animal.getSelectedItem() == "Grizzly Bear" || 
						animal.getSelectedItem() == "Mallard" || 
						animal.getSelectedItem() == "Moose" || 
						animal.getSelectedItem() == "Mule Deer" || 
						animal.getSelectedItem() == "Northern Pintail" || 
						animal.getSelectedItem() == "Pheasant" || 
						animal.getSelectedItem() == "Polar Bear" || 
						animal.getSelectedItem() == "Red Deer" || 
						animal.getSelectedItem() == "Red Fox" || 
						animal.getSelectedItem() == "Red Kangaroo" || 
						animal.getSelectedItem() == "Reindeer" || 
						animal.getSelectedItem() == "Rock Ptarmigan" || 
						animal.getSelectedItem() == "Rocky Mountain Elk" ||  
						animal.getSelectedItem() == "Roe Deer" || 
						animal.getSelectedItem() == "Roosevelt Elk" || 
						animal.getSelectedItem() == "Sitka Deer" || 
						animal.getSelectedItem() == "Snowshoe Hare" || 
						animal.getSelectedItem() == "Turkey" || 
						animal.getSelectedItem() == "White-Tailed Ptarmigan" || 
						animal.getSelectedItem() == "Whitetail Deer" ||
						animal.getSelectedItem() == "Wild Boar" || 
						animal.getSelectedItem() == "Willow Ptarmigan") {
    					txtrYesNo.setText("Yes");
    				} else {
    					txtrYesNo.setText("No");
    				}
    			} else if (ammo.getSelectedItem() == "Longbow Arrows") {
    				if (animal.getSelectedItem() == "Alpine Ibex" || 
						animal.getSelectedItem() == "Arctic Fox" || 
						animal.getSelectedItem() == "American Black Duck" || 
						animal.getSelectedItem() == "Bighorn Sheep" || 
						animal.getSelectedItem() == "Black Bear" || 
						animal.getSelectedItem() == "Blacktail Deer" || 
						animal.getSelectedItem() == "Brown Bear" || 
						animal.getSelectedItem() == "Canada Goose" || 
						animal.getSelectedItem() == "Cottontail Rabbit" || 
						animal.getSelectedItem() == "Coyote" || 
						animal.getSelectedItem() == "Dall Sheep" || 
						animal.getSelectedItem() == "European Rabbit" || 
						animal.getSelectedItem() == "Feral Goat" || 
						animal.getSelectedItem() == "Feral Hog" || 
						animal.getSelectedItem() == "Gadwall" || 
						animal.getSelectedItem() == "Grey Wolf" || 
						animal.getSelectedItem() == "Grizzly Bear" || 
						animal.getSelectedItem() == "Mallard" || 
						animal.getSelectedItem() == "Moose" || 
						animal.getSelectedItem() == "Mule Deer" || 
						animal.getSelectedItem() == "Northern Pintail" || 
						animal.getSelectedItem() == "Pheasant" || 
						animal.getSelectedItem() == "Polar Bear" || 
						animal.getSelectedItem() == "Red Deer" || 
						animal.getSelectedItem() == "Red Fox" || 
						animal.getSelectedItem() == "Red Kangaroo" || 
						animal.getSelectedItem() == "Reindeer" || 
						animal.getSelectedItem() == "Rock Ptarmigan" || 
						animal.getSelectedItem() == "Rocky Mountain Elk" ||  
						animal.getSelectedItem() == "Roe Deer" || 
						animal.getSelectedItem() == "Roosevelt Elk" || 
						animal.getSelectedItem() == "Sitka Deer" || 
						animal.getSelectedItem() == "Snowshoe Hare" || 
						animal.getSelectedItem() == "Turkey" || 
						animal.getSelectedItem() == "White-Tailed Ptarmigan" || 
						animal.getSelectedItem() == "Whitetail Deer" ||
						animal.getSelectedItem() == "Wild Boar" || 
						animal.getSelectedItem() == "Willow Ptarmigan") {
    					txtrYesNo.setText("Yes");
    				} else {
    					txtrYesNo.setText("No");
    				}
    			} else if (ammo.getSelectedItem() == "Crossbow Tracer Arrows") {
    				if (animal.getSelectedItem() == "Alpine Ibex" || 
						animal.getSelectedItem() == "Arctic Fox" || 
						animal.getSelectedItem() == "American Black Duck" || 
						animal.getSelectedItem() == "Bighorn Sheep" || 
						animal.getSelectedItem() == "Bison" || 
						animal.getSelectedItem() == "Black Bear" || 
						animal.getSelectedItem() == "Blacktail Deer" || 
						animal.getSelectedItem() == "Brown Bear" || 
						animal.getSelectedItem() == "Canada Goose" || 
						animal.getSelectedItem() == "Cottontail Rabbit" || 
						animal.getSelectedItem() == "Coyote" || 
						animal.getSelectedItem() == "Dall Sheep" || 
						animal.getSelectedItem() == "European Rabbit" || 
						animal.getSelectedItem() == "Feral Goat" || 
						animal.getSelectedItem() == "Feral Hog" || 
						animal.getSelectedItem() == "Gadwall" || 
						animal.getSelectedItem() == "Grey Wolf" || 
						animal.getSelectedItem() == "Grizzly Bear" || 
						animal.getSelectedItem() == "Mallard" || 
						animal.getSelectedItem() == "Moose" || 
						animal.getSelectedItem() == "Mule Deer" || 
						animal.getSelectedItem() == "Northern Pintail" || 
						animal.getSelectedItem() == "Pheasant" || 
						animal.getSelectedItem() == "Polar Bear" || 
						animal.getSelectedItem() == "Red Deer" || 
						animal.getSelectedItem() == "Red Fox" || 
						animal.getSelectedItem() == "Red Kangaroo" || 
						animal.getSelectedItem() == "Reindeer" || 
						animal.getSelectedItem() == "Rock Ptarmigan" || 
						animal.getSelectedItem() == "Rocky Mountain Elk" ||  
						animal.getSelectedItem() == "Roe Deer" || 
						animal.getSelectedItem() == "Roosevelt Elk" || 
						animal.getSelectedItem() == "Sitka Deer" || 
						animal.getSelectedItem() == "Snowshoe Hare" || 
						animal.getSelectedItem() == "Turkey" || 
						animal.getSelectedItem() == "White-Tailed Ptarmigan" || 
						animal.getSelectedItem() == "Whitetail Deer" ||
						animal.getSelectedItem() == "Wild Boar" || 
						animal.getSelectedItem() == "Willow Ptarmigan") {
    					txtrYesNo.setText("Yes");
    				} else {
    					txtrYesNo.setText("No");
    				}
    			} else if (ammo.getSelectedItem() == "Cupid Arrows") {
    				if (animal.getSelectedItem() == "Alpine Ibex" || 
						animal.getSelectedItem() == "Arctic Fox" || 
						animal.getSelectedItem() == "American Black Duck" || 
						animal.getSelectedItem() == "Bighorn Sheep" || 
						animal.getSelectedItem() == "Bison" || 
						animal.getSelectedItem() == "Black Bear" || 
						animal.getSelectedItem() == "Blacktail Deer" || 
						animal.getSelectedItem() == "Brown Bear" || 
						animal.getSelectedItem() == "Canada Goose" || 
						animal.getSelectedItem() == "Cottontail Rabbit" || 
						animal.getSelectedItem() == "Coyote" || 
						animal.getSelectedItem() == "Dall Sheep" || 
						animal.getSelectedItem() == "European Rabbit" || 
						animal.getSelectedItem() == "Feral Goat" || 
						animal.getSelectedItem() == "Feral Hog" || 
						animal.getSelectedItem() == "Gadwall" || 
						animal.getSelectedItem() == "Grey Wolf" || 
						animal.getSelectedItem() == "Grizzly Bear" || 
						animal.getSelectedItem() == "Mallard" || 
						animal.getSelectedItem() == "Moose" || 
						animal.getSelectedItem() == "Mule Deer" || 
						animal.getSelectedItem() == "Northern Pintail" || 
						animal.getSelectedItem() == "Pheasant" || 
						animal.getSelectedItem() == "Polar Bear" || 
						animal.getSelectedItem() == "Red Deer" || 
						animal.getSelectedItem() == "Red Fox" || 
						animal.getSelectedItem() == "Red Kangaroo" || 
						animal.getSelectedItem() == "Reindeer" || 
						animal.getSelectedItem() == "Rock Ptarmigan" || 
						animal.getSelectedItem() == "Rocky Mountain Elk" ||  
						animal.getSelectedItem() == "Roe Deer" || 
						animal.getSelectedItem() == "Roosevelt Elk" || 
						animal.getSelectedItem() == "Sitka Deer" || 
						animal.getSelectedItem() == "Snowshoe Hare" || 
						animal.getSelectedItem() == "Turkey" || 
						animal.getSelectedItem() == "White-Tailed Ptarmigan" || 
						animal.getSelectedItem() == "Whitetail Deer" ||
						animal.getSelectedItem() == "Wild Boar" || 
						animal.getSelectedItem() == "Willow Ptarmigan") {
    					txtrYesNo.setText("Yes");
    				} else {
    					txtrYesNo.setText("No");
    				}
    			} else if (ammo.getSelectedItem() == "Compound Tracer Arrows") {
    				if (animal.getSelectedItem() == "Alpine Ibex" || 
						animal.getSelectedItem() == "Arctic Fox" || 
						animal.getSelectedItem() == "American Black Duck" || 
						animal.getSelectedItem() == "Bighorn Sheep" || 
						animal.getSelectedItem() == "Bison" || 
						animal.getSelectedItem() == "Black Bear" || 
						animal.getSelectedItem() == "Blacktail Deer" || 
						animal.getSelectedItem() == "Brown Bear" || 
						animal.getSelectedItem() == "Canada Goose" || 
						animal.getSelectedItem() == "Cottontail Rabbit" || 
						animal.getSelectedItem() == "Coyote" || 
						animal.getSelectedItem() == "Dall Sheep" || 
						animal.getSelectedItem() == "European Rabbit" || 
						animal.getSelectedItem() == "Feral Goat" || 
						animal.getSelectedItem() == "Feral Hog" || 
						animal.getSelectedItem() == "Gadwall" || 
						animal.getSelectedItem() == "Grey Wolf" || 
						animal.getSelectedItem() == "Grizzly Bear" || 
						animal.getSelectedItem() == "Mallard" || 
						animal.getSelectedItem() == "Moose" || 
						animal.getSelectedItem() == "Mule Deer" || 
						animal.getSelectedItem() == "Northern Pintail" || 
						animal.getSelectedItem() == "Pheasant" || 
						animal.getSelectedItem() == "Polar Bear" || 
						animal.getSelectedItem() == "Red Deer" || 
						animal.getSelectedItem() == "Red Fox" || 
						animal.getSelectedItem() == "Red Kangaroo" || 
						animal.getSelectedItem() == "Reindeer" || 
						animal.getSelectedItem() == "Rock Ptarmigan" || 
						animal.getSelectedItem() == "Rocky Mountain Elk" ||  
						animal.getSelectedItem() == "Roe Deer" || 
						animal.getSelectedItem() == "Roosevelt Elk" || 
						animal.getSelectedItem() == "Sitka Deer" || 
						animal.getSelectedItem() == "Snowshoe Hare" || 
						animal.getSelectedItem() == "Turkey" || 
						animal.getSelectedItem() == "White-Tailed Ptarmigan" || 
						animal.getSelectedItem() == "Whitetail Deer" ||
						animal.getSelectedItem() == "Wild Boar" || 
						animal.getSelectedItem() == "Willow Ptarmigan")	{
    					txtrYesNo.setText("Yes");
    				} else {
    					txtrYesNo.setText("No");
    				}
    			} else if (ammo.getSelectedItem() == "Recurve Tracer Arrows") {
    				if (animal.getSelectedItem() == "Alpine Ibex" || 
						animal.getSelectedItem() == "Arctic Fox" || 
						animal.getSelectedItem() == "American Black Duck" || 
						animal.getSelectedItem() == "Bighorn Sheep" || 
						animal.getSelectedItem() == "Bison" || 
						animal.getSelectedItem() == "Black Bear" || 
						animal.getSelectedItem() == "Blacktail Deer" || 
						animal.getSelectedItem() == "Brown Bear" || 
						animal.getSelectedItem() == "Canada Goose" || 
						animal.getSelectedItem() == "Cottontail Rabbit" || 
						animal.getSelectedItem() == "Coyote" || 
						animal.getSelectedItem() == "Dall Sheep" || 
						animal.getSelectedItem() == "European Rabbit" || 
						animal.getSelectedItem() == "Feral Goat" || 
						animal.getSelectedItem() == "Feral Hog" || 
						animal.getSelectedItem() == "Gadwall" || 
						animal.getSelectedItem() == "Grey Wolf" || 
						animal.getSelectedItem() == "Grizzly Bear" || 
						animal.getSelectedItem() == "Mallard" || 
						animal.getSelectedItem() == "Moose" || 
						animal.getSelectedItem() == "Mule Deer" || 
						animal.getSelectedItem() == "Northern Pintail" || 
						animal.getSelectedItem() == "Pheasant" || 
						animal.getSelectedItem() == "Polar Bear" || 
						animal.getSelectedItem() == "Red Deer" || 
						animal.getSelectedItem() == "Red Fox" || 
						animal.getSelectedItem() == "Red Kangaroo" || 
						animal.getSelectedItem() == "Reindeer" || 
						animal.getSelectedItem() == "Rock Ptarmigan" || 
						animal.getSelectedItem() == "Rocky Mountain Elk" ||  
						animal.getSelectedItem() == "Roe Deer" || 
						animal.getSelectedItem() == "Roosevelt Elk" || 
						animal.getSelectedItem() == "Sitka Deer" || 
						animal.getSelectedItem() == "Snowshoe Hare" || 
						animal.getSelectedItem() == "Turkey" || 
						animal.getSelectedItem() == "White-Tailed Ptarmigan" || 
						animal.getSelectedItem() == "Whitetail Deer" ||
						animal.getSelectedItem() == "Wild Boar" || 
						animal.getSelectedItem() == "Willow Ptarmigan") {
    					txtrYesNo.setText("Yes");
    				} else {
    					txtrYesNo.setText("No");
    				}
            } else if (ammo.getSelectedItem() == "Recurve Arrows") {
            	if (animal.getSelectedItem() == "Alpine Ibex" || 
					animal.getSelectedItem() == "Arctic Fox" || 
					animal.getSelectedItem() == "American Black Duck" || 
					animal.getSelectedItem() == "Bighorn Sheep" || 
					animal.getSelectedItem() == "Bison" || 
					animal.getSelectedItem() == "Black Bear" || 
					animal.getSelectedItem() == "Blacktail Deer" || 
					animal.getSelectedItem() == "Brown Bear" || 
					animal.getSelectedItem() == "Canada Goose" || 
					animal.getSelectedItem() == "Cottontail Rabbit" || 
					animal.getSelectedItem() == "Coyote" || 
					animal.getSelectedItem() == "Dall Sheep" || 
					animal.getSelectedItem() == "European Rabbit" || 
					animal.getSelectedItem() == "Feral Goat" || 
					animal.getSelectedItem() == "Feral Hog" || 
					animal.getSelectedItem() == "Gadwall" || 
					animal.getSelectedItem() == "Grey Wolf" || 
					animal.getSelectedItem() == "Grizzly Bear" || 
					animal.getSelectedItem() == "Mallard" || 
					animal.getSelectedItem() == "Moose" || 
					animal.getSelectedItem() == "Mule Deer" || 
					animal.getSelectedItem() == "Northern Pintail" || 
					animal.getSelectedItem() == "Pheasant" || 
					animal.getSelectedItem() == "Polar Bear" || 
					animal.getSelectedItem() == "Red Deer" || 
					animal.getSelectedItem() == "Red Fox" || 
					animal.getSelectedItem() == "Red Kangaroo" || 
					animal.getSelectedItem() == "Reindeer" || 
					animal.getSelectedItem() == "Rock Ptarmigan" || 
					animal.getSelectedItem() == "Rocky Mountain Elk" ||  
					animal.getSelectedItem() == "Roe Deer" || 
					animal.getSelectedItem() == "Roosevelt Elk" || 
					animal.getSelectedItem() == "Sitka Deer" || 
					animal.getSelectedItem() == "Snowshoe Hare" || 
					animal.getSelectedItem() == "Turkey" || 
					animal.getSelectedItem() == "White-Tailed Ptarmigan" || 
					animal.getSelectedItem() == "Whitetail Deer" ||
					animal.getSelectedItem() == "Wild Boar" || 
					animal.getSelectedItem() == "Willow Ptarmigan") {
            		txtrYesNo.setText("Yes");
            	} else {
            		txtrYesNo.setText("No");
            	}
            } else if (ammo.getSelectedItem() == "Crossbow Arrows") {
            	if (animal.getSelectedItem() == "Alpine Ibex" || 
					animal.getSelectedItem() == "Arctic Fox" || 
					animal.getSelectedItem() == "American Black Duck" || 
					animal.getSelectedItem() == "Bighorn Sheep" || 
					animal.getSelectedItem() == "Bison" || 
					animal.getSelectedItem() == "Black Bear" || 
					animal.getSelectedItem() == "Blacktail Deer" || 
					animal.getSelectedItem() == "Brown Bear" || 
					animal.getSelectedItem() == "Canada Goose" || 
					animal.getSelectedItem() == "Cottontail Rabbit" || 
					animal.getSelectedItem() == "Coyote" || 
					animal.getSelectedItem() == "Dall Sheep" || 
					animal.getSelectedItem() == "European Rabbit" || 
					animal.getSelectedItem() == "Feral Goat" || 
					animal.getSelectedItem() == "Feral Hog" || 
					animal.getSelectedItem() == "Gadwall" || 
					animal.getSelectedItem() == "Grey Wolf" || 
					animal.getSelectedItem() == "Grizzly Bear" || 
					animal.getSelectedItem() == "Mallard" || 
					animal.getSelectedItem() == "Moose" || 
					animal.getSelectedItem() == "Mule Deer" || 
					animal.getSelectedItem() == "Northern Pintail" || 
					animal.getSelectedItem() == "Pheasant" || 
					animal.getSelectedItem() == "Polar Bear" || 
					animal.getSelectedItem() == "Red Deer" || 
					animal.getSelectedItem() == "Red Fox" || 
					animal.getSelectedItem() == "Red Kangaroo" || 
					animal.getSelectedItem() == "Reindeer" || 
					animal.getSelectedItem() == "Rock Ptarmigan" || 
					animal.getSelectedItem() == "Rocky Mountain Elk" ||  
					animal.getSelectedItem() == "Roe Deer" || 
					animal.getSelectedItem() == "Roosevelt Elk" || 
					animal.getSelectedItem() == "Sitka Deer" || 
					animal.getSelectedItem() == "Snowshoe Hare" || 
					animal.getSelectedItem() == "Turkey" || 
					animal.getSelectedItem() == "White-Tailed Ptarmigan" || 
					animal.getSelectedItem() == "Whitetail Deer" ||
					animal.getSelectedItem() == "Wild Boar" || 
					animal.getSelectedItem() == "Willow Ptarmigan") {
            		txtrYesNo.setText("Yes");
            	} else {
            		txtrYesNo.setText("No");
            	}
            } else if (ammo.getSelectedItem() == "Compound Arrows") {
            	if (animal.getSelectedItem() == "Alpine Ibex" || 
					animal.getSelectedItem() == "Arctic Fox" || 
					animal.getSelectedItem() == "American Black Duck" || 
					animal.getSelectedItem() == "Bighorn Sheep" || 
					animal.getSelectedItem() == "Bison" || 
					animal.getSelectedItem() == "Black Bear" || 
					animal.getSelectedItem() == "Blacktail Deer" || 
					animal.getSelectedItem() == "Brown Bear" || 
					animal.getSelectedItem() == "Canada Goose" || 
					animal.getSelectedItem() == "Cottontail Rabbit" || 
					animal.getSelectedItem() == "Coyote" || 
					animal.getSelectedItem() == "Dall Sheep" || 
					animal.getSelectedItem() == "European Rabbit" || 
					animal.getSelectedItem() == "Feral Goat" || 
					animal.getSelectedItem() == "Feral Hog" || 
					animal.getSelectedItem() == "Gadwall" || 
					animal.getSelectedItem() == "Grey Wolf" || 
					animal.getSelectedItem() == "Grizzly Bear" || 
					animal.getSelectedItem() == "Mallard" || 
					animal.getSelectedItem() == "Moose" || 
					animal.getSelectedItem() == "Mule Deer" || 
					animal.getSelectedItem() == "Northern Pintail" || 
					animal.getSelectedItem() == "Pheasant" || 
					animal.getSelectedItem() == "Polar Bear" || 
					animal.getSelectedItem() == "Red Deer" || 
					animal.getSelectedItem() == "Red Fox" || 
					animal.getSelectedItem() == "Red Kangaroo" || 
					animal.getSelectedItem() == "Reindeer" || 
					animal.getSelectedItem() == "Rock Ptarmigan" || 
					animal.getSelectedItem() == "Rocky Mountain Elk" ||  
					animal.getSelectedItem() == "Roe Deer" || 
					animal.getSelectedItem() == "Roosevelt Elk" || 
					animal.getSelectedItem() == "Sitka Deer" || 
					animal.getSelectedItem() == "Snowshoe Hare" || 
					animal.getSelectedItem() == "Turkey" || 
					animal.getSelectedItem() == "White-Tailed Ptarmigan" || 
					animal.getSelectedItem() == "Whitetail Deer" ||
					animal.getSelectedItem() == "Wild Boar" || 
					animal.getSelectedItem() == "Willow Ptarmigan") {
            		txtrYesNo.setText("Yes");
            	} else {
            		txtrYesNo.setText("No");
            	}
            } else if (ammo.getSelectedItem() == ".45 Saboted Bullet") {
            	if (animal.getSelectedItem() == "Alpine Ibex" || 
					animal.getSelectedItem() == "Bighorn Sheep" || 
					animal.getSelectedItem() == "Blacktail Deer" || 
					animal.getSelectedItem() == "Coyote" || 
					animal.getSelectedItem() == "Dall Sheep" || 
					animal.getSelectedItem() == "Feral Goat" || 
					animal.getSelectedItem() == "Grey Wolf" || 
					animal.getSelectedItem() == "Mule Deer" || 
					animal.getSelectedItem() == "Red Kangaroo" || 
					animal.getSelectedItem() == "Reindeer" || 
					animal.getSelectedItem() == "Roe Deer" || 
					animal.getSelectedItem() == "Sitka Deer" || 
					animal.getSelectedItem() == "Whitetail Deer") {
            		txtrYesNo.setText("Yes");
            	} else {
            		txtrYesNo.setText("No");
            	}
            } else if (ammo.getSelectedItem() == ".50 Conical Bullet") {
            	if (animal.getSelectedItem() == "Bison" || 
					animal.getSelectedItem() == "Black Bear" || 
					animal.getSelectedItem() == "Brown Bear" || 
					animal.getSelectedItem() == "Feral Hog" || 
					animal.getSelectedItem() == "Grizzly Bear" || 
					animal.getSelectedItem() == "Moose" || 
					animal.getSelectedItem() == "Polar Bear" || 
					animal.getSelectedItem() == "Red Deer" || 
					animal.getSelectedItem() == "Rocky Mountain Elk" ||  
					animal.getSelectedItem() == "Roosevelt Elk" || 
					animal.getSelectedItem() == "Wild Boar") {
            		txtrYesNo.setText("Yes");
            	} else {
            		txtrYesNo.setText("No");
            	}
            } else if (ammo.getSelectedItem() == ".50 Patched Round Ball") {
            	if (animal.getSelectedItem() == "Alpine Ibex" || 
					animal.getSelectedItem() == "Bighorn Sheep" || 
					animal.getSelectedItem() == "Black Bear" || 
					animal.getSelectedItem() == "Blacktail Deer" || 
					animal.getSelectedItem() == "Brown Bear" || 
					animal.getSelectedItem() == "Coyote" || 
					animal.getSelectedItem() == "Dall Sheep" || 
					animal.getSelectedItem() == "Feral Goat" || 
					animal.getSelectedItem() == "Feral Hog" || 
					animal.getSelectedItem() == "Grey Wolf" || 
					animal.getSelectedItem() == "Grizzly Bear" || 
					animal.getSelectedItem() == "Moose" || 
					animal.getSelectedItem() == "Mule Deer" || 
					animal.getSelectedItem() == "Polar Bear" || 
					animal.getSelectedItem() == "Red Deer" || 
					animal.getSelectedItem() == "Red Fox" || 
					animal.getSelectedItem() == "Red Kangaroo" || 
					animal.getSelectedItem() == "Reindeer" || 
					animal.getSelectedItem() == "Rocky Mountain Elk" ||  
					animal.getSelectedItem() == "Roe Deer" || 
					animal.getSelectedItem() == "Roosevelt Elk" || 
					animal.getSelectedItem() == "Sitka Deer" || 
					animal.getSelectedItem() == "Turkey" || 
					animal.getSelectedItem() == "Whitetail Deer" ||
					animal.getSelectedItem() == "Wild Boar") {
            		txtrYesNo.setText("Yes");
            	} else {
            		txtrYesNo.setText("No");
            	}
            } else if (ammo.getSelectedItem() != "Select One" && animal.getSelectedItem() == "Select One") {
            	txtrYesNo.setText("Please Select an Animal/Ammunition Type");   
            } else if (animal.getSelectedItem() != "Select One" && ammo.getSelectedItem() == "Select One") {
                	txtrYesNo.setText("Please Select an Animal/Ammunition Type");            
            }
        }
    });

        animal.add("Select One");
        animal.add("Alpine Ibex");
        animal.add("Arctic Fox");
        animal.add("American Black Duck");
        animal.add("Bighorn Sheep");
        animal.add("Bison");
        animal.add("Black Bear");
        animal.add("Blacktail Deer");
        animal.add("Brown Bear");
        animal.add("Canada Goose");
        animal.add("Cottontail Rabbit");
        animal.add("Coyote");
        animal.add("Dall Sheep");
        animal.add("European Rabbit");
        animal.add("Feral Goat");
        animal.add("Feral Hog");
        animal.add("Gadwall");
        animal.add("Grey Wolf");
        animal.add("Grizzly Bear");
        animal.add("Mallard");
        animal.add("Moose");
        animal.add("Mule Deer");
        animal.add("Northern Pintail");
        animal.add("Pheasant");
        animal.add("Polar Bear");
        animal.add("Red Deer");
        animal.add("Red Fox");
        animal.add("Red Kangaroo");
        animal.add("Reindeer");
        animal.add("Rock Ptarmigan");
        animal.add("Rocky Mountain Elk");
        animal.add("Roe Deer");
        animal.add("Roosevelt Elk");
        animal.add("Sitka Deer");
        animal.add("Snowshoe Hare");
        animal.add("Turkey");
        animal.add("White-Tailed Ptarmigan");
        animal.add("Whitetail Deer");
        animal.add("Wild Boar");
        animal.add("Willow Ptarmigan");

        ammo.add("Select One");
        ammo.add(".45-70 Government");
        ammo.add(".340 Weatherby Magnum");
        ammo.add(".30-06 Round Nose");
        ammo.add("7.62x54R SP");
        ammo.add(".303 British");
        ammo.add("7mm Magnum");
        ammo.add(".30-30 Nosler Partition");
        ammo.add(".22 Air Rifle Pellet");
        ammo.add("6.5X55 Nosler AccuBond");
        ammo.add(".223 Nosler Ballistic Tip");
        ammo.add("9.3x62 Nosler Partition");
        ammo.add("8x57 IS Nosler Partition");
        ammo.add(".308 Nosler Partition");
        ammo.add(".270 Nosler Ballistic Tip");
        ammo.add(".30-06 Nosler Partition");
        ammo.add(".300 Nosler AccuBond");
        ammo.add(".243 Nosler Ballistic Tip");
        ammo.add("10mm Auto");
        ammo.add(".45 Long Colt Handgun");
        ammo.add(".22 LR");
        ammo.add(".454 Nosler Custom Handgun");
        ammo.add(".44 Nosler Sporting Handgun");
        ammo.add(".357 Nosler Sporting Handgun");
        ammo.add("16 GA Birdshot");
        ammo.add("16 GA Buckshot");
        ammo.add("20 GA Birdshot");
        ammo.add("12 GA Slug");
        ammo.add("12 GA Buckshot");
        ammo.add("12 GA Birdshot");
        ammo.add("Cable Backed Bow Arrows");
        ammo.add("Longbow Arrows");
        ammo.add("Crossbow Tracer Arrows");
        ammo.add("Cupid Arrows");
        ammo.add("Compound Tracer Arrows");
        ammo.add("Recurve Tracer Arrows");
        ammo.add("Recurve Arrows");
        ammo.add("Crossbow Arrows");
        ammo.add("Compound Arrows");
        ammo.add(".45 Saboted Bullet");
        ammo.add(".50 Conical Bullet");
        ammo.add(".50 Patched Round Ball");
    }
}