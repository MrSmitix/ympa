package org.openapitools.vertxweb.server.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.vertxweb.server.model.GetMappingDTO;
import org.openapitools.vertxweb.server.model.OfferCardRecommendationDTO;
import org.openapitools.vertxweb.server.model.OfferCardStatusType;
import org.openapitools.vertxweb.server.model.OfferErrorDTO;
import org.openapitools.vertxweb.server.model.ParameterValueDTO;

/**
 * Информация о состоянии карточки товара.  Если поле &#x60;mapping&#x60; отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. 
 **/
@JsonInclude(JsonInclude.Include.NON_NULL)
public class OfferCardDTO   {
  
  private String offerId;
  private GetMappingDTO mapping;
  private List<ParameterValueDTO> parameterValues;
  private OfferCardStatusType cardStatus;
  private Integer contentRating;
  private List<OfferCardRecommendationDTO> recommendations;
  private List<OfferErrorDTO> errors;
  private List<OfferErrorDTO> warnings;

  public OfferCardDTO () {

  }

  public OfferCardDTO (String offerId, GetMappingDTO mapping, List<ParameterValueDTO> parameterValues, OfferCardStatusType cardStatus, Integer contentRating, List<OfferCardRecommendationDTO> recommendations, List<OfferErrorDTO> errors, List<OfferErrorDTO> warnings) {
    this.offerId = offerId;
    this.mapping = mapping;
    this.parameterValues = parameterValues;
    this.cardStatus = cardStatus;
    this.contentRating = contentRating;
    this.recommendations = recommendations;
    this.errors = errors;
    this.warnings = warnings;
  }

    
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

    
  @JsonProperty("mapping")
  public GetMappingDTO getMapping() {
    return mapping;
  }
  public void setMapping(GetMappingDTO mapping) {
    this.mapping = mapping;
  }

    
  @JsonProperty("parameterValues")
  public List<ParameterValueDTO> getParameterValues() {
    return parameterValues;
  }
  public void setParameterValues(List<ParameterValueDTO> parameterValues) {
    this.parameterValues = parameterValues;
  }

    
  @JsonProperty("cardStatus")
  public OfferCardStatusType getCardStatus() {
    return cardStatus;
  }
  public void setCardStatus(OfferCardStatusType cardStatus) {
    this.cardStatus = cardStatus;
  }

    
  @JsonProperty("contentRating")
  public Integer getContentRating() {
    return contentRating;
  }
  public void setContentRating(Integer contentRating) {
    this.contentRating = contentRating;
  }

    
  @JsonProperty("recommendations")
  public List<OfferCardRecommendationDTO> getRecommendations() {
    return recommendations;
  }
  public void setRecommendations(List<OfferCardRecommendationDTO> recommendations) {
    this.recommendations = recommendations;
  }

    
  @JsonProperty("errors")
  public List<OfferErrorDTO> getErrors() {
    return errors;
  }
  public void setErrors(List<OfferErrorDTO> errors) {
    this.errors = errors;
  }

    
  @JsonProperty("warnings")
  public List<OfferErrorDTO> getWarnings() {
    return warnings;
  }
  public void setWarnings(List<OfferErrorDTO> warnings) {
    this.warnings = warnings;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OfferCardDTO offerCardDTO = (OfferCardDTO) o;
    return Objects.equals(offerId, offerCardDTO.offerId) &&
        Objects.equals(mapping, offerCardDTO.mapping) &&
        Objects.equals(parameterValues, offerCardDTO.parameterValues) &&
        Objects.equals(cardStatus, offerCardDTO.cardStatus) &&
        Objects.equals(contentRating, offerCardDTO.contentRating) &&
        Objects.equals(recommendations, offerCardDTO.recommendations) &&
        Objects.equals(errors, offerCardDTO.errors) &&
        Objects.equals(warnings, offerCardDTO.warnings);
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, mapping, parameterValues, cardStatus, contentRating, recommendations, errors, warnings);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OfferCardDTO {\n");
    
    sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
    sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
    sb.append("    parameterValues: ").append(toIndentedString(parameterValues)).append("\n");
    sb.append("    cardStatus: ").append(toIndentedString(cardStatus)).append("\n");
    sb.append("    contentRating: ").append(toIndentedString(contentRating)).append("\n");
    sb.append("    recommendations: ").append(toIndentedString(recommendations)).append("\n");
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    warnings: ").append(toIndentedString(warnings)).append("\n");
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
