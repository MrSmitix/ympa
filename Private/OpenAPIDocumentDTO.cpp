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

#include "OpenAPIDocumentDTO.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIDocumentDTO::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Status.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("status")); WriteJsonValue(Writer, Status.GetValue());
	}
	if (Number.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("number")); WriteJsonValue(Writer, Number.GetValue());
	}
	if (Date.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("date")); WriteJsonValue(Writer, Date.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIDocumentDTO::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("status"), Status);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("number"), Number);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("date"), Date);

	return ParseSuccess;
}

}
