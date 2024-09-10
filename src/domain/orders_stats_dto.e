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
class ORDERS_STATS_DTO




feature --Access

    orders: detachable LIST [ORDERS_STATS_ORDER_DTO]
      -- Список заказов.
    paging: detachable FORWARD_SCROLLING_PAGER_DTO
      

feature -- Change Element

    set_orders (a_name: like orders)
        -- Set 'orders' with 'a_name'.
      do
        orders := a_name
      ensure
        orders_set: orders = a_name
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
        Result.append("%Nclass ORDERS_STATS_DTO%N")
        if attached orders as l_orders then
          across l_orders as ic loop
            Result.append ("%N orders:")
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

