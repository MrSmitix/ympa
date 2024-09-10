package org.openapitools.server.model;

import java.time.OffsetDateTime;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Последнее обновление цен и наличия товаров на Маркете. Если последнее по времени обновление было полным, в параметре выводятся те же данные, что и в параметре `full`. Выводится, если параметр `publication status=OK`. 
 */
public class FeedPublicationPriceAndStockUpdateDTO   {

    private OffsetDateTime fileTime;
    private OffsetDateTime publishedTime;

    /**
     * Default constructor.
     */
    public FeedPublicationPriceAndStockUpdateDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create FeedPublicationPriceAndStockUpdateDTO.
     *
     * @param fileTime Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
     * @param publishedTime Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
     */
    public FeedPublicationPriceAndStockUpdateDTO(
        OffsetDateTime fileTime, 
        OffsetDateTime publishedTime
    ) {
        this.fileTime = fileTime;
        this.publishedTime = publishedTime;
    }



    /**
     * Дата и время, которые магазин указал в прайс-листе.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
     * @return fileTime
     */
    public OffsetDateTime getFileTime() {
        return fileTime;
    }

    public void setFileTime(OffsetDateTime fileTime) {
        this.fileTime = fileTime;
    }

    /**
     * Дата и время публикации предложений из прайс-листа на Маркете.  Формат даты: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
     * @return publishedTime
     */
    public OffsetDateTime getPublishedTime() {
        return publishedTime;
    }

    public void setPublishedTime(OffsetDateTime publishedTime) {
        this.publishedTime = publishedTime;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FeedPublicationPriceAndStockUpdateDTO {\n");
        
        sb.append("    fileTime: ").append(toIndentedString(fileTime)).append("\n");
        sb.append("    publishedTime: ").append(toIndentedString(publishedTime)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
    */
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

