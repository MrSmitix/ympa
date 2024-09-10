package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Элемент отображает одно грузовое место. Вложенные поля больше не используются, передавайте элемент пустым в запросах и не обращайте внимание на содержимое в ответах.
 */
public class ParcelBoxDTO   {

    private Long id;
    private String fulfilmentId;

    /**
     * Default constructor.
     */
    public ParcelBoxDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create ParcelBoxDTO.
     *
     * @param id {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
     * @param fulfilmentId {% note warning \&quot;\&quot; %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
     */
    public ParcelBoxDTO(
        Long id, 
        String fulfilmentId
    ) {
        this.id = id;
        this.fulfilmentId = fulfilmentId;
    }



    /**
     * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
     * @return id
     */
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    /**
     * {% note warning \"\" %}  Этот параметр устарел. Не используйте его.  {% endnote %} 
     * @return fulfilmentId
     */
    public String getFulfilmentId() {
        return fulfilmentId;
    }

    public void setFulfilmentId(String fulfilmentId) {
        this.fulfilmentId = fulfilmentId;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ParcelBoxDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    fulfilmentId: ").append(toIndentedString(fulfilmentId)).append("\n");
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

