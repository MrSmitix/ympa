package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.Date;
import org.openapitools.model.ShipmentStatusType;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Статус отгрузки.
 */

@Schema(name = "ShipmentStatusChangeDTO", description = "Статус отгрузки.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ShipmentStatusChangeDTO {

  private ShipmentStatusType status;

  private String description;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private Date updateTime;

  public ShipmentStatusChangeDTO status(ShipmentStatusType status) {
    this.status = status;
    return this;
  }

  /**
   * Get status
   * @return status
   */
  @Valid 
  @Schema(name = "status", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("status")
  public ShipmentStatusType getStatus() {
    return status;
  }

  public void setStatus(ShipmentStatusType status) {
    this.status = status;
  }

  public ShipmentStatusChangeDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание статуса отгрузки.
   * @return description
   */
  
  @Schema(name = "description", description = "Описание статуса отгрузки.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ShipmentStatusChangeDTO updateTime(Date updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  /**
   * Время последнего изменения статуса отгрузки.
   * @return updateTime
   */
  @Valid 
  @Schema(name = "updateTime", description = "Время последнего изменения статуса отгрузки.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("updateTime")
  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ShipmentStatusChangeDTO shipmentStatusChangeDTO = (ShipmentStatusChangeDTO) o;
    return Objects.equals(this.status, shipmentStatusChangeDTO.status) &&
        Objects.equals(this.description, shipmentStatusChangeDTO.description) &&
        Objects.equals(this.updateTime, shipmentStatusChangeDTO.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, description, updateTime);
  }

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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

