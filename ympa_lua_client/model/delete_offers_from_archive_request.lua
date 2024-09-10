--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- delete_offers_from_archive_request class
local delete_offers_from_archive_request = {}
local delete_offers_from_archive_request_mt = {
	__name = "delete_offers_from_archive_request";
	__index = delete_offers_from_archive_request;
}

local function cast_delete_offers_from_archive_request(t)
	return setmetatable(t, delete_offers_from_archive_request_mt)
end

local function new_delete_offers_from_archive_request(offer_ids)
	return cast_delete_offers_from_archive_request({
		["offerIds"] = offer_ids;
	})
end

return {
	cast = cast_delete_offers_from_archive_request;
	new = new_delete_offers_from_archive_request;
}
