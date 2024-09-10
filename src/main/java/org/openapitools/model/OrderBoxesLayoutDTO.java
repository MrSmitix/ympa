package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.EnrichedOrderBoxLayoutDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Распределение товаров по коробкам.
 */

@Schema(name = "OrderBoxesLayoutDTO", description = "Распределение товаров по коробкам.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OrderBoxesLayoutDTO {

  @Valid
  private List<@Valid EnrichedOrderBoxLayoutDTO> boxes = new ArrayList<>();

  public OrderBoxesLayoutDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OrderBoxesLayoutDTO(List<@Valid EnrichedOrderBoxLayoutDTO> boxes) {
    this.boxes = boxes;
  }

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
   */
  @NotNull @Valid 
  @Schema(name = "boxes", description = "Список коробок.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("boxes")
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

