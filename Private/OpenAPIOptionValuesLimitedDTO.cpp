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

#include "OpenAPIOptionValuesLimitedDTO.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIOptionValuesLimitedDTO::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("limitingOptionValueId")); WriteJsonValue(Writer, LimitingOptionValueId);
	Writer->WriteIdentifierPrefix(TEXT("optionValueIds")); WriteJsonValue(Writer, OptionValueIds);
	Writer->WriteObjectEnd();
}

bool OpenAPIOptionValuesLimitedDTO::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("limitingOptionValueId"), LimitingOptionValueId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("optionValueIds"), OptionValueIds);

	return ParseSuccess;
}

}
