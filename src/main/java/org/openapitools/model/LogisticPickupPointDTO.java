package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.LogisticPointType;
import org.openapitools.model.PickupAddressDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Описание пункта вывоза для возврата.
 */

@Schema(name = "LogisticPickupPointDTO", description = "Описание пункта вывоза для возврата.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class LogisticPickupPointDTO {

  private Long id;

  private String name;

  private PickupAddressDTO address;

  private String instruction;

  private LogisticPointType type;

  private Long logisticPartnerId;

  public LogisticPickupPointDTO id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Идентификатор пункта вывоза.
   * @return id
   */
  
  @Schema(name = "id", description = "Идентификатор пункта вывоза.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("id")
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
   */
  
  @Schema(name = "name", description = "Название пункта вывоза.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("name")
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
   */
  @Valid 
  @Schema(name = "address", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("address")
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
   */
  
  @Schema(name = "instruction", description = "Дополнительные инструкции к вывозу.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("instruction")
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
   */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
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
   */
  
  @Schema(name = "logisticPartnerId", description = "Идентификатор логистического партнера, к которому относится логистическая точка.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

