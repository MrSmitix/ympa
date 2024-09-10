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
class OFFER_CONTENT_ERROR_TYPE

feature -- Access

  value: detachable STRING_32
      -- enumerated value.
    note
            option: stable
    attribute
    end

feature -- Enum

 val_offer_not_found: OFFER_CONTENT_ERROR_TYPE
    once
      create Result
      Result.set_value ("OFFER_NOT_FOUND")
    end

 val_unknown_category: OFFER_CONTENT_ERROR_TYPE
    once
      create Result
      Result.set_value ("UNKNOWN_CATEGORY")
    end

 val_category_mismatch: OFFER_CONTENT_ERROR_TYPE
    once
      create Result
      Result.set_value ("CATEGORY_MISMATCH")
    end

 val_unknown_parameter: OFFER_CONTENT_ERROR_TYPE
    once
      create Result
      Result.set_value ("UNKNOWN_PARAMETER")
    end

 val_unexpected_boolean_value: OFFER_CONTENT_ERROR_TYPE
    once
      create Result
      Result.set_value ("UNEXPECTED_BOOLEAN_VALUE")
    end

 val_number_format: OFFER_CONTENT_ERROR_TYPE
    once
      create Result
      Result.set_value ("NUMBER_FORMAT")
    end

 val_value_blank: OFFER_CONTENT_ERROR_TYPE
    once
      create Result
      Result.set_value ("VALUE_BLANK")
    end

 val_invalid_unit_id: OFFER_CONTENT_ERROR_TYPE
    once
      create Result
      Result.set_value ("INVALID_UNIT_ID")
    end

 val_invalid_group_id_length: OFFER_CONTENT_ERROR_TYPE
    once
      create Result
      Result.set_value ("INVALID_GROUP_ID_LENGTH")
    end

 val_invalid_group_id_characters: OFFER_CONTENT_ERROR_TYPE
    once
      create Result
      Result.set_value ("INVALID_GROUP_ID_CHARACTERS")
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

