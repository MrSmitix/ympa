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
 * OrderItemSubsidyDTO.h
 *
 * Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. 
 */

#ifndef OrderItemSubsidyDTO_H_
#define OrderItemSubsidyDTO_H_



#include "OrderItemSubsidyType.h"
#include <vector>
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Общее вознаграждение партнеру за все скидки на товар:  * по промокодам, купонам и акциям; * по баллам Плюса.  Передается в валюте заказа. 
/// </summary>
class  OrderItemSubsidyDTO 
{
public:
    OrderItemSubsidyDTO() = default;
    explicit OrderItemSubsidyDTO(boost::property_tree::ptree const& pt);
    virtual ~OrderItemSubsidyDTO() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// OrderItemSubsidyDTO members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<OrderItemSubsidyType> getType() const;
    void setType(std::shared_ptr<OrderItemSubsidyType> value);

    /// <summary>
    /// Сумма субсидии.
    /// </summary>
    double getAmount() const;
    void setAmount(double value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::shared_ptr<OrderItemSubsidyType> m_Type = std::make_shared<OrderItemSubsidyType>();
    double m_Amount = 0.0;
};

std::vector<OrderItemSubsidyDTO> createOrderItemSubsidyDTOVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* OrderItemSubsidyDTO_H_ */
