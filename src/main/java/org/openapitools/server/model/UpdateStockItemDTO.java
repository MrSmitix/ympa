package org.openapitools.server.model;

import java.time.OffsetDateTime;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация об остатках товара. 
 */
public class UpdateStockItemDTO   {

    private Long count;
    private OffsetDateTime updatedAt;

    /**
     * Default constructor.
     */
    public UpdateStockItemDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateStockItemDTO.
     *
     * @param count Количество доступного товара. 
     * @param updatedAt Дата и время последнего обновления информации об остатках. &lt;br&gt;&lt;br&gt; Если вы не передали параметр &#x60;updatedAt&#x60;, используется текущее время. &lt;br&gt;&lt;br&gt; Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, &#x60;2017-11-21T00:42:42+03:00&#x60;. 
     */
    public UpdateStockItemDTO(
        Long count, 
        OffsetDateTime updatedAt
    ) {
        this.count = count;
        this.updatedAt = updatedAt;
    }



    /**
     * Количество доступного товара. 
     * minimum: 0
     * maximum: 2000000000
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    /**
     * Дата и время последнего обновления информации об остатках. <br><br> Если вы не передали параметр `updatedAt`, используется текущее время. <br><br> Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateStockItemDTO {\n");
        
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

