package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.openapitools.server.model.CurrencyType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Цена с указанием ставки НДС и времени последнего обновления.
 */
public class GetPriceWithVatDTO   {

    private BigDecimal value;
    private BigDecimal discountBase;
    private CurrencyType currencyId;
    private Integer vat;
    private OffsetDateTime updatedAt;

    /**
     * Default constructor.
     */
    public GetPriceWithVatDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetPriceWithVatDTO.
     *
     * @param value Цена на товар.
     * @param discountBase Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
     * @param currencyId currencyId
     * @param vat Идентификатор ставки НДС, применяемой для товара:  * &#x60;2&#x60; — 10%. * &#x60;5&#x60; — 0%. * &#x60;6&#x60; — не облагается НДС. * &#x60;7&#x60; — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. 
     * @param updatedAt Время последнего обновления.
     */
    public GetPriceWithVatDTO(
        BigDecimal value, 
        BigDecimal discountBase, 
        CurrencyType currencyId, 
        Integer vat, 
        OffsetDateTime updatedAt
    ) {
        this.value = value;
        this.discountBase = discountBase;
        this.currencyId = currencyId;
        this.vat = vat;
        this.updatedAt = updatedAt;
    }



    /**
     * Цена на товар.
     * @return value
     */
    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    /**
     * Цена на товар без скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
     * @return discountBase
     */
    public BigDecimal getDiscountBase() {
        return discountBase;
    }

    public void setDiscountBase(BigDecimal discountBase) {
        this.discountBase = discountBase;
    }

    /**
     * Get currencyId
     * @return currencyId
     */
    public CurrencyType getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(CurrencyType currencyId) {
        this.currencyId = currencyId;
    }

    /**
     * Идентификатор ставки НДС, применяемой для товара:  * `2` — 10%. * `5` — 0%. * `6` — не облагается НДС. * `7` — 20%.  Если параметр не указан, используется ставка НДС, установленная в кабинете. 
     * @return vat
     */
    public Integer getVat() {
        return vat;
    }

    public void setVat(Integer vat) {
        this.vat = vat;
    }

    /**
     * Время последнего обновления.
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    /**
      * Create a string representation of this pojo.
    **/
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GetPriceWithVatDTO {\n");
        
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    discountBase: ").append(toIndentedString(discountBase)).append("\n");
        sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
        sb.append("    vat: ").append(toIndentedString(vat)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

