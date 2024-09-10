--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- time_period_dto class
local time_period_dto = {}
local time_period_dto_mt = {
	__name = "time_period_dto";
	__index = time_period_dto;
}

local function cast_time_period_dto(t)
	return setmetatable(t, time_period_dto_mt)
end

local function new_time_period_dto(time_period, time_unit, comment)
	return cast_time_period_dto({
		["timePeriod"] = time_period;
		["timeUnit"] = time_unit;
		["comment"] = comment;
	})
end

return {
	cast = cast_time_period_dto;
	new = new_time_period_dto;
}
