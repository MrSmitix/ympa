package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.OfferConditionQualityType;
import org.openapitools.model.OfferConditionType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Состояние уцененного товара. 
 */
@ApiModel(description="Состояние уцененного товара. ")

public class OfferConditionDTO  {
  
  @ApiModelProperty(value = "")
  @Valid
  private OfferConditionType type;

  @ApiModelProperty(value = "")
  @Valid
  private OfferConditionQualityType quality;

 /**
  * Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. 
  */
  @ApiModelProperty(value = "Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. ")
  private String reason;
 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  public OfferConditionType getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(OfferConditionType type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public OfferConditionDTO type(OfferConditionType type) {
    this.type = type;
    return this;
  }

 /**
  * Get quality
  * @return quality
  */
  @JsonProperty("quality")
  public OfferConditionQualityType getQuality() {
    return quality;
  }

  /**
   * Sets the <code>quality</code> property.
   */
 public void setQuality(OfferConditionQualityType quality) {
    this.quality = quality;
  }

  /**
   * Sets the <code>quality</code> property.
   */
  public OfferConditionDTO quality(OfferConditionQualityType quality) {
    this.quality = quality;
    return this;
  }

 /**
  * Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. 
  * @return reason
  */
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  /**
   * Sets the <code>reason</code> property.
   */
 public void setReason(String reason) {
    this.reason = reason;
  }

  /**
   * Sets the <code>reason</code> property.
   */
  public OfferConditionDTO reason(String reason) {
    this.reason = reason;
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
    OfferConditionDTO offerConditionDTO = (OfferConditionDTO) o;
    return Objects.equals(this.type, offerConditionDTO.type) &&
        Objects.equals(this.quality, offerConditionDTO.quality) &&
        Objects.equals(this.reason, offerConditionDTO.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, quality, reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferConditionDTO {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    quality: ").append(toIndentedString(quality)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

