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

#include "OpenAPIWarehouseDTO.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIWarehouseDTO::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("id")); WriteJsonValue(Writer, Id);
	Writer->WriteIdentifierPrefix(TEXT("name")); WriteJsonValue(Writer, Name);
	Writer->WriteIdentifierPrefix(TEXT("campaignId")); WriteJsonValue(Writer, CampaignId);
	Writer->WriteIdentifierPrefix(TEXT("express")); WriteJsonValue(Writer, Express);
	if (Address.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("address")); WriteJsonValue(Writer, Address.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIWarehouseDTO::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("id"), Id);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("name"), Name);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("campaignId"), CampaignId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("express"), Express);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("address"), Address);

	return ParseSuccess;
}

}
