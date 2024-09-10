package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о приложенных к сообщению файлах.
 */
public class ChatMessagePayloadDTO   {

    private String name;
    private String url;
    private Integer size;

    /**
     * Default constructor.
     */
    public ChatMessagePayloadDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create ChatMessagePayloadDTO.
     *
     * @param name Имя файла.
     * @param url Ссылка для скачивания файла.
     * @param size Размер файла в байтах.
     */
    public ChatMessagePayloadDTO(
        String name, 
        String url, 
        Integer size
    ) {
        this.name = name;
        this.url = url;
        this.size = size;
    }



    /**
     * Имя файла.
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Ссылка для скачивания файла.
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * Размер файла в байтах.
     * @return size
     */
    public Integer getSize() {
        return size;
    }

    public void setSize(Integer size) {
        this.size = size;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChatMessagePayloadDTO {\n");
        
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

