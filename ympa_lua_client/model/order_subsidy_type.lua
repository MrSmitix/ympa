--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- order_subsidy_type class
local order_subsidy_type = {}
local order_subsidy_type_mt = {
	__name = "order_subsidy_type";
	__index = order_subsidy_type;
}

local function cast_order_subsidy_type(t)
	return setmetatable(t, order_subsidy_type_mt)
end

local function new_order_subsidy_type()
	return cast_order_subsidy_type({
	})
end

return {
	cast = cast_order_subsidy_type;
	new = new_order_subsidy_type;
}
