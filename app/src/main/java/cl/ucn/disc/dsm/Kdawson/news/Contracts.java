package cl.ucn.disc.dsm.Kdawson.news;

/*
* The Contracts of the news project
*
* @author Kevin Dawson Diaz
* */

import java.util.List;

public interface Contracts {

    /*
    * @return all news
    * */
    List<News> retrieveNews();
}
