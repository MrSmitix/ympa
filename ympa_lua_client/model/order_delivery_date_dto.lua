--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- order_delivery_date_dto class
local order_delivery_date_dto = {}
local order_delivery_date_dto_mt = {
	__name = "order_delivery_date_dto";
	__index = order_delivery_date_dto;
}

local function cast_order_delivery_date_dto(t)
	return setmetatable(t, order_delivery_date_dto_mt)
end

local function new_order_delivery_date_dto(to_date)
	return cast_order_delivery_date_dto({
		["toDate"] = to_date;
	})
end

return {
	cast = cast_order_delivery_date_dto;
	new = new_order_delivery_date_dto;
}
