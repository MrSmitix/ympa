/*
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.model;

import java.util.Objects;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.model.GetMappingDTO;
import org.openapitools.model.OfferCardRecommendationDTO;
import org.openapitools.model.OfferCardStatusType;
import org.openapitools.model.OfferErrorDTO;
import org.openapitools.model.ParameterValueDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Информация о состоянии карточки товара.  Если поле &#x60;mapping&#x60; отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. 
 */
@JsonPropertyOrder({
  OfferCardDTO.JSON_PROPERTY_OFFER_ID,
  OfferCardDTO.JSON_PROPERTY_MAPPING,
  OfferCardDTO.JSON_PROPERTY_PARAMETER_VALUES,
  OfferCardDTO.JSON_PROPERTY_CARD_STATUS,
  OfferCardDTO.JSON_PROPERTY_CONTENT_RATING,
  OfferCardDTO.JSON_PROPERTY_RECOMMENDATIONS,
  OfferCardDTO.JSON_PROPERTY_ERRORS,
  OfferCardDTO.JSON_PROPERTY_WARNINGS
})
@JsonTypeName("OfferCardDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class OfferCardDTO {
    public static final String JSON_PROPERTY_OFFER_ID = "offerId";
    private String offerId;

    public static final String JSON_PROPERTY_MAPPING = "mapping";
    private GetMappingDTO mapping;

    public static final String JSON_PROPERTY_PARAMETER_VALUES = "parameterValues";
    private List<@Valid ParameterValueDTO> parameterValues = null;

    public static final String JSON_PROPERTY_CARD_STATUS = "cardStatus";
    private OfferCardStatusType cardStatus;

    public static final String JSON_PROPERTY_CONTENT_RATING = "contentRating";
    private Integer contentRating;

    public static final String JSON_PROPERTY_RECOMMENDATIONS = "recommendations";
    private List<@Valid OfferCardRecommendationDTO> recommendations = null;

    public static final String JSON_PROPERTY_ERRORS = "errors";
    private List<@Valid OfferErrorDTO> errors = null;

    public static final String JSON_PROPERTY_WARNINGS = "warnings";
    private List<@Valid OfferErrorDTO> warnings = null;

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
    @NotNull
    @Pattern(regexp="^[^\\x00-\\x08\\x0A-\\x1f\\x7f]{1,255}$")
    @Size(min=1, max=255)
    @JsonProperty(JSON_PROPERTY_OFFER_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public String getOfferId() {
        return offerId;
    }

    @JsonProperty(JSON_PROPERTY_OFFER_ID)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_MAPPING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public GetMappingDTO getMapping() {
        return mapping;
    }

    @JsonProperty(JSON_PROPERTY_MAPPING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_PARAMETER_VALUES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Valid ParameterValueDTO> getParameterValues() {
        return parameterValues;
    }

    @JsonProperty(JSON_PROPERTY_PARAMETER_VALUES)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_CARD_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public OfferCardStatusType getCardStatus() {
        return cardStatus;
    }

    @JsonProperty(JSON_PROPERTY_CARD_STATUS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    @Nullable
    @JsonProperty(JSON_PROPERTY_CONTENT_RATING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getContentRating() {
        return contentRating;
    }

    @JsonProperty(JSON_PROPERTY_CONTENT_RATING)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_RECOMMENDATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Valid OfferCardRecommendationDTO> getRecommendations() {
        return recommendations;
    }

    @JsonProperty(JSON_PROPERTY_RECOMMENDATIONS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_ERRORS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Valid OfferErrorDTO> getErrors() {
        return errors;
    }

    @JsonProperty(JSON_PROPERTY_ERRORS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
     */
    @Nullable
    @JsonProperty(JSON_PROPERTY_WARNINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Valid OfferErrorDTO> getWarnings() {
        return warnings;
    }

    @JsonProperty(JSON_PROPERTY_WARNINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
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
    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}

