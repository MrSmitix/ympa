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
class GET_OFFER_MAPPING_DTO




feature --Access

    offer: detachable GET_OFFER_DTO
      
    mapping: detachable GET_MAPPING_DTO
      

feature -- Change Element

    set_offer (a_name: like offer)
        -- Set 'offer' with 'a_name'.
      do
        offer := a_name
      ensure
        offer_set: offer = a_name
      end

    set_mapping (a_name: like mapping)
        -- Set 'mapping' with 'a_name'.
      do
        mapping := a_name
      ensure
        mapping_set: mapping = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass GET_OFFER_MAPPING_DTO%N")
        if attached offer as l_offer then
          Result.append ("%Noffer:")
          Result.append (l_offer.out)
          Result.append ("%N")
        end
        if attached mapping as l_mapping then
          Result.append ("%Nmapping:")
          Result.append (l_mapping.out)
          Result.append ("%N")
        end
      end
end

