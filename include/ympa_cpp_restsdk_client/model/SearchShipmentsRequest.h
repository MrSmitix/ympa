/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.8.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * SearchShipmentsRequest.h
 *
 * Запрос информации об отгрузках.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_SearchShipmentsRequest_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_SearchShipmentsRequest_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "ympa_cpp_restsdk_client/model/ShipmentStatusType.h"
#include <set>

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// Запрос информации об отгрузках.
/// </summary>
class  SearchShipmentsRequest
    : public ModelBase
{
public:
    SearchShipmentsRequest();
    virtual ~SearchShipmentsRequest();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// SearchShipmentsRequest members

    /// <summary>
    /// Начальная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
    /// </summary>
    utility::datetime getDateFrom() const;
    bool dateFromIsSet() const;
    void unsetDateFrom();

    void setDateFrom(const utility::datetime& value);

    /// <summary>
    /// Конечная дата для фильтрации по дате отгрузки (включительно).  Формат даты: &#x60;ДД-ММ-ГГГГ&#x60;. 
    /// </summary>
    utility::datetime getDateTo() const;
    bool dateToIsSet() const;
    void unsetDateTo();

    void setDateTo(const utility::datetime& value);

    /// <summary>
    /// Список статусов отгрузок.
    /// </summary>
    std::set<std::shared_ptr<ShipmentStatusType>>& getStatuses();
    bool statusesIsSet() const;
    void unsetStatuses();

    void setStatuses(const std::set<std::shared_ptr<ShipmentStatusType>>& value);

    /// <summary>
    /// Список идентификаторов заказов из отгрузок.
    /// </summary>
    std::set<int64_t>& getOrderIds();
    bool orderIdsIsSet() const;
    void unsetOrderIds();

    void setOrderIds(std::set<int64_t> value);

    /// <summary>
    /// Возвращать ли отмененные заказы.  Значение по умолчанию — &#x60;true&#x60;. Если возвращать отмененные заказы не нужно, передайте значение &#x60;false&#x60;. 
    /// </summary>
    bool isCancelledOrders() const;
    bool cancelledOrdersIsSet() const;
    void unsetCancelledOrders();

    void setCancelledOrders(bool value);


protected:
    utility::datetime m_DateFrom;
    bool m_DateFromIsSet;
    utility::datetime m_DateTo;
    bool m_DateToIsSet;
    std::set<std::shared_ptr<ShipmentStatusType>> m_Statuses;
    bool m_StatusesIsSet;
    std::set<int64_t> m_OrderIds;
    bool m_OrderIdsIsSet;
    bool m_CancelledOrders;
    bool m_CancelledOrdersIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_SearchShipmentsRequest_H_ */
