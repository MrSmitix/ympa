package com.prokarma.pkmst.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.prokarma.pkmst.model.AffectedOrderQualityRatingComponentType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
/**
 * Response class to be returned by Api
 * @author pkmst
 *
 */
/**
 * Информация о заказе, который повлиял на индекс качества.
 */
@ApiModel(description = "Информация о заказе, который повлиял на индекс качества.")

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPKMSTServerCodegen", date = "2024-09-09T22:21:39.140910578Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class QualityRatingAffectedOrderDTO   {
  @JsonProperty("orderId")
  private Long orderId;

  @JsonProperty("description")
  private String description;

  @JsonProperty("componentType")
  private AffectedOrderQualityRatingComponentType componentType;

  public QualityRatingAffectedOrderDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Идентификатор заказа.
   * minimum: 0
   * @return orderId
   */
  @ApiModelProperty(required = true, value = "Идентификатор заказа.")
  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public QualityRatingAffectedOrderDTO description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Описание проблемы.
   * @return description
   */
  @ApiModelProperty(required = true, value = "Описание проблемы.")
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public QualityRatingAffectedOrderDTO componentType(AffectedOrderQualityRatingComponentType componentType) {
    this.componentType = componentType;
    return this;
  }

  /**
   * Get componentType
   * @return componentType
   */
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
    return Objects.equals(this.orderId, qualityRatingAffectedOrderDTO.orderId) &&
        Objects.equals(this.description, qualityRatingAffectedOrderDTO.description) &&
        Objects.equals(this.componentType, qualityRatingAffectedOrderDTO.componentType);
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

