package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ParcelBoxDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;



@JsonTypeName("SetOrderShipmentBoxesRequest")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class SetOrderShipmentBoxesRequest   {
  private @Valid List<@Valid ParcelBoxDTO> boxes = new ArrayList<>();

  /**
   * Список грузовых мест. Маркет определяет количество мест по длине этого списка.
   **/
  public SetOrderShipmentBoxesRequest boxes(List<@Valid ParcelBoxDTO> boxes) {
    this.boxes = boxes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список грузовых мест. Маркет определяет количество мест по длине этого списка.")
  @JsonProperty("boxes")
  @NotNull @Valid  @Size(min=1)public List<@Valid ParcelBoxDTO> getBoxes() {
    return boxes;
  }

  @JsonProperty("boxes")
  public void setBoxes(List<@Valid ParcelBoxDTO> boxes) {
    this.boxes = boxes;
  }

  public SetOrderShipmentBoxesRequest addBoxesItem(ParcelBoxDTO boxesItem) {
    if (this.boxes == null) {
      this.boxes = new ArrayList<>();
    }

    this.boxes.add(boxesItem);
    return this;
  }

  public SetOrderShipmentBoxesRequest removeBoxesItem(ParcelBoxDTO boxesItem) {
    if (boxesItem != null && this.boxes != null) {
      this.boxes.remove(boxesItem);
    }

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
    SetOrderShipmentBoxesRequest setOrderShipmentBoxesRequest = (SetOrderShipmentBoxesRequest) o;
    return Objects.equals(this.boxes, setOrderShipmentBoxesRequest.boxes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(boxes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SetOrderShipmentBoxesRequest {\n");
    
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

