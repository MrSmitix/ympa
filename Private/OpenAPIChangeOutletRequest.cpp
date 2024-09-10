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

#include "OpenAPIChangeOutletRequest.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIChangeOutletRequest::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("name")); WriteJsonValue(Writer, Name);
	Writer->WriteIdentifierPrefix(TEXT("type")); WriteJsonValue(Writer, Type);
	if (Coords.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("coords")); WriteJsonValue(Writer, Coords.GetValue());
	}
	if (IsMain.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("isMain")); WriteJsonValue(Writer, IsMain.GetValue());
	}
	if (ShopOutletCode.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("shopOutletCode")); WriteJsonValue(Writer, ShopOutletCode.GetValue());
	}
	if (Visibility.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("visibility")); WriteJsonValue(Writer, Visibility.GetValue());
	}
	Writer->WriteIdentifierPrefix(TEXT("address")); WriteJsonValue(Writer, Address);
	Writer->WriteIdentifierPrefix(TEXT("phones")); WriteJsonValue(Writer, Phones);
	Writer->WriteIdentifierPrefix(TEXT("workingSchedule")); WriteJsonValue(Writer, WorkingSchedule);
	if (DeliveryRules.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("deliveryRules")); WriteJsonValue(Writer, DeliveryRules.GetValue());
	}
	if (StoragePeriod.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("storagePeriod")); WriteJsonValue(Writer, StoragePeriod.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIChangeOutletRequest::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("name"), Name);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("type"), Type);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("coords"), Coords);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("isMain"), IsMain);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("shopOutletCode"), ShopOutletCode);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("visibility"), Visibility);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("address"), Address);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("phones"), Phones);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("workingSchedule"), WorkingSchedule);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("deliveryRules"), DeliveryRules);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("storagePeriod"), StoragePeriod);

	return ParseSuccess;
}

}
