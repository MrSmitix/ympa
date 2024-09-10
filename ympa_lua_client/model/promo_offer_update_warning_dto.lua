--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- promo_offer_update_warning_dto class
local promo_offer_update_warning_dto = {}
local promo_offer_update_warning_dto_mt = {
	__name = "promo_offer_update_warning_dto";
	__index = promo_offer_update_warning_dto;
}

local function cast_promo_offer_update_warning_dto(t)
	return setmetatable(t, promo_offer_update_warning_dto_mt)
end

local function new_promo_offer_update_warning_dto(code, campaign_ids)
	return cast_promo_offer_update_warning_dto({
		["code"] = code;
		["campaignIds"] = campaign_ids;
	})
end

return {
	cast = cast_promo_offer_update_warning_dto;
	new = new_promo_offer_update_warning_dto;
}
