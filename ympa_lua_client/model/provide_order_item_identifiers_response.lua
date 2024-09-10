--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- provide_order_item_identifiers_response class
local provide_order_item_identifiers_response = {}
local provide_order_item_identifiers_response_mt = {
	__name = "provide_order_item_identifiers_response";
	__index = provide_order_item_identifiers_response;
}

local function cast_provide_order_item_identifiers_response(t)
	return setmetatable(t, provide_order_item_identifiers_response_mt)
end

local function new_provide_order_item_identifiers_response(status, result)
	return cast_provide_order_item_identifiers_response({
		["status"] = status;
		["result"] = result;
	})
end

return {
	cast = cast_provide_order_item_identifiers_response;
	new = new_provide_order_item_identifiers_response;
}
