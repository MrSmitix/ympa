package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Ставка налога на добавленную стоимость (НДС) на товар:  * &#x60;NO_VAT&#x60; — НДС не облагается, используется только для отдельных видов услуг.  * &#x60;VAT_0&#x60; — НДС 0%. Например, используется при продаже товаров, вывезенных в таможенной процедуре экспорта, или при оказании услуг по международной перевозке товаров.  * &#x60;VAT_10&#x60; — НДС 10%. Например, используется при реализации отдельных продовольственных и медицинских товаров.  * &#x60;VAT_10_110&#x60; — НДС 10/110. Расчетная ставка НДС 10%, применяется только при предоплате.  * &#x60;VAT_20&#x60; — НДС 20%. Основная ставка с 2019 года.  * &#x60;VAT_20_120&#x60; — НДС 20/120. Расчетная ставка НДС 20%, применяется только при предоплате.  * &#x60;VAT_18&#x60; — НДС 18%. Основная ставка до 2019 года.  * &#x60;VAT_18_118&#x60; — НДС 18/118. Ставка использовалась до 1 января 2019 года при предоплате.  * &#x60;UNKNOWN_VALUE&#x60; — неизвестный тип.  Используется только совместно с параметром &#x60;payment-method&#x3D;YANDEX&#x60;. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum OrderVatType {

    @JsonProperty("NO_VAT") NO_VAT(String.valueOf("NO_VAT")), @JsonProperty("VAT_0") VAT_0(String.valueOf("VAT_0")), @JsonProperty("VAT_10") VAT_10(String.valueOf("VAT_10")), @JsonProperty("VAT_10_110") VAT_10_110(String.valueOf("VAT_10_110")), @JsonProperty("VAT_20") VAT_20(String.valueOf("VAT_20")), @JsonProperty("VAT_20_120") VAT_20_120(String.valueOf("VAT_20_120")), @JsonProperty("VAT_18") VAT_18(String.valueOf("VAT_18")), @JsonProperty("VAT_18_118") VAT_18_118(String.valueOf("VAT_18_118")), @JsonProperty("UNKNOWN_VALUE") UNKNOWN_VALUE(String.valueOf("UNKNOWN_VALUE"));


    private String value;

    OrderVatType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static OrderVatType fromValue(String value) {
        for (OrderVatType b : OrderVatType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



