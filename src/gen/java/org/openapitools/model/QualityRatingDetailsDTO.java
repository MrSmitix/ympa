package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.QualityRatingAffectedOrderDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о заказах, которые повлияли на индекс качества.
 **/
@ApiModel(description="Информация о заказах, которые повлияли на индекс качества.")

public class QualityRatingDetailsDTO  {
  
  @ApiModelProperty(required = true, value = "Список заказов, которые повлияли на индекс качества.")
  @Valid
 /**
   * Список заказов, которые повлияли на индекс качества.
  **/
  private List<@Valid QualityRatingAffectedOrderDTO> affectedOrders = new ArrayList<>();
 /**
   * Список заказов, которые повлияли на индекс качества.
   * @return affectedOrders
  **/
  @JsonProperty("affectedOrders")
  @NotNull
  public List<@Valid QualityRatingAffectedOrderDTO> getAffectedOrders() {
    return affectedOrders;
  }

  public void setAffectedOrders(List<@Valid QualityRatingAffectedOrderDTO> affectedOrders) {
    this.affectedOrders = affectedOrders;
  }

  public QualityRatingDetailsDTO affectedOrders(List<@Valid QualityRatingAffectedOrderDTO> affectedOrders) {
    this.affectedOrders = affectedOrders;
    return this;
  }

  public QualityRatingDetailsDTO addAffectedOrdersItem(QualityRatingAffectedOrderDTO affectedOrdersItem) {
    this.affectedOrders.add(affectedOrdersItem);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

