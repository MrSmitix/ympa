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
import org.openapitools.model.AddOffersToArchiveErrorType;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Товар, который не удалось поместить в архив.
 */
@Schema(name = "AddOffersToArchiveErrorDTO", description = "Товар, который не удалось поместить в архив.")
@JsonPropertyOrder({
  AddOffersToArchiveErrorDTO.JSON_PROPERTY_OFFER_ID,
  AddOffersToArchiveErrorDTO.JSON_PROPERTY_ERROR
})
@JsonTypeName("AddOffersToArchiveErrorDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class AddOffersToArchiveErrorDTO {
    public static final String JSON_PROPERTY_OFFER_ID = "offerId";
    private String offerId;

    public static final String JSON_PROPERTY_ERROR = "error";
    private AddOffersToArchiveErrorType error;

    public AddOffersToArchiveErrorDTO(String offerId, AddOffersToArchiveErrorType error) {
        this.offerId = offerId;
        this.error = error;
    }

    public AddOffersToArchiveErrorDTO offerId(String offerId) {
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

    public AddOffersToArchiveErrorDTO error(AddOffersToArchiveErrorType error) {
        this.error = error;
        return this;
    }

    /**
     * Get error
     * @return error
     */
    @NotNull
    @Schema(name = "error", requiredMode = Schema.RequiredMode.REQUIRED)
    @JsonProperty(JSON_PROPERTY_ERROR)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public AddOffersToArchiveErrorType getError() {
        return error;
    }

    @JsonProperty(JSON_PROPERTY_ERROR)
    @JsonInclude(value = JsonInclude.Include.ALWAYS)
    public void setError(AddOffersToArchiveErrorType error) {
        this.error = error;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AddOffersToArchiveErrorDTO addOffersToArchiveErrorDTO = (AddOffersToArchiveErrorDTO) o;
        return Objects.equals(this.offerId, addOffersToArchiveErrorDTO.offerId) &&
            Objects.equals(this.error, addOffersToArchiveErrorDTO.error);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offerId, error);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AddOffersToArchiveErrorDTO {\n");
        sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
        sb.append("    error: ").append(toIndentedString(error)).append("\n");
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

