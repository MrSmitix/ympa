package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GetPromoDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Информация об акциях Маркета.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Информация об акциях Маркета.")
public class GetPromosResultDTO   {
  
  private List<@Valid GetPromoDTO> promos = new ArrayList<>();

  /**
   * Акции Маркета.
   **/
  public GetPromosResultDTO promos(List<@Valid GetPromoDTO> promos) {
    this.promos = promos;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Акции Маркета.")
  @JsonProperty("promos")
  @NotNull
  public List<@Valid GetPromoDTO> getPromos() {
    return promos;
  }
  public void setPromos(List<@Valid GetPromoDTO> promos) {
    this.promos = promos;
  }

  public GetPromosResultDTO addPromosItem(GetPromoDTO promosItem) {
    if (this.promos == null) {
      this.promos = new ArrayList<>();
    }
    this.promos.add(promosItem);
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
    GetPromosResultDTO getPromosResultDTO = (GetPromosResultDTO) o;
    return Objects.equals(this.promos, getPromosResultDTO.promos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(promos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetPromosResultDTO {\n");
    
    sb.append("    promos: ").append(toIndentedString(promos)).append("\n");
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

