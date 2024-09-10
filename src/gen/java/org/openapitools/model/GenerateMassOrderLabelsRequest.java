package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Данные, необходимые для генерации файла. 
 **/

import io.swagger.annotations.*;
import java.util.Objects;


@ApiModel(description = "Данные, необходимые для генерации файла. ")
public class GenerateMassOrderLabelsRequest   {
  
  private Long businessId;

  private Set<Long> orderIds = new LinkedHashSet<>();

  /**
   * Идентификатор кабинета.
   **/
  public GenerateMassOrderLabelsRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор кабинета.")
  @JsonProperty("businessId")
  @NotNull
  public Long getBusinessId() {
    return businessId;
  }
  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }


  /**
   * Список идентификаторов заказов.
   **/
  public GenerateMassOrderLabelsRequest orderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Список идентификаторов заказов.")
  @JsonProperty("orderIds")
  @NotNull
 @Size(min=1,max=1000)  public Set<Long> getOrderIds() {
    return orderIds;
  }
  @JsonDeserialize(as = LinkedHashSet.class)
  public void setOrderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
  }

  public GenerateMassOrderLabelsRequest addOrderIdsItem(Long orderIdsItem) {
    if (this.orderIds == null) {
      this.orderIds = new LinkedHashSet<>();
    }
    this.orderIds.add(orderIdsItem);
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
    GenerateMassOrderLabelsRequest generateMassOrderLabelsRequest = (GenerateMassOrderLabelsRequest) o;
    return Objects.equals(this.businessId, generateMassOrderLabelsRequest.businessId) &&
        Objects.equals(this.orderIds, generateMassOrderLabelsRequest.orderIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(businessId, orderIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GenerateMassOrderLabelsRequest {\n");
    
    sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
    sb.append("    orderIds: ").append(toIndentedString(orderIds)).append("\n");
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

