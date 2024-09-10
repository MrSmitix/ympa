package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.ShipmentStatusType;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Статус отгрузки.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Статус отгрузки.")
public class ShipmentStatusChangeDTO   {
  
  private ShipmentStatusType status;

  private String description;

  private java.util.Date updateTime;

  /**
   **/
  public ShipmentStatusChangeDTO status(ShipmentStatusType status) {
    this.status = status;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("status")
  public ShipmentStatusType getStatus() {
    return status;
  }
  public void setStatus(ShipmentStatusType status) {
    this.status = status;
  }


  /**
   * Описание статуса отгрузки.
   **/
  public ShipmentStatusChangeDTO description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(value = "Описание статуса отгрузки.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }


  /**
   * Время последнего изменения статуса отгрузки.
   **/
  public ShipmentStatusChangeDTO updateTime(java.util.Date updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  
  @ApiModelProperty(value = "Время последнего изменения статуса отгрузки.")
  @JsonProperty("updateTime")
  public java.util.Date getUpdateTime() {
    return updateTime;
  }
  public void setUpdateTime(java.util.Date updateTime) {
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

