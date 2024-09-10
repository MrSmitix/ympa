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
class DELETE_OFFERS_FROM_ARCHIVE_REQUEST




feature --Access

    offer_ids: detachable LIST [STRING_32]
      -- Список товаров, которые нужно восстановить из архива.

feature -- Change Element

    set_offer_ids (a_name: like offer_ids)
        -- Set 'offer_ids' with 'a_name'.
      do
        offer_ids := a_name
      ensure
        offer_ids_set: offer_ids = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass DELETE_OFFERS_FROM_ARCHIVE_REQUEST%N")
        if attached offer_ids as l_offer_ids then
          across l_offer_ids as ic loop
            Result.append ("%N offer_ids:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
      end
end

