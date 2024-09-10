--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- offer_price_by_offer_ids_response_dto class
local offer_price_by_offer_ids_response_dto = {}
local offer_price_by_offer_ids_response_dto_mt = {
	__name = "offer_price_by_offer_ids_response_dto";
	__index = offer_price_by_offer_ids_response_dto;
}

local function cast_offer_price_by_offer_ids_response_dto(t)
	return setmetatable(t, offer_price_by_offer_ids_response_dto_mt)
end

local function new_offer_price_by_offer_ids_response_dto(offer_id, price, updated_at)
	return cast_offer_price_by_offer_ids_response_dto({
		["offerId"] = offer_id;
		["price"] = price;
		["updatedAt"] = updated_at;
	})
end

return {
	cast = cast_offer_price_by_offer_ids_response_dto;
	new = new_offer_price_by_offer_ids_response_dto;
}
