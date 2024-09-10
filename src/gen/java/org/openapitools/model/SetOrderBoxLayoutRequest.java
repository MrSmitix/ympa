package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderBoxLayoutDTO;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SetOrderBoxLayoutRequest  {
  
  @ApiModelProperty(required = true, value = "Список коробок.")
 /**
   * Список коробок.
  **/
  private List<OrderBoxLayoutDTO> boxes = new ArrayList<>();

  @ApiModelProperty(value = "Передайте `true`, если вы собираетесь удалить часть товаров из заказа.")
 /**
   * Передайте `true`, если вы собираетесь удалить часть товаров из заказа.
  **/
  private Boolean allowRemove = false;
 /**
   * Список коробок.
   * @return boxes
  **/
  @JsonProperty("boxes")
  public List<OrderBoxLayoutDTO> getBoxes() {
    return boxes;
  }

  public void setBoxes(List<OrderBoxLayoutDTO> boxes) {
    this.boxes = boxes;
  }

  public SetOrderBoxLayoutRequest boxes(List<OrderBoxLayoutDTO> boxes) {
    this.boxes = boxes;
    return this;
  }

  public SetOrderBoxLayoutRequest addBoxesItem(OrderBoxLayoutDTO boxesItem) {
    this.boxes.add(boxesItem);
    return this;
  }

 /**
   * Передайте &#x60;true&#x60;, если вы собираетесь удалить часть товаров из заказа.
   * @return allowRemove
  **/
  @JsonProperty("allowRemove")
  public Boolean getAllowRemove() {
    return allowRemove;
  }

  public void setAllowRemove(Boolean allowRemove) {
    this.allowRemove = allowRemove;
  }

  public SetOrderBoxLayoutRequest allowRemove(Boolean allowRemove) {
    this.allowRemove = allowRemove;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

