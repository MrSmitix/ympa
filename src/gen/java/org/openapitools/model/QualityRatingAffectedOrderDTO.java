package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.AffectedOrderQualityRatingComponentType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о заказе, который повлиял на индекс качества.
 */
@ApiModel(description="Информация о заказе, который повлиял на индекс качества.")

public class QualityRatingAffectedOrderDTO  {
  
 /**
  * Идентификатор заказа.
  */
  @ApiModelProperty(required = true, value = "Идентификатор заказа.")
  private Long orderId;

 /**
  * Описание проблемы.
  */
  @ApiModelProperty(required = true, value = "Описание проблемы.")
  private String description;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AffectedOrderQualityRatingComponentType componentType;
 /**
  * Идентификатор заказа.
  * minimum: 0
  * @return orderId
  */
  @JsonProperty("orderId")
  @NotNull
 @Min(0L)  public Long getOrderId() {
    return orderId;
  }

  /**
   * Sets the <code>orderId</code> property.
   */
 public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  /**
   * Sets the <code>orderId</code> property.
   */
  public QualityRatingAffectedOrderDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

 /**
  * Описание проблемы.
  * @return description
  */
  @JsonProperty("description")
  @NotNull
  public String getDescription() {
    return description;
  }

  /**
   * Sets the <code>description</code> property.
   */
 public void setDescription(String description) {
    this.description = description;
  }

  /**
   * Sets the <code>description</code> property.
   */
  public QualityRatingAffectedOrderDTO description(String description) {
    this.description = description;
    return this;
  }

 /**
  * Get componentType
  * @return componentType
  */
  @JsonProperty("componentType")
  @NotNull
  public AffectedOrderQualityRatingComponentType getComponentType() {
    return componentType;
  }

  /**
   * Sets the <code>componentType</code> property.
   */
 public void setComponentType(AffectedOrderQualityRatingComponentType componentType) {
    this.componentType = componentType;
  }

  /**
   * Sets the <code>componentType</code> property.
   */
  public QualityRatingAffectedOrderDTO componentType(AffectedOrderQualityRatingComponentType componentType) {
    this.componentType = componentType;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

