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

#include "OpenAPIOutletWorkingScheduleItemDTO.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIOutletWorkingScheduleItemDTO::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("startDay")); WriteJsonValue(Writer, StartDay);
	Writer->WriteIdentifierPrefix(TEXT("endDay")); WriteJsonValue(Writer, EndDay);
	Writer->WriteIdentifierPrefix(TEXT("startTime")); WriteJsonValue(Writer, StartTime);
	Writer->WriteIdentifierPrefix(TEXT("endTime")); WriteJsonValue(Writer, EndTime);
	Writer->WriteObjectEnd();
}

bool OpenAPIOutletWorkingScheduleItemDTO::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("startDay"), StartDay);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("endDay"), EndDay);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("startTime"), StartTime);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("endTime"), EndTime);

	return ParseSuccess;
}

}
