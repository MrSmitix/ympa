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

#include "OpenAPIGetPriceWithDiscountDTO.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIGetPriceWithDiscountDTO::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("value")); WriteJsonValue(Writer, Value);
	Writer->WriteIdentifierPrefix(TEXT("currencyId")); WriteJsonValue(Writer, CurrencyId);
	if (DiscountBase.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("discountBase")); WriteJsonValue(Writer, DiscountBase.GetValue());
	}
	Writer->WriteIdentifierPrefix(TEXT("updatedAt")); WriteJsonValue(Writer, UpdatedAt);
	Writer->WriteObjectEnd();
}

bool OpenAPIGetPriceWithDiscountDTO::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("value"), Value);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("currencyId"), CurrencyId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("discountBase"), DiscountBase);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("updatedAt"), UpdatedAt);

	return ParseSuccess;
}

}
