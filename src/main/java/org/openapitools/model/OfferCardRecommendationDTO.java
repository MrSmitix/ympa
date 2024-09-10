package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.model.OfferCardRecommendationType;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Рекомендация по заполнению карточки товара.
 */

@Schema(name = "OfferCardRecommendationDTO", description = "Рекомендация по заполнению карточки товара.")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferCardRecommendationDTO {

  private OfferCardRecommendationType type;

  private Integer percent;

  public OfferCardRecommendationDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OfferCardRecommendationDTO(OfferCardRecommendationType type) {
    this.type = type;
  }

  public OfferCardRecommendationDTO type(OfferCardRecommendationType type) {
    this.type = type;
    return this;
  }

  /**
   * Get type
   * @return type
   */
  @NotNull @Valid 
  @Schema(name = "type", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("type")
  public OfferCardRecommendationType getType() {
    return type;
  }

  public void setType(OfferCardRecommendationType type) {
    this.type = type;
  }

  public OfferCardRecommendationDTO percent(Integer percent) {
    this.percent = percent;
    return this;
  }

  /**
   * Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.
   * minimum: 0
   * maximum: 100
   * @return percent
   */
  @Min(0) @Max(100) 
  @Schema(name = "percent", description = "Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("percent")
  public Integer getPercent() {
    return percent;
  }

  public void setPercent(Integer percent) {
    this.percent = percent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferCardRecommendationDTO offerCardRecommendationDTO = (OfferCardRecommendationDTO) o;
    return Objects.equals(this.type, offerCardRecommendationDTO.type) &&
        Objects.equals(this.percent, offerCardRecommendationDTO.percent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, percent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferCardRecommendationDTO {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
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

