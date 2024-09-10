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
import org.openapitools.model.OfferContentErrorDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Ошибки и предупреждения, которые появились из-за переданных характеристик.
 */
@Schema(name = "UpdateOfferContentResultDTO", description = "Ошибки и предупреждения, которые появились из-за переданных характеристик.")
@JsonPropertyOrder({
  UpdateOfferContentResultDTO.JSON_PROPERTY_OFFER_ID,
  UpdateOfferContentResultDTO.JSON_PROPERTY_ERRORS,
  UpdateOfferContentResultDTO.JSON_PROPERTY_WARNINGS
})
@JsonTypeName("UpdateOfferContentResultDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class UpdateOfferContentResultDTO {
    public static final String JSON_PROPERTY_OFFER_ID = "offerId";
    private String offerId;

    public static final String JSON_PROPERTY_ERRORS = "errors";
    private List<@Valid OfferContentErrorDTO> errors = null;

    public static final String JSON_PROPERTY_WARNINGS = "warnings";
    private List<@Valid OfferContentErrorDTO> warnings = null;

    public UpdateOfferContentResultDTO(String offerId) {
        this.offerId = offerId;
    }

    public UpdateOfferContentResultDTO offerId(String offerId) {
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
    @Schema(name = "offerId", description = "Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) ", requiredMode = Schema.RequiredMode.REQUIRED)
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

    public UpdateOfferContentResultDTO errors(List<@Valid OfferContentErrorDTO> errors) {
        this.errors = errors;
        return this;
    }

    public UpdateOfferContentResultDTO addErrorsItem(OfferContentErrorDTO errorsItem) {
        if (this.errors == null) {
            this.errors = new ArrayList<>();
        }
        this.errors.add(errorsItem);
        return this;
    }

    /**
     * Ошибки — информация в каталоге не обновится.
     * @return errors
     */
    @Nullable
    @Schema(name = "errors", description = "Ошибки — информация в каталоге не обновится.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_ERRORS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Valid OfferContentErrorDTO> getErrors() {
        return errors;
    }

    @JsonProperty(JSON_PROPERTY_ERRORS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setErrors(List<@Valid OfferContentErrorDTO> errors) {
        this.errors = errors;
    }

    public UpdateOfferContentResultDTO warnings(List<@Valid OfferContentErrorDTO> warnings) {
        this.warnings = warnings;
        return this;
    }

    public UpdateOfferContentResultDTO addWarningsItem(OfferContentErrorDTO warningsItem) {
        if (this.warnings == null) {
            this.warnings = new ArrayList<>();
        }
        this.warnings.add(warningsItem);
        return this;
    }

    /**
     * Предупреждения — информация в каталоге обновится.
     * @return warnings
     */
    @Nullable
    @Schema(name = "warnings", description = "Предупреждения — информация в каталоге обновится.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_WARNINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public List<@Valid OfferContentErrorDTO> getWarnings() {
        return warnings;
    }

    @JsonProperty(JSON_PROPERTY_WARNINGS)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setWarnings(List<@Valid OfferContentErrorDTO> warnings) {
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
        UpdateOfferContentResultDTO updateOfferContentResultDTO = (UpdateOfferContentResultDTO) o;
        return Objects.equals(this.offerId, updateOfferContentResultDTO.offerId) &&
            Objects.equals(this.errors, updateOfferContentResultDTO.errors) &&
            Objects.equals(this.warnings, updateOfferContentResultDTO.warnings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offerId, errors, warnings);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateOfferContentResultDTO {\n");
        sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
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

