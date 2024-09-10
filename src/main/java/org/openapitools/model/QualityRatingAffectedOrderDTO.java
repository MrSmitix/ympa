/*
 * Партнерский API Маркета
 *
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI document version: LATEST
 * 
 *
 * AUTO-GENERATED FILE, DO NOT MODIFY!
 */
package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.AffectedOrderQualityRatingComponentType;



/**
 * Информация о заказе, который повлиял на индекс качества.
 */

@ApiModel(description = "Информация о заказе, который повлиял на индекс качества.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaUndertowServerCodegen", date = "2024-09-09T22:22:14.220683748Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class QualityRatingAffectedOrderDTO   {
  
  private Long orderId;
  private String description;
  private AffectedOrderQualityRatingComponentType componentType;

  /**
   * Идентификатор заказа.
   * minimum: 0
   */
  public QualityRatingAffectedOrderDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Идентификатор заказа.")
  @JsonProperty("orderId")
  public Long getOrderId() {
    return orderId;
  }
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  /**
   * Описание проблемы.
   */
  public QualityRatingAffectedOrderDTO description(String description) {
    this.description = description;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Описание проблемы.")
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  /**
   */
  public QualityRatingAffectedOrderDTO componentType(AffectedOrderQualityRatingComponentType componentType) {
    this.componentType = componentType;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("componentType")
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
    return Objects.equals(orderId, qualityRatingAffectedOrderDTO.orderId) &&
        Objects.equals(description, qualityRatingAffectedOrderDTO.description) &&
        Objects.equals(componentType, qualityRatingAffectedOrderDTO.componentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, description, componentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class QualityRatingAffectedOrderDTO {\n");
    
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    componentType: ").append(toIndentedString(componentType)).append("\n");
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

