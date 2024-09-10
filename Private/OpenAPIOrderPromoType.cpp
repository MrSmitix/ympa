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

#include "OpenAPIOrderPromoType.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIOrderPromoType::Values& Value)
{
	switch (Value)
	{
	case OpenAPIOrderPromoType::Values::DirectDiscount:
		return TEXT("DIRECT_DISCOUNT");
	case OpenAPIOrderPromoType::Values::BlueSet:
		return TEXT("BLUE_SET");
	case OpenAPIOrderPromoType::Values::BlueFlash:
		return TEXT("BLUE_FLASH");
	case OpenAPIOrderPromoType::Values::GenericBundle:
		return TEXT("GENERIC_BUNDLE");
	case OpenAPIOrderPromoType::Values::MarketCoupon:
		return TEXT("MARKET_COUPON");
	case OpenAPIOrderPromoType::Values::MarketPromocode:
		return TEXT("MARKET_PROMOCODE");
	case OpenAPIOrderPromoType::Values::MarketDeal:
		return TEXT("MARKET_DEAL");
	case OpenAPIOrderPromoType::Values::MarketBlue:
		return TEXT("MARKET_BLUE");
	case OpenAPIOrderPromoType::Values::MarketPrime:
		return TEXT("MARKET_PRIME");
	case OpenAPIOrderPromoType::Values::YandexPlus:
		return TEXT("YANDEX_PLUS");
	case OpenAPIOrderPromoType::Values::BeruPlus:
		return TEXT("BERU_PLUS");
	case OpenAPIOrderPromoType::Values::MarketCoin:
		return TEXT("MARKET_COIN");
	case OpenAPIOrderPromoType::Values::YandexEmployee:
		return TEXT("YANDEX_EMPLOYEE");
	case OpenAPIOrderPromoType::Values::LimitedFreeDeliveryPromo:
		return TEXT("LIMITED_FREE_DELIVERY_PROMO");
	case OpenAPIOrderPromoType::Values::FreeDeliveryThreshold:
		return TEXT("FREE_DELIVERY_THRESHOLD");
	case OpenAPIOrderPromoType::Values::MulticartDiscount:
		return TEXT("MULTICART_DISCOUNT");
	case OpenAPIOrderPromoType::Values::PriceDropAsYouShop:
		return TEXT("PRICE_DROP_AS_YOU_SHOP");
	case OpenAPIOrderPromoType::Values::FreeDeliveryForLdi:
		return TEXT("FREE_DELIVERY_FOR_LDI");
	case OpenAPIOrderPromoType::Values::FreeDeliveryForLsc:
		return TEXT("FREE_DELIVERY_FOR_LSC");
	case OpenAPIOrderPromoType::Values::SecretSale:
		return TEXT("SECRET_SALE");
	case OpenAPIOrderPromoType::Values::FreePickup:
		return TEXT("FREE_PICKUP");
	case OpenAPIOrderPromoType::Values::CheapestAsGift:
		return TEXT("CHEAPEST_AS_GIFT");
	case OpenAPIOrderPromoType::Values::Cashback:
		return TEXT("CASHBACK");
	case OpenAPIOrderPromoType::Values::SupplierMulticartDiscount:
		return TEXT("SUPPLIER_MULTICART_DISCOUNT");
	case OpenAPIOrderPromoType::Values::SpreadDiscountCount:
		return TEXT("SPREAD_DISCOUNT_COUNT");
	case OpenAPIOrderPromoType::Values::SpreadDiscountReceipt:
		return TEXT("SPREAD_DISCOUNT_RECEIPT");
	case OpenAPIOrderPromoType::Values::AnnouncementPromo:
		return TEXT("ANNOUNCEMENT_PROMO");
	case OpenAPIOrderPromoType::Values::DiscountByPaymentType:
		return TEXT("DISCOUNT_BY_PAYMENT_TYPE");
	case OpenAPIOrderPromoType::Values::PercentDiscount:
		return TEXT("PERCENT_DISCOUNT");
	case OpenAPIOrderPromoType::Values::DcoExtraDiscount:
		return TEXT("DCO_EXTRA_DISCOUNT");
	case OpenAPIOrderPromoType::Values::EmptyPromo:
		return TEXT("EMPTY_PROMO");
	case OpenAPIOrderPromoType::Values::BlockingPromo:
		return TEXT("BLOCKING_PROMO");
	case OpenAPIOrderPromoType::Values::Unknown:
		return TEXT("UNKNOWN");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIOrderPromoType::Values Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIOrderPromoType::EnumToString(const OpenAPIOrderPromoType::Values& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIOrderPromoType::Values& Value)
{
	static TMap<FString, OpenAPIOrderPromoType::Values> StringToEnum = { 
		{ TEXT("DIRECT_DISCOUNT"), OpenAPIOrderPromoType::Values::DirectDiscount },
		{ TEXT("BLUE_SET"), OpenAPIOrderPromoType::Values::BlueSet },
		{ TEXT("BLUE_FLASH"), OpenAPIOrderPromoType::Values::BlueFlash },
		{ TEXT("GENERIC_BUNDLE"), OpenAPIOrderPromoType::Values::GenericBundle },
		{ TEXT("MARKET_COUPON"), OpenAPIOrderPromoType::Values::MarketCoupon },
		{ TEXT("MARKET_PROMOCODE"), OpenAPIOrderPromoType::Values::MarketPromocode },
		{ TEXT("MARKET_DEAL"), OpenAPIOrderPromoType::Values::MarketDeal },
		{ TEXT("MARKET_BLUE"), OpenAPIOrderPromoType::Values::MarketBlue },
		{ TEXT("MARKET_PRIME"), OpenAPIOrderPromoType::Values::MarketPrime },
		{ TEXT("YANDEX_PLUS"), OpenAPIOrderPromoType::Values::YandexPlus },
		{ TEXT("BERU_PLUS"), OpenAPIOrderPromoType::Values::BeruPlus },
		{ TEXT("MARKET_COIN"), OpenAPIOrderPromoType::Values::MarketCoin },
		{ TEXT("YANDEX_EMPLOYEE"), OpenAPIOrderPromoType::Values::YandexEmployee },
		{ TEXT("LIMITED_FREE_DELIVERY_PROMO"), OpenAPIOrderPromoType::Values::LimitedFreeDeliveryPromo },
		{ TEXT("FREE_DELIVERY_THRESHOLD"), OpenAPIOrderPromoType::Values::FreeDeliveryThreshold },
		{ TEXT("MULTICART_DISCOUNT"), OpenAPIOrderPromoType::Values::MulticartDiscount },
		{ TEXT("PRICE_DROP_AS_YOU_SHOP"), OpenAPIOrderPromoType::Values::PriceDropAsYouShop },
		{ TEXT("FREE_DELIVERY_FOR_LDI"), OpenAPIOrderPromoType::Values::FreeDeliveryForLdi },
		{ TEXT("FREE_DELIVERY_FOR_LSC"), OpenAPIOrderPromoType::Values::FreeDeliveryForLsc },
		{ TEXT("SECRET_SALE"), OpenAPIOrderPromoType::Values::SecretSale },
		{ TEXT("FREE_PICKUP"), OpenAPIOrderPromoType::Values::FreePickup },
		{ TEXT("CHEAPEST_AS_GIFT"), OpenAPIOrderPromoType::Values::CheapestAsGift },
		{ TEXT("CASHBACK"), OpenAPIOrderPromoType::Values::Cashback },
		{ TEXT("SUPPLIER_MULTICART_DISCOUNT"), OpenAPIOrderPromoType::Values::SupplierMulticartDiscount },
		{ TEXT("SPREAD_DISCOUNT_COUNT"), OpenAPIOrderPromoType::Values::SpreadDiscountCount },
		{ TEXT("SPREAD_DISCOUNT_RECEIPT"), OpenAPIOrderPromoType::Values::SpreadDiscountReceipt },
		{ TEXT("ANNOUNCEMENT_PROMO"), OpenAPIOrderPromoType::Values::AnnouncementPromo },
		{ TEXT("DISCOUNT_BY_PAYMENT_TYPE"), OpenAPIOrderPromoType::Values::DiscountByPaymentType },
		{ TEXT("PERCENT_DISCOUNT"), OpenAPIOrderPromoType::Values::PercentDiscount },
		{ TEXT("DCO_EXTRA_DISCOUNT"), OpenAPIOrderPromoType::Values::DcoExtraDiscount },
		{ TEXT("EMPTY_PROMO"), OpenAPIOrderPromoType::Values::EmptyPromo },
		{ TEXT("BLOCKING_PROMO"), OpenAPIOrderPromoType::Values::BlockingPromo },
		{ TEXT("UNKNOWN"), OpenAPIOrderPromoType::Values::Unknown }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIOrderPromoType::EnumFromString(const FString& EnumAsString, OpenAPIOrderPromoType::Values& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIOrderPromoType::Values& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIOrderPromoType::Values& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIOrderPromoType::WriteJson(JsonWriter& Writer) const
{
	WriteJsonValue(Writer, Value);
}

bool OpenAPIOrderPromoType::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Value);
}

}
