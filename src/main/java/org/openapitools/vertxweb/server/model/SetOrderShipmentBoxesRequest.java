package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.vertxweb.server.model.ParcelBoxDTO;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SetOrderShipmentBoxesRequest   {
  
  private List<ParcelBoxDTO> boxes = new ArrayList<>();

  public SetOrderShipmentBoxesRequest () {

  }

  public SetOrderShipmentBoxesRequest (List<ParcelBoxDTO> boxes) {
    this.boxes = boxes;
  }

    
  @JsonProperty("boxes")
  public List<ParcelBoxDTO> getBoxes() {
    return boxes;
  }
  public void setBoxes(List<ParcelBoxDTO> boxes) {
    this.boxes = boxes;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest = (SetOrderShipmentBoxesRequest) o;
    return Objects.equals(boxes, setOrderShipmentBoxesRequest.boxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boxes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetOrderShipmentBoxesRequest {\n");
    
    sb.append("    boxes: ").append(toIndentedString(boxes)).append("\n");
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
