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

#include "OpenAPIReturnItemDTO.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIReturnItemDTO::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (MarketSku.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("marketSku")); WriteJsonValue(Writer, MarketSku.GetValue());
	}
	Writer->WriteIdentifierPrefix(TEXT("shopSku")); WriteJsonValue(Writer, ShopSku);
	Writer->WriteIdentifierPrefix(TEXT("count")); WriteJsonValue(Writer, Count);
	if (Decisions.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("decisions")); WriteJsonValue(Writer, Decisions.GetValue());
	}
	if (Instances.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("instances")); WriteJsonValue(Writer, Instances.GetValue());
	}
	if (Tracks.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("tracks")); WriteJsonValue(Writer, Tracks.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIReturnItemDTO::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("marketSku"), MarketSku);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("shopSku"), ShopSku);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("count"), Count);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("decisions"), Decisions);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("instances"), Instances);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("tracks"), Tracks);

	return ParseSuccess;
}

}
