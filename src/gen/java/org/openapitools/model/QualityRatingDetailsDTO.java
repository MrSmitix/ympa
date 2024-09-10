package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.QualityRatingAffectedOrderDTO;



/**
 * Информация о заказах, которые повлияли на индекс качества.
 **/

@ApiModel(description = "Информация о заказах, которые повлияли на индекс качества.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class QualityRatingDetailsDTO   {
  @JsonProperty("affectedOrders")
  private List<QualityRatingAffectedOrderDTO> affectedOrders = new ArrayList<>();

  /**
   * Список заказов, которые повлияли на индекс качества.
   **/
  public QualityRatingDetailsDTO affectedOrders(List<QualityRatingAffectedOrderDTO> affectedOrders) {
    this.affectedOrders = affectedOrders;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список заказов, которые повлияли на индекс качества.")
  @JsonProperty("affectedOrders")
  public List<QualityRatingAffectedOrderDTO> getAffectedOrders() {
    return affectedOrders;
  }
  public void setAffectedOrders(List<QualityRatingAffectedOrderDTO> affectedOrders) {
    this.affectedOrders = affectedOrders;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualityRatingDetailsDTO qualityRatingDetailsDTO = (QualityRatingDetailsDTO) o;
    return Objects.equals(affectedOrders, qualityRatingDetailsDTO.affectedOrders);
  }

  @Override
  public int hashCode() {
    return Objects.hash(affectedOrders);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualityRatingDetailsDTO {\n");
    
    sb.append("    affectedOrders: ").append(toIndentedString(affectedOrders)).append("\n");
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

