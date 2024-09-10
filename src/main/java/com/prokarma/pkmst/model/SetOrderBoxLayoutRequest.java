package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.OrderBoxLayoutDTO;
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
 * SetOrderBoxLayoutRequest
 */

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SetOrderBoxLayoutRequest   {
  @JsonProperty("boxes")
  
  private List<OrderBoxLayoutDTO> boxes = new ArrayList<>();

  @JsonProperty("allowRemove")
  private Boolean allowRemove = false;

  public SetOrderBoxLayoutRequest boxes(List<OrderBoxLayoutDTO> boxes) {
    this.boxes = boxes;
    return this;
  }

  public SetOrderBoxLayoutRequest addBoxesItem(OrderBoxLayoutDTO boxesItem) {
    if (this.boxes == null) {
      this.boxes = new ArrayList<>();
    }
    this.boxes.add(boxesItem);
    return this;
  }

  /**
   * Список коробок.
   * @return boxes
   */
  @ApiModelProperty(required = true, value = "Список коробок.")
  public List<OrderBoxLayoutDTO> getBoxes() {
    return boxes;
  }

  public void setBoxes(List<OrderBoxLayoutDTO> boxes) {
    this.boxes = boxes;
  }

  public SetOrderBoxLayoutRequest allowRemove(Boolean allowRemove) {
    this.allowRemove = allowRemove;
    return this;
  }

  /**
   * Передайте `true`, если вы собираетесь удалить часть товаров из заказа.
   * @return allowRemove
   */
  @ApiModelProperty(value = "Передайте `true`, если вы собираетесь удалить часть товаров из заказа.")
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
    return Objects.equals(this.boxes, setOrderBoxLayoutRequest.boxes) &&
        Objects.equals(this.allowRemove, setOrderBoxLayoutRequest.allowRemove);
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

