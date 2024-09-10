package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GetMappingDTO;
import org.openapitools.model.OfferCardRecommendationDTO;
import org.openapitools.model.OfferCardStatusType;
import org.openapitools.model.OfferErrorDTO;
import org.openapitools.model.ParameterValueDTO;
import java.util.NoSuchElementException;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * Информация о состоянии карточки товара.  Если поле &#x60;mapping&#x60; отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. 
 */

@Schema(name = "OfferCardDTO", description = "Информация о состоянии карточки товара.  Если поле `mapping` отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. ")
@Generated(value = "org.openapitools.codegen.languages.JavaCamelServerCodegen", date = "2024-09-09T22:19:44.552145407Z[Etc/UTC]", comments = "Generator version: 7.8.0")
public class OfferCardDTO {

  private String offerId;

  private GetMappingDTO mapping;

  @Valid
  private JsonNullable<List<@Valid ParameterValueDTO>> parameterValues = JsonNullable.<List<@Valid ParameterValueDTO>>undefined();

  private OfferCardStatusType cardStatus;

  private Integer contentRating;

  @Valid
  private JsonNullable<List<@Valid OfferCardRecommendationDTO>> recommendations = JsonNullable.<List<@Valid OfferCardRecommendationDTO>>undefined();

  @Valid
  private JsonNullable<List<@Valid OfferErrorDTO>> errors = JsonNullable.<List<@Valid OfferErrorDTO>>undefined();

  @Valid
  private JsonNullable<List<@Valid OfferErrorDTO>> warnings = JsonNullable.<List<@Valid OfferErrorDTO>>undefined();

  public OfferCardDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OfferCardDTO(String offerId) {
    this.offerId = offerId;
  }

  public OfferCardDTO offerId(String offerId) {
    this.offerId = offerId;
    return this;
  }

