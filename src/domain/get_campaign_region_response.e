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
class GET_CAMPAIGN_REGION_RESPONSE




feature --Access

    region: detachable REGION_DTO
      

feature -- Change Element

    set_region (a_name: like region)
        -- Set 'region' with 'a_name'.
      do
        region := a_name
      ensure
        region_set: region = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass GET_CAMPAIGN_REGION_RESPONSE%N")
        if attached region as l_region then
          Result.append ("%Nregion:")
          Result.append (l_region.out)
          Result.append ("%N")
        end
      end
end

