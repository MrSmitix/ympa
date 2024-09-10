package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDate;
import org.openapitools.server.model.OrderDocumentStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о документе.
 */
public class DocumentDTO   {

    private OrderDocumentStatusType status;
    private String number;
    private LocalDate date;

    /**
     * Default constructor.
     */
    public DocumentDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create DocumentDTO.
     *
     * @param status status
     * @param number Номер документа.
     * @param date Дата создания документа.
     */
    public DocumentDTO(
        OrderDocumentStatusType status, 
        String number, 
        LocalDate date
    ) {
        this.status = status;
        this.number = number;
        this.date = date;
    }



    /**
     * Get status
     * @return status
     */
    public OrderDocumentStatusType getStatus() {
        return status;
    }

    public void setStatus(OrderDocumentStatusType status) {
        this.status = status;
    }

    /**
     * Номер документа.
     * @return number
     */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    /**
     * Дата создания документа.
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
        sb.append("class DocumentDTO {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
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

