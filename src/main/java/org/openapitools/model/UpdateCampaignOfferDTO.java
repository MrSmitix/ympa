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
import org.openapitools.model.QuantumDTO;
import com.fasterxml.jackson.annotation.*;

import javax.validation.constraints.*;
import javax.validation.Valid;
import io.micronaut.core.annotation.*;
import javax.annotation.Generated;
import io.swagger.v3.oas.annotations.media.Schema;

/**
 * Параметры размещения товара в магазине.
 */
@Schema(name = "UpdateCampaignOfferDTO", description = "Параметры размещения товара в магазине.")
@JsonPropertyOrder({
  UpdateCampaignOfferDTO.JSON_PROPERTY_OFFER_ID,
  UpdateCampaignOfferDTO.JSON_PROPERTY_QUANTUM,
  UpdateCampaignOfferDTO.JSON_PROPERTY_AVAILABLE,
  UpdateCampaignOfferDTO.JSON_PROPERTY_VAT
})
@JsonTypeName("UpdateCampaignOfferDTO")
@Generated(value="org.openapitools.codegen.languages.JavaMicronautServerCodegen", date="2024-09-09T22:20:41.711842593Z[Etc/UTC]", comments = "Generator version: 7.8.0")
@Introspected
public class UpdateCampaignOfferDTO {
    public static final String JSON_PROPERTY_OFFER_ID = "offerId";
    private String offerId;

    public static final String JSON_PROPERTY_QUANTUM = "quantum";
    private QuantumDTO quantum;

    public static final String JSON_PROPERTY_AVAILABLE = "available";
    private Boolean available;

    public static final String JSON_PROPERTY_VAT = "vat";
    private Integer vat;

    public UpdateCampaignOfferDTO(String offerId) {
        this.offerId = offerId;
    }

    public UpdateCampaignOfferDTO offerId(String offerId) {
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

    public UpdateCampaignOfferDTO quantum(QuantumDTO quantum) {
        this.quantum = quantum;
        return this;
    }

    /**
     * Get quantum
     * @return quantum
     */
    @Valid
    @Nullable
    @Schema(name = "quantum", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_QUANTUM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public QuantumDTO getQuantum() {
        return quantum;
    }

    @JsonProperty(JSON_PROPERTY_QUANTUM)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setQuantum(QuantumDTO quantum) {
        this.quantum = quantum;
    }

    public UpdateCampaignOfferDTO available(Boolean available) {
        this.available = available;
        return this;
    }

    /**
     * Есть ли товар в продаже. 
     * @return available
     */
    @Nullable
    @Schema(name = "available", description = "Есть ли товар в продаже. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_AVAILABLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Boolean getAvailable() {
        return available;
    }

    @JsonProperty(JSON_PROPERTY_AVAILABLE)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public UpdateCampaignOfferDTO vat(Integer vat) {
        this.vat = vat;
        return this;
    }

    /**
     * Ставка НДС, применяемая для товара. Задается цифрой:  * &#x60;2&#x60; — 10%. * &#x60;5&#x60; — 0%. * &#x60;6&#x60; — не облагается НДС. * &#x60;7&#x60; — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете продавца на Маркете. 
     * @return vat
     */
    @Nullable
    @Schema(name = "vat", description = "Ставка НДС, применяемая для товара. Задается цифрой:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете продавца на Маркете. ", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
    @JsonProperty(JSON_PROPERTY_VAT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public Integer getVat() {
        return vat;
    }

    @JsonProperty(JSON_PROPERTY_VAT)
    @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
    public void setVat(Integer vat) {
        this.vat = vat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateCampaignOfferDTO updateCampaignOfferDTO = (UpdateCampaignOfferDTO) o;
        return Objects.equals(this.offerId, updateCampaignOfferDTO.offerId) &&
            Objects.equals(this.quantum, updateCampaignOfferDTO.quantum) &&
            Objects.equals(this.available, updateCampaignOfferDTO.available) &&
            Objects.equals(this.vat, updateCampaignOfferDTO.vat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(offerId, quantum, available, vat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCampaignOfferDTO {\n");
        sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
        sb.append("    quantum: ").append(toIndentedString(quantum)).append("\n");
        sb.append("    available: ").append(toIndentedString(available)).append("\n");
        sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
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

