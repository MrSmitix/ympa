package org.openapitools.server.model;

import java.time.LocalDate;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о новой дате доставки заказа.
 */
public class OrderDeliveryDateDTO   {

    private LocalDate toDate;

    /**
     * Default constructor.
     */
    public OrderDeliveryDateDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrderDeliveryDateDTO.
     *
     * @param toDate Новая дата доставки заказа.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. 
     */
    public OrderDeliveryDateDTO(
        LocalDate toDate
    ) {
        this.toDate = toDate;
    }



    /**
     * Новая дата доставки заказа.  Формат даты: `ГГГГ-ММ-ДД`. 
     * @return toDate
     */
    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrderDeliveryDateDTO {\n");
        
        sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
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

