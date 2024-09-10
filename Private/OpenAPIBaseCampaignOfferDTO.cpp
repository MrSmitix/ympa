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

#include "OpenAPIBaseCampaignOfferDTO.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIBaseCampaignOfferDTO::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("offerId")); WriteJsonValue(Writer, OfferId);
	if (Quantum.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("quantum")); WriteJsonValue(Writer, Quantum.GetValue());
	}
	if (Available.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("available")); WriteJsonValue(Writer, Available.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIBaseCampaignOfferDTO::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("offerId"), OfferId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("quantum"), Quantum);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("available"), Available);

	return ParseSuccess;
}

}
