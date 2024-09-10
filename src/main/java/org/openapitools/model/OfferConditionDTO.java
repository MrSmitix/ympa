package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.OfferConditionQualityType;
import org.openapitools.model.OfferConditionType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Состояние уцененного товара. 
 */

@Schema(name = "OfferConditionDTO", description = "Состояние уцененного товара. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferConditionDTO {

  private OfferConditionType type;

  private OfferConditionQualityType quality;

  private String reason;

  public OfferConditionDTO type(OfferConditionType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("type")
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
   */
  @Valid 
  @Schema(name = "quality", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("quality")
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
   */
  
  @Schema(name = "reason", description = "Описание товара. Подробно опишите дефекты, насколько они заметны и где их искать. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
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

