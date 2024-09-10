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

#include "OpenAPIFeedbacksApiOperations.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Dom/JsonObject.h"
#include "Templates/SharedPointer.h"
#include "HttpModule.h"
#include "PlatformHttp.h"

namespace OpenAPI
{

FString OpenAPIFeedbacksApi::GetFeedbackAndCommentUpdatesRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("campaignId"), FStringFormatArg(ToUrlString(CampaignId)) } };

	FString Path = FString::Format(TEXT("/campaigns/{campaignId}/feedback/updates"), PathParams);

	TArray<FString> QueryParams;
	if(PageToken.IsSet())
	{
		QueryParams.Add(FString(TEXT("page_token=")) + ToUrlString(PageToken.GetValue()));
	}
	if(Limit.IsSet())
	{
		QueryParams.Add(FString(TEXT("limit=")) + ToUrlString(Limit.GetValue()));
	}
	if(FromDate.IsSet())
	{
		QueryParams.Add(FString(TEXT("from_date=")) + ToUrlString(FromDate.GetValue()));
	}
	Path += TCHAR('?');
	Path += FString::Join(QueryParams, TEXT("&"));

	return Path;
}

void OpenAPIFeedbacksApi::GetFeedbackAndCommentUpdatesRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
{
	static const TArray<FString> Consumes = {  };
	//static const TArray<FString> Produces = { TEXT("application/json") };

	HttpRequest->SetVerb(TEXT("GET"));

}

void OpenAPIFeedbacksApi::GetFeedbackAndCommentUpdatesResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("Список отзывов для магазина."));
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

bool OpenAPIFeedbacksApi::GetFeedbackAndCommentUpdatesResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

}
