package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.Date;
import org.openapitools.model.ShipmentStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Статус отгрузки.
 */
@ApiModel(description="Статус отгрузки.")

public class ShipmentStatusChangeDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private ShipmentStatusType status;

 /**
  * Описание статуса отгрузки.
  */
  @ApiModelProperty(value = "Описание статуса отгрузки.")
  private String description;

 /**
  * Время последнего изменения статуса отгрузки.
  */
  @ApiModelProperty(value = "Время последнего изменения статуса отгрузки.")
  @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'hh:mm:ss.SSSX")
  private Date updateTime;
 /**
  * Get status
  * @return status
  */
  @JsonProperty("status")
  public ShipmentStatusType getStatus() {
    return status;
  }

  /**
   * Sets the <code>status</code> property.
   */
 public void setStatus(ShipmentStatusType status) {
    this.status = status;
  }

  /**
   * Sets the <code>status</code> property.
   */
  public ShipmentStatusChangeDTO status(ShipmentStatusType status) {
    this.status = status;
    return this;
  }

 /**
  * Описание статуса отгрузки.
  * @return description
  */
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public ShipmentStatusChangeDTO description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Время последнего изменения статуса отгрузки.
  * @return updateTime
  */
  @JsonProperty("updateTime")
  public Date getUpdateTime() {
    return updateTime;
  }

  /**
   * Sets the <code>updateTime</code> property.
   */
 public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }

  /**
   * Sets the <code>updateTime</code> property.
   */
  public ShipmentStatusChangeDTO updateTime(Date updateTime) {
    this.updateTime = updateTime;
    return this;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

