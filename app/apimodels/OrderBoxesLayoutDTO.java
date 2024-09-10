package apimodels;

import apimodels.EnrichedOrderBoxLayoutDTO;
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
 * Распределение товаров по коробкам.
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OrderBoxesLayoutDTO   {
  @JsonProperty("boxes")
  @NotNull
@Valid

  private List<@Valid EnrichedOrderBoxLayoutDTO> boxes = new ArrayList<>();

  public OrderBoxesLayoutDTO boxes(List<@Valid EnrichedOrderBoxLayoutDTO> boxes) {
    this.boxes = boxes;
    return this;
  }

  public OrderBoxesLayoutDTO addBoxesItem(EnrichedOrderBoxLayoutDTO boxesItem) {
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
  public List<@Valid EnrichedOrderBoxLayoutDTO> getBoxes() {
    return boxes;
  }

  public void setBoxes(List<@Valid EnrichedOrderBoxLayoutDTO> boxes) {
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
    OrderBoxesLayoutDTO orderBoxesLayoutDTO = (OrderBoxesLayoutDTO) o;
    return Objects.equals(boxes, orderBoxesLayoutDTO.boxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boxes);
  }

  @SuppressWarnings("StringBufferReplaceableByString")
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

