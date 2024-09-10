--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- price_suggest_type class
local price_suggest_type = {}
local price_suggest_type_mt = {
	__name = "price_suggest_type";
	__index = price_suggest_type;
}

local function cast_price_suggest_type(t)
	return setmetatable(t, price_suggest_type_mt)
end

local function new_price_suggest_type()
	return cast_price_suggest_type({
	})
end

return {
	cast = cast_price_suggest_type;
	new = new_price_suggest_type;
}
