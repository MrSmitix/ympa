package org.openapitools.model;

import java.util.Objects;
import java.util.ArrayList;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OfferConditionQualityType;
import org.openapitools.model.OfferConditionType;
import javax.validation.constraints.*;
import javax.validation.Valid;
import io.swagger.annotations.*;

@ApiModel(description="Состояние уцененного товара. ")@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaResteasyServerCodegen", date = "2024-09-09T22:24:34.340132557Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferConditionDTO   {
  
  private OfferConditionType type;
  private OfferConditionQualityType quality;
  private String reason;

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("type")
  @Valid
  public OfferConditionType getType() {
    return type;
  }
  public void setType(OfferConditionType type) {
    this.type = type;
  }

  /**
   **/
  
  @ApiModelProperty(value = "")
  @JsonProperty("quality")
  @Valid
  public OfferConditionQualityType getQuality() {
    return quality;
  }
  public void setQuality(OfferConditionQualityType quality) {
    this.quality = quality;
  }

  /**
   * Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. 
   **/
  
  @ApiModelProperty(value = "Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. ")
  @JsonProperty("reason")
  public String getReason() {
    return reason;
  }
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

