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

#include "OpenAPISearchModelsResponse.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPISearchModelsResponse::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("models")); WriteJsonValue(Writer, Models);
	if (Currency.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("currency")); WriteJsonValue(Writer, Currency.GetValue());
	}
	if (RegionId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("regionId")); WriteJsonValue(Writer, RegionId.GetValue());
	}
	if (Pager.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("pager")); WriteJsonValue(Writer, Pager.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPISearchModelsResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("models"), Models);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("currency"), Currency);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("regionId"), RegionId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("pager"), Pager);

	return ParseSuccess;
}

}
