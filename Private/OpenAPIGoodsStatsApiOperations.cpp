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

#include "OpenAPIGoodsStatsApiOperations.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Dom/JsonObject.h"
#include "Templates/SharedPointer.h"
#include "HttpModule.h"
#include "PlatformHttp.h"

namespace OpenAPI
{

FString OpenAPIGoodsStatsApi::GetGoodsStatsRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("campaignId"), FStringFormatArg(ToUrlString(CampaignId)) } };

	FString Path = FString::Format(TEXT("/campaigns/{campaignId}/stats/skus"), PathParams);

	return Path;
}

void OpenAPIGoodsStatsApi::GetGoodsStatsRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
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

		WriteJsonValue(Writer, OpenAPIGetGoodsStatsRequest);
		Writer->Close();

		HttpRequest->SetHeader(TEXT("Content-Type"), TEXT("application/json; charset=utf-8"));
		HttpRequest->SetContentAsString(JsonBody);
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Body parameter (OpenAPIGetGoodsStatsRequest) was ignored, not supported in multipart form"));
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Body parameter (OpenAPIGetGoodsStatsRequest) was ignored, not supported in urlencoded requests"));
	}
	else
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void OpenAPIGoodsStatsApi::GetGoodsStatsResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("Отчет по товарам."));
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

bool OpenAPIGoodsStatsApi::GetGoodsStatsResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

}
