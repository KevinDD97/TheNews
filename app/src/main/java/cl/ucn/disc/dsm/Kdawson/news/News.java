package cl.ucn.disc.dsm.Kdawson.news;

/*
* The news class
*
* @author Kevin Dawson Diaz
* */

import net.openhft.hashing.LongHashFunction;

import java.time.ZonedDateTime;

import lombok.Getter;

public class News {

    /*
    * ID unique
    * */

    @Getter
    private Long id;


    /*
    * The title
    * */
    @Getter
    private String title;

    /*
    * The Source
    * */

    @Getter
    private String Source;

    @Getter
    private String source;

    /*
    * The Author
    * */

    @Getter
    private String author;

    /*
    * The url
    * */
    @Getter
    private String url;

    /*
    * The URL Image
    * */
    @Getter
    private String urlImage;

    /*
    * The Description
    * */
    @Getter
    private String description;

    /*
    * The content
    * */
    @Getter
    private String content;

    /*
    * The date of publish
    * */
    @Getter
    private ZonedDateTime publishedAt;


    /*
    * The constructor of News.
    * @param title cant be null
    * @param source cant be null
    * @param author cant be null
    * @param url can be null@param title cant be null
    * @param urlImage can be null
    * @param description cant be null
    * @param content cant be null
    * @param publishedAt cant be null
    * *
    * */
    public News(final String title,
                final String source,
                final  String author,
                final String url,
                final String urlImage,
                final String description,
                final String content,
                final ZonedDateTime publishedAt){

        // title
        if(title ==null || title.length()<2){

            throw new IllegalArgumentException("title required");
        }
        this.title=title;

        // source

        if(source==null || source.length()<2){

            throw new IllegalArgumentException("source required");

        }
        this.source=source;

        //author
        if(author==null || author.length()<3){

            throw new IllegalArgumentException("author required");

        }
        this.author=author;

        // ID: hashing (title +|+ source +|+ author)
        this.id= LongHashFunction.xx().hashChars(title+"|"+ source +"|"+ author);

        this.url=url;
        this.urlImage=urlImage;

        if(description==null || description.length()<4){

            throw new IllegalArgumentException("Description required");

        }
        this.description=description;

        if(content==null || content.length()<5){

            throw new IllegalArgumentException("content required");

        }
        this.content=content;

        if(publishedAt==null){

            throw new IllegalArgumentException("published at required");

        }
        this.publishedAt=publishedAt;
    }

}
