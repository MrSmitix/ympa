package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import org.openapitools.model.OfferCardRecommendationType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Рекомендация по заполнению карточки товара.
 */
@ApiModel(description="Рекомендация по заполнению карточки товара.")

public class OfferCardRecommendationDTO  {
  
  @ApiModelProperty(required = true, value = "")
  @Valid
  private OfferCardRecommendationType type;

 /**
  * Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.
  */
  @ApiModelProperty(value = "Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.")
  private Integer percent;
 /**
  * Get type
  * @return type
  */
  @JsonProperty("type")
  @NotNull
  public OfferCardRecommendationType getType() {
    return type;
  }

  /**
   * Sets the <code>type</code> property.
   */
 public void setType(OfferCardRecommendationType type) {
    this.type = type;
  }

  /**
   * Sets the <code>type</code> property.
   */
  public OfferCardRecommendationDTO type(OfferCardRecommendationType type) {
    this.type = type;
    return this;
  }

 /**
  * Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.
  * minimum: 0
  * maximum: 100
  * @return percent
  */
  @JsonProperty("percent")
 @Min(0) @Max(100)  public Integer getPercent() {
    return percent;
  }

  /**
   * Sets the <code>percent</code> property.
   */
 public void setPercent(Integer percent) {
    this.percent = percent;
  }

  /**
   * Sets the <code>percent</code> property.
   */
  public OfferCardRecommendationDTO percent(Integer percent) {
    this.percent = percent;
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

