--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- get_promo_mechanics_info_dto class
local get_promo_mechanics_info_dto = {}
local get_promo_mechanics_info_dto_mt = {
	__name = "get_promo_mechanics_info_dto";
	__index = get_promo_mechanics_info_dto;
}

local function cast_get_promo_mechanics_info_dto(t)
	return setmetatable(t, get_promo_mechanics_info_dto_mt)
end

local function new_get_promo_mechanics_info_dto(type, promocode_info)
	return cast_get_promo_mechanics_info_dto({
		["type"] = type;
		["promocodeInfo"] = promocode_info;
	})
end

return {
	cast = cast_get_promo_mechanics_info_dto;
	new = new_get_promo_mechanics_info_dto;
}
