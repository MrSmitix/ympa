package org.openapitools.server.model;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о части товара в коробке.
 */
public class OrderBoxLayoutPartialCountDTO   {

    private Integer current;
    private Integer total;

    /**
     * Default constructor.
     */
    public OrderBoxLayoutPartialCountDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderBoxLayoutPartialCountDTO.
     *
     * @param current Номер части, начиная с 1.
     * @param total На сколько всего частей разделен товар.
     */
    public OrderBoxLayoutPartialCountDTO(
        Integer current, 
        Integer total
    ) {
        this.current = current;
        this.total = total;
    }



    /**
     * Номер части, начиная с 1.
     * minimum: 1
     * @return current
     */
    public Integer getCurrent() {
        return current;
    }

    public void setCurrent(Integer current) {
        this.current = current;
    }

    /**
     * На сколько всего частей разделен товар.
     * minimum: 2
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderBoxLayoutPartialCountDTO {\n");
        
        sb.append("    current: ").append(toIndentedString(current)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

