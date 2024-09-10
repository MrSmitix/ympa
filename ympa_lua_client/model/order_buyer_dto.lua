--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- order_buyer_dto class
local order_buyer_dto = {}
local order_buyer_dto_mt = {
	__name = "order_buyer_dto";
	__index = order_buyer_dto;
}

local function cast_order_buyer_dto(t)
	return setmetatable(t, order_buyer_dto_mt)
end

local function new_order_buyer_dto(id, last_name, first_name, middle_name, type)
	return cast_order_buyer_dto({
		["id"] = id;
		["lastName"] = last_name;
		["firstName"] = first_name;
		["middleName"] = middle_name;
		["type"] = type;
	})
end

return {
	cast = cast_order_buyer_dto;
	new = new_order_buyer_dto;
}
