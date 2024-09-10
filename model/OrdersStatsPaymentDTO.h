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
 * OrdersStatsPaymentDTO.h
 *
 * Информация о денежных переводах по заказу.
 */

#ifndef OrdersStatsPaymentDTO_H_
#define OrdersStatsPaymentDTO_H_


#include "OrdersStatsPaymentOrderDTO.h"
#include "OrdersStatsPaymentType.h"
#include <string>
#include "OrdersStatsPaymentSourceType.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Информация о денежных переводах по заказу.
/// </summary>
class  OrdersStatsPaymentDTO
{
public:
    OrdersStatsPaymentDTO();
    virtual ~OrdersStatsPaymentDTO() = default;


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

    bool operator==(const OrdersStatsPaymentDTO& rhs) const;
    bool operator!=(const OrdersStatsPaymentDTO& rhs) const;

    /////////////////////////////////////////////
    /// OrdersStatsPaymentDTO members

    /// <summary>
    /// Идентификатор денежного перевода.
    /// </summary>
    std::string getId() const;
    void setId(std::string const& value);
    bool idIsSet() const;
    void unsetId();
    /// <summary>
    /// Дата денежного перевода.  Формат даты: &#x60;ГГГГ-ММ-ДД&#x60;. 
    /// </summary>
    std::string getDate() const;
    void setDate(std::string const& value);
    bool dateIsSet() const;
    void unsetdate();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::OrdersStatsPaymentType getType() const;
    void setType(org::openapitools::server::model::OrdersStatsPaymentType const& value);
    bool typeIsSet() const;
    void unsetType();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::OrdersStatsPaymentSourceType getSource() const;
    void setSource(org::openapitools::server::model::OrdersStatsPaymentSourceType const& value);
    bool sourceIsSet() const;
    void unsetSource();
    /// <summary>
    /// Сумма денежного перевода. Значение указывается в рублях независимо от способа денежного перевода. Точность — два знака после запятой. 
    /// </summary>
    double getTotal() const;
    void setTotal(double const value);
    bool totalIsSet() const;
    void unsetTotal();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::OrdersStatsPaymentOrderDTO getPaymentOrder() const;
    void setPaymentOrder(org::openapitools::server::model::OrdersStatsPaymentOrderDTO const& value);
    bool paymentOrderIsSet() const;
    void unsetPaymentOrder();

    friend  void to_json(nlohmann::json& j, const OrdersStatsPaymentDTO& o);
    friend  void from_json(const nlohmann::json& j, OrdersStatsPaymentDTO& o);
protected:
    std::string m_Id;
    bool m_IdIsSet;
    std::string m_date;
    bool m_dateIsSet;
    org::openapitools::server::model::OrdersStatsPaymentType m_Type;
    bool m_TypeIsSet;
    org::openapitools::server::model::OrdersStatsPaymentSourceType m_Source;
    bool m_SourceIsSet;
    double m_Total;
    bool m_TotalIsSet;
    org::openapitools::server::model::OrdersStatsPaymentOrderDTO m_PaymentOrder;
    bool m_PaymentOrderIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* OrdersStatsPaymentDTO_H_ */
