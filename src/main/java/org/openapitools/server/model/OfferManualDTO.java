package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Инструкция по использованию товара. 
 */
public class OfferManualDTO   {

    private String url;
    private String title;

    /**
     * Default constructor.
     */
    public OfferManualDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OfferManualDTO.
     *
     * @param url Ссылка на инструкцию.
     * @param title Название инструкции, которое будет отображаться на карточке товара. 
     */
    public OfferManualDTO(
        String url, 
        String title
    ) {
        this.url = url;
        this.title = title;
    }



    /**
     * Ссылка на инструкцию.
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Название инструкции, которое будет отображаться на карточке товара. 
     * @return title
     */
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OfferManualDTO {\n");
        
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
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

