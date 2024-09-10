package org.openapitools.model;

import io.swagger.annotations.ApiModel;


/**
 * Услуга Маркета или дополнительный тариф к услуге размещения:  * &#x60;AGENCY_COMMISSION&#x60; — прием платежа покупателя.  * &#x60;PAYMENT_TRANSFER&#x60; — перевод платежа покупателя.  * &#x60;STORAGE&#x60; — хранение товара на складе Маркета в течение суток.  * &#x60;SURPLUS&#x60; — хранение излишков на складе Маркета.  * &#x60;WITHDRAW&#x60; — вывоз товара со склада Маркета.  * &#x60;FEE&#x60; — размещение товара на Маркете.  * &#x60;DELIVERY_TO_CUSTOMER&#x60; — доставка покупателю.  * &#x60;CROSSREGIONAL_DELIVERY&#x60; — доставка в федеральный округ, город или населенный пункт.  * &#x60;CROSSREGIONAL_DELIVERY_RETURN&#x60; — доставка невыкупов и возвратов.  * &#x60;DISPOSAL&#x60; — утилизация.  * &#x60;SORTING_CENTER_STORAGE&#x60; — хранение невыкупов и возвратов.  * &#x60;EXPRESS_DELIVERY&#x60; — экспресс-доставка покупателю.  * &#x60;FF_XDOC_SUPPLY_BOX&#x60; — поставка товара через транзитный склад (за короб).  * &#x60;FF_XDOC_SUPPLY_PALLET&#x60; — поставка товара через транзитный склад (за палету).  * &#x60;SORTING&#x60; — обработка заказа.  * &#x60;MIDDLE_MILE&#x60; — средняя миля.  * &#x60;RETURN_PROCESSING&#x60; — обработка невыкупов и возвратов.  * &#x60;EXPRESS_CANCELLED_BY_PARTNER&#x60; — отмена заказа с экспресс-доставкой.  * &#x60;DELIVERY_TO_CUSTOMER_RETURN&#x60; — возврат доставляемого товара на склад.  * &#x60;CROSSBORDER_DELIVERY&#x60; — доставка из-за рубежа.  * &#x60;INTAKE_SORTING_BULKY_CARGO&#x60; — сортировка заказов с крупногабаритными товарами, которые Маркет забрал со склада продавца.  * &#x60;INTAKE_SORTING_SMALL_GOODS&#x60; — сортировка заказов с малогабаритными товарами, которые Маркет забрал со склада продавца.  * &#x60;INTAKE_SORTING_DAILY&#x60; — организация забора заказов со склада продавца.  * &#x60;FF_STORAGE_BILLING&#x60; — хранения товаров на складе.  * &#x60;CANCELLED_ORDER_FEE_QI&#x60; — отмена заказа по вине продавца.  * &#x60;LATE_ORDER_EXECUTION_FEE_QI&#x60; — несвоевременная отгрузка или доставка.  Подробнее об услугах Маркета читайте [в Справке Маркета для продавцов](https://yandex.ru/support/marketplace/introduction/rates/index.html). 
 */
public enum TariffType {
  
  AGENCY_COMMISSION("AGENCY_COMMISSION"),
  
  PAYMENT_TRANSFER("PAYMENT_TRANSFER"),
  
  STORAGE("STORAGE"),
  
  WITHDRAW("WITHDRAW"),
  
  SURPLUS("SURPLUS"),
  
  FEE("FEE"),
  
  DELIVERY_TO_CUSTOMER("DELIVERY_TO_CUSTOMER"),
  
  CROSSREGIONAL_DELIVERY("CROSSREGIONAL_DELIVERY"),
  
  CROSSREGIONAL_DELIVERY_RETURN("CROSSREGIONAL_DELIVERY_RETURN"),
  
  DISPOSAL("DISPOSAL"),
  
  SORTING_CENTER_STORAGE("SORTING_CENTER_STORAGE"),
  
  EXPRESS_DELIVERY("EXPRESS_DELIVERY"),
  
  FF_XDOC_SUPPLY_BOX("FF_XDOC_SUPPLY_BOX"),
  
  FF_XDOC_SUPPLY_PALLET("FF_XDOC_SUPPLY_PALLET"),
  
  SORTING("SORTING"),
  
  MIDDLE_MILE("MIDDLE_MILE"),
  
  RETURN_PROCESSING("RETURN_PROCESSING"),
  
  EXPRESS_CANCELLED_BY_PARTNER("EXPRESS_CANCELLED_BY_PARTNER"),
  
  DELIVERY_TO_CUSTOMER_RETURN("DELIVERY_TO_CUSTOMER_RETURN"),
  
  CROSSBORDER_DELIVERY("CROSSBORDER_DELIVERY"),
  
  INTAKE_SORTING_BULKY_CARGO("INTAKE_SORTING_BULKY_CARGO"),
  
  INTAKE_SORTING_SMALL_GOODS("INTAKE_SORTING_SMALL_GOODS"),
  
  INTAKE_SORTING_DAILY("INTAKE_SORTING_DAILY"),
  
  FF_STORAGE_BILLING("FF_STORAGE_BILLING"),
  
  CANCELLED_ORDER_FEE_QI("CANCELLED_ORDER_FEE_QI"),
  
  LATE_ORDER_EXECUTION_FEE_QI("LATE_ORDER_EXECUTION_FEE_QI");

  private String value;

  TariffType(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static TariffType fromValue(String value) {
    for (TariffType b : TariffType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

}

