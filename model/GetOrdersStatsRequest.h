/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.8.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * GetOrdersStatsRequest.h
 *
 * Запрос информации по заказам.
 */

#ifndef GetOrdersStatsRequest_H_
#define GetOrdersStatsRequest_H_



#include <string>
#include <vector>
#include "OrderStatsStatusType.h"
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Запрос информации по заказам.
/// </summary>
class  GetOrdersStatsRequest 
{
public:
    GetOrdersStatsRequest() = default;
    explicit GetOrdersStatsRequest(boost::property_tree::ptree const& pt);
    virtual ~GetOrdersStatsRequest() = default;

    GetOrdersStatsRequest(const GetOrdersStatsRequest& other) = default; // copy constructor
    GetOrdersStatsRequest(GetOrdersStatsRequest&& other) noexcept = default; // move constructor

    GetOrdersStatsRequest& operator=(const GetOrdersStatsRequest& other) = default; // copy assignment
    GetOrdersStatsRequest& operator=(GetOrdersStatsRequest&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// GetOrdersStatsRequest members

    /// <summary>
    /// Начальная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;. 
    /// </summary>
    std::string getDateFrom() const;
    void setDateFrom(std::string value);

    /// <summary>
    /// Конечная дата, когда заказ был сформирован.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;updateFrom&#x60; и &#x60;updateTo&#x60;. 
    /// </summary>
    std::string getDateTo() const;
    void setDateTo(std::string value);

    /// <summary>
    /// Начальная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;. 
    /// </summary>
    std::string getUpdateFrom() const;
    void setUpdateFrom(std::string value);

    /// <summary>
    /// Конечная дата периода, за который были изменения статуса заказа.  Формат даты: &#x60;ГГГГ‑ММ‑ДД&#x60;.  Нельзя использовать вместе с параметрами &#x60;dateFrom&#x60; и &#x60;dateTo&#x60;. 
    /// </summary>
    std::string getUpdateTo() const;
    void setUpdateTo(std::string value);

    /// <summary>
    /// Список идентификаторов заказов.
    /// </summary>
    std::vector<int64_t> getOrders() const;
    void setOrders(std::vector<int64_t> value);

    /// <summary>
    /// Список статусов заказов.
    /// </summary>
    std::vector<OrderStatsStatusType> getStatuses() const;
    void setStatuses(std::vector<OrderStatsStatusType> value);

    /// <summary>
    /// Нужно ли вернуть только те заказы, в составе которых есть хотя бы один товар с кодом идентификации [в системе «Честный ЗНАК»](https://честныйзнак.рф/):  * &#x60;true&#x60; — да. * &#x60;false&#x60; — нет. Такие коды присваиваются товарам, которые подлежат маркировке и относятся к определенным категориям. 
    /// </summary>
    bool isHasCis() const;
    void setHasCis(bool value);

protected:
    std::string m_DateFrom = "";
    std::string m_DateTo = "";
    std::string m_UpdateFrom = "";
    std::string m_UpdateTo = "";
    std::vector<int64_t> m_Orders;
    std::vector<OrderStatsStatusType> m_Statuses;
    bool m_HasCis = false;
};

std::vector<GetOrdersStatsRequest> createGetOrdersStatsRequestVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<GetOrdersStatsRequest>(const GetOrdersStatsRequest& val) {
    return val.toPropertyTree();
}

template<>
inline GetOrdersStatsRequest fromPt<GetOrdersStatsRequest>(const boost::property_tree::ptree& pt) {
    GetOrdersStatsRequest ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* GetOrdersStatsRequest_H_ */
