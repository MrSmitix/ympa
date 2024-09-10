package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.AffectedOrderQualityRatingComponentType;

/**
 * Информация о заказе, который повлиял на индекс качества.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class QualityRatingAffectedOrderDTO   {
  
  private Long orderId;
  private String description;
  private AffectedOrderQualityRatingComponentType componentType;

  public QualityRatingAffectedOrderDTO () {

  }

  public QualityRatingAffectedOrderDTO (Long orderId, String description, AffectedOrderQualityRatingComponentType componentType) {
    this.orderId = orderId;
    this.description = description;
    this.componentType = componentType;
  }

    
  @JsonProperty("orderId")
  public Long getOrderId() {
    return orderId;
  }
  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

    
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

    
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
