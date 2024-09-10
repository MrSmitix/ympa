package org.openapitools.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GetMappingDTO;
import org.openapitools.model.OfferCardRecommendationDTO;
import org.openapitools.model.OfferCardStatusType;
import org.openapitools.model.OfferErrorDTO;
import org.openapitools.model.ParameterValueDTO;
import javax.validation.constraints.*;
import javax.validation.Valid;

import io.swagger.annotations.ApiModelProperty;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;


/**
 * Информация о состоянии карточки товара.  Если поле `mapping` отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. 
 */
@ApiModel(description="Информация о состоянии карточки товара.  Если поле `mapping` отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. ")

public class OfferCardDTO  {
  
 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  */
  @ApiModelProperty(required = true, value = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ")
  private String offerId;

  @ApiModelProperty(value = "")
  @Valid
  private GetMappingDTO mapping;

 /**
  * Список характеристик с их значениями. 
  */
  @ApiModelProperty(value = "Список характеристик с их значениями. ")
  @Valid
  private List<@Valid ParameterValueDTO> parameterValues;

  @ApiModelProperty(value = "")
  @Valid
  private OfferCardStatusType cardStatus;

 /**
  * Процент заполненности карточки.
  */
  @ApiModelProperty(value = "Процент заполненности карточки.")
  private Integer contentRating;

 /**
  * Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. 
  */
  @ApiModelProperty(value = "Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. ")
  @Valid
  private List<@Valid OfferCardRecommendationDTO> recommendations;

 /**
  * Ошибки в контенте, препятствующие размещению товара на витрине.
  */
  @ApiModelProperty(value = "Ошибки в контенте, препятствующие размещению товара на витрине.")
  @Valid
  private List<@Valid OfferErrorDTO> errors;

 /**
  * Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.
  */
  @ApiModelProperty(value = "Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.")
  @Valid
  private List<@Valid OfferErrorDTO> warnings;
 /**
  * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
  * @return offerId
  */
  @JsonProperty("offerId")
  @NotNull
 @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min=1,max=255)  public String getOfferId() {
    return offerId;
  }

  /**
   * Sets the <code>offerId</code> property.
   */
 public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  /**
   * Sets the <code>offerId</code> property.
   */
  public OfferCardDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

 /**
  * Get mapping
  * @return mapping
  */
  @JsonProperty("mapping")
  public GetMappingDTO getMapping() {
    return mapping;
  }

  /**
   * Sets the <code>mapping</code> property.
   */
 public void setMapping(GetMappingDTO mapping) {
    this.mapping = mapping;
  }

  /**
   * Sets the <code>mapping</code> property.
   */
  public OfferCardDTO mapping(GetMappingDTO mapping) {
    this.mapping = mapping;
    return this;
  }

 /**
  * Список характеристик с их значениями. 
  * @return parameterValues
  */
  @JsonProperty("parameterValues")
  public List<@Valid ParameterValueDTO> getParameterValues() {
    return parameterValues;
  }

  /**
   * Sets the <code>parameterValues</code> property.
   */
 public void setParameterValues(List<@Valid ParameterValueDTO> parameterValues) {
    this.parameterValues = parameterValues;
  }

  /**
   * Sets the <code>parameterValues</code> property.
   */
  public OfferCardDTO parameterValues(List<@Valid ParameterValueDTO> parameterValues) {
    this.parameterValues = parameterValues;
    return this;
  }

  /**
   * Adds a new item to the <code>parameterValues</code> list.
   */
  public OfferCardDTO addParameterValuesItem(ParameterValueDTO parameterValuesItem) {
    this.parameterValues.add(parameterValuesItem);
    return this;
  }

 /**
  * Get cardStatus
  * @return cardStatus
  */
  @JsonProperty("cardStatus")
  public OfferCardStatusType getCardStatus() {
    return cardStatus;
  }

