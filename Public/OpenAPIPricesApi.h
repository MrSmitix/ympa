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

#pragma once

#include "CoreMinimal.h"
#include "OpenAPIBaseModel.h"

namespace OpenAPI
{

class OPENAPI_API OpenAPIPricesApi
{
public:
	OpenAPIPricesApi();
	~OpenAPIPricesApi();

	/* Sets the URL Endpoint.
	* Note: several fallback endpoints can be configured in request retry policies, see Request::SetShouldRetry */
	void SetURL(const FString& Url);

	/* Adds global header params to all requests */
	void AddHeaderParam(const FString& Key, const FString& Value);
	void ClearHeaderParams();

	/* Sets the retry manager to the user-defined retry manager. User must manage the lifetime of the retry manager.
	* If no retry manager is specified and a request needs retries, a default retry manager will be used.
	* See also: Request::SetShouldRetry */
	void SetHttpRetryManager(FHttpRetrySystem::FManager& RetryManager);
	FHttpRetrySystem::FManager& GetHttpRetryManager();

	class GetPricesRequest;
	class GetPricesResponse;
	class GetPricesByOfferIdsRequest;
	class GetPricesByOfferIdsResponse;
	class GetSuggestedPricesRequest;
	class GetSuggestedPricesResponse;
	class UpdateBusinessPricesRequest;
	class UpdateBusinessPricesResponse;
	class UpdatePricesRequest;
	class UpdatePricesResponse;
	
    DECLARE_DELEGATE_OneParam(FGetPricesDelegate, const GetPricesResponse&);
    DECLARE_DELEGATE_OneParam(FGetPricesByOfferIdsDelegate, const GetPricesByOfferIdsResponse&);
    DECLARE_DELEGATE_OneParam(FGetSuggestedPricesDelegate, const GetSuggestedPricesResponse&);
    DECLARE_DELEGATE_OneParam(FUpdateBusinessPricesDelegate, const UpdateBusinessPricesResponse&);
    DECLARE_DELEGATE_OneParam(FUpdatePricesDelegate, const UpdatePricesResponse&);
    
    FHttpRequestPtr GetPrices(const GetPricesRequest& Request, const FGetPricesDelegate& Delegate = FGetPricesDelegate()) const;
    FHttpRequestPtr GetPricesByOfferIds(const GetPricesByOfferIdsRequest& Request, const FGetPricesByOfferIdsDelegate& Delegate = FGetPricesByOfferIdsDelegate()) const;
    FHttpRequestPtr GetSuggestedPrices(const GetSuggestedPricesRequest& Request, const FGetSuggestedPricesDelegate& Delegate = FGetSuggestedPricesDelegate()) const;
    FHttpRequestPtr UpdateBusinessPrices(const UpdateBusinessPricesRequest& Request, const FUpdateBusinessPricesDelegate& Delegate = FUpdateBusinessPricesDelegate()) const;
    FHttpRequestPtr UpdatePrices(const UpdatePricesRequest& Request, const FUpdatePricesDelegate& Delegate = FUpdatePricesDelegate()) const;
    
private:
    void OnGetPricesResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FGetPricesDelegate Delegate) const;
    void OnGetPricesByOfferIdsResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FGetPricesByOfferIdsDelegate Delegate) const;
    void OnGetSuggestedPricesResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FGetSuggestedPricesDelegate Delegate) const;
    void OnUpdateBusinessPricesResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FUpdateBusinessPricesDelegate Delegate) const;
    void OnUpdatePricesResponse(FHttpRequestPtr HttpRequest, FHttpResponsePtr HttpResponse, bool bSucceeded, FUpdatePricesDelegate Delegate) const;
    
	FHttpRequestRef CreateHttpRequest(const Request& Request) const;
	bool IsValid() const;
	void HandleResponse(FHttpResponsePtr HttpResponse, bool bSucceeded, Response& InOutResponse) const;

	FString Url;
	TMap<FString,FString> AdditionalHeaderParams;
	mutable FHttpRetrySystem::FManager* RetryManager = nullptr;
	mutable TUniquePtr<HttpRetryManager> DefaultRetryManager;
};

}
