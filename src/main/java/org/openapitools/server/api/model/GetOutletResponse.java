package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.openapitools.server.api.model.FullOutletDTO;

/**
 * Ответ на запрос информации о точке продаж.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class GetOutletResponse   {
  
  private FullOutletDTO outlet;

  public GetOutletResponse () {

  }

  public GetOutletResponse (FullOutletDTO outlet) {
    this.outlet = outlet;
  }

    
  @JsonProperty("outlet")
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
    return Objects.equals(outlet, getOutletResponse.outlet);
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
