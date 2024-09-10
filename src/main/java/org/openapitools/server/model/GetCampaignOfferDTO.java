package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.openapitools.jackson.nullable.JsonNullable;
import org.openapitools.server.model.GetPriceWithDiscountDTO;
import org.openapitools.server.model.GetPriceWithVatDTO;
import org.openapitools.server.model.OfferCampaignStatusType;
import org.openapitools.server.model.OfferErrorDTO;
import org.openapitools.server.model.QuantumDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Параметры размещения товара в магазине.
 */
public class GetCampaignOfferDTO   {

    private String offerId;
    private QuantumDTO quantum;
    private Boolean available;
    private GetPriceWithDiscountDTO basicPrice;
    private GetPriceWithVatDTO campaignPrice;
    private OfferCampaignStatusType status;
    private List<@Valid OfferErrorDTO> errors;
    private List<@Valid OfferErrorDTO> warnings;

    /**
     * Default constructor.
     */
    public GetCampaignOfferDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetCampaignOfferDTO.
     *
     * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @param quantum quantum
     * @param available Есть ли товар в продаже. 
     * @param basicPrice basicPrice
     * @param campaignPrice campaignPrice
     * @param status status
     * @param errors Ошибки, препятствующие размещению товара на витрине. 
     * @param warnings Предупреждения, не препятствующие размещению товара на витрине. 
     */
    public GetCampaignOfferDTO(
        String offerId, 
        QuantumDTO quantum, 
        Boolean available, 
        GetPriceWithDiscountDTO basicPrice, 
        GetPriceWithVatDTO campaignPrice, 
        OfferCampaignStatusType status, 
        List<@Valid OfferErrorDTO> errors, 
        List<@Valid OfferErrorDTO> warnings
    ) {
        this.offerId = offerId;
        this.quantum = quantum;
        this.available = available;
        this.basicPrice = basicPrice;
        this.campaignPrice = campaignPrice;
        this.status = status;
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
     * Get quantum
     * @return quantum
     */
    public QuantumDTO getQuantum() {
        return quantum;
    }

    public void setQuantum(QuantumDTO quantum) {
        this.quantum = quantum;
    }

    /**
     * Есть ли товар в продаже. 
     * @return available
     */
    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    /**
     * Get basicPrice
     * @return basicPrice
     */
    public GetPriceWithDiscountDTO getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(GetPriceWithDiscountDTO basicPrice) {
        this.basicPrice = basicPrice;
    }

    /**
     * Get campaignPrice
     * @return campaignPrice
     */
    public GetPriceWithVatDTO getCampaignPrice() {
        return campaignPrice;
    }

    public void setCampaignPrice(GetPriceWithVatDTO campaignPrice) {
        this.campaignPrice = campaignPrice;
    }

    /**
     * Get status
     * @return status
     */
    public OfferCampaignStatusType getStatus() {
        return status;
    }

    public void setStatus(OfferCampaignStatusType status) {
        this.status = status;
    }

    /**
     * Ошибки, препятствующие размещению товара на витрине. 
     * @return errors
     */
    public List<@Valid OfferErrorDTO> getErrors() {
        return errors;
    }

    public void setErrors(List<@Valid OfferErrorDTO> errors) {
        this.errors = errors;
    }

    /**
     * Предупреждения, не препятствующие размещению товара на витрине. 
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
        sb.append("class GetCampaignOfferDTO {\n");
        
        sb.append("    offerId: ").append(toIndentedString(offerId)).append("\n");
        sb.append("    quantum: ").append(toIndentedString(quantum)).append("\n");
        sb.append("    available: ").append(toIndentedString(available)).append("\n");
        sb.append("    basicPrice: ").append(toIndentedString(basicPrice)).append("\n");
        sb.append("    campaignPrice: ").append(toIndentedString(campaignPrice)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

