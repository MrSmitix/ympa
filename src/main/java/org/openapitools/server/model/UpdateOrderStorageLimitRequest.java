package org.openapitools.server.model;

import java.time.LocalDate;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Запрос на обновление срока хранения заказа в ПВЗ.
 */
public class UpdateOrderStorageLimitRequest   {

    private LocalDate newDate;

    /**
     * Default constructor.
     */
    public UpdateOrderStorageLimitRequest() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateOrderStorageLimitRequest.
     *
     * @param newDate Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. 
     */
    public UpdateOrderStorageLimitRequest(
        LocalDate newDate
    ) {
        this.newDate = newDate;
    }



    /**
     * Новая дата, до которой заказ будет храниться в пункте выдачи.  Срок хранения можно увеличить не больше, чем на 30 дней.  Формат даты: `ГГГГ-ММ-ДД`. 
     * @return newDate
     */
    public LocalDate getNewDate() {
        return newDate;
    }

    public void setNewDate(LocalDate newDate) {
        this.newDate = newDate;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOrderStorageLimitRequest {\n");
        
        sb.append("    newDate: ").append(toIndentedString(newDate)).append("\n");
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

