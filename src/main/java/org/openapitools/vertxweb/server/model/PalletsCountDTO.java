package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Количество палет в отгрузке.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class PalletsCountDTO   {
  
  private Integer planned;
  private Integer fact;

  public PalletsCountDTO () {

  }

  public PalletsCountDTO (Integer planned, Integer fact) {
    this.planned = planned;
    this.fact = fact;
  }

    
  @JsonProperty("planned")
  public Integer getPlanned() {
    return planned;
  }
  public void setPlanned(Integer planned) {
    this.planned = planned;
  }

    
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
    return Objects.equals(planned, palletsCountDTO.planned) &&
        Objects.equals(fact, palletsCountDTO.fact);
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
