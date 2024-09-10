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

#include "OpenAPIUpdateOfferDTO.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Templates/SharedPointer.h"

namespace OpenAPI
{

void OpenAPIUpdateOfferDTO::WriteJson(JsonWriter& Writer) const
{
	Writer->WriteObjectStart();
	Writer->WriteIdentifierPrefix(TEXT("offerId")); WriteJsonValue(Writer, OfferId);
	if (Name.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("name")); WriteJsonValue(Writer, Name.GetValue());
	}
	if (MarketCategoryId.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("marketCategoryId")); WriteJsonValue(Writer, MarketCategoryId.GetValue());
	}
	if (Category.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("category")); WriteJsonValue(Writer, Category.GetValue());
	}
	if (Pictures.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("pictures")); WriteJsonValue(Writer, Pictures.GetValue());
	}
	if (Videos.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("videos")); WriteJsonValue(Writer, Videos.GetValue());
	}
	if (Manuals.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("manuals")); WriteJsonValue(Writer, Manuals.GetValue());
	}
	if (Vendor.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("vendor")); WriteJsonValue(Writer, Vendor.GetValue());
	}
	if (Barcodes.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("barcodes")); WriteJsonValue(Writer, Barcodes.GetValue());
	}
	if (Description.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("description")); WriteJsonValue(Writer, Description.GetValue());
	}
	if (ManufacturerCountries.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("manufacturerCountries")); WriteJsonValue(Writer, ManufacturerCountries.GetValue());
	}
	if (WeightDimensions.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("weightDimensions")); WriteJsonValue(Writer, WeightDimensions.GetValue());
	}
	if (VendorCode.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("vendorCode")); WriteJsonValue(Writer, VendorCode.GetValue());
	}
	if (Tags.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("tags")); WriteJsonValue(Writer, Tags.GetValue());
	}
	if (ShelfLife.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("shelfLife")); WriteJsonValue(Writer, ShelfLife.GetValue());
	}
	if (LifeTime.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("lifeTime")); WriteJsonValue(Writer, LifeTime.GetValue());
	}
	if (GuaranteePeriod.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("guaranteePeriod")); WriteJsonValue(Writer, GuaranteePeriod.GetValue());
	}
	if (CustomsCommodityCode.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("customsCommodityCode")); WriteJsonValue(Writer, CustomsCommodityCode.GetValue());
	}
	if (Certificates.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("certificates")); WriteJsonValue(Writer, Certificates.GetValue());
	}
	if (BoxCount.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("boxCount")); WriteJsonValue(Writer, BoxCount.GetValue());
	}
	if (Condition.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("condition")); WriteJsonValue(Writer, Condition.GetValue());
	}
	if (Type.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("type")); WriteJsonValue(Writer, Type.GetValue());
	}
	if (Downloadable.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("downloadable")); WriteJsonValue(Writer, Downloadable.GetValue());
	}
	if (Adult.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("adult")); WriteJsonValue(Writer, Adult.GetValue());
	}
	if (Age.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("age")); WriteJsonValue(Writer, Age.GetValue());
	}
	if (Params.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("params")); WriteJsonValue(Writer, Params.GetValue());
	}
	if (ParameterValues.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("parameterValues")); WriteJsonValue(Writer, ParameterValues.GetValue());
	}
	if (BasicPrice.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("basicPrice")); WriteJsonValue(Writer, BasicPrice.GetValue());
	}
	if (PurchasePrice.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("purchasePrice")); WriteJsonValue(Writer, PurchasePrice.GetValue());
	}
	if (AdditionalExpenses.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("additionalExpenses")); WriteJsonValue(Writer, AdditionalExpenses.GetValue());
	}
	if (CofinancePrice.IsSet())
	{
		Writer->WriteIdentifierPrefix(TEXT("cofinancePrice")); WriteJsonValue(Writer, CofinancePrice.GetValue());
	}
	Writer->WriteObjectEnd();
}

bool OpenAPIUpdateOfferDTO::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	const TSharedPtr<FJsonObject>* Object;
	if (!JsonValue->TryGetObject(Object))
		return false;

	bool ParseSuccess = true;

	ParseSuccess &= TryGetJsonValue(*Object, TEXT("offerId"), OfferId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("name"), Name);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("marketCategoryId"), MarketCategoryId);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("category"), Category);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("pictures"), Pictures);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("videos"), Videos);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("manuals"), Manuals);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("vendor"), Vendor);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("barcodes"), Barcodes);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("description"), Description);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("manufacturerCountries"), ManufacturerCountries);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("weightDimensions"), WeightDimensions);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("vendorCode"), VendorCode);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("tags"), Tags);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("shelfLife"), ShelfLife);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("lifeTime"), LifeTime);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("guaranteePeriod"), GuaranteePeriod);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("customsCommodityCode"), CustomsCommodityCode);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("certificates"), Certificates);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("boxCount"), BoxCount);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("condition"), Condition);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("type"), Type);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("downloadable"), Downloadable);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("adult"), Adult);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("age"), Age);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("params"), Params);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("parameterValues"), ParameterValues);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("basicPrice"), BasicPrice);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("purchasePrice"), PurchasePrice);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("additionalExpenses"), AdditionalExpenses);
	ParseSuccess &= TryGetJsonValue(*Object, TEXT("cofinancePrice"), CofinancePrice);

	return ParseSuccess;
}

}
