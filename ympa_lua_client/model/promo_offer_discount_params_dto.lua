--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- promo_offer_discount_params_dto class
local promo_offer_discount_params_dto = {}
local promo_offer_discount_params_dto_mt = {
	__name = "promo_offer_discount_params_dto";
	__index = promo_offer_discount_params_dto;
}

local function cast_promo_offer_discount_params_dto(t)
	return setmetatable(t, promo_offer_discount_params_dto_mt)
end

local function new_promo_offer_discount_params_dto(price, promo_price, max_promo_price)
	return cast_promo_offer_discount_params_dto({
		["price"] = price;
		["promoPrice"] = promo_price;
		["maxPromoPrice"] = max_promo_price;
	})
end

return {
	cast = cast_promo_offer_discount_params_dto;
	new = new_promo_offer_discount_params_dto;
}
