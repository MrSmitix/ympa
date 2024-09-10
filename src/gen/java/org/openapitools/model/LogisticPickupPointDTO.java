package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LogisticPointType;
import org.openapitools.model.PickupAddressDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Описание пункта вывоза для возврата.")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class LogisticPickupPointDTO   {
  
  private Long id;
  private String name;
  private PickupAddressDTO address;
  private String instruction;
  private LogisticPointType type;
  private Long logisticPartnerId;

  /**
   * Идентификатор пункта вывоза.
   **/
  
  @ApiModelProperty(value = "Идентификатор пункта вывоза.")
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * Название пункта вывоза.
   **/
  
  @ApiModelProperty(value = "Название пункта вывоза.")
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("address")
  @Valid
  public PickupAddressDTO getAddress() {
    return address;
  }
  public void setAddress(PickupAddressDTO address) {
    this.address = address;
  }

  /**
   * Дополнительные инструкции к вывозу.
   **/
  
  @ApiModelProperty(value = "Дополнительные инструкции к вывозу.")
  @JsonProperty("instruction")
  public String getInstruction() {
    return instruction;
  }
  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  @Valid
  public LogisticPointType getType() {
    return type;
  }
  public void setType(LogisticPointType type) {
    this.type = type;
  }

  /**
   * Идентификатор логистического партнера, к которому относится логистическая точка.
   **/
  
  @ApiModelProperty(value = "Идентификатор логистического партнера, к которому относится логистическая точка.")
  @JsonProperty("logisticPartnerId")
  public Long getLogisticPartnerId() {
    return logisticPartnerId;
  }
  public void setLogisticPartnerId(Long logisticPartnerId) {
    this.logisticPartnerId = logisticPartnerId;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LogisticPickupPointDTO logisticPickupPointDTO = (LogisticPickupPointDTO) o;
    return Objects.equals(this.id, logisticPickupPointDTO.id) &&
        Objects.equals(this.name, logisticPickupPointDTO.name) &&
        Objects.equals(this.address, logisticPickupPointDTO.address) &&
        Objects.equals(this.instruction, logisticPickupPointDTO.instruction) &&
        Objects.equals(this.type, logisticPickupPointDTO.type) &&
        Objects.equals(this.logisticPartnerId, logisticPickupPointDTO.logisticPartnerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, address, instruction, type, logisticPartnerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LogisticPickupPointDTO {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    instruction: ").append(toIndentedString(instruction)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    logisticPartnerId: ").append(toIndentedString(logisticPartnerId)).append("\n");
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

