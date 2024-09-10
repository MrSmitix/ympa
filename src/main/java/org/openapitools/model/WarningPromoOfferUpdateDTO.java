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
import org.openapitools.model.PromoOfferUpdateWarningDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;

/**
 * Описание предупреждения, которое появилось при добавлении товара.
 */
@JsonPropertyOrder({
  WarningPromoOfferUpdateDTO.JSON_PROPERTY_OFFER_ID,
  WarningPromoOfferUpdateDTO.JSON_PROPERTY_WARNINGS
})
@JsonTypeName("WarningPromoOfferUpdateDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautClientCodegen", date="2024-09-09T21:59:28.310012434Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class WarningPromoOfferUpdateDTO {
    public static final String JSON_PROPERTY_OFFER_ID = "offerId";
    private String offerId;

    public static final String JSON_PROPERTY_WARNINGS = "warnings";
    private List<@Valid PromoOfferUpdateWarningDTO> warnings = new ArrayList<>();

    public WarningPromoOfferUpdateDTO(String offerId, List<@Valid PromoOfferUpdateWarningDTO> warnings) {
        this.offerId = offerId;
        this.warnings = warnings;
    }

    public WarningPromoOfferUpdateDTO offerId(String offerId) {
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

    public WarningPromoOfferUpdateDTO warnings(List<@Valid PromoOfferUpdateWarningDTO> warnings) {
        this.warnings = warnings;
        return this;
    }

    public WarningPromoOfferUpdateDTO addWarningsItem(PromoOfferUpdateWarningDTO warningsItem) {
        this.warnings.add(warningsItem);
        return this;
    }

    /**
     * Предупреждения, которые появились при добавлении товара в акцию или изменении его цен.
     * @return warnings
     */
    @NotNull
    @JsonProperty(JSON_PROPERTY_WARNINGS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public List<@Valid PromoOfferUpdateWarningDTO> getWarnings() {
        return warnings;
    }

    @JsonProperty(JSON_PROPERTY_WARNINGS)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setWarnings(List<@Valid PromoOfferUpdateWarningDTO> warnings) {
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
        WarningPromoOfferUpdateDTO warningPromoOfferUpdateDTO = (WarningPromoOfferUpdateDTO) o;
        return Objects.equals(this.offerId, warningPromoOfferUpdateDTO.offerId) &&
            Objects.equals(this.warnings, warningPromoOfferUpdateDTO.warnings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offerId, warnings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WarningPromoOfferUpdateDTO {\n");
        sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
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

