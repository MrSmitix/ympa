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
class TIME_UNIT_TYPE

feature -- Access

  value: detachable STRING_32
      -- enumerated value.
    note
            option: stable
    attribute
    end

feature -- Enum

 val_hour: TIME_UNIT_TYPE
    once
      create Result
      Result.set_value ("HOUR")
    end

 val_day: TIME_UNIT_TYPE
    once
      create Result
      Result.set_value ("DAY")
    end

 val_week: TIME_UNIT_TYPE
    once
      create Result
      Result.set_value ("WEEK")
    end

 val_month: TIME_UNIT_TYPE
    once
      create Result
      Result.set_value ("MONTH")
    end

 val_year: TIME_UNIT_TYPE
    once
      create Result
      Result.set_value ("YEAR")
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

