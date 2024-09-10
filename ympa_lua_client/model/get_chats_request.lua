--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- get_chats_request class
local get_chats_request = {}
local get_chats_request_mt = {
	__name = "get_chats_request";
	__index = get_chats_request;
}

local function cast_get_chats_request(t)
	return setmetatable(t, get_chats_request_mt)
end

local function new_get_chats_request(order_ids, types, statuses)
	return cast_get_chats_request({
		["orderIds"] = order_ids;
		["types"] = types;
		["statuses"] = statuses;
	})
end

return {
	cast = cast_get_chats_request;
	new = new_get_chats_request;
}
