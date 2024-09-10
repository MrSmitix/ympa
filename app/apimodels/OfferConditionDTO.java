package apimodels;

import apimodels.OfferConditionQualityType;
import apimodels.OfferConditionType;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Состояние уцененного товара. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OfferConditionDTO   {
  @JsonProperty("type")
  @Valid

  private OfferConditionType type;

  @JsonProperty("quality")
  @Valid

  private OfferConditionQualityType quality;

  @JsonProperty("reason")
  
  private String reason;

  public OfferConditionDTO type(OfferConditionType type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public OfferConditionType getType() {
    return type;
  }

  public void setType(OfferConditionType type) {
    this.type = type;
  }

  public OfferConditionDTO quality(OfferConditionQualityType quality) {
    this.quality = quality;
    return this;
  }

   /**
   * Get quality
   * @return quality
  **/
  public OfferConditionQualityType getQuality() {
    return quality;
  }

  public void setQuality(OfferConditionQualityType quality) {
    this.quality = quality;
  }

  public OfferConditionDTO reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. 
   * @return reason
  **/
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

