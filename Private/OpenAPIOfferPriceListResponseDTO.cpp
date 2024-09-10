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

#include "OpenAPIOfferPriceListResponseDTO.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIOfferPriceListResponseDTO::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("offers")); WriteJsonValue(Writer, Offers);
	if (Paging.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("paging")); WriteJsonValue(Writer, Paging.GetValue());
	}
	if (Total.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("total")); WriteJsonValue(Writer, Total.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIOfferPriceListResponseDTO::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("offers"), Offers);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("paging"), Paging);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("total"), Total);

	return ParseSuccess;
}

}
