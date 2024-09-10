package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ParcelBoxDTO;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о грузовых местах в заказе.
 */

@Schema(name = "ParcelDTO", description = "Информация о грузовых местах в заказе.")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-09-09T22:33:46.054383208Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ParcelDTO {

  @Valid
  private List<@Valid ParcelBoxDTO> boxes = new ArrayList<>();

  public ParcelDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ParcelDTO(List<@Valid ParcelBoxDTO> boxes) {
    this.boxes = boxes;
  }

  public ParcelDTO boxes(List<@Valid ParcelBoxDTO> boxes) {
    this.boxes = boxes;
    return this;
  }

  public ParcelDTO addBoxesItem(ParcelBoxDTO boxesItem) {
    if (this.boxes == null) {
      this.boxes = new ArrayList<>();
    }
    this.boxes.add(boxesItem);
    return this;
  }

  /**
   * Список грузовых мест. Маркет определяет количество мест по длине этого списка.
   * @return boxes
   */
  @NotNull @Valid @Size(min = 1) 
  @Schema(name = "boxes", description = "Список грузовых мест. Маркет определяет количество мест по длине этого списка.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("boxes")
  public List<@Valid ParcelBoxDTO> getBoxes() {
    return boxes;
  }

  public void setBoxes(List<@Valid ParcelBoxDTO> boxes) {
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
    ParcelDTO parcelDTO = (ParcelDTO) o;
    return Objects.equals(this.boxes, parcelDTO.boxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boxes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParcelDTO {\n");
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

