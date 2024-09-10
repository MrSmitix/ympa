--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- feed_download_error_dto class
local feed_download_error_dto = {}
local feed_download_error_dto_mt = {
	__name = "feed_download_error_dto";
	__index = feed_download_error_dto;
}

local function cast_feed_download_error_dto(t)
	return setmetatable(t, feed_download_error_dto_mt)
end

local function new_feed_download_error_dto(http_status_code, type, description)
	return cast_feed_download_error_dto({
		["httpStatusCode"] = http_status_code;
		["type"] = type;
		["description"] = description;
	})
end

return {
	cast = cast_feed_download_error_dto;
	new = new_feed_download_error_dto;
}
