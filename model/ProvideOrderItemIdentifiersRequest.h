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
 * ProvideOrderItemIdentifiersRequest.h
 *
 * 
 */

#ifndef ProvideOrderItemIdentifiersRequest_H_
#define ProvideOrderItemIdentifiersRequest_H_



#include "OrderItemInstanceModificationDTO.h"
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ProvideOrderItemIdentifiersRequest 
{
public:
    ProvideOrderItemIdentifiersRequest() = default;
    explicit ProvideOrderItemIdentifiersRequest(boost::property_tree::ptree const& pt);
    virtual ~ProvideOrderItemIdentifiersRequest() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// ProvideOrderItemIdentifiersRequest members

    /// <summary>
    /// Список позиций, требующих маркировки. 
    /// </summary>
    std::vector<std::shared_ptr<OrderItemInstanceModificationDTO>> getItems() const;
    void setItems(std::vector<std::shared_ptr<OrderItemInstanceModificationDTO>> value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::vector<std::shared_ptr<OrderItemInstanceModificationDTO>> m_Items;
};

std::vector<ProvideOrderItemIdentifiersRequest> createProvideOrderItemIdentifiersRequestVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* ProvideOrderItemIdentifiersRequest_H_ */
