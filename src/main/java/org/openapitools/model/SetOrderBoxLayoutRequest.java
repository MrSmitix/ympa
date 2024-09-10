package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.OrderBoxLayoutDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * SetOrderBoxLayoutRequest
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SetOrderBoxLayoutRequest {

  @Valid
  private List<@Valid OrderBoxLayoutDTO> boxes = new ArrayList<>();

  private Boolean allowRemove = false;

  public SetOrderBoxLayoutRequest() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public SetOrderBoxLayoutRequest(List<@Valid OrderBoxLayoutDTO> boxes) {
    this.boxes = boxes;
  }

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
   */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "boxes", description = "Список коробок.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("boxes")
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
   */
  
  @Schema(name = "allowRemove", description = "Передайте `true`, если вы собираетесь удалить часть товаров из заказа.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("allowRemove")
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

