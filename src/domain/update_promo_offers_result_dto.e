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
class UPDATE_PROMO_OFFERS_RESULT_DTO




feature --Access

    rejected_offers: detachable LIST [REJECTED_PROMO_OFFER_UPDATE_DTO]
      -- Изменения, которые были отклонены.  Возвращается, только если есть отклоненные изменения. 
    warning_offers: detachable LIST [WARNING_PROMO_OFFER_UPDATE_DTO]
      -- Изменения, по которым есть предупреждения. Они информируют о возможных проблемах. Информация о товарах обновится.  Возвращается, только если есть предупреждения. 

feature -- Change Element

    set_rejected_offers (a_name: like rejected_offers)
        -- Set 'rejected_offers' with 'a_name'.
      do
        rejected_offers := a_name
      ensure
        rejected_offers_set: rejected_offers = a_name
      end

    set_warning_offers (a_name: like warning_offers)
        -- Set 'warning_offers' with 'a_name'.
      do
        warning_offers := a_name
      ensure
        warning_offers_set: warning_offers = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass UPDATE_PROMO_OFFERS_RESULT_DTO%N")
        if attached rejected_offers as l_rejected_offers then
          across l_rejected_offers as ic loop
            Result.append ("%N rejected_offers:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached warning_offers as l_warning_offers then
          across l_warning_offers as ic loop
            Result.append ("%N warning_offers:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
      end
end

