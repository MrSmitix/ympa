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
 * UpdateOrderStatusResponse.h
 *
 * Информация об изменении статуса заказа.
 */

#ifndef UpdateOrderStatusResponse_H_
#define UpdateOrderStatusResponse_H_


#include "OrderDTO.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Информация об изменении статуса заказа.
/// </summary>
class  UpdateOrderStatusResponse
{
public:
    UpdateOrderStatusResponse();
    virtual ~UpdateOrderStatusResponse() = default;


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

    bool operator==(const UpdateOrderStatusResponse& rhs) const;
    bool operator!=(const UpdateOrderStatusResponse& rhs) const;

    /////////////////////////////////////////////
    /// UpdateOrderStatusResponse members

    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::OrderDTO getOrder() const;
    void setOrder(org::openapitools::server::model::OrderDTO const& value);
    bool orderIsSet() const;
    void unsetOrder();

    friend  void to_json(nlohmann::json& j, const UpdateOrderStatusResponse& o);
    friend  void from_json(const nlohmann::json& j, UpdateOrderStatusResponse& o);
protected:
    org::openapitools::server::model::OrderDTO m_Order;
    bool m_OrderIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* UpdateOrderStatusResponse_H_ */
