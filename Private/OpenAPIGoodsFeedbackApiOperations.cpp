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

#include "OpenAPIGoodsFeedbackApiOperations.h"

#include "OpenAPIModule.h"
#include "OpenAPIHelpers.h"

#include "Dom/JsonObject.h"
#include "Templates/SharedPointer.h"
#include "HttpModule.h"
#include "PlatformHttp.h"

namespace OpenAPI
{

FString OpenAPIGoodsFeedbackApi::DeleteGoodsFeedbackCommentRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("businessId"), FStringFormatArg(ToUrlString(BusinessId)) } };

	FString Path = FString::Format(TEXT("/businesses/{businessId}/goods-feedback/comments/delete"), PathParams);

	return Path;
}

void OpenAPIGoodsFeedbackApi::DeleteGoodsFeedbackCommentRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
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

		WriteJsonValue(Writer, OpenAPIDeleteGoodsFeedbackCommentRequest);
		Writer->Close();

		HttpRequest->SetHeader(TEXT("Content-Type"), TEXT("application/json; charset=utf-8"));
		HttpRequest->SetContentAsString(JsonBody);
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Body parameter (OpenAPIDeleteGoodsFeedbackCommentRequest) was ignored, not supported in multipart form"));
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Body parameter (OpenAPIDeleteGoodsFeedbackCommentRequest) was ignored, not supported in urlencoded requests"));
	}
	else
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void OpenAPIGoodsFeedbackApi::DeleteGoodsFeedbackCommentResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("Пустой ответ."));
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

bool OpenAPIGoodsFeedbackApi::DeleteGoodsFeedbackCommentResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString OpenAPIGoodsFeedbackApi::GetGoodsFeedbackCommentsRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("businessId"), FStringFormatArg(ToUrlString(BusinessId)) } };

	FString Path = FString::Format(TEXT("/businesses/{businessId}/goods-feedback/comments"), PathParams);

	TArray<FString> QueryParams;
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

void OpenAPIGoodsFeedbackApi::GetGoodsFeedbackCommentsRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
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

		WriteJsonValue(Writer, OpenAPIGetGoodsFeedbackCommentsRequest);
		Writer->Close();

		HttpRequest->SetHeader(TEXT("Content-Type"), TEXT("application/json; charset=utf-8"));
		HttpRequest->SetContentAsString(JsonBody);
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Body parameter (OpenAPIGetGoodsFeedbackCommentsRequest) was ignored, not supported in multipart form"));
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Body parameter (OpenAPIGetGoodsFeedbackCommentsRequest) was ignored, not supported in urlencoded requests"));
	}
	else
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void OpenAPIGoodsFeedbackApi::GetGoodsFeedbackCommentsResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("Дерево комментариев к отзыву."));
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

bool OpenAPIGoodsFeedbackApi::GetGoodsFeedbackCommentsResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString OpenAPIGoodsFeedbackApi::GetGoodsFeedbacksRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("businessId"), FStringFormatArg(ToUrlString(BusinessId)) } };

	FString Path = FString::Format(TEXT("/businesses/{businessId}/goods-feedback"), PathParams);

	TArray<FString> QueryParams;
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

void OpenAPIGoodsFeedbackApi::GetGoodsFeedbacksRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
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

		if (OpenAPIGetGoodsFeedbackRequest.IsSet())
		{
			WriteJsonValue(Writer, OpenAPIGetGoodsFeedbackRequest.GetValue());
		}
		Writer->Close();

		HttpRequest->SetHeader(TEXT("Content-Type"), TEXT("application/json; charset=utf-8"));
		HttpRequest->SetContentAsString(JsonBody);
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Body parameter (OpenAPIGetGoodsFeedbackRequest) was ignored, not supported in multipart form"));
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Body parameter (OpenAPIGetGoodsFeedbackRequest) was ignored, not supported in urlencoded requests"));
	}
	else
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void OpenAPIGoodsFeedbackApi::GetGoodsFeedbacksResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("Список отзывов."));
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

bool OpenAPIGoodsFeedbackApi::GetGoodsFeedbacksResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString OpenAPIGoodsFeedbackApi::SkipGoodsFeedbacksReactionRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("businessId"), FStringFormatArg(ToUrlString(BusinessId)) } };

	FString Path = FString::Format(TEXT("/businesses/{businessId}/goods-feedback/skip-reaction"), PathParams);

	return Path;
}

void OpenAPIGoodsFeedbackApi::SkipGoodsFeedbacksReactionRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
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

		WriteJsonValue(Writer, OpenAPISkipGoodsFeedbackReactionRequest);
		Writer->Close();

		HttpRequest->SetHeader(TEXT("Content-Type"), TEXT("application/json; charset=utf-8"));
		HttpRequest->SetContentAsString(JsonBody);
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Body parameter (OpenAPISkipGoodsFeedbackReactionRequest) was ignored, not supported in multipart form"));
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Body parameter (OpenAPISkipGoodsFeedbackReactionRequest) was ignored, not supported in urlencoded requests"));
	}
	else
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void OpenAPIGoodsFeedbackApi::SkipGoodsFeedbacksReactionResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("Пустой ответ."));
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

bool OpenAPIGoodsFeedbackApi::SkipGoodsFeedbacksReactionResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

FString OpenAPIGoodsFeedbackApi::UpdateGoodsFeedbackCommentRequest::ComputePath() const
{
	TMap<FString, FStringFormatArg> PathParams = { 
	{ TEXT("businessId"), FStringFormatArg(ToUrlString(BusinessId)) } };

	FString Path = FString::Format(TEXT("/businesses/{businessId}/goods-feedback/comments/update"), PathParams);

	return Path;
}

void OpenAPIGoodsFeedbackApi::UpdateGoodsFeedbackCommentRequest::SetupHttpRequest(const FHttpRequestRef& HttpRequest) const
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

		WriteJsonValue(Writer, OpenAPIUpdateGoodsFeedbackCommentRequest);
		Writer->Close();

		HttpRequest->SetHeader(TEXT("Content-Type"), TEXT("application/json; charset=utf-8"));
		HttpRequest->SetContentAsString(JsonBody);
	}
	else if (Consumes.Contains(TEXT("multipart/form-data")))
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Body parameter (OpenAPIUpdateGoodsFeedbackCommentRequest) was ignored, not supported in multipart form"));
	}
	else if (Consumes.Contains(TEXT("application/x-www-form-urlencoded")))
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Body parameter (OpenAPIUpdateGoodsFeedbackCommentRequest) was ignored, not supported in urlencoded requests"));
	}
	else
	{
		UE_LOG(LogOpenAPI, Error, TEXT("Request ContentType not supported (%s)"), *FString::Join(Consumes, TEXT(",")));
	}
}

void OpenAPIGoodsFeedbackApi::UpdateGoodsFeedbackCommentResponse::SetHttpResponseCode(EHttpResponseCodes::Type InHttpResponseCode)
{
	Response::SetHttpResponseCode(InHttpResponseCode);
	switch ((int)InHttpResponseCode)
	{
	case 200:
		SetResponseString(TEXT("Информация о добавленном или измененном комментарии."));
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

bool OpenAPIGoodsFeedbackApi::UpdateGoodsFeedbackCommentResponse::FromJson(const TSharedPtr<FJsonValue>& JsonValue)
{
	return TryGetJsonValue(JsonValue, Content);
}

}
