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
class PROMO_PERIOD_DTO




feature --Access

    date_time_from: detachable DATE_TIME
      -- Дата и время начала акции.
    date_time_to: detachable DATE_TIME
      -- Дата и время окончания акции.

feature -- Change Element

    set_date_time_from (a_name: like date_time_from)
        -- Set 'date_time_from' with 'a_name'.
      do
        date_time_from := a_name
      ensure
        date_time_from_set: date_time_from = a_name
      end

    set_date_time_to (a_name: like date_time_to)
        -- Set 'date_time_to' with 'a_name'.
      do
        date_time_to := a_name
      ensure
        date_time_to_set: date_time_to = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass PROMO_PERIOD_DTO%N")
        if attached date_time_from as l_date_time_from then
          Result.append ("%Ndate_time_from:")
          Result.append (l_date_time_from.out)
          Result.append ("%N")
        end
        if attached date_time_to as l_date_time_to then
          Result.append ("%Ndate_time_to:")
          Result.append (l_date_time_to.out)
          Result.append ("%N")
        end
      end
end

