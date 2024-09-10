package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Данные, необходимые для генерации файла. 
 */
@ApiModel(description = "Данные, необходимые для генерации файла. ")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateMassOrderLabelsRequest   {
  @JsonProperty("businessId")
  private Long businessId;

  @JsonProperty("orderIds")
  
  private Set<Long> orderIds = new LinkedHashSet<>();

  public GenerateMassOrderLabelsRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

  /**
   * Идентификатор кабинета.
   * @return businessId
   */
  @ApiModelProperty(required = true, value = "Идентификатор кабинета.")
  public Long getBusinessId() {
    return businessId;
  }

  public void setBusinessId(Long businessId) {
    this.businessId = businessId;
  }

  public GenerateMassOrderLabelsRequest orderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
    return this;
  }

  public GenerateMassOrderLabelsRequest addOrderIdsItem(Long orderIdsItem) {
    if (this.orderIds == null) {
      this.orderIds = new LinkedHashSet<>();
    }
    this.orderIds.add(orderIdsItem);
    return this;
  }

  /**
   * Список идентификаторов заказов.
   * @return orderIds
   */
  @ApiModelProperty(required = true, value = "Список идентификаторов заказов.")
  public Set<Long> getOrderIds() {
    return orderIds;
  }

  @JsonDeserialize(as = LinkedHashSet.class)
  public void setOrderIds(Set<Long> orderIds) {
    this.orderIds = orderIds;
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

