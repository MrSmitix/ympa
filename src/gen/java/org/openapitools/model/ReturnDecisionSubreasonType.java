package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

/**
 * Детали причин возврата:   * &#x60;DO_NOT_FIT&#x60;:     * &#x60;USER_DID_NOT_LIKE&#x60; — товар не понравился.     * &#x60;USER_CHANGED_MIND&#x60; — передумал покупать.     * &#x60;DELIVERED_TOO_LONG&#x60; — длительный срок доставки, поэтому передумал.    * &#x60;BAD_QUALITY&#x60;:     * &#x60;BAD_PACKAGE&#x60; — упаковка товара была нарушена.     * &#x60;DAMAGED&#x60; — царапины, сколы.     * &#x60;NOT_WORKING&#x60; — не включается / не работает.     * &#x60;INCOMPLETENESS&#x60; — некомплект (не хватает детали в наборе, к товару).    * &#x60;WRONG_ITEM&#x60;:     * &#x60;WRONG_ITEM&#x60; — не тот товар.     * &#x60;WRONG_COLOR&#x60; — не соответствует по цвету.     * &#x60;DID_NOT_MATCH_DESCRIPTION&#x60; — не соответствует заявленным характеристикам/описанию. 
 **/
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.fasterxml.jackson.annotation.JsonProperty;

public enum ReturnDecisionSubreasonType {

    @JsonProperty("USER_DID_NOT_LIKE") USER_DID_NOT_LIKE(String.valueOf("USER_DID_NOT_LIKE")), @JsonProperty("USER_CHANGED_MIND") USER_CHANGED_MIND(String.valueOf("USER_CHANGED_MIND")), @JsonProperty("DELIVERED_TOO_LONG") DELIVERED_TOO_LONG(String.valueOf("DELIVERED_TOO_LONG")), @JsonProperty("BAD_PACKAGE") BAD_PACKAGE(String.valueOf("BAD_PACKAGE")), @JsonProperty("DAMAGED") DAMAGED(String.valueOf("DAMAGED")), @JsonProperty("NOT_WORKING") NOT_WORKING(String.valueOf("NOT_WORKING")), @JsonProperty("INCOMPLETENESS") INCOMPLETENESS(String.valueOf("INCOMPLETENESS")), @JsonProperty("WRONG_ITEM") WRONG_ITEM(String.valueOf("WRONG_ITEM")), @JsonProperty("WRONG_COLOR") WRONG_COLOR(String.valueOf("WRONG_COLOR")), @JsonProperty("DID_NOT_MATCH_DESCRIPTION") DID_NOT_MATCH_DESCRIPTION(String.valueOf("DID_NOT_MATCH_DESCRIPTION")), @JsonProperty("UNKNOWN") UNKNOWN(String.valueOf("UNKNOWN"));


    private String value;

    ReturnDecisionSubreasonType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    @Override
    public String toString() {
        return String.valueOf(value);
    }

    public static ReturnDecisionSubreasonType fromValue(String value) {
        for (ReturnDecisionSubreasonType b : ReturnDecisionSubreasonType.values()) {
            if (b.value.equals(value)) {
                return b;
            }
        }
        throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
}



