package apimodels;

import apimodels.OrderBoxLayoutDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * SetOrderBoxLayoutRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class SetOrderBoxLayoutRequest   {
  @JsonProperty("boxes")
  @NotNull
@Size(min=1)
@Valid

  private List<@Valid OrderBoxLayoutDTO> boxes = new ArrayList<>();

  @JsonProperty("allowRemove")
  
  private Boolean allowRemove = false;

  public SetOrderBoxLayoutRequest boxes(List<@Valid OrderBoxLayoutDTO> boxes) {
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
  **/
  public List<@Valid OrderBoxLayoutDTO> getBoxes() {
    return boxes;
  }

  public void setBoxes(List<@Valid OrderBoxLayoutDTO> boxes) {
    this.boxes = boxes;
  }

  public SetOrderBoxLayoutRequest allowRemove(Boolean allowRemove) {
    this.allowRemove = allowRemove;
    return this;
  }

   /**
   * Передайте `true`, если вы собираетесь удалить часть товаров из заказа.
   * @return allowRemove
  **/
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
    return Objects.equals(boxes, setOrderBoxLayoutRequest.boxes) &&
        Objects.equals(allowRemove, setOrderBoxLayoutRequest.allowRemove);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boxes, allowRemove);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

