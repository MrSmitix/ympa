--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- api_server_error_response class
local api_server_error_response = {}
local api_server_error_response_mt = {
	__name = "api_server_error_response";
	__index = api_server_error_response;
}

local function cast_api_server_error_response(t)
	return setmetatable(t, api_server_error_response_mt)
end

local function new_api_server_error_response(status, errors)
	return cast_api_server_error_response({
		["status"] = status;
		["errors"] = errors;
	})
end

return {
	cast = cast_api_server_error_response;
	new = new_api_server_error_response;
}
