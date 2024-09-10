package org.openapitools.model;

import io.swagger.annotations.ApiModel;
import javax.validation.constraints.*;
import javax.validation.Valid;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Способ возврата товара покупателем:  * &#x60;SHOP&#x60; — в точку возврата магазина.  * &#x60;DELIVERY_SERVICE&#x60; — отправить курьером.  * &#x60;POST&#x60; — почта. 
 */
public enum RecipientType {
  
  SHOP("SHOP"),
  
  DELIVERY_SERVICE("DELIVERY_SERVICE"),
  
  POST("POST");

  private String value;

  RecipientType(String value) {
    this.value = value;
  }

    /**
     * Convert a String into String, as specified in the
     * <a href="https://download.oracle.com/otndocs/jcp/jaxrs-2_0-fr-eval-spec/index.html">See JAX RS 2.0 Specification, section 3.2, p. 12</a>
     */
    public static RecipientType fromString(String s) {
      for (RecipientType b : RecipientType.values()) {
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
  public static RecipientType fromValue(String value) {
    for (RecipientType b : RecipientType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }
}


