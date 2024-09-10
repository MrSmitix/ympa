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

#include "OpenAPIOfferMappingInfoDTO.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIOfferMappingInfoDTO::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Mapping.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("mapping")); WriteJsonValue(Writer, Mapping.GetValue());
	}
	if (AwaitingModerationMapping.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("awaitingModerationMapping")); WriteJsonValue(Writer, AwaitingModerationMapping.GetValue());
	}
	if (RejectedMapping.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("rejectedMapping")); WriteJsonValue(Writer, RejectedMapping.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIOfferMappingInfoDTO::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("mapping"), Mapping);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("awaitingModerationMapping"), AwaitingModerationMapping);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("rejectedMapping"), RejectedMapping);

	return ParseSuccess;
}

}
