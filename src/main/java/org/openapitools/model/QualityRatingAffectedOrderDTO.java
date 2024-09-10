package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.AffectedOrderQualityRatingComponentType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о заказе, который повлиял на индекс качества.
 */

@Schema(name = "QualityRatingAffectedOrderDTO", description = "Информация о заказе, который повлиял на индекс качества.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class QualityRatingAffectedOrderDTO {

  private Long orderId;

  private String description;

  private AffectedOrderQualityRatingComponentType componentType;

  public QualityRatingAffectedOrderDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public QualityRatingAffectedOrderDTO(Long orderId, String description, AffectedOrderQualityRatingComponentType componentType) {
    this.orderId = orderId;
    this.description = description;
    this.componentType = componentType;
  }

  public QualityRatingAffectedOrderDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Идентификатор заказа.
   * minimum: 0
   * @return orderId
   */
  @NotNull @Min(0L) 
  @Schema(name = "orderId", description = "Идентификатор заказа.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("orderId")
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
  @NotNull 
  @Schema(name = "description", description = "Описание проблемы.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("description")
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
  @NotNull @Valid 
  @Schema(name = "componentType", requiredMode = Schema.RequiredMode.REQUIRED)
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

