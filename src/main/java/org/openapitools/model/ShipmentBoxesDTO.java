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
 * В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. 
 */

@Schema(name = "ShipmentBoxesDTO", description = "В ответе Маркет возвращает переданный вами список грузовых мест. Не обращайте на это поле внимания. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ShipmentBoxesDTO {

  @Valid
  private List<@Valid ParcelBoxDTO> boxes = new ArrayList<>();

  public ShipmentBoxesDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public ShipmentBoxesDTO(List<@Valid ParcelBoxDTO> boxes) {
    this.boxes = boxes;
  }

  public ShipmentBoxesDTO boxes(List<@Valid ParcelBoxDTO> boxes) {
    this.boxes = boxes;
    return this;
  }

  public ShipmentBoxesDTO addBoxesItem(ParcelBoxDTO boxesItem) {
    if (this.boxes == null) {
      this.boxes = new ArrayList<>();
    }
    this.boxes.add(boxesItem);
    return this;
  }

  /**
   * Список грузовых мест. Маркет определил количество мест по длине этого списка. 
   * @return boxes
   */
  @NotNull @Valid 
  @Schema(name = "boxes", description = "Список грузовых мест. Маркет определил количество мест по длине этого списка. ", requiredMode = Schema.RequiredMode.REQUIRED)
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
    ShipmentBoxesDTO shipmentBoxesDTO = (ShipmentBoxesDTO) o;
    return Objects.equals(this.boxes, shipmentBoxesDTO.boxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boxes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShipmentBoxesDTO {\n");
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

