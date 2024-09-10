--[[
  Партнерский API Маркета

  API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 

  The version of the OpenAPI document: LATEST
  
  Generated by: https://openapi-generator.tech
]]

-- get_price_with_vat_dto class
local get_price_with_vat_dto = {}
local get_price_with_vat_dto_mt = {
	__name = "get_price_with_vat_dto";
	__index = get_price_with_vat_dto;
}

local function cast_get_price_with_vat_dto(t)
	return setmetatable(t, get_price_with_vat_dto_mt)
end

local function new_get_price_with_vat_dto(value, discount_base, currency_id, vat, updated_at)
	return cast_get_price_with_vat_dto({
		["value"] = value;
		["discountBase"] = discount_base;
		["currencyId"] = currency_id;
		["vat"] = vat;
		["updatedAt"] = updated_at;
	})
end

return {
	cast = cast_get_price_with_vat_dto;
	new = new_get_price_with_vat_dto;
}
