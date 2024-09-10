package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.LogisticPointType;
import org.openapitools.model.PickupAddressDTO;

/**
 * Описание пункта вывоза для возврата.
 */
@ApiModel(description = "Описание пункта вывоза для возврата.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaMSF4JServerCodegen", date = "2024-09-09T22:21:22.142726883Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class LogisticPickupPointDTO   {
  @JsonProperty("id")
  private Long id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("address")
  private PickupAddressDTO address;

  @JsonProperty("instruction")
  private String instruction;

  @JsonProperty("type")
  private LogisticPointType type;

  @JsonProperty("logisticPartnerId")
  private Long logisticPartnerId;

  public LogisticPickupPointDTO id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Идентификатор пункта вывоза.
   * @return id
  **/
  @ApiModelProperty(value = "Идентификатор пункта вывоза.")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public LogisticPickupPointDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Название пункта вывоза.
   * @return name
  **/
  @ApiModelProperty(value = "Название пункта вывоза.")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LogisticPickupPointDTO address(PickupAddressDTO address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  @ApiModelProperty(value = "")
  public PickupAddressDTO getAddress() {
    return address;
  }

  public void setAddress(PickupAddressDTO address) {
    this.address = address;
  }

  public LogisticPickupPointDTO instruction(String instruction) {
    this.instruction = instruction;
    return this;
  }

   /**
   * Дополнительные инструкции к вывозу.
   * @return instruction
  **/
  @ApiModelProperty(value = "Дополнительные инструкции к вывозу.")
  public String getInstruction() {
    return instruction;
  }

  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }

  public LogisticPickupPointDTO type(LogisticPointType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  @ApiModelProperty(value = "")
  public LogisticPointType getType() {
    return type;
  }

  public void setType(LogisticPointType type) {
    this.type = type;
  }

  public LogisticPickupPointDTO logisticPartnerId(Long logisticPartnerId) {
    this.logisticPartnerId = logisticPartnerId;
    return this;
  }

   /**
   * Идентификатор логистического партнера, к которому относится логистическая точка.
   * @return logisticPartnerId
  **/
  @ApiModelProperty(value = "Идентификатор логистического партнера, к которому относится логистическая точка.")
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

