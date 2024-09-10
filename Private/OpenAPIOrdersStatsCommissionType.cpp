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

#include "OpenAPIOrdersStatsCommissionType.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIOrdersStatsCommissionType::Values& Value)
{
	switch (Value)
	{
	case OpenAPIOrdersStatsCommissionType::Values::Fee:
		return TEXT("FEE");
	case OpenAPIOrdersStatsCommissionType::Values::Fulfillment:
		return TEXT("FULFILLMENT");
	case OpenAPIOrdersStatsCommissionType::Values::LoyaltyParticipationFee:
		return TEXT("LOYALTY_PARTICIPATION_FEE");
	case OpenAPIOrdersStatsCommissionType::Values::AuctionPromotion:
		return TEXT("AUCTION_PROMOTION");
	case OpenAPIOrdersStatsCommissionType::Values::Installment:
		return TEXT("INSTALLMENT");
	case OpenAPIOrdersStatsCommissionType::Values::DeliveryToCustomer:
		return TEXT("DELIVERY_TO_CUSTOMER");
	case OpenAPIOrdersStatsCommissionType::Values::ExpressDeliveryToCustomer:
		return TEXT("EXPRESS_DELIVERY_TO_CUSTOMER");
	case OpenAPIOrdersStatsCommissionType::Values::Agency:
		return TEXT("AGENCY");
	case OpenAPIOrdersStatsCommissionType::Values::PaymentTransfer:
		return TEXT("PAYMENT_TRANSFER");
	case OpenAPIOrdersStatsCommissionType::Values::ReturnedOrdersStorage:
		return TEXT("RETURNED_ORDERS_STORAGE");
	case OpenAPIOrdersStatsCommissionType::Values::Sorting:
		return TEXT("SORTING");
	case OpenAPIOrdersStatsCommissionType::Values::IntakeSorting:
		return TEXT("INTAKE_SORTING");
	case OpenAPIOrdersStatsCommissionType::Values::ReturnProcessing:
		return TEXT("RETURN_PROCESSING");
	case OpenAPIOrdersStatsCommissionType::Values::IlliquidGoodsSale:
		return TEXT("ILLIQUID_GOODS_SALE");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIOrdersStatsCommissionType::Values Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIOrdersStatsCommissionType::EnumToString(const OpenAPIOrdersStatsCommissionType::Values& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIOrdersStatsCommissionType::Values& Value)
{
	static TMap<FString, OpenAPIOrdersStatsCommissionType::Values> StringToEnum = { 
		{ TEXT("FEE"), OpenAPIOrdersStatsCommissionType::Values::Fee },
		{ TEXT("FULFILLMENT"), OpenAPIOrdersStatsCommissionType::Values::Fulfillment },
		{ TEXT("LOYALTY_PARTICIPATION_FEE"), OpenAPIOrdersStatsCommissionType::Values::LoyaltyParticipationFee },
		{ TEXT("AUCTION_PROMOTION"), OpenAPIOrdersStatsCommissionType::Values::AuctionPromotion },
		{ TEXT("INSTALLMENT"), OpenAPIOrdersStatsCommissionType::Values::Installment },
		{ TEXT("DELIVERY_TO_CUSTOMER"), OpenAPIOrdersStatsCommissionType::Values::DeliveryToCustomer },
		{ TEXT("EXPRESS_DELIVERY_TO_CUSTOMER"), OpenAPIOrdersStatsCommissionType::Values::ExpressDeliveryToCustomer },
		{ TEXT("AGENCY"), OpenAPIOrdersStatsCommissionType::Values::Agency },
		{ TEXT("PAYMENT_TRANSFER"), OpenAPIOrdersStatsCommissionType::Values::PaymentTransfer },
		{ TEXT("RETURNED_ORDERS_STORAGE"), OpenAPIOrdersStatsCommissionType::Values::ReturnedOrdersStorage },
		{ TEXT("SORTING"), OpenAPIOrdersStatsCommissionType::Values::Sorting },
		{ TEXT("INTAKE_SORTING"), OpenAPIOrdersStatsCommissionType::Values::IntakeSorting },
		{ TEXT("RETURN_PROCESSING"), OpenAPIOrdersStatsCommissionType::Values::ReturnProcessing },
		{ TEXT("ILLIQUID_GOODS_SALE"), OpenAPIOrdersStatsCommissionType::Values::IlliquidGoodsSale }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIOrdersStatsCommissionType::EnumFromString(const FString& EnumAsString, OpenAPIOrdersStatsCommissionType::Values& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIOrdersStatsCommissionType::Values& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIOrdersStatsCommissionType::Values& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIOrdersStatsCommissionType::WriteJson(JsonWriter& Writer) const
{
	WriteJsonValue(Writer, Value);
}

bool OpenAPIOrdersStatsCommissionType::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Value);
}

}
