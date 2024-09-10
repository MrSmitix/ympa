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
class OFFER_PRICE_LIST_RESPONSE_DTO




feature --Access

    offers: detachable LIST [OFFER_PRICE_RESPONSE_DTO]
      -- Страница списка.
    paging: detachable SCROLLING_PAGER_DTO
      
    total: INTEGER_32
      -- Количество всех цен магазина, измененных через API.

feature -- Change Element

    set_offers (a_name: like offers)
        -- Set 'offers' with 'a_name'.
      do
        offers := a_name
      ensure
        offers_set: offers = a_name
      end

    set_paging (a_name: like paging)
        -- Set 'paging' with 'a_name'.
      do
        paging := a_name
      ensure
        paging_set: paging = a_name
      end

    set_total (a_name: like total)
        -- Set 'total' with 'a_name'.
      do
        total := a_name
      ensure
        total_set: total = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass OFFER_PRICE_LIST_RESPONSE_DTO%N")
        if attached offers as l_offers then
          across l_offers as ic loop
            Result.append ("%N offers:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached paging as l_paging then
          Result.append ("%Npaging:")
          Result.append (l_paging.out)
          Result.append ("%N")
        end
        if attached total as l_total then
          Result.append ("%Ntotal:")
          Result.append (l_total.out)
          Result.append ("%N")
        end
      end
end

