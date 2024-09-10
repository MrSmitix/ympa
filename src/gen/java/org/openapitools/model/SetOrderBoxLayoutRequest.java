package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderBoxLayoutDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("SetOrderBoxLayoutRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SetOrderBoxLayoutRequest   {
  private @Valid List<@Valid OrderBoxLayoutDTO> boxes = new ArrayList<>();
  private Boolean allowRemove = false;

  /**
   * Список коробок.
   **/
  public SetOrderBoxLayoutRequest boxes(List<@Valid OrderBoxLayoutDTO> boxes) {
    this.boxes = boxes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список коробок.")
  @JsonProperty("boxes")
  @NotNull @Valid  @Size(min=1)public List<@Valid OrderBoxLayoutDTO> getBoxes() {
    return boxes;
  }

  @JsonProperty("boxes")
  public void setBoxes(List<@Valid OrderBoxLayoutDTO> boxes) {
    this.boxes = boxes;
  }

  public SetOrderBoxLayoutRequest addBoxesItem(OrderBoxLayoutDTO boxesItem) {
    if (this.boxes == null) {
      this.boxes = new ArrayList<>();
    }

    this.boxes.add(boxesItem);
    return this;
  }

  public SetOrderBoxLayoutRequest removeBoxesItem(OrderBoxLayoutDTO boxesItem) {
    if (boxesItem != null && this.boxes != null) {
      this.boxes.remove(boxesItem);
    }

    return this;
  }
  /**
   * Передайте &#x60;true&#x60;, если вы собираетесь удалить часть товаров из заказа.
   **/
  public SetOrderBoxLayoutRequest allowRemove(Boolean allowRemove) {
    this.allowRemove = allowRemove;
    return this;
  }

  
  @ApiModelProperty(value = "Передайте `true`, если вы собираетесь удалить часть товаров из заказа.")
  @JsonProperty("allowRemove")
  public Boolean getAllowRemove() {
    return allowRemove;
  }

  @JsonProperty("allowRemove")
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

