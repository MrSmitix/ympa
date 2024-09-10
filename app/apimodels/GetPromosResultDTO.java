package apimodels;

import apimodels.GetPromoDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация об акциях Маркета.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class GetPromosResultDTO   {
  @JsonProperty("promos")
  @NotNull
@Valid

  private List<@Valid GetPromoDTO> promos = new ArrayList<>();

  public GetPromosResultDTO promos(List<@Valid GetPromoDTO> promos) {
    this.promos = promos;
    return this;
  }

  public GetPromosResultDTO addPromosItem(GetPromoDTO promosItem) {
    if (this.promos == null) {
      this.promos = new ArrayList<>();
    }
    this.promos.add(promosItem);
    return this;
  }

   /**
   * Акции Маркета.
   * @return promos
  **/
  public List<@Valid GetPromoDTO> getPromos() {
    return promos;
  }

  public void setPromos(List<@Valid GetPromoDTO> promos) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

