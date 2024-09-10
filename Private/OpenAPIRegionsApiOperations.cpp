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

#include "OpenAPIRegionsApiOperations.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Dom/JsonObject.h"
#include "Templates/SharedPointer.h"
#include "HttpModule.h"
#include "PlatformHttp.h"

namespace OpenAPI
{

FString OpenAPIRegionsApi::SearchRegionChildrenRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("regionId"), FStringFormatArg(ToUrlString(RegionId)) } };

	FString Path = FString::Format(TEXT("/regions/{regionId}/children"), PathParams);

	TArray<FString> QueryParams;
	if(Page.IsSet())
	{
		QueryParams.Add(FString(TEXT("page=")) + ToUrlString(Page.GetValue()));
	}
	if(PageSize.IsSet())
	{
		QueryParams.Add(FString(TEXT("pageSize=")) + ToUrlString(PageSize.GetValue()));
	}
	Path += TCHAR('?');
	Path += FString::Join(QueryParams, TEXT("&"));

	return Path;
}

void OpenAPIRegionsApi::SearchRegionChildrenRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("GET"));

}

void OpenAPIRegionsApi::SearchRegionChildrenResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("Регионы, являющиеся дочерними к указанному в запросе."));
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

bool OpenAPIRegionsApi::SearchRegionChildrenResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString OpenAPIRegionsApi::SearchRegionsByIdRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("regionId"), FStringFormatArg(ToUrlString(RegionId)) } };

	FString Path = FString::Format(TEXT("/regions/{regionId}"), PathParams);

	return Path;
}

void OpenAPIRegionsApi::SearchRegionsByIdRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("GET"));

}

void OpenAPIRegionsApi::SearchRegionsByIdResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("Найденный регион."));
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

bool OpenAPIRegionsApi::SearchRegionsByIdResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString OpenAPIRegionsApi::SearchRegionsByNameRequest::ComputePath() const
{
	FString Path(TEXT("/regions"));
	TArray<FString> QueryParams;
	QueryParams.Add(FString(TEXT("name=")) + ToUrlString(Name));
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

void OpenAPIRegionsApi::SearchRegionsByNameRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("GET"));

}

void OpenAPIRegionsApi::SearchRegionsByNameResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("Список найденных регионов."));
		break;
	case 401:
		SetResponseString(TEXT("В запросе не указаны данные для авторизации."));
		break;
	case 403:
		SetResponseString(TEXT("Данные для авторизации неверны или доступ к ресурсу запрещен."));
		break;
	case 420:
		SetResponseString(TEXT("Превышено ограничение на доступ к ресурсу."));
		break;
	case 500:
		SetResponseString(TEXT("Внутренняя ошибка сервера."));
		break;
	}
}

bool OpenAPIRegionsApi::SearchRegionsByNameResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

}
