--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- get_suggested_offer_mapping_entries_request class
local get_suggested_offer_mapping_entries_request = {}
local get_suggested_offer_mapping_entries_request_mt = {
	__name = "get_suggested_offer_mapping_entries_request";
	__index = get_suggested_offer_mapping_entries_request;
}

local function cast_get_suggested_offer_mapping_entries_request(t)
	return setmetatable(t, get_suggested_offer_mapping_entries_request_mt)
end

local function new_get_suggested_offer_mapping_entries_request(offers)
	return cast_get_suggested_offer_mapping_entries_request({
		["offers"] = offers;
	})
end

return {
	cast = cast_get_suggested_offer_mapping_entries_request;
	new = new_get_suggested_offer_mapping_entries_request;
}
