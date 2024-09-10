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

#include "OrdersStatsApiImpl.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

OrdersStatsApiImpl::OrdersStatsApiImpl(const std::shared_ptr<Pistache::Rest::Router>& rtr)
    : OrdersStatsApi(rtr)
{
}

void OrdersStatsApiImpl::get_orders_stats(const int64_t &campaignId, const std::optional<std::string> &pageToken, const std::optional<int32_t> &limit, const GetOrdersStatsRequest &getOrdersStatsRequest, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}

}
}
}
}

