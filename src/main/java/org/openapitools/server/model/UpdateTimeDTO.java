package org.openapitools.server.model;

import java.time.OffsetDateTime;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Время последнего обновления.
 */
public class UpdateTimeDTO   {

    private OffsetDateTime updatedAt;

    /**
     * Default constructor.
     */
    public UpdateTimeDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateTimeDTO.
     *
     * @param updatedAt Время последнего обновления.
     */
    public UpdateTimeDTO(
        OffsetDateTime updatedAt
    ) {
        this.updatedAt = updatedAt;
    }



    /**
     * Время последнего обновления.
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
        sb.append("class UpdateTimeDTO {\n");
        
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

