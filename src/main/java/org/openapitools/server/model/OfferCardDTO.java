package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.GetMappingDTO;
import org.openapitools.server.model.OfferCardRecommendationDTO;
import org.openapitools.server.model.OfferCardStatusType;
import org.openapitools.server.model.OfferErrorDTO;
import org.openapitools.server.model.ParameterValueDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Информация о состоянии карточки товара.  Если поле `mapping` отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. 
 */
public class OfferCardDTO   {

    private String offerId;
    private GetMappingDTO mapping;
    private List<@Valid ParameterValueDTO> parameterValues;
    private OfferCardStatusType cardStatus;
    private Integer contentRating;
    private List<@Valid OfferCardRecommendationDTO> recommendations;
    private List<@Valid OfferErrorDTO> errors;
    private List<@Valid OfferErrorDTO> warnings;

    /**
     * Default constructor.
     */
    public OfferCardDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create OfferCardDTO.
     *
     * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @param mapping mapping
     * @param parameterValues Список характеристик с их значениями. 
     * @param cardStatus cardStatus
     * @param contentRating Процент заполненности карточки.
     * @param recommendations Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. 
     * @param errors Ошибки в контенте, препятствующие размещению товара на витрине.
     * @param warnings Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.
     */
    public OfferCardDTO(
        String offerId, 
        GetMappingDTO mapping, 
        List<@Valid ParameterValueDTO> parameterValues, 
        OfferCardStatusType cardStatus, 
        Integer contentRating, 
        List<@Valid OfferCardRecommendationDTO> recommendations, 
        List<@Valid OfferErrorDTO> errors, 
        List<@Valid OfferErrorDTO> warnings
    ) {
        this.offerId = offerId;
        this.mapping = mapping;
        this.parameterValues = parameterValues;
        this.cardStatus = cardStatus;
        this.contentRating = contentRating;
        this.recommendations = recommendations;
        this.errors = errors;
        this.warnings = warnings;
    }



    /**
     * Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @return offerId
     */
    public String getOfferId() {
        return offerId;
    }

    public void setOfferId(String offerId) {
        this.offerId = offerId;
    }

    /**
     * Get mapping
     * @return mapping
     */
    public GetMappingDTO getMapping() {
        return mapping;
    }

    public void setMapping(GetMappingDTO mapping) {
        this.mapping = mapping;
    }

    /**
     * Список характеристик с их значениями. 
     * @return parameterValues
     */
    public List<@Valid ParameterValueDTO> getParameterValues() {
        return parameterValues;
    }

    public void setParameterValues(List<@Valid ParameterValueDTO> parameterValues) {
        this.parameterValues = parameterValues;
    }

    /**
     * Get cardStatus
     * @return cardStatus
     */
    public OfferCardStatusType getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(OfferCardStatusType cardStatus) {
        this.cardStatus = cardStatus;
    }

    /**
     * Процент заполненности карточки.
     * @return contentRating
     */
    public Integer getContentRating() {
        return contentRating;
    }

    public void setContentRating(Integer contentRating) {
        this.contentRating = contentRating;
    }

    /**
     * Список рекомендаций к заполнению карточки.  Рекомендации Маркета помогают заполнять карточку так, чтобы покупателям было проще найти ваш товар и решиться на покупку. 
     * @return recommendations
     */
    public List<@Valid OfferCardRecommendationDTO> getRecommendations() {
        return recommendations;
    }

    public void setRecommendations(List<@Valid OfferCardRecommendationDTO> recommendations) {
        this.recommendations = recommendations;
    }

    /**
     * Ошибки в контенте, препятствующие размещению товара на витрине.
     * @return errors
     */
    public List<@Valid OfferErrorDTO> getErrors() {
        return errors;
    }

    public void setErrors(List<@Valid OfferErrorDTO> errors) {
        this.errors = errors;
    }

    /**
     * Связанные с контентом предупреждения, не препятствующие размещению товара на витрине.
     * @return warnings
     */
    public List<@Valid OfferErrorDTO> getWarnings() {
        return warnings;
    }

    public void setWarnings(List<@Valid OfferErrorDTO> warnings) {
        this.warnings = warnings;
    }

    /**
      * Create a string representation of this pojo.
    **/
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

