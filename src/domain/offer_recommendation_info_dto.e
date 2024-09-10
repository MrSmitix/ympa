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
class OFFER_RECOMMENDATION_INFO_DTO




feature --Access

    offer_id: detachable STRING_32
      -- Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    recommended_cofinance_price: detachable BASE_PRICE_DTO
      
    competitiveness_thresholds: detachable PRICE_COMPETITIVENESS_THRESHOLDS_DTO
      

feature -- Change Element

    set_offer_id (a_name: like offer_id)
        -- Set 'offer_id' with 'a_name'.
      do
        offer_id := a_name
      ensure
        offer_id_set: offer_id = a_name
      end

    set_recommended_cofinance_price (a_name: like recommended_cofinance_price)
        -- Set 'recommended_cofinance_price' with 'a_name'.
      do
        recommended_cofinance_price := a_name
      ensure
        recommended_cofinance_price_set: recommended_cofinance_price = a_name
      end

    set_competitiveness_thresholds (a_name: like competitiveness_thresholds)
        -- Set 'competitiveness_thresholds' with 'a_name'.
      do
        competitiveness_thresholds := a_name
      ensure
        competitiveness_thresholds_set: competitiveness_thresholds = a_name
      end


 feature -- Status Report

    output: STRING
          -- <Precursor>
      do
        create Result.make_empty
        Result.append("%Nclass OFFER_RECOMMENDATION_INFO_DTO%N")
        if attached offer_id as l_offer_id then
          Result.append ("%Noffer_id:")
          Result.append (l_offer_id.out)
          Result.append ("%N")
        end
        if attached recommended_cofinance_price as l_recommended_cofinance_price then
          Result.append ("%Nrecommended_cofinance_price:")
          Result.append (l_recommended_cofinance_price.out)
          Result.append ("%N")
        end
        if attached competitiveness_thresholds as l_competitiveness_thresholds then
          Result.append ("%Ncompetitiveness_thresholds:")
          Result.append (l_competitiveness_thresholds.out)
          Result.append ("%N")
        end
      end
end