  /**
   * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
   * @return offerId
   */
  @NotNull @Pattern(regexp = "^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$") @Size(min = 1, max = 255) 
  @Schema(name = "offerId", description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("offerId")
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
   */
  @Valid 
  @Schema(name = "mapping", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("mapping")
  public GetMappingDTO getMapping() {
    return mapping;
  }

  public void setMapping(GetMappingDTO mapping) {
    this.mapping = mapping;
  }

  public OfferCardDTO parameterValues(List<@Valid ParameterValueDTO> parameterValues) {
    this.parameterValues = JsonNullable.of(parameterValues);
    return this;
  }

  public OfferCardDTO addParameterValuesItem(ParameterValueDTO parameterValuesItem) {
    if (this.parameterValues == null || !this.parameterValues.isPresent()) {
      this.parameterValues = JsonNullable.of(new ArrayList<>());
    }
    this.parameterValues.get().add(parameterValuesItem);
    return this;
  }

  /**
   * Список характеристик с их значениями. 
   * @return parameterValues
   */
  @Valid 
  @Schema(name = "parameterValues", description = "Список характеристик с их значениями. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("parameterValues")
  public JsonNullable<List<@Valid ParameterValueDTO>> getParameterValues() {
    return parameterValues;
  }

  public void setParameterValues(JsonNullable<List<@Valid ParameterValueDTO>> parameterValues) {
    this.parameterValues = parameterValues;
  }

  public OfferCardDTO cardStatus(OfferCardStatusType cardStatus) {
    this.cardStatus = cardStatus;
    return this;
  }

  /**
   * Get cardStatus
   * @return cardStatus
   */
  @Valid 
  @Schema(name = "cardStatus", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("cardStatus")
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
   */
  
  @Schema(name = "contentRating", description = "Процент заполненности карточки.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("contentRating")
  public Integer getContentRating() {
    return contentRating;
  }

  public void setContentRating(Integer contentRating) {
    this.contentRating = contentRating;
  }

  public OfferCardDTO recommendations(List<@Valid OfferCardRecommendationDTO> recommendations) {
    this.recommendations = JsonNullable.of(recommendations);
    return this;
  }

  public OfferCardDTO addRecommendationsItem(OfferCardRecommendationDTO recommendationsItem) {
    if (this.recommendations == null || !this.recommendations.isPresent()) {
      this.recommendations = JsonNullable.of(new ArrayList<>());
    }
    this.recommendations.get().add(recommendationsItem);
    return this;
  }

  /**
   * Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. 
   * @return recommendations
   */
  @Valid 
  @Schema(name = "recommendations", description = "Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("recommendations")
  public JsonNullable<List<@Valid OfferCardRecommendationDTO>> getRecommendations() {
    return recommendations;
  }

  public void setRecommendations(JsonNullable<List<@Valid OfferCardRecommendationDTO>> recommendations) {
    this.recommendations = recommendations;
  }

  public OfferCardDTO errors(List<@Valid OfferErrorDTO> errors) {
    this.errors = JsonNullable.of(errors);
    return this;
  }

  public OfferCardDTO addErrorsItem(OfferErrorDTO errorsItem) {
    if (this.errors == null || !this.errors.isPresent()) {
      this.errors = JsonNullable.of(new ArrayList<>());
    }
    this.errors.get().add(errorsItem);
    return this;
  }

  /**
   * Ошибки в контенте, препятствующие размещению товара на витрине.
   * @return errors
   */
  @Valid 
  @Schema(name = "errors", description = "Ошибки в контенте, препятствующие размещению товара на витрине.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("errors")
  public JsonNullable<List<@Valid OfferErrorDTO>> getErrors() {
    return errors;
  }

  public void setErrors(JsonNullable<List<@Valid OfferErrorDTO>> errors) {
    this.errors = errors;
  }

  public OfferCardDTO warnings(List<@Valid OfferErrorDTO> warnings) {
    this.warnings = JsonNullable.of(warnings);
    return this;
  }

  public OfferCardDTO addWarningsItem(OfferErrorDTO warningsItem) {
    if (this.warnings == null || !this.warnings.isPresent()) {
      this.warnings = JsonNullable.of(new ArrayList<>());
    }
    this.warnings.get().add(warningsItem);
    return this;
  }

  /**
   * Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.
   * @return warnings
   */
  @Valid 
  @Schema(name = "warnings", description = "Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("warnings")
  public JsonNullable<List<@Valid OfferErrorDTO>> getWarnings() {
    return warnings;
  }

  public void setWarnings(JsonNullable<List<@Valid OfferErrorDTO>> warnings) {
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
    return Objects.equals(this.offerId, offerCardDTO.offerId) &&
        Objects.equals(this.mapping, offerCardDTO.mapping) &&
        equalsNullable(this.parameterValues, offerCardDTO.parameterValues) &&
        Objects.equals(this.cardStatus, offerCardDTO.cardStatus) &&
        Objects.equals(this.contentRating, offerCardDTO.contentRating) &&
        equalsNullable(this.recommendations, offerCardDTO.recommendations) &&
        equalsNullable(this.errors, offerCardDTO.errors) &&
        equalsNullable(this.warnings, offerCardDTO.warnings);
  }

  private static <T> boolean equalsNullable(JsonNullable<T> a, JsonNullable<T> b) {
    return a == b || (a != null && b != null && a.isPresent() && b.isPresent() && Objects.deepEquals(a.get(), b.get()));
  }

  @Override
  public int hashCode() {
    return Objects.hash(offerId, mapping, hashCodeNullable(parameterValues), cardStatus, contentRating, hashCodeNullable(recommendations), hashCodeNullable(errors), hashCodeNullable(warnings));
  }

  private static <T> int hashCodeNullable(JsonNullable<T> a) {
    if (a == null) {
      return 1;
    }
    return a.isPresent() ? Arrays.deepHashCode(new Object[]{a.get()}) : 31;
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

