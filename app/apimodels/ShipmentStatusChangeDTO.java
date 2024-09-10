package apimodels;

import apimodels.ShipmentStatusType;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Статус отгрузки.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class ShipmentStatusChangeDTO   {
  @JsonProperty("status")
  @Valid

  private ShipmentStatusType status;

  @JsonProperty("description")
  
  private String description;

  @JsonProperty("updateTime")
  @Valid

  private OffsetDateTime updateTime;

  public ShipmentStatusChangeDTO status(ShipmentStatusType status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
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
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ShipmentStatusChangeDTO updateTime(OffsetDateTime updateTime) {
    this.updateTime = updateTime;
    return this;
  }

   /**
   * Время последнего изменения статуса отгрузки.
   * @return updateTime
  **/
  public OffsetDateTime getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(OffsetDateTime updateTime) {
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
    return Objects.equals(status, shipmentStatusChangeDTO.status) &&
        Objects.equals(description, shipmentStatusChangeDTO.description) &&
        Objects.equals(updateTime, shipmentStatusChangeDTO.updateTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, description, updateTime);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

