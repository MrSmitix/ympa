package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ParcelBoxDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. 
 **/
@ApiModel(description="В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. ")

public class ShipmentBoxesDTO  {
  
  @ApiModelProperty(required = true, value = "Список грузовых мест. Маркет определил количество мест по длине этого списка. ")
 /**
   * Список грузовых мест. Маркет определил количество мест по длине этого списка. 
  **/
  private List<ParcelBoxDTO> boxes = new ArrayList<>();
 /**
   * Список грузовых мест. Маркет определил количество мест по длине этого списка. 
   * @return boxes
  **/
  @JsonProperty("boxes")
  public List<ParcelBoxDTO> getBoxes() {
    return boxes;
  }

  public void setBoxes(List<ParcelBoxDTO> boxes) {
    this.boxes = boxes;
  }

  public ShipmentBoxesDTO boxes(List<ParcelBoxDTO> boxes) {
    this.boxes = boxes;
    return this;
  }

  public ShipmentBoxesDTO addBoxesItem(ParcelBoxDTO boxesItem) {
    this.boxes.add(boxesItem);
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
    ShipmentBoxesDTO shipmentBoxesDTO = (ShipmentBoxesDTO) o;
    return Objects.equals(this.boxes, shipmentBoxesDTO.boxes);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

