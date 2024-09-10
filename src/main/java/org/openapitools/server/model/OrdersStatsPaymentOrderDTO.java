package org.openapitools.server.model;

import java.time.LocalDate;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о платежном получении.
 */
public class OrdersStatsPaymentOrderDTO   {

    private String id;
    private LocalDate date;

    /**
     * Default constructor.
     */
    public OrdersStatsPaymentOrderDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OrdersStatsPaymentOrderDTO.
     *
     * @param id Номер платежного поручения.
     * @param date Дата платежного поручения.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;. 
     */
    public OrdersStatsPaymentOrderDTO(
        String id, 
        LocalDate date
    ) {
        this.id = id;
        this.date = date;
    }



    /**
     * Номер платежного поручения.
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    /**
     * Дата платежного поручения.  Формат даты: `ГГГГ‑ММ‑ДД`. 
     * @return date
     */
    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OrdersStatsPaymentOrderDTO {\n");
        
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

