--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- feed_download_dto class
local feed_download_dto = {}
local feed_download_dto_mt = {
	__name = "feed_download_dto";
	__index = feed_download_dto;
}

local function cast_feed_download_dto(t)
	return setmetatable(t, feed_download_dto_mt)
end

local function new_feed_download_dto(status, error)
	return cast_feed_download_dto({
		["status"] = status;
		["error"] = error;
	})
end

return {
	cast = cast_feed_download_dto;
	new = new_feed_download_dto;
}
