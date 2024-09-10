package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.ParcelBoxDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. 
 */
@ApiModel(description = "В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ShipmentBoxesDTO   {
  @JsonProperty("boxes")
  
  private List<ParcelBoxDTO> boxes = new ArrayList<>();

  public ShipmentBoxesDTO boxes(List<ParcelBoxDTO> boxes) {
    this.boxes = boxes;
    return this;
  }

  public ShipmentBoxesDTO addBoxesItem(ParcelBoxDTO boxesItem) {
    if (this.boxes == null) {
      this.boxes = new ArrayList<>();
    }
    this.boxes.add(boxesItem);
    return this;
  }

  /**
   * Список грузовых мест. Маркет определил количество мест по длине этого списка. 
   * @return boxes
   */
  @ApiModelProperty(required = true, value = "Список грузовых мест. Маркет определил количество мест по длине этого списка. ")
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

