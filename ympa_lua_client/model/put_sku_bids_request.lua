--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- put_sku_bids_request class
local put_sku_bids_request = {}
local put_sku_bids_request_mt = {
	__name = "put_sku_bids_request";
	__index = put_sku_bids_request;
}

local function cast_put_sku_bids_request(t)
	return setmetatable(t, put_sku_bids_request_mt)
end

local function new_put_sku_bids_request(bids)
	return cast_put_sku_bids_request({
		["bids"] = bids;
	})
end

return {
	cast = cast_put_sku_bids_request;
	new = new_put_sku_bids_request;
}
