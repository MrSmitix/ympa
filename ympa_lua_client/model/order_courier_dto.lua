--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- order_courier_dto class
local order_courier_dto = {}
local order_courier_dto_mt = {
	__name = "order_courier_dto";
	__index = order_courier_dto;
}

local function cast_order_courier_dto(t)
	return setmetatable(t, order_courier_dto_mt)
end

local function new_order_courier_dto(full_name, phone, phone_extension, vehicle_number, vehicle_description)
	return cast_order_courier_dto({
		["fullName"] = full_name;
		["phone"] = phone;
		["phoneExtension"] = phone_extension;
		["vehicleNumber"] = vehicle_number;
		["vehicleDescription"] = vehicle_description;
	})
end

return {
	cast = cast_order_courier_dto;
	new = new_order_courier_dto;
}
