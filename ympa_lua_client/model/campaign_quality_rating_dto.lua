--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- campaign_quality_rating_dto class
local campaign_quality_rating_dto = {}
local campaign_quality_rating_dto_mt = {
	__name = "campaign_quality_rating_dto";
	__index = campaign_quality_rating_dto;
}

local function cast_campaign_quality_rating_dto(t)
	return setmetatable(t, campaign_quality_rating_dto_mt)
end

local function new_campaign_quality_rating_dto(campaign_id, ratings)
	return cast_campaign_quality_rating_dto({
		["campaignId"] = campaign_id;
		["ratings"] = ratings;
	})
end

return {
	cast = cast_campaign_quality_rating_dto;
	new = new_campaign_quality_rating_dto;
}
