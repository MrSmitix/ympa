--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- offer_condition_dto class
local offer_condition_dto = {}
local offer_condition_dto_mt = {
	__name = "offer_condition_dto";
	__index = offer_condition_dto;
}

local function cast_offer_condition_dto(t)
	return setmetatable(t, offer_condition_dto_mt)
end

local function new_offer_condition_dto(type, quality, reason)
	return cast_offer_condition_dto({
		["type"] = type;
		["quality"] = quality;
		["reason"] = reason;
	})
end

return {
	cast = cast_offer_condition_dto;
	new = new_offer_condition_dto;
}
