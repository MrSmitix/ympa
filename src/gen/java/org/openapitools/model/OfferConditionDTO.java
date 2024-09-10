package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OfferConditionQualityType;
import org.openapitools.model.OfferConditionType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Состояние уцененного товара. 
 **/
@ApiModel(description = "Состояние уцененного товара. ")
@JsonTypeName("OfferConditionDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferConditionDTO   {
  private OfferConditionType type;
  private OfferConditionQualityType quality;
  private String reason;

  /**
   **/
  public OfferConditionDTO type(OfferConditionType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  public OfferConditionType getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(OfferConditionType type) {
    this.type = type;
  }

  /**
   **/
  public OfferConditionDTO quality(OfferConditionQualityType quality) {
    this.quality = quality;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("quality")
  public OfferConditionQualityType getQuality() {
    return quality;
  }

  @JsonProperty("quality")
  public void setQuality(OfferConditionQualityType quality) {
    this.quality = quality;
  }

  /**
   * Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. 
   **/
  public OfferConditionDTO reason(String reason) {
    this.reason = reason;
    return this;
  }

  
  @ApiModelProperty(value = "Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. ")
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }

  @JsonProperty("reason")
  public void setReason(String reason) {
    this.reason = reason;
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


}

