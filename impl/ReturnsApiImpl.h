/**
* Партнерский API Маркета
* API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
*
* The version of the OpenAPI document: LATEST
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/

/*
* ReturnsApiImpl.h
*
* 
*/

#ifndef RETURNS_API_IMPL_H_
#define RETURNS_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>
#include <optional>

#include <ReturnsApi.h>


#include "ApiClientDataErrorResponse.h"
#include "ApiForbiddenErrorResponse.h"
#include "ApiLimitErrorResponse.h"
#include "ApiNotFoundErrorResponse.h"
#include "ApiServerErrorResponse.h"
#include "ApiUnauthorizedErrorResponse.h"
#include "EmptyApiResponse.h"
#include "GetReturnResponse.h"
#include "GetReturnsResponse.h"
#include "RefundStatusType.h"
#include "ReturnType.h"
#include "SetReturnDecisionRequest.h"
#include <string>
#include <vector>

namespace org::openapitools::server::api
{

using namespace org::openapitools::server::model;

class  ReturnsApiImpl : public org::openapitools::server::api::ReturnsApi {
public:
    explicit ReturnsApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr);
    ~ReturnsApiImpl() override = default;

    void get_return(const int64_t &campaignId, const int64_t &orderId, const int64_t &returnId, Pistache::Http::ResponseWriter &response);
    void get_return_application(const int64_t &campaignId, const int64_t &orderId, const int64_t &returnId, Pistache::Http::ResponseWriter &response);
    void get_return_photo(const int64_t &campaignId, const int64_t &orderId, const int64_t &returnId, const int64_t &itemId, const std::string &imageHash, Pistache::Http::ResponseWriter &response);
    void get_returns(const int64_t &campaignId, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, const std::optional<std::vector<int64_t>> &orderIds, const std::optional<std::vector<org::openapitools::server::model::RefundStatusType>> &statuses, const std::optional<org::openapitools::server::model::ReturnType> &type, const std::optional<std::string> &fromDate, const std::optional<std::string> &toDate, const std::optional<std::string> &fromDate2, const std::optional<std::string> &toDate2, Pistache::Http::ResponseWriter &response);
    void set_return_decision(const int64_t &campaignId, const int64_t &orderId, const int64_t &returnId, const SetReturnDecisionRequest &setReturnDecisionRequest, Pistache::Http::ResponseWriter &response);
    void submit_return_decision(const int64_t &campaignId, const int64_t &orderId, const int64_t &returnId, Pistache::Http::ResponseWriter &response);

};

} // namespace org::openapitools::server::api



#endif
