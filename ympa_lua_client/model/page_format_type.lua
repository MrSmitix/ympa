--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- page_format_type class
local page_format_type = {}
local page_format_type_mt = {
	__name = "page_format_type";
	__index = page_format_type;
}

local function cast_page_format_type(t)
	return setmetatable(t, page_format_type_mt)
end

local function new_page_format_type()
	return cast_page_format_type({
	})
end

return {
	cast = cast_page_format_type;
	new = new_page_format_type;
}
