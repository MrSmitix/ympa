--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- order_item_subsidy_dto class
local order_item_subsidy_dto = {}
local order_item_subsidy_dto_mt = {
	__name = "order_item_subsidy_dto";
	__index = order_item_subsidy_dto;
}

local function cast_order_item_subsidy_dto(t)
	return setmetatable(t, order_item_subsidy_dto_mt)
end

local function new_order_item_subsidy_dto(type, amount)
	return cast_order_item_subsidy_dto({
		["type"] = type;
		["amount"] = amount;
	})
end

return {
	cast = cast_order_item_subsidy_dto;
	new = new_order_item_subsidy_dto;
}
