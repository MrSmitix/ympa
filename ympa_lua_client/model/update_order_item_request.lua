--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- update_order_item_request class
local update_order_item_request = {}
local update_order_item_request_mt = {
	__name = "update_order_item_request";
	__index = update_order_item_request;
}

local function cast_update_order_item_request(t)
	return setmetatable(t, update_order_item_request_mt)
end

local function new_update_order_item_request(items, reason)
	return cast_update_order_item_request({
		["items"] = items;
		["reason"] = reason;
	})
end

return {
	cast = cast_update_order_item_request;
	new = new_update_order_item_request;
}
