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
class OFFER_RECOMMENDATIONS_RESULT_DTO




feature --Access

    paging: detachable SCROLLING_PAGER_DTO
      
    offer_recommendations: detachable LIST [OFFER_RECOMMENDATION_DTO]
      -- Страница списка товаров.

feature -- Change Element

    set_paging (a_name: like paging)
        -- Set 'paging' with 'a_name'.
      do
        paging := a_name
      ensure
        paging_set: paging = a_name
      end

    set_offer_recommendations (a_name: like offer_recommendations)
        -- Set 'offer_recommendations' with 'a_name'.
      do
        offer_recommendations := a_name
      ensure
        offer_recommendations_set: offer_recommendations = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass OFFER_RECOMMENDATIONS_RESULT_DTO%N")
        if attached paging as l_paging then
          Result.append ("%Npaging:")
          Result.append (l_paging.out)
          Result.append ("%N")
        end
        if attached offer_recommendations as l_offer_recommendations then
          across l_offer_recommendations as ic loop
            Result.append ("%N offer_recommendations:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
      end
end

