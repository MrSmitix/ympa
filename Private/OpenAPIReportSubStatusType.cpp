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

#include "OpenAPIReportSubStatusType.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIReportSubStatusType::Values& Value)
{
	switch (Value)
	{
	case OpenAPIReportSubStatusType::Values::NoData:
		return TEXT("NO_DATA");
	case OpenAPIReportSubStatusType::Values::TooLarge:
		return TEXT("TOO_LARGE");
	case OpenAPIReportSubStatusType::Values::ResourceNotFound:
		return TEXT("RESOURCE_NOT_FOUND");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIReportSubStatusType::Values Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIReportSubStatusType::EnumToString(const OpenAPIReportSubStatusType::Values& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIReportSubStatusType::Values& Value)
{
	static TMap<FString, OpenAPIReportSubStatusType::Values> StringToEnum = { 
		{ TEXT("NO_DATA"), OpenAPIReportSubStatusType::Values::NoData },
		{ TEXT("TOO_LARGE"), OpenAPIReportSubStatusType::Values::TooLarge },
		{ TEXT("RESOURCE_NOT_FOUND"), OpenAPIReportSubStatusType::Values::ResourceNotFound }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIReportSubStatusType::EnumFromString(const FString& EnumAsString, OpenAPIReportSubStatusType::Values& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIReportSubStatusType::Values& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIReportSubStatusType::Values& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIReportSubStatusType::WriteJson(JsonWriter& Writer) const
{
	WriteJsonValue(Writer, Value);
}

bool OpenAPIReportSubStatusType::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Value);
}

}
