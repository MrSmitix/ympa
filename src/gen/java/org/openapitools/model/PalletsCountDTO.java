package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Количество палет в отгрузке.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Количество палет в отгрузке.")
public class PalletsCountDTO   {
  
  private Integer planned;

  private Integer fact;

  /**
   * Количество палет, которое заявил продавец.
   **/
  public PalletsCountDTO planned(Integer planned) {
    this.planned = planned;
    return this;
  }

  
  @ApiModelProperty(value = "Количество палет, которое заявил продавец.")
  @JsonProperty("planned")
  public Integer getPlanned() {
    return planned;
  }
  public void setPlanned(Integer planned) {
    this.planned = planned;
  }


  /**
   * Количество палет, которое приняли в сортировочном центре.
   **/
  public PalletsCountDTO fact(Integer fact) {
    this.fact = fact;
    return this;
  }

  
  @ApiModelProperty(value = "Количество палет, которое приняли в сортировочном центре.")
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

