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
class WARNING_PROMO_OFFER_UPDATE_DTO




feature --Access

    offer_id: detachable STRING_32
      -- Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    warnings: detachable LIST [PROMO_OFFER_UPDATE_WARNING_DTO]
      -- Предупреждения, которые появились при добавлении товара в акцию или изменении его цен.

feature -- Change Element

    set_offer_id (a_name: like offer_id)
        -- Set 'offer_id' with 'a_name'.
      do
        offer_id := a_name
      ensure
        offer_id_set: offer_id = a_name
      end

    set_warnings (a_name: like warnings)
        -- Set 'warnings' with 'a_name'.
      do
        warnings := a_name
      ensure
        warnings_set: warnings = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass WARNING_PROMO_OFFER_UPDATE_DTO%N")
        if attached offer_id as l_offer_id then
          Result.append ("%Noffer_id:")
          Result.append (l_offer_id.out)
          Result.append ("%N")
        end
        if attached warnings as l_warnings then
          across l_warnings as ic loop
            Result.append ("%N warnings:")
            Result.append (ic.item.out)
            Result.append ("%N")
          end
        end
      end
end

