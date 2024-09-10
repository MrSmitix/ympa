package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.server.api.model.LogisticPointType;
import org.openapitools.server.api.model.PickupAddressDTO;

/**
 * Описание пункта вывоза для возврата.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class LogisticPickupPointDTO   {
  
  private Long id;
  private String name;
  private PickupAddressDTO address;
  private String instruction;
  private LogisticPointType type;
  private Long logisticPartnerId;

  public LogisticPickupPointDTO () {

  }

  public LogisticPickupPointDTO (Long id, String name, PickupAddressDTO address, String instruction, LogisticPointType type, Long logisticPartnerId) {
    this.id = id;
    this.name = name;
    this.address = address;
    this.instruction = instruction;
    this.type = type;
    this.logisticPartnerId = logisticPartnerId;
  }

    
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

    
  @JsonProperty("name")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

    
  @JsonProperty("address")
  public PickupAddressDTO getAddress() {
    return address;
  }
  public void setAddress(PickupAddressDTO address) {
    this.address = address;
  }

    
  @JsonProperty("instruction")
  public String getInstruction() {
    return instruction;
  }
  public void setInstruction(String instruction) {
    this.instruction = instruction;
  }

    
  @JsonProperty("type")
  public LogisticPointType getType() {
    return type;
  }
  public void setType(LogisticPointType type) {
    this.type = type;
  }

    
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
    return Objects.equals(id, logisticPickupPointDTO.id) &&
        Objects.equals(name, logisticPickupPointDTO.name) &&
        Objects.equals(address, logisticPickupPointDTO.address) &&
        Objects.equals(instruction, logisticPickupPointDTO.instruction) &&
        Objects.equals(type, logisticPickupPointDTO.type) &&
        Objects.equals(logisticPartnerId, logisticPickupPointDTO.logisticPartnerId);
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
