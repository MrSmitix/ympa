--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- license_check_status_type class
local license_check_status_type = {}
local license_check_status_type_mt = {
	__name = "license_check_status_type";
	__index = license_check_status_type;
}

local function cast_license_check_status_type(t)
	return setmetatable(t, license_check_status_type_mt)
end

local function new_license_check_status_type()
	return cast_license_check_status_type({
	})
end

return {
	cast = cast_license_check_status_type;
	new = new_license_check_status_type;
}
