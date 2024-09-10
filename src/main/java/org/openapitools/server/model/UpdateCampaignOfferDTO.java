package org.openapitools.server.model;

import org.openapitools.server.model.QuantumDTO;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Параметры размещения товара в магазине.
 */
public class UpdateCampaignOfferDTO   {

    private String offerId;
    private QuantumDTO quantum;
    private Boolean available;
    private Integer vat;

    /**
     * Default constructor.
     */
    public UpdateCampaignOfferDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create UpdateCampaignOfferDTO.
     *
     * @param offerId Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
     * @param quantum quantum
     * @param available Есть ли товар в продаже. 
     * @param vat Ставка НДС, применяемая для товара. Задается цифрой:  * &#x60;2&#x60; — 10%. * &#x60;5&#x60; — 0%. * &#x60;6&#x60; — не облагается НДС. * &#x60;7&#x60; — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете продавца на Маркете. 
     */
    public UpdateCampaignOfferDTO(
        String offerId, 
        QuantumDTO quantum, 
        Boolean available, 
        Integer vat
    ) {
        this.offerId = offerId;
        this.quantum = quantum;
        this.available = available;
        this.vat = vat;
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
     * Ставка НДС, применяемая для товара. Задается цифрой:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете продавца на Маркете. 
     * @return vat
     */
    public Integer getVat() {
        return vat;
    }

    public void setVat(Integer vat) {
        this.vat = vat;
    }

    /**
      * Create a string representation of this pojo.
    **/
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
    private static String toIndentedString(Object o) {
        if (o == null) {
          return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

