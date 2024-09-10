package org.openapitools.server.model;

import java.time.OffsetDateTime;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Время проведения акции.
 */
public class PromoPeriodDTO   {

    private OffsetDateTime dateTimeFrom;
    private OffsetDateTime dateTimeTo;

    /**
     * Default constructor.
     */
    public PromoPeriodDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create PromoPeriodDTO.
     *
     * @param dateTimeFrom Дата и время начала акции.
     * @param dateTimeTo Дата и время окончания акции.
     */
    public PromoPeriodDTO(
        OffsetDateTime dateTimeFrom, 
        OffsetDateTime dateTimeTo
    ) {
        this.dateTimeFrom = dateTimeFrom;
        this.dateTimeTo = dateTimeTo;
    }



    /**
     * Дата и время начала акции.
     * @return dateTimeFrom
     */
    public OffsetDateTime getDateTimeFrom() {
        return dateTimeFrom;
    }

    public void setDateTimeFrom(OffsetDateTime dateTimeFrom) {
        this.dateTimeFrom = dateTimeFrom;
    }

    /**
     * Дата и время окончания акции.
     * @return dateTimeTo
     */
    public OffsetDateTime getDateTimeTo() {
        return dateTimeTo;
    }

    public void setDateTimeTo(OffsetDateTime dateTimeTo) {
        this.dateTimeTo = dateTimeTo;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PromoPeriodDTO {\n");
        
        sb.append("    dateTimeFrom: ").append(toIndentedString(dateTimeFrom)).append("\n");
        sb.append("    dateTimeTo: ").append(toIndentedString(dateTimeTo)).append("\n");
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

