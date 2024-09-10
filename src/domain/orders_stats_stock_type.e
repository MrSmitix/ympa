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
class ORDERS_STATS_STOCK_TYPE

feature -- Access

  value: detachable STRING_32
      -- enumerated value.
    note
            option: stable
    attribute
    end

feature -- Enum

 val_fit: ORDERS_STATS_STOCK_TYPE
    once
      create Result
      Result.set_value ("FIT")
    end

 val_freeze: ORDERS_STATS_STOCK_TYPE
    once
      create Result
      Result.set_value ("FREEZE")
    end

 val_available: ORDERS_STATS_STOCK_TYPE
    once
      create Result
      Result.set_value ("AVAILABLE")
    end

 val_quarantine: ORDERS_STATS_STOCK_TYPE
    once
      create Result
      Result.set_value ("QUARANTINE")
    end

 val_utilization: ORDERS_STATS_STOCK_TYPE
    once
      create Result
      Result.set_value ("UTILIZATION")
    end

 val_defect: ORDERS_STATS_STOCK_TYPE
    once
      create Result
      Result.set_value ("DEFECT")
    end

 val_expired: ORDERS_STATS_STOCK_TYPE
    once
      create Result
      Result.set_value ("EXPIRED")
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

