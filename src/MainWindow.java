import java.awt.EventQueue;

import javax.swing.ImageIcon;
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
import java.awt.Image;




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
        txtrYesNo.setBounds(218, 216, 487, 123);
        frame.getContentPane().add(txtrYesNo);

        Label Xey = new Label("By: Xeygwyn");
        Xey.setAlignment(Label.RIGHT);
        Xey.setBounds(10, 382, 127, 14);
        frame.getContentPane().add(Xey);
        
        JLabel label = new JLabel("");
        Image img = new ImageIcon(this.getClass().getResource("/gwyn_logo_Small.png")).getImage();
        label.setIcon(new ImageIcon(img));
        label.setBounds(51, 198, 157, 174);
        frame.getContentPane().add(label);
        frame.setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[] {
            ammo,
            animal
        }));

        ammo.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                txtrYesNo.setText("");
            }
        });


        animal.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {


                if (ammo.getSelectedItem() == ".45-70 Government" || ammo.getSelectedItem() == ".340 Weatherby Magnum" || ammo.getSelectedItem() == ".50 Conical Bullet" || ammo.getSelectedItem() == ".454 Nosler Custom Handgun") {
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
                        Image img = new ImageIcon(this.getClass().getResource("/340_454_4570_50c.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    } else {
                        txtrYesNo.setText("No");
                        Image img = new ImageIcon(this.getClass().getResource("/340_454_4570_50c.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    }
                } else if (ammo.getSelectedItem() == ".17 HMR") {
                	if (animal.getSelectedItem() == "American Black Duck" ||
                		animal.getSelectedItem() == "Arctic Fox" ||
                		animal.getSelectedItem() == "Canada Goose" ||
                		animal.getSelectedItem() == "Cottontail Rabbit" ||
                		animal.getSelectedItem() == "European Rabbit" ||
                		animal.getSelectedItem() == "Gadwall" ||
                		animal.getSelectedItem() == "Mallard" ||
                		animal.getSelectedItem() == "Northern Pintail" ||
                		animal.getSelectedItem() == "Pheasant" ||
                		animal.getSelectedItem() == "Red Fox" ||
                		animal.getSelectedItem() == "Rock Ptarmigan" ||
                		animal.getSelectedItem() == "Snowshoe Hare" ||
                		animal.getSelectedItem() == "Turkey" ||
                		animal.getSelectedItem() == "White-tailed Ptarmigan" ||
                		animal.getSelectedItem() == "Willow Ptarmigan") {
                		txtrYesNo.setText("Yes");
                        Image img = new ImageIcon(this.getClass().getResource("/cartridges_17_HMR.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                	} else {
                		txtrYesNo.setText("No");
                        Image img = new ImageIcon(this.getClass().getResource("/cartridges_17_HMR.png")).getImage();
                        label.setIcon(new ImageIcon(img));
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
                        Image img = new ImageIcon(this.getClass().getResource("/cartridges_3006_256.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    } else {
                        txtrYesNo.setText("No");
                        Image img = new ImageIcon(this.getClass().getResource("/cartridges_3006_256.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    }
                } else if (ammo.getSelectedItem() == "7.62x54R SP" || ammo.getSelectedItem() == ".303 British") {
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
                        Image img = new ImageIcon(this.getClass().getResource("/cartridges_303_british_256.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    } else {
                        txtrYesNo.setText("No");
                        Image img = new ImageIcon(this.getClass().getResource("/cartridges_303_british_256.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    }
                } else if (ammo.getSelectedItem() == "7mm Magnum" || ammo.getSelectedItem() == "9.3x62 Nosler Partition" || ammo.getSelectedItem() == "8x57 IS Nosler Partition") {
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
                        Image img = new ImageIcon(this.getClass().getResource("/7mm_9362_857.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    } else {
                        txtrYesNo.setText("No");
                        Image img = new ImageIcon(this.getClass().getResource("/7mm_9362_857.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    }
                } else if (ammo.getSelectedItem() == ".30-30 Nosler Partition" || ammo.getSelectedItem() == "6.5x55 Nosler AccuBond") {
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
                        Image img = new ImageIcon(this.getClass().getResource("/3030_6555.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    } else {
                        txtrYesNo.setText("No");
                        Image img = new ImageIcon(this.getClass().getResource("/3030_6555.png")).getImage();
                        label.setIcon(new ImageIcon(img));
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
                        Image img = new ImageIcon(this.getClass().getResource("/Air_rifle_22_pellet.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    } else {
                        txtrYesNo.setText("No");
                        Image img = new ImageIcon(this.getClass().getResource("/Air_rifle_22_pellet.png")).getImage();
                        label.setIcon(new ImageIcon(img));
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
                        Image img = new ImageIcon(this.getClass().getResource("/Cartridges_223_256.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    } else {
                        txtrYesNo.setText("No");
                        Image img = new ImageIcon(this.getClass().getResource("/Cartridges_223_256.png")).getImage();
                        label.setIcon(new ImageIcon(img));
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
                        Image img = new ImageIcon(this.getClass().getResource("/Cartridges_308_256.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    } else {
                        txtrYesNo.setText("No");
                        Image img = new ImageIcon(this.getClass().getResource("/Cartridges_308_256.png")).getImage();
                        label.setIcon(new ImageIcon(img));
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
                        Image img = new ImageIcon(this.getClass().getResource("/Cartridges_270_256.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    } else {
                        txtrYesNo.setText("No");
                        Image img = new ImageIcon(this.getClass().getResource("/Cartridges_270_256.png")).getImage();
                        label.setIcon(new ImageIcon(img));
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
                        Image img = new ImageIcon(this.getClass().getResource("/Cartridges_3006_256.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    } else {
                        txtrYesNo.setText("No");
                        Image img = new ImageIcon(this.getClass().getResource("/Cartridges_3006_256.png")).getImage();
                        label.setIcon(new ImageIcon(img));
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
                        Image img = new ImageIcon(this.getClass().getResource("/Cartridges_300_256.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    } else {
                        txtrYesNo.setText("No");
                        Image img = new ImageIcon(this.getClass().getResource("/Cartridges_300_256.png")).getImage();
                        label.setIcon(new ImageIcon(img));
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
                        Image img = new ImageIcon(this.getClass().getResource("/Cartridges_243_256.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    } else {
                        txtrYesNo.setText("No");
                        Image img = new ImageIcon(this.getClass().getResource("/Cartridges_243_256.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    }
                } else if (ammo.getSelectedItem() == "10mm Auto" || ammo.getSelectedItem() == ".44 Nosler Sporting Handgun") {
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
                        Image img = new ImageIcon(this.getClass().getResource("/10mm_44.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    } else {
                        txtrYesNo.setText("No");
                        Image img = new ImageIcon(this.getClass().getResource("/10mm_44.png")).getImage();
                        label.setIcon(new ImageIcon(img));
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
                        animal.getSelectedItem() == "Rocky Mountain Elk" ||
                        animal.getSelectedItem() == "Roosevelt Elk" ||
                        animal.getSelectedItem() == "Wild Boar") {
                        txtrYesNo.setText("Yes");
                        Image img = new ImageIcon(this.getClass().getResource("/Cartridges_45_revolver.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    } else {
                        txtrYesNo.setText("No");
                        Image img = new ImageIcon(this.getClass().getResource("/Cartridges_45_revolver.png")).getImage();
                        label.setIcon(new ImageIcon(img));
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
                        Image img = new ImageIcon(this.getClass().getResource("/Cartridges_357_256.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    } else {
                        txtrYesNo.setText("No");
                        Image img = new ImageIcon(this.getClass().getResource("/Cartridges_357_256.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    }
                } else if (ammo.getSelectedItem() == "16 GA Birdshot" || ammo.getSelectedItem() == "20 GA Birdshot" || ammo.getSelectedItem() == "12 GA Birdshot" || ammo.getSelectedItem() == "10 GA Birdshot" || ammo.getSelectedItem() == ".22 LR") {
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
                        Image img = new ImageIcon(this.getClass().getResource("/10201612birdshot.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    } else {
                        txtrYesNo.setText("No");
                        Image img = new ImageIcon(this.getClass().getResource("/10201612birdshot.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    }
                } else if (ammo.getSelectedItem() == "16 GA Buckshot" || ammo.getSelectedItem() == "12 GA Buckshot" || ammo.getSelectedItem() == "10 GA Buckshot") {
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
                        Image img = new ImageIcon(this.getClass().getResource("/buckshot121016.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    } else {
                        txtrYesNo.setText("No");
                        Image img = new ImageIcon(this.getClass().getResource("/buckshot121016.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    }
                } else if (ammo.getSelectedItem() == "12 GA Slug" || ammo.getSelectedItem() == "10 GA Slug") {
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
                        Image img = new ImageIcon(this.getClass().getResource("/1210_slug.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    } else {
                        txtrYesNo.setText("No");
                        Image img = new ImageIcon(this.getClass().getResource("/1210_slug.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    }
                } else if (ammo.getSelectedItem() == "Cable Backed Bow Arrows" || ammo.getSelectedItem() == "Longbow Arrows") {
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
                        Image img = new ImageIcon(this.getClass().getResource("/cable_longbow.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    } else {
                        txtrYesNo.setText("No");
                        Image img = new ImageIcon(this.getClass().getResource("/cable_longbow.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    }
                } else if (ammo.getSelectedItem() == "Compound Arrows" || ammo.getSelectedItem() == "Compound Tracer Arrows" || ammo.getSelectedItem() == "Crossbow Arrows" || ammo.getSelectedItem() == "Crossbow Tracer Arrows" || ammo.getSelectedItem() == "Recurve Tracer Arrows" || ammo.getSelectedItem() == "Recurve Arrows" || ammo.getSelectedItem() == "Cupid Arrows") {
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
                        Image img = new ImageIcon(this.getClass().getResource("/recurve_compound_crossbow.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    } else {
                        txtrYesNo.setText("No");
                        Image img = new ImageIcon(this.getClass().getResource("/recurve_compound_crossbow.png")).getImage();
                        label.setIcon(new ImageIcon(img));
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
                        Image img = new ImageIcon(this.getClass().getResource("/45_saboted_bullet.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    } else {
                        txtrYesNo.setText("No");
                        Image img = new ImageIcon(this.getClass().getResource("/45_saboted_bullet.png")).getImage();
                        label.setIcon(new ImageIcon(img));
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
                        Image img = new ImageIcon(this.getClass().getResource("/Balls_lead_50_256.png")).getImage();
                        label.setIcon(new ImageIcon(img));
                    } else {
                        txtrYesNo.setText("No");
                        Image img = new ImageIcon(this.getClass().getResource("/Balls_lead_50_256.png")).getImage();
                        label.setIcon(new ImageIcon(img));
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

        ammo.add("7mm Magnum");
        ammo.add(".45-70 Government");
        ammo.add(".340 Weatherby Magnum");
        ammo.add(".30-06 Round Nose");
        ammo.add(".303 British");
        ammo.add(".30-30 Nosler Partition");
        ammo.add(".22 Air Rifle Pellet");
        ammo.add(".223 Nosler Ballistic Tip");
        ammo.add("6.5x55 Nosler AccuBond");
        ammo.add("7.62x54R SP");  
        ammo.add("8x57 IS Nosler Partition");
        ammo.add("9.3x62 Nosler Partition");
        ammo.add(".308 Nosler Partition");
        ammo.add(".270 Nosler Ballistic Tip");
        ammo.add(".30-06 Nosler Partition");
        ammo.add(".300 Nosler AccuBond");
        ammo.add(".243 Nosler Ballistic Tip");
        ammo.add(".17 HMR");
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
        ammo.add("10 GA Birdshot");
        ammo.add("10 GA Buckshot");
        ammo.add("10 GA Slug");
        ammo.add("Compound Arrows");
        ammo.add("Crossbow Arrows");
        ammo.add("Recurve Arrows");
		ammo.add("Longbow Arrows");
        ammo.add("Cable Backed Bow Arrows");
        ammo.add("Compound Tracer Arrows");
        ammo.add("Crossbow Tracer Arrows");
        ammo.add("Recurve Tracer Arrows");
        ammo.add("Cupid Arrows");
        ammo.add(".45 Saboted Bullet");
        ammo.add(".50 Conical Bullet");
        ammo.add(".50 Patched Round Ball");
    }
}
