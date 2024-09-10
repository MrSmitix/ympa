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

#include "OpenAPIGoodsFeedbackDescriptionDTO.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIGoodsFeedbackDescriptionDTO::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	if (Advantages.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("advantages")); WriteJsonValue(Writer, Advantages.GetValue());
	}
	if (Disadvantages.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("disadvantages")); WriteJsonValue(Writer, Disadvantages.GetValue());
	}
	if (Comment.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("comment")); WriteJsonValue(Writer, Comment.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIGoodsFeedbackDescriptionDTO::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("advantages"), Advantages);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("disadvantages"), Disadvantages);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("comment"), Comment);

	return ParseSuccess;
}

}
