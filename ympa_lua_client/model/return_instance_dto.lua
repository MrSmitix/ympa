--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- return_instance_dto class
local return_instance_dto = {}
local return_instance_dto_mt = {
	__name = "return_instance_dto";
	__index = return_instance_dto;
}

local function cast_return_instance_dto(t)
	return setmetatable(t, return_instance_dto_mt)
end

local function new_return_instance_dto(stock_type, status, cis, imei)
	return cast_return_instance_dto({
		["stockType"] = stock_type;
		["status"] = status;
		["cis"] = cis;
		["imei"] = imei;
	})
end

return {
	cast = cast_return_instance_dto;
	new = new_return_instance_dto;
}
