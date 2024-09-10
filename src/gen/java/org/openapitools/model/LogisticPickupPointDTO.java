package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LogisticPointType;
import org.openapitools.model.PickupAddressDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Описание пункта вывоза для возврата.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Описание пункта вывоза для возврата.")
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
  public LogisticPickupPointDTO id(Long id) {
    this.id = id;
    return this;
  }

  
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
  public LogisticPickupPointDTO name(String name) {
    this.name = name;
    return this;
  }

  
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
  public LogisticPickupPointDTO address(PickupAddressDTO address) {
    this.address = address;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("address")
  public PickupAddressDTO getAddress() {
    return address;
  }
  public void setAddress(PickupAddressDTO address) {
    this.address = address;
  }


  /**
   * Дополнительные инструкции к вывозу.
   **/
  public LogisticPickupPointDTO instruction(String instruction) {
    this.instruction = instruction;
    return this;
  }

  
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
  public LogisticPickupPointDTO type(LogisticPointType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public LogisticPointType getType() {
    return type;
  }
  public void setType(LogisticPointType type) {
    this.type = type;
  }


  /**
   * Идентификатор логистического партнера, к которому относится логистическая точка.
   **/
  public LogisticPickupPointDTO logisticPartnerId(Long logisticPartnerId) {
    this.logisticPartnerId = logisticPartnerId;
    return this;
  }

  
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

