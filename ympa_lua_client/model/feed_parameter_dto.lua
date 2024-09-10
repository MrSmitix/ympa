--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- feed_parameter_dto class
local feed_parameter_dto = {}
local feed_parameter_dto_mt = {
	__name = "feed_parameter_dto";
	__index = feed_parameter_dto;
}

local function cast_feed_parameter_dto(t)
	return setmetatable(t, feed_parameter_dto_mt)
end

local function new_feed_parameter_dto(deleted, name, values)
	return cast_feed_parameter_dto({
		["deleted"] = deleted;
		["name"] = name;
		["values"] = values;
	})
end

return {
	cast = cast_feed_parameter_dto;
	new = new_feed_parameter_dto;
}
