--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- shipment_status_change_dto class
local shipment_status_change_dto = {}
local shipment_status_change_dto_mt = {
	__name = "shipment_status_change_dto";
	__index = shipment_status_change_dto;
}

local function cast_shipment_status_change_dto(t)
	return setmetatable(t, shipment_status_change_dto_mt)
end

local function new_shipment_status_change_dto(status, description, update_time)
	return cast_shipment_status_change_dto({
		["status"] = status;
		["description"] = description;
		["updateTime"] = update_time;
	})
end

return {
	cast = cast_shipment_status_change_dto;
	new = new_shipment_status_change_dto;
}
