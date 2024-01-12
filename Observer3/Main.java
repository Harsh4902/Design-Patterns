//Observer Pattern example 3

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        WeatherStation observable = new WeatherStation();
        WeatherWeatherWeatherChannel observer1 = new WeatherWeatherWeatherChannel();

        observable.addObserver(observer1);
        //Putting some weather to weatheragency wich will send the weather to all the channels which are observers
        observable.setNews("Hazy");

        //As we have put 'Hazy' new in weatheragency, weatherchannel will return 'Hazy' as a weather;
        System.out.println(observer1.getNews());// >>> Hazy

        WeatherWeatherWeatherChannel observer2 = new WeatherWeatherWeatherChannel();
        observable.addObserver(observer2);
        //created a new observer but it will not have any weather so 'null' will be the output
        System.out.println(observer2.getNews());// >>> null

        observable.setNews("Cold");
        System.out.println(observer1.getNews());
        System.out.println(observer2.getNews());
    }
}

class WeatherStation{

    private String weather;
    private List<WeatherWeatherWeatherChannel> channels = new ArrayList<>();

    public void addObserver(WeatherWeatherWeatherChannel channel){
        this.channels.add(channel);
    }

    public void removeObserver(WeatherWeatherWeatherChannel channel){
        this.channels.remove(channel);
    }

    public void setNews(String weather){
        this.weather = weather;
        for(WeatherWeatherWeatherChannel channel : channels){
            channel.update(weather);
        }
    }

}

class WeatherWeatherWeatherChannel{
    private String weather;

    public void update(String weather){
        this.setNews(weather);
    }

    public void setNews(String weather) {
        this.weather = weather;
    }
    public String getNews() {
        return weather;
    }
}