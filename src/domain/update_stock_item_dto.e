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
class UPDATE_STOCK_ITEM_DTO




feature --Access

    count: INTEGER_64
      -- Количество доступного товара. 
    updated_at: detachable DATE_TIME
      -- Дата и время последнего обновления информации об остатках. <br><br> Если вы не передали параметр `updatedAt`, используется текущее время. <br><br> Формат даты и времени: ISO 8601 со смещением относительно UTC. Например, `2017-11-21T00:42:42+03:00`. 

feature -- Change Element

    set_count (a_name: like count)
        -- Set 'count' with 'a_name'.
      do
        count := a_name
      ensure
        count_set: count = a_name
      end

    set_updated_at (a_name: like updated_at)
        -- Set 'updated_at' with 'a_name'.
      do
        updated_at := a_name
      ensure
        updated_at_set: updated_at = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass UPDATE_STOCK_ITEM_DTO%N")
        if attached count as l_count then
          Result.append ("%Ncount:")
          Result.append (l_count.out)
          Result.append ("%N")
        end
        if attached updated_at as l_updated_at then
          Result.append ("%Nupdated_at:")
          Result.append (l_updated_at.out)
          Result.append ("%N")
        end
      end
end

