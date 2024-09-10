note
 description:"[
		Партнерский API Маркета
 		API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
  		The version of the OpenAPI document: LATEST
 	    

  	NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

 		 Do not edit the class manually.
 	]"
	date: "$Date$"
	revision: "$Revision$"
	EIS:"Eiffel openapi generator", "src=https://openapi-generator.tech", "protocol=uri"
class REJECTED_PROMO_OFFER_UPDATE_REASON_TYPE

feature -- Access

  value: detachable STRING_32
      -- enumerated value.
    note
            option: stable
    attribute
    end

feature -- Enum

 val_offer_does_not_exist: REJECTED_PROMO_OFFER_UPDATE_REASON_TYPE
    once
      create Result
      Result.set_value ("OFFER_DOES_NOT_EXIST")
    end

 val_offer_duplication: REJECTED_PROMO_OFFER_UPDATE_REASON_TYPE
    once
      create Result
      Result.set_value ("OFFER_DUPLICATION")
    end

 val_offer_not_eligible_for_promo: REJECTED_PROMO_OFFER_UPDATE_REASON_TYPE
    once
      create Result
      Result.set_value ("OFFER_NOT_ELIGIBLE_FOR_PROMO")
    end

 val_offer_promos_max_byte_size_exceeded: REJECTED_PROMO_OFFER_UPDATE_REASON_TYPE
    once
      create Result
      Result.set_value ("OFFER_PROMOS_MAX_BYTE_SIZE_EXCEEDED")
    end

 val_deadline_for_focus_promos_exceeded: REJECTED_PROMO_OFFER_UPDATE_REASON_TYPE
    once
      create Result
      Result.set_value ("DEADLINE_FOR_FOCUS_PROMOS_EXCEEDED")
    end

 val_empty_old_price: REJECTED_PROMO_OFFER_UPDATE_REASON_TYPE
    once
      create Result
      Result.set_value ("EMPTY_OLD_PRICE")
    end

 val_empty_promo_price: REJECTED_PROMO_OFFER_UPDATE_REASON_TYPE
    once
      create Result
      Result.set_value ("EMPTY_PROMO_PRICE")
    end

 val_max_promo_price_exceeded: REJECTED_PROMO_OFFER_UPDATE_REASON_TYPE
    once
      create Result
      Result.set_value ("MAX_PROMO_PRICE_EXCEEDED")
    end

 val_promo_price_bigger_than_max: REJECTED_PROMO_OFFER_UPDATE_REASON_TYPE
    once
      create Result
      Result.set_value ("PROMO_PRICE_BIGGER_THAN_MAX")
    end

 val_promo_price_smaller_than_min: REJECTED_PROMO_OFFER_UPDATE_REASON_TYPE
    once
      create Result
      Result.set_value ("PROMO_PRICE_SMALLER_THAN_MIN")
    end


feature -- Element Change

  set_value (a_val: like value)
      -- Set `value' with `a_value'.
    do
      value := a_val
    ensure
      value_set: value = a_val
    end


end

