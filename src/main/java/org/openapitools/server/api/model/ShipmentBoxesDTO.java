package org.openapitools.server.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.server.api.model.ParcelBoxDTO;

/**
 * В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ShipmentBoxesDTO   {
  
  private List<ParcelBoxDTO> boxes = new ArrayList<>();

  public ShipmentBoxesDTO () {

  }

  public ShipmentBoxesDTO (List<ParcelBoxDTO> boxes) {
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
    ShipmentBoxesDTO shipmentBoxesDTO = (ShipmentBoxesDTO) o;
    return Objects.equals(boxes, shipmentBoxesDTO.boxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boxes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentBoxesDTO {\n");
    
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
