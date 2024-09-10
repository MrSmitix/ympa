package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.FullOutletDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Ответ на запрос информации о точке продаж.
 **/
@ApiModel(description="Ответ на запрос информации о точке продаж.")

public class GetOutletResponse  {
  
  @ApiModelProperty(value = "")
  private FullOutletDTO outlet;
 /**
   * Get outlet
   * @return outlet
  **/
  @JsonProperty("outlet")
  public FullOutletDTO getOutlet() {
    return outlet;
  }

  public void setOutlet(FullOutletDTO outlet) {
    this.outlet = outlet;
  }

  public GetOutletResponse outlet(FullOutletDTO outlet) {
    this.outlet = outlet;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

