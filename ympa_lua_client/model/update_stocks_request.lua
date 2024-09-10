--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- update_stocks_request class
local update_stocks_request = {}
local update_stocks_request_mt = {
	__name = "update_stocks_request";
	__index = update_stocks_request;
}

local function cast_update_stocks_request(t)
	return setmetatable(t, update_stocks_request_mt)
end

local function new_update_stocks_request(skus)
	return cast_update_stocks_request({
		["skus"] = skus;
	})
end

return {
	cast = cast_update_stocks_request;
	new = new_update_stocks_request;
}
