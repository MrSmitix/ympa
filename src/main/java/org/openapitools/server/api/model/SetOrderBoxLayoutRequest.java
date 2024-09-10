package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.OrderBoxLayoutDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SetOrderBoxLayoutRequest   {
  
  private List<OrderBoxLayoutDTO> boxes = new ArrayList<>();
  private Boolean allowRemove = false;

  public SetOrderBoxLayoutRequest () {

  }

  public SetOrderBoxLayoutRequest (List<OrderBoxLayoutDTO> boxes, Boolean allowRemove) {
    this.boxes = boxes;
    this.allowRemove = allowRemove;
  }

    
  @JsonProperty("boxes")
  public List<OrderBoxLayoutDTO> getBoxes() {
    return boxes;
  }
  public void setBoxes(List<OrderBoxLayoutDTO> boxes) {
    this.boxes = boxes;
  }

    
  @JsonProperty("allowRemove")
  public Boolean getAllowRemove() {
    return allowRemove;
  }
  public void setAllowRemove(Boolean allowRemove) {
    this.allowRemove = allowRemove;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetOrderBoxLayoutRequest setOrderBoxLayoutRequest = (SetOrderBoxLayoutRequest) o;
    return Objects.equals(boxes, setOrderBoxLayoutRequest.boxes) &&
        Objects.equals(allowRemove, setOrderBoxLayoutRequest.allowRemove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boxes, allowRemove);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetOrderBoxLayoutRequest {\n");
    
    sb.append("    boxes: ").append(toIndentedString(boxes)).append("\n");
    sb.append("    allowRemove: ").append(toIndentedString(allowRemove)).append("\n");
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
