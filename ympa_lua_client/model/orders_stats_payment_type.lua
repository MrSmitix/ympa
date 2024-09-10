--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- orders_stats_payment_type class
local orders_stats_payment_type = {}
local orders_stats_payment_type_mt = {
	__name = "orders_stats_payment_type";
	__index = orders_stats_payment_type;
}

local function cast_orders_stats_payment_type(t)
	return setmetatable(t, orders_stats_payment_type_mt)
end

local function new_orders_stats_payment_type()
	return cast_orders_stats_payment_type({
	})
end

return {
	cast = cast_orders_stats_payment_type;
	new = new_orders_stats_payment_type;
}
