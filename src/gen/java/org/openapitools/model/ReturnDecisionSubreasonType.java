package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Детали причин возврата:   * &#x60;DO_NOT_FIT&#x60;:     * &#x60;USER_DID_NOT_LIKE&#x60; — товар не понравился.     * &#x60;USER_CHANGED_MIND&#x60; — передумал покупать.     * &#x60;DELIVERED_TOO_LONG&#x60; — длительный срок доставки, поэтому передумал.    * &#x60;BAD_QUALITY&#x60;:     * &#x60;BAD_PACKAGE&#x60; — упаковка товара была нарушена.     * &#x60;DAMAGED&#x60; — царапины, сколы.     * &#x60;NOT_WORKING&#x60; — не включается / не работает.     * &#x60;INCOMPLETENESS&#x60; — некомплект (не хватает детали в наборе, к товару).    * &#x60;WRONG_ITEM&#x60;:     * &#x60;WRONG_ITEM&#x60; — не тот товар.     * &#x60;WRONG_COLOR&#x60; — не соответствует по цвету.     * &#x60;DID_NOT_MATCH_DESCRIPTION&#x60; — не соответствует заявленным характеристикам/описанию. 
 */
public enum ReturnDecisionSubreasonType {
  
  USER_DID_NOT_LIKE("USER_DID_NOT_LIKE"),
  
  USER_CHANGED_MIND("USER_CHANGED_MIND"),
  
  DELIVERED_TOO_LONG("DELIVERED_TOO_LONG"),
  
  BAD_PACKAGE("BAD_PACKAGE"),
  
  DAMAGED("DAMAGED"),
  
  NOT_WORKING("NOT_WORKING"),
  
  INCOMPLETENESS("INCOMPLETENESS"),
  
  WRONG_ITEM("WRONG_ITEM"),
  
  WRONG_COLOR("WRONG_COLOR"),
  
  DID_NOT_MATCH_DESCRIPTION("DID_NOT_MATCH_DESCRIPTION"),
  
  UNKNOWN("UNKNOWN");

  private String value;

  ReturnDecisionSubreasonType(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static ReturnDecisionSubreasonType fromString(String s) {
      for (ReturnDecisionSubreasonType b : ReturnDecisionSubreasonType.values()) {
        // using Objects.toString() to be safe if value type non-object type
        // because types like 'int' etc. will be auto-boxed
        if (java.util.Objects.toString(b.value).equals(s)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected string value '" + s + "'");
    }

  @Override
  @JsonValue
  public String toString() {
    return String.valueOf(value);
  }

  @JsonCreator
  public static ReturnDecisionSubreasonType fromValue(String value) {
    for (ReturnDecisionSubreasonType b : ReturnDecisionSubreasonType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


