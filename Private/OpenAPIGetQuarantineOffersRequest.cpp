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

#include "OpenAPIGetQuarantineOffersRequest.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIGetQuarantineOffersRequest::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (OfferIds.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("offerIds")); WriteJsonValue(Writer, OfferIds.GetValue());
	}
	if (CardStatuses.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("cardStatuses")); WriteJsonValue(Writer, CardStatuses.GetValue());
	}
	if (CategoryIds.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("categoryIds")); WriteJsonValue(Writer, CategoryIds.GetValue());
	}
	if (VendorNames.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("vendorNames")); WriteJsonValue(Writer, VendorNames.GetValue());
	}
	if (Tags.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("tags")); WriteJsonValue(Writer, Tags.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIGetQuarantineOffersRequest::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("offerIds"), OfferIds);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("cardStatuses"), CardStatuses);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("categoryIds"), CategoryIds);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("vendorNames"), VendorNames);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("tags"), Tags);

	return ParseSuccess;
}

}
