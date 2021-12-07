package cl.ucn.disc.dsm.Kdawson.news;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import lombok.extern.slf4j.Slf4j;

/*
* Test of {@link News}.
*
* @author Kevin Dawson D
* */

public class TestNews {

    /*
    * Test the constructor
    * */

    @Test
    public void testConstructor(){

        log.debug("Testing Constructor ..");
        // Constructor OK
        {
            News news=new News(
                    "Autoridades Ucn informan",
                    "Noticias UCN",
                    "UCN",
                    "#",
                    "#",
                    "Se solicitan videos que se vean bien",
                    "Directores/as y representantes",
                    ZonedDateTime.now(ZoneId.of("-4"))

            );

            Assertions.assertNotNull(news,"The News was null");
            Assertions.assertNotNull(news.getId(),"The id was null");
            Assertions.assertNotNull(news.getTitle(),"The title was null");
            Assertions.assertNotNull(news.getSource(),"The source was null");
            Assertions.assertNotNull(news.getAuthor(),"The Author was null");
            Assertions.assertNotNull(news.getUrl(),"The url was null");
            Assertions.assertNotNull(news.getUrlImage(),"The url Image was null");
            Assertions.assertNotNull(news.getDescription(),"The description was null");
            Assertions.assertNotNull(news.getContent(),"The content was null");
        }

        // Constructor not ok

                Assertions.assertThrows(IllegalArgumentException.class,()->new News(

                        null,
                        "Noticias UCN",
                        "UCN",
                        "#",
                        "#",
                        "Autoridades solicitan videos que se vean bien",
                        "Directores/as y representantes",
                        ZonedDateTime.now(ZoneId.of("-4"))

                ));

        Assertions.assertThrows(IllegalArgumentException.class,()->new News(

                "Autoridades Ucn informan",
                null,
                "UCN",
                "#",
                "#",
                "Autoridades solicitan videos que se vean bien",
                "Directores/as y representantes",
                ZonedDateTime.now(ZoneId.of("-4"))

        ));

        Assertions.assertThrows(IllegalArgumentException.class,()->new News(

                "Autoridades Ucn informan",
                "Noticias UCN",
                null,
                "#",
                "#",
                "Autoridades solicitan videos que se vean bien",
                "Directores/as y representantes",
                ZonedDateTime.now(ZoneId.of("-4"))

        ));

        Assertions.assertThrows(IllegalArgumentException.class,()->new News(

                "Autoridades Ucn informan",
                "Noticias UCN",
                "UCN",
                null,
                "#",
                "Autoridades solicitan videos que se vean bien",
                "Directores/as y representantes",
                ZonedDateTime.now(ZoneId.of("-4"))

        ));

        Assertions.assertThrows(IllegalArgumentException.class,()->new News(

                "Autoridades Ucn informan",
                "Noticias UCN",
                "UCN",
                "#",
                null,
                "Autoridades solicitan videos que se vean bien",
                "Directores/as y representantes",
                ZonedDateTime.now(ZoneId.of("-4"))

        ));

        Assertions.assertThrows(IllegalArgumentException.class,()->new News(

                "Autoridades Ucn informan",
                "Noticias UCN",
                "UCN",
                "#",
                "#",
                null,
                "Directores/as y representantes",
                ZonedDateTime.now(ZoneId.of("-4"))

        ));

        Assertions.assertThrows(IllegalArgumentException.class,()->new News(

                "Autoridades Ucn informan",
                "Noticias UCN",
                "UCN",
                "#",
                "#",
                "Autoridades solicitan videos que se vean bien",
                null,
                ZonedDateTime.now(ZoneId.of("-4"))

        ));


    }
}
