package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.OffsetDateTime;
import org.openapitools.server.model.ShipmentStatusType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Статус отгрузки.
 */
public class ShipmentStatusChangeDTO   {

    private ShipmentStatusType status;
    private String description;
    private OffsetDateTime updateTime;

    /**
     * Default constructor.
     */
    public ShipmentStatusChangeDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create ShipmentStatusChangeDTO.
     *
     * @param status status
     * @param description Описание статуса отгрузки.
     * @param updateTime Время последнего изменения статуса отгрузки.
     */
    public ShipmentStatusChangeDTO(
        ShipmentStatusType status, 
        String description, 
        OffsetDateTime updateTime
    ) {
        this.status = status;
        this.description = description;
        this.updateTime = updateTime;
    }



    /**
     * Get status
     * @return status
     */
    public ShipmentStatusType getStatus() {
        return status;
    }

    public void setStatus(ShipmentStatusType status) {
        this.status = status;
    }

    /**
     * Описание статуса отгрузки.
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * Время последнего изменения статуса отгрузки.
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShipmentStatusChangeDTO {\n");
        
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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

