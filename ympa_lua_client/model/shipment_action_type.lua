--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- shipment_action_type class
local shipment_action_type = {}
local shipment_action_type_mt = {
	__name = "shipment_action_type";
	__index = shipment_action_type;
}

local function cast_shipment_action_type(t)
	return setmetatable(t, shipment_action_type_mt)
end

local function new_shipment_action_type()
	return cast_shipment_action_type({
	})
end

return {
	cast = cast_shipment_action_type;
	new = new_shipment_action_type;
}
