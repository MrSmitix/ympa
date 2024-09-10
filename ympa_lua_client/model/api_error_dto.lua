--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- api_error_dto class
local api_error_dto = {}
local api_error_dto_mt = {
	__name = "api_error_dto";
	__index = api_error_dto;
}

local function cast_api_error_dto(t)
	return setmetatable(t, api_error_dto_mt)
end

local function new_api_error_dto(code, message)
	return cast_api_error_dto({
		["code"] = code;
		["message"] = message;
	})
end

return {
	cast = cast_api_error_dto;
	new = new_api_error_dto;
}
