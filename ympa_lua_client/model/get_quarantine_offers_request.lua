--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- get_quarantine_offers_request class
local get_quarantine_offers_request = {}
local get_quarantine_offers_request_mt = {
	__name = "get_quarantine_offers_request";
	__index = get_quarantine_offers_request;
}

local function cast_get_quarantine_offers_request(t)
	return setmetatable(t, get_quarantine_offers_request_mt)
end

local function new_get_quarantine_offers_request(offer_ids, card_statuses, category_ids, vendor_names, tags)
	return cast_get_quarantine_offers_request({
		["offerIds"] = offer_ids;
		["cardStatuses"] = card_statuses;
		["categoryIds"] = category_ids;
		["vendorNames"] = vendor_names;
		["tags"] = tags;
	})
end

return {
	cast = cast_get_quarantine_offers_request;
	new = new_get_quarantine_offers_request;
}
