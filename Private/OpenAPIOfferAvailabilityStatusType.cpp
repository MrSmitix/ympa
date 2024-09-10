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

#include "OpenAPIOfferAvailabilityStatusType.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIOfferAvailabilityStatusType::Values& Value)
{
	switch (Value)
	{
	case OpenAPIOfferAvailabilityStatusType::Values::Active:
		return TEXT("ACTIVE");
	case OpenAPIOfferAvailabilityStatusType::Values::Inactive:
		return TEXT("INACTIVE");
	case OpenAPIOfferAvailabilityStatusType::Values::Delisted:
		return TEXT("DELISTED");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIOfferAvailabilityStatusType::Values Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIOfferAvailabilityStatusType::EnumToString(const OpenAPIOfferAvailabilityStatusType::Values& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIOfferAvailabilityStatusType::Values& Value)
{
	static TMap<FString, OpenAPIOfferAvailabilityStatusType::Values> StringToEnum = { 
		{ TEXT("ACTIVE"), OpenAPIOfferAvailabilityStatusType::Values::Active },
		{ TEXT("INACTIVE"), OpenAPIOfferAvailabilityStatusType::Values::Inactive },
		{ TEXT("DELISTED"), OpenAPIOfferAvailabilityStatusType::Values::Delisted }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIOfferAvailabilityStatusType::EnumFromString(const FString& EnumAsString, OpenAPIOfferAvailabilityStatusType::Values& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIOfferAvailabilityStatusType::Values& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIOfferAvailabilityStatusType::Values& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIOfferAvailabilityStatusType::WriteJson(JsonWriter& Writer) const
{
	WriteJsonValue(Writer, Value);
}

bool OpenAPIOfferAvailabilityStatusType::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Value);
}

}
