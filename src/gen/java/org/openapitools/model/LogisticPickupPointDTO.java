package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.LogisticPointType;
import org.openapitools.model.PickupAddressDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Описание пункта вывоза для возврата.
 */
@ApiModel(description="Описание пункта вывоза для возврата.")

public class LogisticPickupPointDTO  {
  
 /**
  * Идентификатор пункта вывоза.
  */
  @ApiModelProperty(value = "Идентификатор пункта вывоза.")
  private Long id;

 /**
  * Название пункта вывоза.
  */
  @ApiModelProperty(value = "Название пункта вывоза.")
  private String name;

  @ApiModelProperty(value = "")
  @Valid
  private PickupAddressDTO address;

 /**
  * Дополнительные инструкции к вывозу.
  */
  @ApiModelProperty(value = "Дополнительные инструкции к вывозу.")
  private String instruction;

  @ApiModelProperty(value = "")
  @Valid
  private LogisticPointType type;

 /**
  * Идентификатор логистического партнера, к которому относится логистическая точка.
  */
  @ApiModelProperty(value = "Идентификатор логистического партнера, к которому относится логистическая точка.")
  private Long logisticPartnerId;
 /**
  * Идентификатор пункта вывоза.
  * @return id
  */
  @JsonProperty("id")
  public Long getId() {
    return id;
  }

  /**
   * Sets the <code>id</code> property.
   */
 public void setId(Long id) {
    this.id = id;
  }

  /**
   * Sets the <code>id</code> property.
   */
  public LogisticPickupPointDTO id(Long id) {
    this.id = id;
    return this;
  }

 /**
  * Название пункта вывоза.
  * @return name
  */
  @JsonProperty("name")
  public String getName() {
    return name;
  }

  /**
   * Sets the <code>name</code> property.
   */
 public void setName(String name) {
    this.name = name;
  }

  /**
   * Sets the <code>name</code> property.
   */
  public LogisticPickupPointDTO name(String name) {
    this.name = name;
    return this;
  }

 /**
  * Get address
  * @return address
  */
  @JsonProperty("address")
  public PickupAddressDTO getAddress() {
    return address;
  }

  /**
   * Sets the <code>address</code> property.
   */
 public void setAddress(PickupAddressDTO address) {
    this.address = address;
  }

  /**
   * Sets the <code>address</code> property.
   */
  public LogisticPickupPointDTO address(PickupAddressDTO address) {
    this.address = address;
    return this;
  }

 /**
  * Дополнительные инструкции к вывозу.
  * @return instruction
  */
  @JsonProperty("instruction")
  public String getInstruction() {
    return instruction;
  }

  /**
   * Sets the <code>instruction</code> property.
   */
 public void setInstruction(String instruction) {
    this.instruction = instruction;
  }

  /**
   * Sets the <code>instruction</code> property.
   */
  public LogisticPickupPointDTO instruction(String instruction) {
    this.instruction = instruction;
    return this;
  }

 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  public LogisticPointType getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(LogisticPointType type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public LogisticPickupPointDTO type(LogisticPointType type) {
    this.type = type;
    return this;
  }

 /**
  * Идентификатор логистического партнера, к которому относится логистическая точка.
  * @return logisticPartnerId
  */
  @JsonProperty("logisticPartnerId")
  public Long getLogisticPartnerId() {
    return logisticPartnerId;
  }

  /**
   * Sets the <code>logisticPartnerId</code> property.
   */
 public void setLogisticPartnerId(Long logisticPartnerId) {
    this.logisticPartnerId = logisticPartnerId;
  }

  /**
   * Sets the <code>logisticPartnerId</code> property.
   */
  public LogisticPickupPointDTO logisticPartnerId(Long logisticPartnerId) {
    this.logisticPartnerId = logisticPartnerId;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

