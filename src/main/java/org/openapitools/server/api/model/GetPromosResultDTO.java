package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.GetPromoDTO;

/**
 * Информация об акциях Маркета.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetPromosResultDTO   {
  
  private List<GetPromoDTO> promos = new ArrayList<>();

  public GetPromosResultDTO () {

  }

  public GetPromosResultDTO (List<GetPromoDTO> promos) {
    this.promos = promos;
  }

    
  @JsonProperty("promos")
  public List<GetPromoDTO> getPromos() {
    return promos;
  }
  public void setPromos(List<GetPromoDTO> promos) {
    this.promos = promos;
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
    return Objects.equals(promos, getPromosResultDTO.promos);
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
