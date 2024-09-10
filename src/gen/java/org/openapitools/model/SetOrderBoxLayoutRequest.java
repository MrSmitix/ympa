package org.openapitools.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderBoxLayoutDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


public class SetOrderBoxLayoutRequest  {
  
 /**
  * Список коробок.
  */
  @ApiModelProperty(required = true, value = "Список коробок.")
  @Valid
  private List<@Valid OrderBoxLayoutDTO> boxes = new ArrayList<>();

 /**
  * Передайте `true`, если вы собираетесь удалить часть товаров из заказа.
  */
  @ApiModelProperty(value = "Передайте `true`, если вы собираетесь удалить часть товаров из заказа.")
  private Boolean allowRemove = false;
 /**
  * Список коробок.
  * @return boxes
  */
  @JsonProperty("boxes")
  @NotNull
 @Size(min=1)  public List<@Valid OrderBoxLayoutDTO> getBoxes() {
    return boxes;
  }

  /**
   * Sets the <code>boxes</code> property.
   */
 public void setBoxes(List<@Valid OrderBoxLayoutDTO> boxes) {
    this.boxes = boxes;
  }

  /**
   * Sets the <code>boxes</code> property.
   */
  public SetOrderBoxLayoutRequest boxes(List<@Valid OrderBoxLayoutDTO> boxes) {
    this.boxes = boxes;
    return this;
  }

  /**
   * Adds a new item to the <code>boxes</code> list.
   */
  public SetOrderBoxLayoutRequest addBoxesItem(OrderBoxLayoutDTO boxesItem) {
    this.boxes.add(boxesItem);
    return this;
  }

 /**
  * Передайте &#x60;true&#x60;, если вы собираетесь удалить часть товаров из заказа.
  * @return allowRemove
  */
  @JsonProperty("allowRemove")
  public Boolean getAllowRemove() {
    return allowRemove;
  }

  /**
   * Sets the <code>allowRemove</code> property.
   */
 public void setAllowRemove(Boolean allowRemove) {
    this.allowRemove = allowRemove;
  }

  /**
   * Sets the <code>allowRemove</code> property.
   */
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

