package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.ParcelBoxDTO;



/**
 * Информация о грузовых местах в заказе.
 **/

@ApiModel(description = "Информация о грузовых местах в заказе.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class ParcelDTO   {
  @JsonProperty("boxes")
  private List<ParcelBoxDTO> boxes = new ArrayList<>();

  /**
   * Список грузовых мест. Маркет определяет количество мест по длине этого списка.
   **/
  public ParcelDTO boxes(List<ParcelBoxDTO> boxes) {
    this.boxes = boxes;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список грузовых мест. Маркет определяет количество мест по длине этого списка.")
  @JsonProperty("boxes")
  public List<ParcelBoxDTO> getBoxes() {
    return boxes;
  }
  public void setBoxes(List<ParcelBoxDTO> boxes) {
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
    return Objects.equals(boxes, parcelDTO.boxes);
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

