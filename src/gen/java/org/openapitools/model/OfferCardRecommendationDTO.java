package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.model.OfferCardRecommendationType;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.*;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Рекомендация по заполнению карточки товара.
 **/
@ApiModel(description = "Рекомендация по заполнению карточки товара.")
@JsonTypeName("OfferCardRecommendationDTO")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaJAXRSSpecServerCodegen", date = "2024-09-09T22:25:08.792192529Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferCardRecommendationDTO   {
  private OfferCardRecommendationType type;
  private Integer percent;

  /**
   **/
  public OfferCardRecommendationDTO type(OfferCardRecommendationType type) {
    this.type = type;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "")
  @JsonProperty("type")
  @NotNull public OfferCardRecommendationType getType() {
    return type;
  }

  @JsonProperty("type")
  public void setType(OfferCardRecommendationType type) {
    this.type = type;
  }

  /**
   * Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.
   * minimum: 0
   * maximum: 100
   **/
  public OfferCardRecommendationDTO percent(Integer percent) {
    this.percent = percent;
    return this;
  }

  
  @ApiModelProperty(value = "Процент выполнения рекомендации. Указывается для рекомендаций некоторых типов.")
  @JsonProperty("percent")
   @Min(0) @Max(100)public Integer getPercent() {
    return percent;
  }

  @JsonProperty("percent")
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

