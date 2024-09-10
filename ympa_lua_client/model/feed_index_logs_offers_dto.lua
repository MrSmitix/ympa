--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- feed_index_logs_offers_dto class
local feed_index_logs_offers_dto = {}
local feed_index_logs_offers_dto_mt = {
	__name = "feed_index_logs_offers_dto";
	__index = feed_index_logs_offers_dto;
}

local function cast_feed_index_logs_offers_dto(t)
	return setmetatable(t, feed_index_logs_offers_dto_mt)
end

local function new_feed_index_logs_offers_dto(rejected_count, total_count)
	return cast_feed_index_logs_offers_dto({
		["rejectedCount"] = rejected_count;
		["totalCount"] = total_count;
	})
end

return {
	cast = cast_feed_index_logs_offers_dto;
	new = new_feed_index_logs_offers_dto;
}
