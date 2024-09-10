/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.LinkedHashSet;
import java.util.Set;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Данные, необходимые для генерации файла. 
 */
@ApiModel(description = "Данные, необходимые для генерации файла. ")
@JsonPropertyOrder({
  GenerateMassOrderLabelsRequest.JSON_PROPERTY_BUSINESS_ID,
  GenerateMassOrderLabelsRequest.JSON_PROPERTY_ORDER_IDS
})
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJerseyServerCodegen", date = "2024-09-09T22:24:17.175492804Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class GenerateMassOrderLabelsRequest   {
  public static final String JSON_PROPERTY_BUSINESS_ID = "businessId";
  @JsonProperty(JSON_PROPERTY_BUSINESS_ID)
  private Long businessId;

  public static final String JSON_PROPERTY_ORDER_IDS = "orderIds";
  @JsonProperty(JSON_PROPERTY_ORDER_IDS)
  private Set<Long> orderIds = new LinkedHashSet<>();

  public GenerateMassOrderLabelsRequest businessId(Long businessId) {
    this.businessId = businessId;
    return this;
  }

  /**
   * Идентификатор кабинета.
   * @return businessId
   **/
  @JsonProperty(value = "businessId")
  @ApiModelProperty(required = true, value = "Идентификатор кабинета.")
  @NotNull 
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
   **/
  @JsonProperty(value = "orderIds")
  @ApiModelProperty(required = true, value = "Список идентификаторов заказов.")
  @NotNull  @Size(min=1,max=1000)
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

