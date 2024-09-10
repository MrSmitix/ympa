/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * OpenAPI spec version: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator
 * https://github.com/OpenAPITools/openapi-generator
 * Do not edit the class manually.
 */

#include "OpenAPIPromoOfferUpdateWarningCodeType.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIPromoOfferUpdateWarningCodeType::Values& Value)
{
	switch (Value)
	{
	case OpenAPIPromoOfferUpdateWarningCodeType::Values::DeepDiscountOffer:
		return TEXT("DEEP_DISCOUNT_OFFER");
	case OpenAPIPromoOfferUpdateWarningCodeType::Values::CatalogPriceIsLowerThanPromo:
		return TEXT("CATALOG_PRICE_IS_LOWER_THAN_PROMO");
	case OpenAPIPromoOfferUpdateWarningCodeType::Values::ShopPricesAreLowerThanPromo:
		return TEXT("SHOP_PRICES_ARE_LOWER_THAN_PROMO");
	case OpenAPIPromoOfferUpdateWarningCodeType::Values::PromocodePriceMoreThanMaxFairPrice:
		return TEXT("PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE");
	case OpenAPIPromoOfferUpdateWarningCodeType::Values::ShopOfferNotEligibleForPromo:
		return TEXT("SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIPromoOfferUpdateWarningCodeType::Values Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIPromoOfferUpdateWarningCodeType::EnumToString(const OpenAPIPromoOfferUpdateWarningCodeType::Values& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIPromoOfferUpdateWarningCodeType::Values& Value)
{
	static TMap<FString, OpenAPIPromoOfferUpdateWarningCodeType::Values> StringToEnum = { 
		{ TEXT("DEEP_DISCOUNT_OFFER"), OpenAPIPromoOfferUpdateWarningCodeType::Values::DeepDiscountOffer },
		{ TEXT("CATALOG_PRICE_IS_LOWER_THAN_PROMO"), OpenAPIPromoOfferUpdateWarningCodeType::Values::CatalogPriceIsLowerThanPromo },
		{ TEXT("SHOP_PRICES_ARE_LOWER_THAN_PROMO"), OpenAPIPromoOfferUpdateWarningCodeType::Values::ShopPricesAreLowerThanPromo },
		{ TEXT("PROMOCODE_PRICE_MORE_THAN_MAX_FAIR_PRICE"), OpenAPIPromoOfferUpdateWarningCodeType::Values::PromocodePriceMoreThanMaxFairPrice },
		{ TEXT("SHOP_OFFER_NOT_ELIGIBLE_FOR_PROMO"), OpenAPIPromoOfferUpdateWarningCodeType::Values::ShopOfferNotEligibleForPromo }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIPromoOfferUpdateWarningCodeType::EnumFromString(const FString& EnumAsString, OpenAPIPromoOfferUpdateWarningCodeType::Values& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIPromoOfferUpdateWarningCodeType::Values& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIPromoOfferUpdateWarningCodeType::Values& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIPromoOfferUpdateWarningCodeType::WriteJson(JsonWriter& Writer) const
{
	WriteJsonValue(Writer, Value);
}

bool OpenAPIPromoOfferUpdateWarningCodeType::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Value);
}

}
