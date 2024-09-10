--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- get_order_labels_data_response class
local get_order_labels_data_response = {}
local get_order_labels_data_response_mt = {
	__name = "get_order_labels_data_response";
	__index = get_order_labels_data_response;
}

local function cast_get_order_labels_data_response(t)
	return setmetatable(t, get_order_labels_data_response_mt)
end

local function new_get_order_labels_data_response(status, result)
	return cast_get_order_labels_data_response({
		["status"] = status;
		["result"] = result;
	})
end

return {
	cast = cast_get_order_labels_data_response;
	new = new_get_order_labels_data_response;
}
