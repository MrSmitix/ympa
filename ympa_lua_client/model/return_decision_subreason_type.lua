--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- return_decision_subreason_type class
local return_decision_subreason_type = {}
local return_decision_subreason_type_mt = {
	__name = "return_decision_subreason_type";
	__index = return_decision_subreason_type;
}

local function cast_return_decision_subreason_type(t)
	return setmetatable(t, return_decision_subreason_type_mt)
end

local function new_return_decision_subreason_type()
	return cast_return_decision_subreason_type({
	})
end

return {
	cast = cast_return_decision_subreason_type;
	new = new_return_decision_subreason_type;
}
