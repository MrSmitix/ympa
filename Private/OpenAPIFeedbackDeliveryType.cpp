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

#include "OpenAPIFeedbackDeliveryType.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIFeedbackDeliveryType::Values& Value)
{
	switch (Value)
	{
	case OpenAPIFeedbackDeliveryType::Values::Delivery:
		return TEXT("DELIVERY");
	case OpenAPIFeedbackDeliveryType::Values::Pickup:
		return TEXT("PICKUP");
	case OpenAPIFeedbackDeliveryType::Values::Instore:
		return TEXT("INSTORE");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIFeedbackDeliveryType::Values Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIFeedbackDeliveryType::EnumToString(const OpenAPIFeedbackDeliveryType::Values& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIFeedbackDeliveryType::Values& Value)
{
	static TMap<FString, OpenAPIFeedbackDeliveryType::Values> StringToEnum = { 
		{ TEXT("DELIVERY"), OpenAPIFeedbackDeliveryType::Values::Delivery },
		{ TEXT("PICKUP"), OpenAPIFeedbackDeliveryType::Values::Pickup },
		{ TEXT("INSTORE"), OpenAPIFeedbackDeliveryType::Values::Instore }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIFeedbackDeliveryType::EnumFromString(const FString& EnumAsString, OpenAPIFeedbackDeliveryType::Values& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIFeedbackDeliveryType::Values& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIFeedbackDeliveryType::Values& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIFeedbackDeliveryType::WriteJson(JsonWriter& Writer) const
{
	WriteJsonValue(Writer, Value);
}

bool OpenAPIFeedbackDeliveryType::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Value);
}

}
