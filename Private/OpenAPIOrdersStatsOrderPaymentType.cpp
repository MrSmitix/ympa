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

#include "OpenAPIOrdersStatsOrderPaymentType.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIOrdersStatsOrderPaymentType::Values& Value)
{
	switch (Value)
	{
	case OpenAPIOrdersStatsOrderPaymentType::Values::Credit:
		return TEXT("CREDIT");
	case OpenAPIOrdersStatsOrderPaymentType::Values::Postpaid:
		return TEXT("POSTPAID");
	case OpenAPIOrdersStatsOrderPaymentType::Values::Prepaid:
		return TEXT("PREPAID");
	case OpenAPIOrdersStatsOrderPaymentType::Values::TinkoffCredit:
		return TEXT("TINKOFF_CREDIT");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIOrdersStatsOrderPaymentType::Values Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIOrdersStatsOrderPaymentType::EnumToString(const OpenAPIOrdersStatsOrderPaymentType::Values& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIOrdersStatsOrderPaymentType::Values& Value)
{
	static TMap<FString, OpenAPIOrdersStatsOrderPaymentType::Values> StringToEnum = { 
		{ TEXT("CREDIT"), OpenAPIOrdersStatsOrderPaymentType::Values::Credit },
		{ TEXT("POSTPAID"), OpenAPIOrdersStatsOrderPaymentType::Values::Postpaid },
		{ TEXT("PREPAID"), OpenAPIOrdersStatsOrderPaymentType::Values::Prepaid },
		{ TEXT("TINKOFF_CREDIT"), OpenAPIOrdersStatsOrderPaymentType::Values::TinkoffCredit }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIOrdersStatsOrderPaymentType::EnumFromString(const FString& EnumAsString, OpenAPIOrdersStatsOrderPaymentType::Values& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIOrdersStatsOrderPaymentType::Values& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIOrdersStatsOrderPaymentType::Values& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIOrdersStatsOrderPaymentType::WriteJson(JsonWriter& Writer) const
{
	WriteJsonValue(Writer, Value);
}

bool OpenAPIOrdersStatsOrderPaymentType::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Value);
}

}
