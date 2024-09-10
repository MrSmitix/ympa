--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- model_price_dto class
local model_price_dto = {}
local model_price_dto_mt = {
	__name = "model_price_dto";
	__index = model_price_dto;
}

local function cast_model_price_dto(t)
	return setmetatable(t, model_price_dto_mt)
end

local function new_model_price_dto(avg, max, min)
	return cast_model_price_dto({
		["avg"] = avg;
		["max"] = max;
		["min"] = min;
	})
end

return {
	cast = cast_model_price_dto;
	new = new_model_price_dto;
}
