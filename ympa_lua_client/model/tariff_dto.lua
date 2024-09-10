--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- tariff_dto class
local tariff_dto = {}
local tariff_dto_mt = {
	__name = "tariff_dto";
	__index = tariff_dto;
}

local function cast_tariff_dto(t)
	return setmetatable(t, tariff_dto_mt)
end

local function new_tariff_dto(type, percent, amount, parameters)
	return cast_tariff_dto({
		["type"] = type;
		["percent"] = percent;
		["amount"] = amount;
		["parameters"] = parameters;
	})
end

return {
	cast = cast_tariff_dto;
	new = new_tariff_dto;
}
