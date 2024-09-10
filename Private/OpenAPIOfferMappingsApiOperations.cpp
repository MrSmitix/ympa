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

#include "OpenAPIOfferMappingsApiOperations.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Dom/JsonObject.h"
#include "Templates/SharedPointer.h"
#include "HttpModule.h"
#include "PlatformHttp.h"

namespace OpenAPI
{

FString OpenAPIOfferMappingsApi::GetOfferMappingEntriesRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("campaignId"), FStringFormatArg(ToUrlString(CampaignId)) } };

	FString Path = FString::Format(TEXT("/campaigns/{campaignId}/offer-mapping-entries"), PathParams);

	TArray<FString> QueryParams;
	if(OfferId.IsSet())
	{
		QueryParams.Add(FString(TEXT("offer_id=")) + CollectionToUrlString_csv(OfferId.GetValue(), TEXT("offer_id")));
	}
	if(ShopSku.IsSet())
	{
		QueryParams.Add(FString(TEXT("shop_sku=")) + CollectionToUrlString_csv(ShopSku.GetValue(), TEXT("shop_sku")));
	}
	if(MappingKind.IsSet())
	{
		QueryParams.Add(FString(TEXT("mapping_kind=")) + ToUrlString(MappingKind.GetValue()));
	}
	if(Status.IsSet())
	{
		QueryParams.Add(FString(TEXT("status=")) + CollectionToUrlString_csv(Status.GetValue(), TEXT("status")));
	}
	if(Availability.IsSet())
	{
		QueryParams.Add(FString(TEXT("availability=")) + CollectionToUrlString_csv(Availability.GetValue(), TEXT("availability")));
	}
	if(CategoryId.IsSet())
	{
		QueryParams.Add(FString(TEXT("category_id=")) + CollectionToUrlString_csv(CategoryId.GetValue(), TEXT("category_id")));
	}
	if(Vendor.IsSet())
	{
		QueryParams.Add(FString(TEXT("vendor=")) + CollectionToUrlString_csv(Vendor.GetValue(), TEXT("vendor")));
	}
	if(PageToken.IsSet())
	{
		QueryParams.Add(FString(TEXT("page_token=")) + ToUrlString(PageToken.GetValue()));
	}
	if(Limit.IsSet())
	{
		QueryParams.Add(FString(TEXT("limit=")) + ToUrlString(Limit.GetValue()));
	}
	Path += TCHAR('?');
	Path += FString::Join(QueryParams, TEXT("&"));

	return Path;
}

void OpenAPIOfferMappingsApi::GetOfferMappingEntriesRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("GET"));

}

void OpenAPIOfferMappingsApi::GetOfferMappingEntriesResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("Информация о товарах в каталоге."));
		break;
	case 400:
		SetResponseString(TEXT("Запрос содержит неправильные данные."));
		break;
	case 401:
		SetResponseString(TEXT("В запросе не указаны данные для авторизации."));
		break;
	case 403:
		SetResponseString(TEXT("Данные для авторизации неверны или доступ к ресурсу запрещен."));
		break;
	case 404:
		SetResponseString(TEXT("Запрашиваемый ресурс не найден."));
		break;
	case 420:
		SetResponseString(TEXT("Превышено ограничение на доступ к ресурсу."));
		break;
	case 500:
		SetResponseString(TEXT("Внутренняя ошибка сервера."));
		break;
	}
}

bool OpenAPIOfferMappingsApi::GetOfferMappingEntriesResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString OpenAPIOfferMappingsApi::GetSuggestedOfferMappingEntriesRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("campaignId"), FStringFormatArg(ToUrlString(CampaignId)) } };

	FString Path = FString::Format(TEXT("/campaigns/{campaignId}/offer-mapping-entries/suggestions"), PathParams);

	return Path;
}

