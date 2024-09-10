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
class GOODS_STATS_GOODS_DTO




feature --Access

    shop_sku: detachable STRING_32
      -- Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    market_sku: INTEGER_64
      -- SKU на Маркете.
    name: detachable STRING_32
      -- Название товара.
    price: REAL_32
      -- Цена на товар в валюте, которая установлена [в кабинете продавца на Маркете](https://partner.market.yandex.ru/).
    category_id: INTEGER_64
      -- Идентификатор категории товара на Маркете.
    category_name: detachable STRING_32
      -- Название категории товара на Маркете.
    weight_dimensions: detachable GOODS_STATS_WEIGHT_DIMENSIONS_DTO
      
    warehouses: detachable LIST [GOODS_STATS_WAREHOUSE_DTO]
      -- Информация о складах, на которых хранится товар.  Параметр не приходит, если товара нет ни на одном складе. 
    tariffs: detachable LIST [TARIFF_DTO]
      -- Информация о тарифах, по которым нужно заплатить за услуги Маркета.  По некоторым услугам могут возвращаться несколько разных стоимостей. Например, в модели FBS стоимость услуги `SORTING` (обработка заказа) зависит от способа отгрузки и количества заказов в отгрузке. Подробнее о тарифах на услуги читайте [в Справке Маркета для продавцов](https://yandex.ru/support2/marketplace/ru/introduction/rates/models/). 
    pictures: detachable LIST [STRING_32]
      -- Ссылки (URL) изображений товара в хорошем качестве.

feature -- Change Element

    set_shop_sku (a_name: like shop_sku)
        -- Set 'shop_sku' with 'a_name'.
      do
        shop_sku := a_name
      ensure
        shop_sku_set: shop_sku = a_name
      end

    set_market_sku (a_name: like market_sku)
        -- Set 'market_sku' with 'a_name'.
      do
        market_sku := a_name
      ensure
        market_sku_set: market_sku = a_name
      end

    set_name (a_name: like name)
        -- Set 'name' with 'a_name'.
      do
        name := a_name
      ensure
        name_set: name = a_name
      end

    set_price (a_name: like price)
        -- Set 'price' with 'a_name'.
      do
        price := a_name
      ensure
        price_set: price = a_name
      end

    set_category_id (a_name: like category_id)
        -- Set 'category_id' with 'a_name'.
      do
        category_id := a_name
      ensure
        category_id_set: category_id = a_name
      end

    set_category_name (a_name: like category_name)
        -- Set 'category_name' with 'a_name'.
      do
        category_name := a_name
      ensure
        category_name_set: category_name = a_name
      end

    set_weight_dimensions (a_name: like weight_dimensions)
        -- Set 'weight_dimensions' with 'a_name'.
      do
        weight_dimensions := a_name
      ensure
        weight_dimensions_set: weight_dimensions = a_name
      end

    set_warehouses (a_name: like warehouses)
        -- Set 'warehouses' with 'a_name'.
      do
        warehouses := a_name
      ensure
        warehouses_set: warehouses = a_name
      end

    set_tariffs (a_name: like tariffs)
        -- Set 'tariffs' with 'a_name'.
      do
        tariffs := a_name
      ensure
        tariffs_set: tariffs = a_name
      end

    set_pictures (a_name: like pictures)
        -- Set 'pictures' with 'a_name'.
      do
        pictures := a_name
      ensure
        pictures_set: pictures = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass GOODS_STATS_GOODS_DTO%N")
        if attached shop_sku as l_shop_sku then
          Result.append ("%Nshop_sku:")
          Result.append (l_shop_sku.out)
          Result.append ("%N")
        end
        if attached market_sku as l_market_sku then
          Result.append ("%Nmarket_sku:")
          Result.append (l_market_sku.out)
          Result.append ("%N")
        end
        if attached name as l_name then
          Result.append ("%Nname:")
          Result.append (l_name.out)
          Result.append ("%N")
        end
        if attached price as l_price then
          Result.append ("%Nprice:")
          Result.append (l_price.out)
          Result.append ("%N")
        end
        if attached category_id as l_category_id then
          Result.append ("%Ncategory_id:")
          Result.append (l_category_id.out)
          Result.append ("%N")
        end
        if attached category_name as l_category_name then
          Result.append ("%Ncategory_name:")
          Result.append (l_category_name.out)
          Result.append ("%N")
        end
        if attached weight_dimensions as l_weight_dimensions then
          Result.append ("%Nweight_dimensions:")
          Result.append (l_weight_dimensions.out)
          Result.append ("%N")
        end
        if attached warehouses as l_warehouses then
          across l_warehouses as ic loop
            Result.append ("%N warehouses:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached tariffs as l_tariffs then
          across l_tariffs as ic loop
            Result.append ("%N tariffs:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
        if attached pictures as l_pictures then
          across l_pictures as ic loop
            Result.append ("%N pictures:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
      end
end

