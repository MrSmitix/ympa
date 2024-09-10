package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EnrichedOrderBoxLayoutDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Распределение товаров по коробкам.
 **/
@ApiModel(description="Распределение товаров по коробкам.")

public class OrderBoxesLayoutDTO  {
  
  @ApiModelProperty(required = true, value = "Список коробок.")
 /**
   * Список коробок.
  **/
  private List<EnrichedOrderBoxLayoutDTO> boxes = new ArrayList<>();
 /**
   * Список коробок.
   * @return boxes
  **/
  @JsonProperty("boxes")
  public List<EnrichedOrderBoxLayoutDTO> getBoxes() {
    return boxes;
  }

  public void setBoxes(List<EnrichedOrderBoxLayoutDTO> boxes) {
    this.boxes = boxes;
  }

  public OrderBoxesLayoutDTO boxes(List<EnrichedOrderBoxLayoutDTO> boxes) {
    this.boxes = boxes;
    return this;
  }

  public OrderBoxesLayoutDTO addBoxesItem(EnrichedOrderBoxLayoutDTO boxesItem) {
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
    OrderBoxesLayoutDTO orderBoxesLayoutDTO = (OrderBoxesLayoutDTO) o;
    return Objects.equals(this.boxes, orderBoxesLayoutDTO.boxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boxes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderBoxesLayoutDTO {\n");
    
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

