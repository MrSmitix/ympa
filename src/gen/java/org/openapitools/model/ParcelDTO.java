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
  * Информация о грузовых местах в заказе.
 **/
@ApiModel(description="Информация о грузовых местах в заказе.")

public class ParcelDTO  {
  
  @ApiModelProperty(required = true, value = "Список грузовых мест. Маркет определяет количество мест по длине этого списка.")
 /**
   * Список грузовых мест. Маркет определяет количество мест по длине этого списка.
  **/
  private List<ParcelBoxDTO> boxes = new ArrayList<>();
 /**
   * Список грузовых мест. Маркет определяет количество мест по длине этого списка.
   * @return boxes
  **/
  @JsonProperty("boxes")
  public List<ParcelBoxDTO> getBoxes() {
    return boxes;
  }

  public void setBoxes(List<ParcelBoxDTO> boxes) {
    this.boxes = boxes;
  }

  public ParcelDTO boxes(List<ParcelBoxDTO> boxes) {
    this.boxes = boxes;
    return this;
  }

  public ParcelDTO addBoxesItem(ParcelBoxDTO boxesItem) {
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
    ParcelDTO parcelDTO = (ParcelDTO) o;
    return Objects.equals(this.boxes, parcelDTO.boxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boxes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelDTO {\n");
    
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

