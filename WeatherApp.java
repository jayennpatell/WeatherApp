import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;



public class WeatherApp extends JFrame {
    public WeatherApp(){
        super("Weather App");
        setSize(450, 650);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null); 


        // adding GUI components
        addGuiComponents();
    }

    private void addGuiComponents(){
        JTextField searchField = new JTextField(25);
        searchField.setFont(new Font("Dialog", Font.PLAIN, 18));
        searchField.setPreferredSize(new Dimension(415, 30));
        searchField.setBounds(15, 15, 350, 30);
        add(searchField);

        // search button with image icon
        ImageIcon searchIcon = loadImage("src/assets/weatherapp_images/search.png");
        Image searchImg = searchIcon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
        JButton searchButton = new JButton(new ImageIcon(searchImg));
        searchButton.setFont(new Font("Dialog", Font.PLAIN, 12));
        searchButton.setBounds(370, 15, 45, 35);

        // change the button to a hand cursor when hovered
        searchButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        searchButton.setBounds(370, 15, 45, 35); 

        // added to the frame
        add(searchButton);

        // weather image display
        JLabel weatherImageLabel = new JLabel(loadImage("src/assets/weatherapp_images/cloudy.png"));
        weatherImageLabel.setBounds(0, 125, 450, 217);
        add(weatherImageLabel);

        // adding temperature label
        JLabel temperatureLabel = new JLabel("10° C");
        temperatureLabel.setBounds(0, 350, 450, 54);
        temperatureLabel.setFont(new Font("Dialog", Font.PLAIN, 48));
        temperatureLabel.setHorizontalAlignment(SwingConstants.CENTER); 
        add(temperatureLabel);  

        // addingg condition label
        JLabel conditionLabel = new JLabel("Cloudy");
        conditionLabel.setBounds(0, 405, 450, 36);
        conditionLabel.setFont(new Font("Dialog", Font.PLAIN, 32));
        conditionLabel.setHorizontalAlignment(SwingConstants.CENTER);
        add(conditionLabel);

        // adding humidity label
        JLabel humidityImg = new JLabel(loadImage("src/assets/weatherapp_images/humidity.png"));
        humidityImg.setBounds(15, 500, 74, 66);
        add(humidityImg);

        // adding humidity text label
        JLabel humidityLabel = new JLabel("<html><b>Humidity</b> 100%</html>");
        humidityLabel.setBounds(90, 500, 85, 55);
        humidityLabel.setFont(new Font("Dialog", Font.PLAIN, 16));
        add(humidityLabel);

        // adding windspeed image
        JLabel windspeedImg = new JLabel(loadImage("src/assets/weatherapp_images/windspeed.png"));
        windspeedImg.setBounds(220, 500, 74, 66);
        add(windspeedImg);

        // adding windspeed text label
        JLabel windspeedLabel = new JLabel("<html><b>Windspeed</b> 15km/h</html>");
        windspeedLabel.setBounds(310, 500, 90, 55);
        windspeedLabel.setFont(new Font("Dialog", Font.PLAIN, 16));
        add(windspeedLabel);
    }

    private ImageIcon loadImage(String path){
        try {
            BufferedImage img = ImageIO.read(new File(path));
            return new ImageIcon(img);
        } catch (Exception e) {
            System.out.println("Error loading image: " + e.getMessage());
            return null;
        }
    }


    
}




