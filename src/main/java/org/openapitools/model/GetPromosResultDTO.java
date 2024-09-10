package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.GetPromoDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация об акциях Маркета.
 */

@Schema(name = "GetPromosResultDTO", description = "Информация об акциях Маркета.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetPromosResultDTO {

  @Valid
  private List<@Valid GetPromoDTO> promos = new ArrayList<>();

  public GetPromosResultDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public GetPromosResultDTO(List<@Valid GetPromoDTO> promos) {
    this.promos = promos;
  }

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
   */
  @NotNull @Valid 
  @Schema(name = "promos", description = "Акции Маркета.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("promos")
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

