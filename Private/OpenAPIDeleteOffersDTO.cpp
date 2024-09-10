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

#include "OpenAPIDeleteOffersDTO.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIDeleteOffersDTO::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (NotDeletedOfferIds.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("notDeletedOfferIds")); WriteJsonValue(Writer, NotDeletedOfferIds.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIDeleteOffersDTO::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("notDeletedOfferIds"), NotDeletedOfferIds);

	return ParseSuccess;
}

}
