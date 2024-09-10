package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import org.openapitools.model.OfferConditionQualityType;
import org.openapitools.model.OfferConditionType;

import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
  * Состояние уцененного товара. 
 **/
@ApiModel(description="Состояние уцененного товара. ")

public class OfferConditionDTO  {
  
  @ApiModelProperty(value = "")
  private OfferConditionType type;

  @ApiModelProperty(value = "")
  private OfferConditionQualityType quality;

  @ApiModelProperty(value = "Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. ")
 /**
   * Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. 
  **/
  private String reason;
 /**
   * Get type
   * @return type
  **/
  @JsonProperty("type")
  public OfferConditionType getType() {
    return type;
  }

  public void setType(OfferConditionType type) {
    this.type = type;
  }

  public OfferConditionDTO type(OfferConditionType type) {
    this.type = type;
    return this;
  }

 /**
   * Get quality
   * @return quality
  **/
  @JsonProperty("quality")
  public OfferConditionQualityType getQuality() {
    return quality;
  }

  public void setQuality(OfferConditionQualityType quality) {
    this.quality = quality;
  }

  public OfferConditionDTO quality(OfferConditionQualityType quality) {
    this.quality = quality;
    return this;
  }

 /**
   * Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. 
   * @return reason
  **/
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

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

