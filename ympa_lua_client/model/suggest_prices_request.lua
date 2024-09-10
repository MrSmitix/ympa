--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- suggest_prices_request class
local suggest_prices_request = {}
local suggest_prices_request_mt = {
	__name = "suggest_prices_request";
	__index = suggest_prices_request;
}

local function cast_suggest_prices_request(t)
	return setmetatable(t, suggest_prices_request_mt)
end

local function new_suggest_prices_request(offers)
	return cast_suggest_prices_request({
		["offers"] = offers;
	})
end

return {
	cast = cast_suggest_prices_request;
	new = new_suggest_prices_request;
}
