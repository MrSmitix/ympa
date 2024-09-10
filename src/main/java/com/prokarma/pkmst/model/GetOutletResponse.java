package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.FullOutletDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Ответ на запрос информации о точке продаж.
 */
@ApiModel(description = "Ответ на запрос информации о точке продаж.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GetOutletResponse   {
  @JsonProperty("outlet")
  private FullOutletDTO outlet;

  public GetOutletResponse outlet(FullOutletDTO outlet) {
    this.outlet = outlet;
    return this;
  }

  /**
   * Get outlet
   * @return outlet
   */
  @ApiModelProperty(value = "")
  public FullOutletDTO getOutlet() {
    return outlet;
  }

  public void setOutlet(FullOutletDTO outlet) {
    this.outlet = outlet;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetOutletResponse getOutletResponse = (GetOutletResponse) o;
    return Objects.equals(this.outlet, getOutletResponse.outlet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(outlet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetOutletResponse {\n");
    
    sb.append("    outlet: ").append(toIndentedString(outlet)).append("\n");
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

