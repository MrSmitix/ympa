package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Количество палет в отгрузке.
 */

@Schema(name = "PalletsCountDTO", description = "Количество палет в отгрузке.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class PalletsCountDTO {

  private Integer planned;

  private Integer fact;

  public PalletsCountDTO planned(Integer planned) {
    this.planned = planned;
    return this;
  }

  /**
   * Количество палет, которое заявил продавец.
   * @return planned
   */
  
  @Schema(name = "planned", description = "Количество палет, которое заявил продавец.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("planned")
  public Integer getPlanned() {
    return planned;
  }

  public void setPlanned(Integer planned) {
    this.planned = planned;
  }

  public PalletsCountDTO fact(Integer fact) {
    this.fact = fact;
    return this;
  }

  /**
   * Количество палет, которое приняли в сортировочном центре.
   * @return fact
   */
  
  @Schema(name = "fact", description = "Количество палет, которое приняли в сортировочном центре.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("fact")
  public Integer getFact() {
    return fact;
  }

  public void setFact(Integer fact) {
    this.fact = fact;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PalletsCountDTO palletsCountDTO = (PalletsCountDTO) o;
    return Objects.equals(this.planned, palletsCountDTO.planned) &&
        Objects.equals(this.fact, palletsCountDTO.fact);
  }

  @Override
  public int hashCode() {
    return Objects.hash(planned, fact);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PalletsCountDTO {\n");
    sb.append("    planned: ").append(toIndentedString(planned)).append("\n");
    sb.append("    fact: ").append(toIndentedString(fact)).append("\n");
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

