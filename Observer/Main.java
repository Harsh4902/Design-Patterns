//Observer Pattern example 2

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        NewsAgency observable = new NewsAgency();
        Channel observer1 = new Channel();

        observable.addObserver(observer1);
        //Putting some news to newsagency wich will send the news to all the channels which are observers
        observable.setNews("Hello World");

        //As we have put 'Hello World' new in newsagency, newschannel will return 'Hello World' as a news;
        System.out.println(observer1.getNews());// >>> Hello World

        Channel observer2 = new Channel();
        observable.addObserver(observer2);
        //created a new observer but it will not have any news so 'null' will be the output
        System.out.println(observer2.getNews());// >>> null

        observable.setNews("new news has arrived");
        System.out.println(observer1.getNews());
        System.out.println(observer2.getNews());
    }
}

class NewsAgency{

    private String news;
    private List<Channel> channels = new ArrayList<>();

    public void addObserver(Channel channel){
        this.channels.add(channel);
    }

    public void removeObserver(Channel channel){
        this.channels.remove(channel);
    }

    public void setNews(String news){
        this.news = news;
        for(Channel channel : channels){
            channel.update(news);
        }
    }

}

class Channel{
    private String news;

    public void update(String news){
        this.setNews(news);
    }

    public void setNews(String news) {
        this.news = news;
    }
    public String getNews() {
        return news;
    }
}