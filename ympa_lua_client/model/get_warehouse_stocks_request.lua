--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- get_warehouse_stocks_request class
local get_warehouse_stocks_request = {}
local get_warehouse_stocks_request_mt = {
	__name = "get_warehouse_stocks_request";
	__index = get_warehouse_stocks_request;
}

local function cast_get_warehouse_stocks_request(t)
	return setmetatable(t, get_warehouse_stocks_request_mt)
end

local function new_get_warehouse_stocks_request(with_turnover, archived, offer_ids)
	return cast_get_warehouse_stocks_request({
		["withTurnover"] = with_turnover;
		["archived"] = archived;
		["offerIds"] = offer_ids;
	})
end

return {
	cast = cast_get_warehouse_stocks_request;
	new = new_get_warehouse_stocks_request;
}
