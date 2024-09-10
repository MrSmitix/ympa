package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EnrichedOrderBoxLayoutDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Распределение товаров по коробкам.
 **/
@ApiModel(description = "Распределение товаров по коробкам.")
@JsonTypeName("OrderBoxesLayoutDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderBoxesLayoutDTO   {
  private @Valid List<@Valid EnrichedOrderBoxLayoutDTO> boxes = new ArrayList<>();

  /**
   * Список коробок.
   **/
  public OrderBoxesLayoutDTO boxes(List<@Valid EnrichedOrderBoxLayoutDTO> boxes) {
    this.boxes = boxes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список коробок.")
  @JsonProperty("boxes")
  @NotNull @Valid public List<@Valid EnrichedOrderBoxLayoutDTO> getBoxes() {
    return boxes;
  }

  @JsonProperty("boxes")
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

  public OrderBoxesLayoutDTO removeBoxesItem(EnrichedOrderBoxLayoutDTO boxesItem) {
    if (boxesItem != null && this.boxes != null) {
      this.boxes.remove(boxesItem);
    }

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

