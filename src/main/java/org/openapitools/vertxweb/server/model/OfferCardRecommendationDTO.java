package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import org.openapitools.vertxweb.server.model.OfferCardRecommendationType;

/**
 * Рекомендация по заполнению карточки товара.
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferCardRecommendationDTO   {
  
  private OfferCardRecommendationType type;
  private Integer percent;

  public OfferCardRecommendationDTO () {

  }

  public OfferCardRecommendationDTO (OfferCardRecommendationType type, Integer percent) {
    this.type = type;
    this.percent = percent;
  }

    
  @JsonProperty("type")
  public OfferCardRecommendationType getType() {
    return type;
  }
  public void setType(OfferCardRecommendationType type) {
    this.type = type;
  }

    
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
    return Objects.equals(type, offerCardRecommendationDTO.type) &&
        Objects.equals(percent, offerCardRecommendationDTO.percent);
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
