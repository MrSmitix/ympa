package org.openapitools.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GetMappingDTO;
import org.openapitools.model.OfferCardRecommendationDTO;
import org.openapitools.model.OfferCardStatusType;
import org.openapitools.model.OfferErrorDTO;
import org.openapitools.model.ParameterValueDTO;



/**
 * Информация о состоянии карточки товара.  Если поле &#x60;mapping&#x60; отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. 
 **/

@ApiModel(description = "Информация о состоянии карточки товара.  Если поле `mapping` отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. ")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaInflectorServerCodegen", date = "2024-09-09T22:20:23.877037640Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferCardDTO   {
  @JsonProperty("offerId")
  private String offerId;

  @JsonProperty("mapping")
  private GetMappingDTO mapping;

  @JsonProperty("parameterValues")
  private List<ParameterValueDTO> parameterValues = null;

  @JsonProperty("cardStatus")
  private OfferCardStatusType cardStatus;

  @JsonProperty("contentRating")
  private Integer contentRating;

  @JsonProperty("recommendations")
  private List<OfferCardRecommendationDTO> recommendations = null;

  @JsonProperty("errors")
  private List<OfferErrorDTO> errors = null;

  @JsonProperty("warnings")
  private List<OfferErrorDTO> warnings = null;

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   **/
  public OfferCardDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  @JsonProperty("offerId")
  public String getOfferId() {
    return offerId;
  }
  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  /**
   **/
  public OfferCardDTO mapping(GetMappingDTO mapping) {
    this.mapping = mapping;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("mapping")
  public GetMappingDTO getMapping() {
    return mapping;
  }
  public void setMapping(GetMappingDTO mapping) {
    this.mapping = mapping;
  }

  /**
   * Список характеристик с их значениями. 
   **/
  public OfferCardDTO parameterValues(List<ParameterValueDTO> parameterValues) {
    this.parameterValues = parameterValues;
    return this;
  }

  
  @ApiModelProperty(value = "Список характеристик с их значениями. ")
  @JsonProperty("parameterValues")
  public List<ParameterValueDTO> getParameterValues() {
    return parameterValues;
  }
  public void setParameterValues(List<ParameterValueDTO> parameterValues) {
    this.parameterValues = parameterValues;
  }

  /**
   **/
  public OfferCardDTO cardStatus(OfferCardStatusType cardStatus) {
    this.cardStatus = cardStatus;
    return this;
  }

  
  @ApiModelProperty(value = "")
  @JsonProperty("cardStatus")
  public OfferCardStatusType getCardStatus() {
    return cardStatus;
  }
  public void setCardStatus(OfferCardStatusType cardStatus) {
    this.cardStatus = cardStatus;
  }

  /**
   * Процент заполненности карточки.
   **/
  public OfferCardDTO contentRating(Integer contentRating) {
    this.contentRating = contentRating;
    return this;
  }

  
  @ApiModelProperty(value = "Процент заполненности карточки.")
  @JsonProperty("contentRating")
  public Integer getContentRating() {
    return contentRating;
  }
  public void setContentRating(Integer contentRating) {
    this.contentRating = contentRating;
  }

  /**
   * Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. 
   **/
  public OfferCardDTO recommendations(List<OfferCardRecommendationDTO> recommendations) {
    this.recommendations = recommendations;
    return this;
  }

  
  @ApiModelProperty(value = "Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. ")
  @JsonProperty("recommendations")
  public List<OfferCardRecommendationDTO> getRecommendations() {
    return recommendations;
  }
  public void setRecommendations(List<OfferCardRecommendationDTO> recommendations) {
    this.recommendations = recommendations;
  }

  /**
   * Ошибки в контенте, препятствующие размещению товара на витрине.
   **/
  public OfferCardDTO errors(List<OfferErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  
  @ApiModelProperty(value = "Ошибки в контенте, препятствующие размещению товара на витрине.")
  @JsonProperty("errors")
  public List<OfferErrorDTO> getErrors() {
    return errors;
  }
  public void setErrors(List<OfferErrorDTO> errors) {
    this.errors = errors;
  }

  /**
   * Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.
   **/
  public OfferCardDTO warnings(List<OfferErrorDTO> warnings) {
    this.warnings = warnings;
    return this;
  }

  
  @ApiModelProperty(value = "Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.")
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

