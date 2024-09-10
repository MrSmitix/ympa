package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EnrichedOrderBoxLayoutDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Распределение товаров по коробкам.
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Распределение товаров по коробкам.")
public class OrderBoxesLayoutDTO   {
  
  private List<@Valid EnrichedOrderBoxLayoutDTO> boxes = new ArrayList<>();

  /**
   * Список коробок.
   **/
  public OrderBoxesLayoutDTO boxes(List<@Valid EnrichedOrderBoxLayoutDTO> boxes) {
    this.boxes = boxes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список коробок.")
  @JsonProperty("boxes")
  @NotNull
  public List<@Valid EnrichedOrderBoxLayoutDTO> getBoxes() {
    return boxes;
  }
  public void setBoxes(List<@Valid EnrichedOrderBoxLayoutDTO> boxes) {
    this.boxes = boxes;
  }

  public OrderBoxesLayoutDTO addBoxesItem(EnrichedOrderBoxLayoutDTO boxesItem) {
    if (this.boxes == null) {
      this.boxes = new ArrayList<>();
    }
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

