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
class OFFER_PROCESSING_STATUS_TYPE

feature -- Access

  value: detachable STRING_32
      -- enumerated value.
    note
            option: stable
    attribute
    end

feature -- Enum

 val_unknown: OFFER_PROCESSING_STATUS_TYPE
    once
      create Result
      Result.set_value ("UNKNOWN")
    end

 val_ready: OFFER_PROCESSING_STATUS_TYPE
    once
      create Result
      Result.set_value ("READY")
    end

 val_in_work: OFFER_PROCESSING_STATUS_TYPE
    once
      create Result
      Result.set_value ("IN_WORK")
    end

 val_need_info: OFFER_PROCESSING_STATUS_TYPE
    once
      create Result
      Result.set_value ("NEED_INFO")
    end

 val_need_mapping: OFFER_PROCESSING_STATUS_TYPE
    once
      create Result
      Result.set_value ("NEED_MAPPING")
    end

 val_need_content: OFFER_PROCESSING_STATUS_TYPE
    once
      create Result
      Result.set_value ("NEED_CONTENT")
    end

 val_content_processing: OFFER_PROCESSING_STATUS_TYPE
    once
      create Result
      Result.set_value ("CONTENT_PROCESSING")
    end

 val_suspended: OFFER_PROCESSING_STATUS_TYPE
    once
      create Result
      Result.set_value ("SUSPENDED")
    end

 val_rejected: OFFER_PROCESSING_STATUS_TYPE
    once
      create Result
      Result.set_value ("REJECTED")
    end

 val_review: OFFER_PROCESSING_STATUS_TYPE
    once
      create Result
      Result.set_value ("REVIEW")
    end

 val_create_error: OFFER_PROCESSING_STATUS_TYPE
    once
      create Result
      Result.set_value ("CREATE_ERROR")
    end

 val_update_error: OFFER_PROCESSING_STATUS_TYPE
    once
      create Result
      Result.set_value ("UPDATE_ERROR")
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

