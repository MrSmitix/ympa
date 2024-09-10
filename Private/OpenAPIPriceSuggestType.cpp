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

#include "OpenAPIPriceSuggestType.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

inline FString ToString(const OpenAPIPriceSuggestType::Values& Value)
{
	switch (Value)
	{
	case OpenAPIPriceSuggestType::Values::Buybox:
		return TEXT("BUYBOX");
	case OpenAPIPriceSuggestType::Values::DefaultOffer:
		return TEXT("DEFAULT_OFFER");
	case OpenAPIPriceSuggestType::Values::MinPriceMarket:
		return TEXT("MIN_PRICE_MARKET");
	}

	UE_LOG(LogOpenAPI, Error, TEXT("Invalid OpenAPIPriceSuggestType::Values Value (%d)"), (int)Value);
	return TEXT("");
}

FString OpenAPIPriceSuggestType::EnumToString(const OpenAPIPriceSuggestType::Values& EnumValue)
{
	return ToString(EnumValue);
}

inline bool FromString(const FString& EnumAsString, OpenAPIPriceSuggestType::Values& Value)
{
	static TMap<FString, OpenAPIPriceSuggestType::Values> StringToEnum = { 
		{ TEXT("BUYBOX"), OpenAPIPriceSuggestType::Values::Buybox },
		{ TEXT("DEFAULT_OFFER"), OpenAPIPriceSuggestType::Values::DefaultOffer },
		{ TEXT("MIN_PRICE_MARKET"), OpenAPIPriceSuggestType::Values::MinPriceMarket }, };

	const auto Found = StringToEnum.Find(EnumAsString);
	if(Found)
		Value = *Found;

	return Found != nullptr;
}

bool OpenAPIPriceSuggestType::EnumFromString(const FString& EnumAsString, OpenAPIPriceSuggestType::Values& EnumValue)
{
	return FromString(EnumAsString, EnumValue);
}

inline void WriteJsonValue(JsonWriter& Writer, const OpenAPIPriceSuggestType::Values& Value)
{
	WriteJsonValue(Writer, ToString(Value));
}

inline bool TryGetJsonValue(const TSharedPtr<FJsonValue>& JsonValue, OpenAPIPriceSuggestType::Values& Value)
{
	FString TmpValue;
	if (JsonValue->TryGetString(TmpValue))
	{
		if(FromString(TmpValue, Value))
			return true;
	}
	return false;
}

void OpenAPIPriceSuggestType::WriteJson(JsonWriter& Writer) const
{
	WriteJsonValue(Writer, Value);
}

bool OpenAPIPriceSuggestType::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Value);
}

}
