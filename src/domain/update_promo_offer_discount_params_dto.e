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
class UPDATE_PROMO_OFFER_DISCOUNT_PARAMS_DTO




feature --Access

    price: INTEGER_64
      -- Зачеркнутая цена — та, по которой товар продавался до акции.  Указывается в рублях.  Число должно быть целым. 
    promo_price: INTEGER_64
      -- Цена по акции — та, по которой вы хотите продавать товар.  Указывается в рублях.  Число должно быть целым. 

feature -- Change Element

    set_price (a_name: like price)
        -- Set 'price' with 'a_name'.
      do
        price := a_name
      ensure
        price_set: price = a_name
      end

    set_promo_price (a_name: like promo_price)
        -- Set 'promo_price' with 'a_name'.
      do
        promo_price := a_name
      ensure
        promo_price_set: promo_price = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass UPDATE_PROMO_OFFER_DISCOUNT_PARAMS_DTO%N")
        if attached price as l_price then
          Result.append ("%Nprice:")
          Result.append (l_price.out)
          Result.append ("%N")
        end
        if attached promo_price as l_promo_price then
          Result.append ("%Npromo_price:")
          Result.append (l_promo_price.out)
          Result.append ("%N")
        end
      end
end

