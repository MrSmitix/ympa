package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Date;
import org.openapitools.model.ShipmentStatusType;



/**
 * Статус отгрузки.
 **/

@ApiModel(description = "Статус отгрузки.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ShipmentStatusChangeDTO   {
  @JsonProperty("status")
  private ShipmentStatusType status;

  @JsonProperty("description")
  private String description;

  @JsonProperty("updateTime")
  private Date updateTime;

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
  public ShipmentStatusChangeDTO updateTime(Date updateTime) {
    this.updateTime = updateTime;
    return this;
  }

  
  @ApiModelProperty(value = "Время последнего изменения статуса отгрузки.")
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
    return Objects.equals(status, shipmentStatusChangeDTO.status) &&
        Objects.equals(description, shipmentStatusChangeDTO.description) &&
        Objects.equals(updateTime, shipmentStatusChangeDTO.updateTime);
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

