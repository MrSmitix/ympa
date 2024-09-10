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
class RETURN_ITEM_DTO




feature --Access

    market_sku: INTEGER_64
      -- SKU на Маркете.
    shop_sku: detachable STRING_32
      -- Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    count: INTEGER_64
      -- Количество единиц товара.
    decisions: detachable LIST [RETURN_DECISION_DTO]
      -- Список решений по возврату.
    instances: detachable LIST [RETURN_INSTANCE_DTO]
      -- Список логистических позиций возврата.
    tracks: detachable LIST [TRACK_DTO]
      -- Список трек-кодов для почтовых отправлений.

feature -- Change Element

    set_market_sku (a_name: like market_sku)
        -- Set 'market_sku' with 'a_name'.
      do
        market_sku := a_name
      ensure
        market_sku_set: market_sku = a_name
      end

    set_shop_sku (a_name: like shop_sku)
        -- Set 'shop_sku' with 'a_name'.
      do
        shop_sku := a_name
      ensure
        shop_sku_set: shop_sku = a_name
      end

    set_count (a_name: like count)
        -- Set 'count' with 'a_name'.
      do
        count := a_name
      ensure
        count_set: count = a_name
      end

    set_decisions (a_name: like decisions)
        -- Set 'decisions' with 'a_name'.
      do
        decisions := a_name
      ensure
        decisions_set: decisions = a_name
      end

    set_instances (a_name: like instances)
        -- Set 'instances' with 'a_name'.
      do
        instances := a_name
      ensure
        instances_set: instances = a_name
      end

    set_tracks (a_name: like tracks)
        -- Set 'tracks' with 'a_name'.
      do
        tracks := a_name
      ensure
        tracks_set: tracks = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass RETURN_ITEM_DTO%N")
        if attached market_sku as l_market_sku then
          Result.append ("%Nmarket_sku:")
          Result.append (l_market_sku.out)
          Result.append ("%N")
        end
        if attached shop_sku as l_shop_sku then
          Result.append ("%Nshop_sku:")
          Result.append (l_shop_sku.out)
          Result.append ("%N")
        end
        if attached count as l_count then
          Result.append ("%Ncount:")
          Result.append (l_count.out)
          Result.append ("%N")
        end
        if attached decisions as l_decisions then
          across l_decisions as ic loop
            Result.append ("%N decisions:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached instances as l_instances then
          across l_instances as ic loop
            Result.append ("%N instances:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached tracks as l_tracks then
          across l_tracks as ic loop
            Result.append ("%N tracks:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
      end
end

