--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- feed_content_error_dto class
local feed_content_error_dto = {}
local feed_content_error_dto_mt = {
	__name = "feed_content_error_dto";
	__index = feed_content_error_dto;
}

local function cast_feed_content_error_dto(t)
	return setmetatable(t, feed_content_error_dto_mt)
end

local function new_feed_content_error_dto(type)
	return cast_feed_content_error_dto({
		["type"] = type;
	})
end

return {
	cast = cast_feed_content_error_dto;
	new = new_feed_content_error_dto;
}
