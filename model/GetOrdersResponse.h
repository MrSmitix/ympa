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
 * GetOrdersResponse.h
 *
 * Модель для ответа API списка информации по заказам.
 */

#ifndef GetOrdersResponse_H_
#define GetOrdersResponse_H_



#include "ForwardScrollingPagerDTO.h"
#include "OrderDTO.h"
#include "FlippingPagerDTO.h"
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Модель для ответа API списка информации по заказам.
/// </summary>
class  GetOrdersResponse 
{
public:
    GetOrdersResponse() = default;
    explicit GetOrdersResponse(boost::property_tree::ptree const& pt);
    virtual ~GetOrdersResponse() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// GetOrdersResponse members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<FlippingPagerDTO> getPager() const;
    void setPager(std::shared_ptr<FlippingPagerDTO> value);

    /// <summary>
    /// Модель заказа. 
    /// </summary>
    std::vector<std::shared_ptr<OrderDTO>> getOrders() const;
    void setOrders(std::vector<std::shared_ptr<OrderDTO>> value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ForwardScrollingPagerDTO> getPaging() const;
    void setPaging(std::shared_ptr<ForwardScrollingPagerDTO> value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::shared_ptr<FlippingPagerDTO> m_Pager;
    std::vector<std::shared_ptr<OrderDTO>> m_Orders;
    std::shared_ptr<ForwardScrollingPagerDTO> m_Paging;
};

std::vector<GetOrdersResponse> createGetOrdersResponseVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* GetOrdersResponse_H_ */