  /**
   * Sets the <code>cardStatus</code> property.
   */
 public void setCardStatus(OfferCardStatusType cardStatus) {
    this.cardStatus = cardStatus;
  }

  /**
   * Sets the <code>cardStatus</code> property.
   */
  public OfferCardDTO cardStatus(OfferCardStatusType cardStatus) {
    this.cardStatus = cardStatus;
    return this;
  }

 /**
  * Процент заполненности карточки.
  * @return contentRating
  */
  @JsonProperty("contentRating")
  public Integer getContentRating() {
    return contentRating;
  }

  /**
   * Sets the <code>contentRating</code> property.
   */
 public void setContentRating(Integer contentRating) {
    this.contentRating = contentRating;
  }

  /**
   * Sets the <code>contentRating</code> property.
   */
  public OfferCardDTO contentRating(Integer contentRating) {
    this.contentRating = contentRating;
    return this;
  }

 /**
  * Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. 
  * @return recommendations
  */
  @JsonProperty("recommendations")
  public List<@Valid OfferCardRecommendationDTO> getRecommendations() {
    return recommendations;
  }

  /**
   * Sets the <code>recommendations</code> property.
   */
 public void setRecommendations(List<@Valid OfferCardRecommendationDTO> recommendations) {
    this.recommendations = recommendations;
  }

  /**
   * Sets the <code>recommendations</code> property.
   */
  public OfferCardDTO recommendations(List<@Valid OfferCardRecommendationDTO> recommendations) {
    this.recommendations = recommendations;
    return this;
  }

  /**
   * Adds a new item to the <code>recommendations</code> list.
   */
  public OfferCardDTO addRecommendationsItem(OfferCardRecommendationDTO recommendationsItem) {
    this.recommendations.add(recommendationsItem);
    return this;
  }

 /**
  * Ошибки в контенте, препятствующие размещению товара на витрине.
  * @return errors
  */
  @JsonProperty("errors")
  public List<@Valid OfferErrorDTO> getErrors() {
    return errors;
  }

  /**
   * Sets the <code>errors</code> property.
   */
 public void setErrors(List<@Valid OfferErrorDTO> errors) {
    this.errors = errors;
  }

  /**
   * Sets the <code>errors</code> property.
   */
  public OfferCardDTO errors(List<@Valid OfferErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  /**
   * Adds a new item to the <code>errors</code> list.
   */
  public OfferCardDTO addErrorsItem(OfferErrorDTO errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

 /**
  * Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.
  * @return warnings
  */
  @JsonProperty("warnings")
  public List<@Valid OfferErrorDTO> getWarnings() {
    return warnings;
  }

  /**
   * Sets the <code>warnings</code> property.
   */
 public void setWarnings(List<@Valid OfferErrorDTO> warnings) {
    this.warnings = warnings;
  }

  /**
   * Sets the <code>warnings</code> property.
   */
  public OfferCardDTO warnings(List<@Valid OfferErrorDTO> warnings) {
    this.warnings = warnings;
    return this;
  }

  /**
   * Adds a new item to the <code>warnings</code> list.
   */
  public OfferCardDTO addWarningsItem(OfferErrorDTO warningsItem) {
    this.warnings.add(warningsItem);
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
    OfferCardDTO offerCardDTO = (OfferCardDTO) o;
    return Objects.equals(this.offerId, offerCardDTO.offerId) &&
        Objects.equals(this.mapping, offerCardDTO.mapping) &&
        Objects.equals(this.parameterValues, offerCardDTO.parameterValues) &&
        Objects.equals(this.cardStatus, offerCardDTO.cardStatus) &&
        Objects.equals(this.contentRating, offerCardDTO.contentRating) &&
        Objects.equals(this.recommendations, offerCardDTO.recommendations) &&
        Objects.equals(this.errors, offerCardDTO.errors) &&
        Objects.equals(this.warnings, offerCardDTO.warnings);
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
  private static String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

