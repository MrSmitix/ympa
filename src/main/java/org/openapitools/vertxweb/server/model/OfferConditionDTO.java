package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.OfferConditionQualityType;
import org.openapitools.vertxweb.server.model.OfferConditionType;

/**
 * Состояние уцененного товара. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferConditionDTO   {
  
  private OfferConditionType type;
  private OfferConditionQualityType quality;
  private String reason;

  public OfferConditionDTO () {

  }

  public OfferConditionDTO (OfferConditionType type, OfferConditionQualityType quality, String reason) {
    this.type = type;
    this.quality = quality;
    this.reason = reason;
  }

    
  @JsonProperty("type")
  public OfferConditionType getType() {
    return type;
  }
  public void setType(OfferConditionType type) {
    this.type = type;
  }

    
  @JsonProperty("quality")
  public OfferConditionQualityType getQuality() {
    return quality;
  }
  public void setQuality(OfferConditionQualityType quality) {
    this.quality = quality;
  }

    
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
    return Objects.equals(type, offerConditionDTO.type) &&
        Objects.equals(quality, offerConditionDTO.quality) &&
        Objects.equals(reason, offerConditionDTO.reason);
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
