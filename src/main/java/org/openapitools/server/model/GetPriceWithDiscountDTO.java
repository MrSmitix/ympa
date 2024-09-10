package org.openapitools.server.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.math.BigDecimal;
import java.time.OffsetDateTime;
import org.openapitools.server.model.CurrencyType;
import jakarta.validation.constraints.*;
import jakarta.validation.Valid;


/**
 * Цена с указанием скидки и времени последнего обновления.
 */
public class GetPriceWithDiscountDTO   {

    private BigDecimal value;
    private CurrencyType currencyId;
    private BigDecimal discountBase;
    private OffsetDateTime updatedAt;

    /**
     * Default constructor.
     */
    public GetPriceWithDiscountDTO() {
    // JSON-B / Jackson
    }

    /**
     * Create GetPriceWithDiscountDTO.
     *
     * @param value Значение.
     * @param currencyId currencyId
     * @param discountBase Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
     * @param updatedAt Время последнего обновления.
     */
    public GetPriceWithDiscountDTO(
        BigDecimal value, 
        CurrencyType currencyId, 
        BigDecimal discountBase, 
        OffsetDateTime updatedAt
    ) {
        this.value = value;
        this.currencyId = currencyId;
        this.discountBase = discountBase;
        this.updatedAt = updatedAt;
    }



    /**
     * Значение.
     * minimum: 0
     * @return value
     */
    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
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
     * Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
     * minimum: 0
     * @return discountBase
     */
    public BigDecimal getDiscountBase() {
        return discountBase;
    }

    public void setDiscountBase(BigDecimal discountBase) {
        this.discountBase = discountBase;
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
        sb.append("class GetPriceWithDiscountDTO {\n");
        
        sb.append("    value: ").append(toIndentedString(value)).append("\n");
        sb.append("    currencyId: ").append(toIndentedString(currencyId)).append("\n");
        sb.append("    discountBase: ").append(toIndentedString(discountBase)).append("\n");
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

