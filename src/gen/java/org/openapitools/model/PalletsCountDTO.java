package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Количество палет в отгрузке.
 **/
@ApiModel(description="Количество палет в отгрузке.")

public class PalletsCountDTO  {
  
  @ApiModelProperty(value = "Количество палет, которое заявил продавец.")
 /**
   * Количество палет, которое заявил продавец.
  **/
  private Integer planned;

  @ApiModelProperty(value = "Количество палет, которое приняли в сортировочном центре.")
 /**
   * Количество палет, которое приняли в сортировочном центре.
  **/
  private Integer fact;
 /**
   * Количество палет, которое заявил продавец.
   * @return planned
  **/
  @JsonProperty("planned")
  public Integer getPlanned() {
    return planned;
  }

  public void setPlanned(Integer planned) {
    this.planned = planned;
  }

  public PalletsCountDTO planned(Integer planned) {
    this.planned = planned;
    return this;
  }

 /**
   * Количество палет, которое приняли в сортировочном центре.
   * @return fact
  **/
  @JsonProperty("fact")
  public Integer getFact() {
    return fact;
  }

  public void setFact(Integer fact) {
    this.fact = fact;
  }

  public PalletsCountDTO fact(Integer fact) {
    this.fact = fact;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

