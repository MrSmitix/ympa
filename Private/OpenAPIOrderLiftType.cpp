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

#include "OpenAPIOrderLiftType.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIOrderLiftType::Values& Value)
{
	switch (Value)
	{
	case OpenAPIOrderLiftType::Values::NotNeeded:
		return TEXT("NOT_NEEDED");
	case OpenAPIOrderLiftType::Values::Manual:
		return TEXT("MANUAL");
	case OpenAPIOrderLiftType::Values::Elevator:
		return TEXT("ELEVATOR");
	case OpenAPIOrderLiftType::Values::CargoElevator:
		return TEXT("CARGO_ELEVATOR");
	case OpenAPIOrderLiftType::Values::Free:
		return TEXT("FREE");
	case OpenAPIOrderLiftType::Values::Unknown:
		return TEXT("UNKNOWN");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIOrderLiftType::Values Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIOrderLiftType::EnumToString(const OpenAPIOrderLiftType::Values& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIOrderLiftType::Values& Value)
{
	static TMap<FString, OpenAPIOrderLiftType::Values> StringToEnum = { 
		{ TEXT("NOT_NEEDED"), OpenAPIOrderLiftType::Values::NotNeeded },
		{ TEXT("MANUAL"), OpenAPIOrderLiftType::Values::Manual },
		{ TEXT("ELEVATOR"), OpenAPIOrderLiftType::Values::Elevator },
		{ TEXT("CARGO_ELEVATOR"), OpenAPIOrderLiftType::Values::CargoElevator },
		{ TEXT("FREE"), OpenAPIOrderLiftType::Values::Free },
		{ TEXT("UNKNOWN"), OpenAPIOrderLiftType::Values::Unknown }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIOrderLiftType::EnumFromString(const FString& EnumAsString, OpenAPIOrderLiftType::Values& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIOrderLiftType::Values& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIOrderLiftType::Values& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIOrderLiftType::WriteJson(JsonWriter& Writer) const
{
	WriteJsonValue(Writer, Value);
}

bool OpenAPIOrderLiftType::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Value);
}

}
