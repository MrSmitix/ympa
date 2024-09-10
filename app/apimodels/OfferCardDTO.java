package apimodels;

import apimodels.GetMappingDTO;
import apimodels.OfferCardRecommendationDTO;
import apimodels.OfferCardStatusType;
import apimodels.OfferErrorDTO;
import apimodels.ParameterValueDTO;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import com.fasterxml.jackson.annotation.*;
import java.util.Set;
import javax.validation.*;
import java.util.Objects;
import javax.validation.constraints.*;
import javax.validation.Valid;
/**
 * Информация о состоянии карточки товара.  Если поле &#x60;mapping&#x60; отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. 
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaPlayFrameworkCodegen", date = "2024-09-09T22:21:55.843336303Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@SuppressWarnings({"UnusedReturnValue", "WeakerAccess"})
public class OfferCardDTO   {
  @JsonProperty("offerId")
  @NotNull
@Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
@Size(min=1,max=255)

  private String offerId;

  @JsonProperty("mapping")
  @Valid

  private GetMappingDTO mapping;

  @JsonProperty("parameterValues")
  @Valid

  private List<@Valid ParameterValueDTO> parameterValues = null;

  @JsonProperty("cardStatus")
  @Valid

  private OfferCardStatusType cardStatus;

  @JsonProperty("contentRating")
  
  private Integer contentRating;

  @JsonProperty("recommendations")
  @Valid

  private List<@Valid OfferCardRecommendationDTO> recommendations = null;

  @JsonProperty("errors")
  @Valid

  private List<@Valid OfferErrorDTO> errors = null;

  @JsonProperty("warnings")
  @Valid

  private List<@Valid OfferErrorDTO> warnings = null;

  public OfferCardDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

   /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return offerId
  **/
  public String getOfferId() {
    return offerId;
  }

  public void setOfferId(String offerId) {
    this.offerId = offerId;
  }

  public OfferCardDTO mapping(GetMappingDTO mapping) {
    this.mapping = mapping;
    return this;
  }

   /**
   * Get mapping
   * @return mapping
  **/
  public GetMappingDTO getMapping() {
    return mapping;
  }

  public void setMapping(GetMappingDTO mapping) {
    this.mapping = mapping;
  }

  public OfferCardDTO parameterValues(List<@Valid ParameterValueDTO> parameterValues) {
    this.parameterValues = parameterValues;
    return this;
  }

  public OfferCardDTO addParameterValuesItem(ParameterValueDTO parameterValuesItem) {
    if (this.parameterValues == null) {
      this.parameterValues = new ArrayList<>();
    }
    this.parameterValues.add(parameterValuesItem);
    return this;
  }

   /**
   * Список характеристик с их значениями. 
   * @return parameterValues
  **/
  public List<@Valid ParameterValueDTO> getParameterValues() {
    return parameterValues;
  }

  public void setParameterValues(List<@Valid ParameterValueDTO> parameterValues) {
    this.parameterValues = parameterValues;
  }

  public OfferCardDTO cardStatus(OfferCardStatusType cardStatus) {
    this.cardStatus = cardStatus;
    return this;
  }

   /**
   * Get cardStatus
   * @return cardStatus
  **/
  public OfferCardStatusType getCardStatus() {
    return cardStatus;
  }

  public void setCardStatus(OfferCardStatusType cardStatus) {
    this.cardStatus = cardStatus;
  }

  public OfferCardDTO contentRating(Integer contentRating) {
    this.contentRating = contentRating;
    return this;
  }

   /**
   * Процент заполненности карточки.
   * @return contentRating
  **/
  public Integer getContentRating() {
    return contentRating;
  }

  public void setContentRating(Integer contentRating) {
    this.contentRating = contentRating;
  }

  public OfferCardDTO recommendations(List<@Valid OfferCardRecommendationDTO> recommendations) {
    this.recommendations = recommendations;
    return this;
  }

  public OfferCardDTO addRecommendationsItem(OfferCardRecommendationDTO recommendationsItem) {
    if (this.recommendations == null) {
      this.recommendations = new ArrayList<>();
    }
    this.recommendations.add(recommendationsItem);
    return this;
  }

   /**
   * Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. 
   * @return recommendations
  **/
  public List<@Valid OfferCardRecommendationDTO> getRecommendations() {
    return recommendations;
  }

  public void setRecommendations(List<@Valid OfferCardRecommendationDTO> recommendations) {
    this.recommendations = recommendations;
  }

  public OfferCardDTO errors(List<@Valid OfferErrorDTO> errors) {
    this.errors = errors;
    return this;
  }

  public OfferCardDTO addErrorsItem(OfferErrorDTO errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<>();
    }
    this.errors.add(errorsItem);
    return this;
  }

   /**
   * Ошибки в контенте, препятствующие размещению товара на витрине.
   * @return errors
  **/
  public List<@Valid OfferErrorDTO> getErrors() {
    return errors;
  }

  public void setErrors(List<@Valid OfferErrorDTO> errors) {
    this.errors = errors;
  }

  public OfferCardDTO warnings(List<@Valid OfferErrorDTO> warnings) {
    this.warnings = warnings;
    return this;
  }

  public OfferCardDTO addWarningsItem(OfferErrorDTO warningsItem) {
    if (this.warnings == null) {
      this.warnings = new ArrayList<>();
    }
    this.warnings.add(warningsItem);
    return this;
  }

   /**
   * Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.
   * @return warnings
  **/
  public List<@Valid OfferErrorDTO> getWarnings() {
    return warnings;
  }

  public void setWarnings(List<@Valid OfferErrorDTO> warnings) {
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

  @SuppressWarnings("StringBufferReplaceableByString")
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

