package org.openapitools.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Данные, необходимые для генерации файла. 
 */
@ApiModel(description="Данные, необходимые для генерации файла. ")

public class GenerateMassOrderLabelsRequest  {
  
 /**
  * Идентификатор кабинета.
  */
  @ApiModelProperty(required = true, value = "Идентификатор кабинета.")
  private Long businessId;

 /**
  * Список идентификаторов заказов.
  */
  @ApiModelProperty(required = true, value = "Список идентификаторов заказов.")
  private Set<Long> orderIds = new LinkedHashSet<>();
 /**
  * Идентификатор кабинета.
  * @return businessId
  */
  @JsonProperty("businessId")
  @NotNull
  public Long getBusinessId() {
    return businessId;
  }

  /**
   * Sets the <code>businessId</code> property.
   */
 public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  /**
   * Sets the <code>businessId</code> property.
   */
  public GenerateMassOrderLabelsRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

 /**
  * Список идентификаторов заказов.
  * @return orderIds
  */
  @JsonProperty("orderIds")
  @NotNull
 @Size(min=1,max=1000)  public Set<Long> getOrderIds() {
    return orderIds;
  }

  /**
   * Sets the <code>orderIds</code> property.
   */
 @JsonDeserialize(as = LinkedHashSet.class)
 public void setOrderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
  }

  /**
   * Sets the <code>orderIds</code> property.
   */
  public GenerateMassOrderLabelsRequest orderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  /**
   * Adds a new item to the <code>orderIds</code> list.
   */
  public GenerateMassOrderLabelsRequest addOrderIdsItem(Long orderIdsItem) {
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

