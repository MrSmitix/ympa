package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Тип уценки:  * &#x60;PREOWNED&#x60; —  бывший в употреблении товар, раньше принадлежал другому человеку. * &#x60;SHOWCASESAMPLE&#x60; — витринный образец. * &#x60;REFURBISHED&#x60; — повторная продажа товара. * &#x60;REDUCTION&#x60; — товар с дефектами. * &#x60;RENOVATED&#x60; — восстановленный товар. * &#x60;NOT_SPECIFIED&#x60; — не выбран.  &#x60;REFURBISHED&#x60; — специальное значение для одежды, обуви и аксессуаров. Используется только для уцененных товаров из этой категории. Другие значения для одежды, обуви и аксессуаров не используются. 
 */
public enum OfferConditionType {
  
  PREOWNED("PREOWNED"),
  
  SHOWCASESAMPLE("SHOWCASESAMPLE"),
  
  REFURBISHED("REFURBISHED"),
  
  REDUCTION("REDUCTION"),
  
  RENOVATED("RENOVATED"),
  
  NOT_SPECIFIED("NOT_SPECIFIED");

  private String value;

  OfferConditionType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static OfferConditionType fromValue(String value) {
    for (OfferConditionType b : OfferConditionType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

