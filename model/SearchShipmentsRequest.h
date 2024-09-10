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
 * SearchShipmentsRequest.h
 *
 * Запрос информации об отгрузках.
 */

#ifndef SearchShipmentsRequest_H_
#define SearchShipmentsRequest_H_


#include "ShipmentStatusType.h"
#include <string>
#include <set>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Запрос информации об отгрузках.
/// </summary>
class  SearchShipmentsRequest
{
public:
    SearchShipmentsRequest();
    virtual ~SearchShipmentsRequest() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const SearchShipmentsRequest& rhs) const;
    bool operator!=(const SearchShipmentsRequest& rhs) const;

    /////////////////////////////////////////////
    /// SearchShipmentsRequest members

    /// <summary>
    /// Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
    /// </summary>
    std::string getDateFrom() const;
    void setDateFrom(std::string const& value);
    /// <summary>
    /// Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
    /// </summary>
    std::string getDateTo() const;
    void setDateTo(std::string const& value);
    /// <summary>
    /// Список статусов отгрузок.
    /// </summary>
    std::set<org::openapitools::server::model::ShipmentStatusType> getStatuses() const;
    void setStatuses(std::set<org::openapitools::server::model::ShipmentStatusType> const& value);
    bool statusesIsSet() const;
    void unsetStatuses();
    /// <summary>
    /// Список идентификаторов заказов из отгрузок.
    /// </summary>
    std::set<int64_t> getOrderIds() const;
    void setOrderIds(std::set<int64_t> const value);
    bool orderIdsIsSet() const;
    void unsetOrderIds();
    /// <summary>
    /// Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;. 
    /// </summary>
    bool isCancelledOrders() const;
    void setCancelledOrders(bool const value);
    bool cancelledOrdersIsSet() const;
    void unsetCancelledOrders();

    friend  void to_json(nlohmann::json& j, const SearchShipmentsRequest& o);
    friend  void from_json(const nlohmann::json& j, SearchShipmentsRequest& o);
protected:
    std::string m_DateFrom;

    std::string m_DateTo;

    std::set<org::openapitools::server::model::ShipmentStatusType> m_Statuses;
    bool m_StatusesIsSet;
    std::set<int64_t> m_OrderIds;
    bool m_OrderIdsIsSet;
    bool m_CancelledOrders;
    bool m_CancelledOrdersIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* SearchShipmentsRequest_H_ */
