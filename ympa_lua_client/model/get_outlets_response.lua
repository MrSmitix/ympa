--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- get_outlets_response class
local get_outlets_response = {}
local get_outlets_response_mt = {
	__name = "get_outlets_response";
	__index = get_outlets_response;
}

local function cast_get_outlets_response(t)
	return setmetatable(t, get_outlets_response_mt)
end

local function new_get_outlets_response(outlets, paging, pager)
	return cast_get_outlets_response({
		["outlets"] = outlets;
		["paging"] = paging;
		["pager"] = pager;
	})
end

return {
	cast = cast_get_outlets_response;
	new = new_get_outlets_response;
}
