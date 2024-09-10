--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- set_order_shipment_boxes_request class
local set_order_shipment_boxes_request = {}
local set_order_shipment_boxes_request_mt = {
	__name = "set_order_shipment_boxes_request";
	__index = set_order_shipment_boxes_request;
}

local function cast_set_order_shipment_boxes_request(t)
	return setmetatable(t, set_order_shipment_boxes_request_mt)
end

local function new_set_order_shipment_boxes_request(boxes)
	return cast_set_order_shipment_boxes_request({
		["boxes"] = boxes;
	})
end

return {
	cast = cast_set_order_shipment_boxes_request;
	new = new_set_order_shipment_boxes_request;
}
