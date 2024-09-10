/**
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

package org.openapitools.client.model;

import org.openapitools.client.model.AffectedOrderQualityRatingComponentType;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

/**
 * Информация о заказе, который повлиял на индекс качества.
 **/
@ApiModel(description = "Информация о заказе, который повлиял на индекс качества.")
public class QualityRatingAffectedOrderDTO {
  
  @SerializedName("orderId")
  private Long orderId = null;
  @SerializedName("description")
  private String description = null;
  @SerializedName("componentType")
  private AffectedOrderQualityRatingComponentType componentType = null;

  /**
   * Идентификатор заказа.
   * minimum: 0
   **/
  @ApiModelProperty(required = true, value = "Идентификатор заказа.")
  public Long getOrderId() {
    return orderId;
  }
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  /**
   * Описание проблемы.
   **/
  @ApiModelProperty(required = true, value = "Описание проблемы.")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public AffectedOrderQualityRatingComponentType getComponentType() {
    return componentType;
  }
  public void setComponentType(AffectedOrderQualityRatingComponentType componentType) {
    this.componentType = componentType;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    QualityRatingAffectedOrderDTO qualityRatingAffectedOrderDTO = (QualityRatingAffectedOrderDTO) o;
    return (this.orderId == null ? qualityRatingAffectedOrderDTO.orderId == null : this.orderId.equals(qualityRatingAffectedOrderDTO.orderId)) &&
        (this.description == null ? qualityRatingAffectedOrderDTO.description == null : this.description.equals(qualityRatingAffectedOrderDTO.description)) &&
        (this.componentType == null ? qualityRatingAffectedOrderDTO.componentType == null : this.componentType.equals(qualityRatingAffectedOrderDTO.componentType));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.orderId == null ? 0: this.orderId.hashCode());
    result = 31 * result + (this.description == null ? 0: this.description.hashCode());
    result = 31 * result + (this.componentType == null ? 0: this.componentType.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualityRatingAffectedOrderDTO {\n");
    
    sb.append("  orderId: ").append(orderId).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  componentType: ").append(componentType).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
