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
 * OrderStatusChangeDTO.h
 *
 * Заказ.
 */

#ifndef OrderStatusChangeDTO_H_
#define OrderStatusChangeDTO_H_



#include "OrderStatusType.h"
#include "OrderStatusChangeDeliveryDTO.h"
#include <vector>
#include "OrderSubstatusType.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Заказ.
/// </summary>
class  OrderStatusChangeDTO 
{
public:
    OrderStatusChangeDTO() = default;
    explicit OrderStatusChangeDTO(boost::property_tree::ptree const& pt);
    virtual ~OrderStatusChangeDTO() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// OrderStatusChangeDTO members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<OrderStatusType> getStatus() const;
    void setStatus(std::shared_ptr<OrderStatusType> value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<OrderSubstatusType> getSubstatus() const;
    void setSubstatus(std::shared_ptr<OrderSubstatusType> value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<OrderStatusChangeDeliveryDTO> getDelivery() const;
    void setDelivery(std::shared_ptr<OrderStatusChangeDeliveryDTO> value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::shared_ptr<OrderStatusType> m_Status = std::make_shared<OrderStatusType>();
    std::shared_ptr<OrderSubstatusType> m_Substatus = std::make_shared<OrderSubstatusType>();
    std::shared_ptr<OrderStatusChangeDeliveryDTO> m_Delivery;
};

std::vector<OrderStatusChangeDTO> createOrderStatusChangeDTOVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* OrderStatusChangeDTO_H_ */
