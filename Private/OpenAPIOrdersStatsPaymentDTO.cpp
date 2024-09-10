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

#include "OpenAPIOrdersStatsPaymentDTO.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIOrdersStatsPaymentDTO::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Id.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("id")); WriteJsonValue(Writer, Id.GetValue());
	}
	if (Date.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("date")); WriteJsonValue(Writer, Date.GetValue());
	}
	if (Type.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("type")); WriteJsonValue(Writer, Type.GetValue());
	}
	if (Source.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("source")); WriteJsonValue(Writer, Source.GetValue());
	}
	if (Total.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("total")); WriteJsonValue(Writer, Total.GetValue());
	}
	if (PaymentOrder.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("paymentOrder")); WriteJsonValue(Writer, PaymentOrder.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIOrdersStatsPaymentDTO::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("id"), Id);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("date"), Date);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("type"), Type);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("source"), Source);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("total"), Total);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("paymentOrder"), PaymentOrder);

	return ParseSuccess;
}

}
