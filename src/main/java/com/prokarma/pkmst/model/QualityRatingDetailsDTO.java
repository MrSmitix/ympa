package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.prokarma.pkmst.model.QualityRatingAffectedOrderDTO;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация о заказах, которые повлияли на индекс качества.
 */
@ApiModel(description = "Информация о заказах, которые повлияли на индекс качества.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class QualityRatingDetailsDTO   {
  @JsonProperty("affectedOrders")
  
  private List<QualityRatingAffectedOrderDTO> affectedOrders = new ArrayList<>();

  public QualityRatingDetailsDTO affectedOrders(List<QualityRatingAffectedOrderDTO> affectedOrders) {
    this.affectedOrders = affectedOrders;
    return this;
  }

  public QualityRatingDetailsDTO addAffectedOrdersItem(QualityRatingAffectedOrderDTO affectedOrdersItem) {
    if (this.affectedOrders == null) {
      this.affectedOrders = new ArrayList<>();
    }
    this.affectedOrders.add(affectedOrdersItem);
    return this;
  }

  /**
   * Список заказов, которые повлияли на индекс качества.
   * @return affectedOrders
   */
  @ApiModelProperty(required = true, value = "Список заказов, которые повлияли на индекс качества.")
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
    return Objects.equals(this.affectedOrders, qualityRatingDetailsDTO.affectedOrders);
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