void OpenAPIOfferMappingsApi::GetSuggestedOfferMappingEntriesRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = { TEXT("application/json") };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("POST"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
		// Body parameters
		FString JsonBody;
		JsonWriter Writer = TJsonWriterFactory<>::Create(&JsonBody);

		WriteJsonValue(Writer, OpenAPIGetSuggestedOfferMappingEntriesRequest);
		Writer->Close();

		HttpRequest->SetHeader(TEXT("Content-Type"), TEXT("application/json; charset=utf-8"));
		HttpRequest->SetContentAsString(JsonBody);
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Body parameter (OpenAPIGetSuggestedOfferMappingEntriesRequest) was ignored, not supported in multipart form"));
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Body parameter (OpenAPIGetSuggestedOfferMappingEntriesRequest) was ignored, not supported in urlencoded requests"));
	}
	else
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void OpenAPIOfferMappingsApi::GetSuggestedOfferMappingEntriesResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("Информация о товарах в каталоге."));
		break;
	case 400:
		SetResponseString(TEXT("Запрос содержит неправильные данные."));
		break;
	case 401:
		SetResponseString(TEXT("В запросе не указаны данные для авторизации."));
		break;
	case 403:
		SetResponseString(TEXT("Данные для авторизации неверны или доступ к ресурсу запрещен."));
		break;
	case 404:
		SetResponseString(TEXT("Запрашиваемый ресурс не найден."));
		break;
	case 420:
		SetResponseString(TEXT("Превышено ограничение на доступ к ресурсу."));
		break;
	case 500:
		SetResponseString(TEXT("Внутренняя ошибка сервера."));
		break;
	}
}

bool OpenAPIOfferMappingsApi::GetSuggestedOfferMappingEntriesResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString OpenAPIOfferMappingsApi::UpdateOfferMappingEntriesRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("campaignId"), FStringFormatArg(ToUrlString(CampaignId)) } };

	FString Path = FString::Format(TEXT("/campaigns/{campaignId}/offer-mapping-entries/updates"), PathParams);

	return Path;
}

void OpenAPIOfferMappingsApi::UpdateOfferMappingEntriesRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = { TEXT("application/json") };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("POST"));

	// Default to Json Body request
	if (Consumes.Num() == 0 || Consumes.Contains(TEXT("application/json")))
	{
		// Body parameters
		FString JsonBody;
		JsonWriter Writer = TJsonWriterFactory<>::Create(&JsonBody);

		WriteJsonValue(Writer, OpenAPIUpdateOfferMappingEntryRequest);
		Writer->Close();

		HttpRequest->SetHeader(TEXT("Content-Type"), TEXT("application/json; charset=utf-8"));
		HttpRequest->SetContentAsString(JsonBody);
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Body parameter (OpenAPIUpdateOfferMappingEntryRequest) was ignored, not supported in multipart form"));
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Body parameter (OpenAPIUpdateOfferMappingEntryRequest) was ignored, not supported in urlencoded requests"));
	}
	else
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void OpenAPIOfferMappingsApi::UpdateOfferMappingEntriesResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("Статус выполнения операции."));
		break;
	case 400:
		SetResponseString(TEXT("Запрос содержит неправильные данные."));
		break;
	case 401:
		SetResponseString(TEXT("В запросе не указаны данные для авторизации."));
		break;
	case 403:
		SetResponseString(TEXT("Данные для авторизации неверны или доступ к ресурсу запрещен."));
		break;
	case 404:
		SetResponseString(TEXT("Запрашиваемый ресурс не найден."));
		break;
	case 420:
		SetResponseString(TEXT("Превышено ограничение на доступ к ресурсу."));
		break;
	case 423:
		SetResponseString(TEXT("К ресурсу нельзя применить указанный метод."));
		break;
	case 500:
		SetResponseString(TEXT("Внутренняя ошибка сервера."));
		break;
	}
}

bool OpenAPIOfferMappingsApi::UpdateOfferMappingEntriesResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

}
