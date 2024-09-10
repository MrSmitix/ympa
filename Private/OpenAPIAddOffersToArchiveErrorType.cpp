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

#include "OpenAPIAddOffersToArchiveErrorType.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIAddOffersToArchiveErrorType::Values& Value)
{
	switch (Value)
	{
	case OpenAPIAddOffersToArchiveErrorType::Values::OfferHasStocks:
		return TEXT("OFFER_HAS_STOCKS");
	case OpenAPIAddOffersToArchiveErrorType::Values::Unknown:
		return TEXT("UNKNOWN");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIAddOffersToArchiveErrorType::Values Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIAddOffersToArchiveErrorType::EnumToString(const OpenAPIAddOffersToArchiveErrorType::Values& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIAddOffersToArchiveErrorType::Values& Value)
{
	static TMap<FString, OpenAPIAddOffersToArchiveErrorType::Values> StringToEnum = { 
		{ TEXT("OFFER_HAS_STOCKS"), OpenAPIAddOffersToArchiveErrorType::Values::OfferHasStocks },
		{ TEXT("UNKNOWN"), OpenAPIAddOffersToArchiveErrorType::Values::Unknown }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIAddOffersToArchiveErrorType::EnumFromString(const FString& EnumAsString, OpenAPIAddOffersToArchiveErrorType::Values& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIAddOffersToArchiveErrorType::Values& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIAddOffersToArchiveErrorType::Values& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIAddOffersToArchiveErrorType::WriteJson(JsonWriter& Writer) const
{
	WriteJsonValue(Writer, Value);
}

bool OpenAPIAddOffersToArchiveErrorType::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Value);
}

}
