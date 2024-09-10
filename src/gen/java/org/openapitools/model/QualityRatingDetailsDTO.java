package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.model.QualityRatingAffectedOrderDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Информация о заказах, которые повлияли на индекс качества.
 **/
@ApiModel(description = "Информация о заказах, которые повлияли на индекс качества.")
@JsonTypeName("QualityRatingDetailsDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class QualityRatingDetailsDTO   {
  private @Valid List<@Valid QualityRatingAffectedOrderDTO> affectedOrders = new ArrayList<>();

  /**
   * Список заказов, которые повлияли на индекс качества.
   **/
  public QualityRatingDetailsDTO affectedOrders(List<@Valid QualityRatingAffectedOrderDTO> affectedOrders) {
    this.affectedOrders = affectedOrders;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список заказов, которые повлияли на индекс качества.")
  @JsonProperty("affectedOrders")
  @NotNull @Valid public List<@Valid QualityRatingAffectedOrderDTO> getAffectedOrders() {
    return affectedOrders;
  }

  @JsonProperty("affectedOrders")
  public void setAffectedOrders(List<@Valid QualityRatingAffectedOrderDTO> affectedOrders) {
    this.affectedOrders = affectedOrders;
  }

  public QualityRatingDetailsDTO addAffectedOrdersItem(QualityRatingAffectedOrderDTO affectedOrdersItem) {
    if (this.affectedOrders == null) {
      this.affectedOrders = new ArrayList<>();
    }

    this.affectedOrders.add(affectedOrdersItem);
    return this;
  }

  public QualityRatingDetailsDTO removeAffectedOrdersItem(QualityRatingAffectedOrderDTO affectedOrdersItem) {
    if (affectedOrdersItem != null && this.affectedOrders != null) {
      this.affectedOrders.remove(affectedOrdersItem);
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

