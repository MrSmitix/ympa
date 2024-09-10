package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.model.TurnoverType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация об оборачиваемости товара.
 */
public class TurnoverDTO   {

    private TurnoverType turnover;
    private Double turnoverDays;

    /**
     * Default constructor.
     */
    public TurnoverDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create TurnoverDTO.
     *
     * @param turnover turnover
     * @param turnoverDays Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)
     */
    public TurnoverDTO(
        TurnoverType turnover, 
        Double turnoverDays
    ) {
        this.turnover = turnover;
        this.turnoverDays = turnoverDays;
    }



    /**
     * Get turnover
     * @return turnover
     */
    public TurnoverType getTurnover() {
        return turnover;
    }

    public void setTurnover(TurnoverType turnover) {
        this.turnover = turnover;
    }

    /**
     * Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)
     * @return turnoverDays
     */
    public Double getTurnoverDays() {
        return turnoverDays;
    }

    public void setTurnoverDays(Double turnoverDays) {
        this.turnoverDays = turnoverDays;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TurnoverDTO {\n");
        
        sb.append("    turnover: ").append(toIndentedString(turnover)).append("\n");
        sb.append("    turnoverDays: ").append(toIndentedString(turnoverDays)).append("\n");
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

