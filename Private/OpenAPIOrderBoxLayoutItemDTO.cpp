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

#include "OpenAPIOrderBoxLayoutItemDTO.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIOrderBoxLayoutItemDTO::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("id")); WriteJsonValue(Writer, Id);
	if (FullCount.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("fullCount")); WriteJsonValue(Writer, FullCount.GetValue());
	}
	if (PartialCount.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("partialCount")); WriteJsonValue(Writer, PartialCount.GetValue());
	}
	if (Instances.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("instances")); WriteJsonValue(Writer, Instances.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIOrderBoxLayoutItemDTO::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("id"), Id);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("fullCount"), FullCount);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("partialCount"), PartialCount);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("instances"), Instances);

	return ParseSuccess;
}

}
