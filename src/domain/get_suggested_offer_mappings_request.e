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
class GET_SUGGESTED_OFFER_MAPPINGS_REQUEST




feature --Access

    offers: detachable LIST [SUGGESTED_OFFER_DTO]
      -- Список товаров.

feature -- Change Element

    set_offers (a_name: like offers)
        -- Set 'offers' with 'a_name'.
      do
        offers := a_name
      ensure
        offers_set: offers = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass GET_SUGGESTED_OFFER_MAPPINGS_REQUEST%N")
        if attached offers as l_offers then
          across l_offers as ic loop
            Result.append ("%N offers:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
      end
end

