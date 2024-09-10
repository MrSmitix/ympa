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
class GET_QUALITY_RATING_REQUEST




feature --Access

    date_from: detachable DATE
      -- Начало периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть раньше 30 дней от текущей даты. 
    date_to: detachable DATE
      -- Конец периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть позже текущей даты. 
    campaign_ids: detachable LIST [INTEGER_64]
      -- Список идентификаторов магазинов.

feature -- Change Element

    set_date_from (a_name: like date_from)
        -- Set 'date_from' with 'a_name'.
      do
        date_from := a_name
      ensure
        date_from_set: date_from = a_name
      end

    set_date_to (a_name: like date_to)
        -- Set 'date_to' with 'a_name'.
      do
        date_to := a_name
      ensure
        date_to_set: date_to = a_name
      end

    set_campaign_ids (a_name: like campaign_ids)
        -- Set 'campaign_ids' with 'a_name'.
      do
        campaign_ids := a_name
      ensure
        campaign_ids_set: campaign_ids = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass GET_QUALITY_RATING_REQUEST%N")
        if attached date_from as l_date_from then
          Result.append ("%Ndate_from:")
          Result.append (l_date_from.out)
          Result.append ("%N")
        end
        if attached date_to as l_date_to then
          Result.append ("%Ndate_to:")
          Result.append (l_date_to.out)
          Result.append ("%N")
        end
        if attached campaign_ids as l_campaign_ids then
          across l_campaign_ids as ic loop
            Result.append ("%N campaign_ids:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
      end
end

