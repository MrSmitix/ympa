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
class SEARCH_SHIPMENTS_RESPONSE_DTO




feature --Access

    shipments: detachable LIST [SHIPMENT_INFO_DTO]
      -- Список с информацией об отгрузках.
    paging: detachable FORWARD_SCROLLING_PAGER_DTO
      

feature -- Change Element

    set_shipments (a_name: like shipments)
        -- Set 'shipments' with 'a_name'.
      do
        shipments := a_name
      ensure
        shipments_set: shipments = a_name
      end

    set_paging (a_name: like paging)
        -- Set 'paging' with 'a_name'.
      do
        paging := a_name
      ensure
        paging_set: paging = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass SEARCH_SHIPMENTS_RESPONSE_DTO%N")
        if attached shipments as l_shipments then
          across l_shipments as ic loop
            Result.append ("%N shipments:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached paging as l_paging then
          Result.append ("%Npaging:")
          Result.append (l_paging.out)
          Result.append ("%N")
        end
      end
end

