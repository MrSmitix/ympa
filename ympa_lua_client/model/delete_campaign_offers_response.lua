--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- delete_campaign_offers_response class
local delete_campaign_offers_response = {}
local delete_campaign_offers_response_mt = {
	__name = "delete_campaign_offers_response";
	__index = delete_campaign_offers_response;
}

local function cast_delete_campaign_offers_response(t)
	return setmetatable(t, delete_campaign_offers_response_mt)
end

local function new_delete_campaign_offers_response(status, result)
	return cast_delete_campaign_offers_response({
		["status"] = status;
		["result"] = result;
	})
end

return {
	cast = cast_delete_campaign_offers_response;
	new = new_delete_campaign_offers_response;
}
