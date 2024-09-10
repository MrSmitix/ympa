package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.AffectedOrderQualityRatingComponentType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Информация о заказе, который повлиял на индекс качества.
 **/
@ApiModel(description="Информация о заказе, который повлиял на индекс качества.")

public class QualityRatingAffectedOrderDTO  {
  
  @ApiModelProperty(required = true, value = "Идентификатор заказа.")
 /**
   * Идентификатор заказа.
  **/
  private Long orderId;

  @ApiModelProperty(required = true, value = "Описание проблемы.")
 /**
   * Описание проблемы.
  **/
  private String description;

  @ApiModelProperty(required = true, value = "")
  @Valid
  private AffectedOrderQualityRatingComponentType componentType;
 /**
   * Идентификатор заказа.
   * minimum: 0
   * @return orderId
  **/
  @JsonProperty("orderId")
  @NotNull
 @Min(0L)  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public QualityRatingAffectedOrderDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

 /**
   * Описание проблемы.
   * @return description
  **/
  @JsonProperty("description")
  @NotNull
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public QualityRatingAffectedOrderDTO description(String description) {
    this.description = description;
    return this;
  }

 /**
   * Get componentType
   * @return componentType
  **/
  @JsonProperty("componentType")
  @NotNull
  public AffectedOrderQualityRatingComponentType getComponentType() {
    return componentType;
  }

  public void setComponentType(AffectedOrderQualityRatingComponentType componentType) {
    this.componentType = componentType;
  }

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

