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
 * SetReturnDecisionRequest.h
 *
 * Решения по позиции в возврате.
 */

#ifndef SetReturnDecisionRequest_H_
#define SetReturnDecisionRequest_H_



#include "ReturnRequestDecisionType.h"
#include <string>
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
/// Решения по позиции в возврате.
/// </summary>
class  SetReturnDecisionRequest 
{
public:
    SetReturnDecisionRequest() = default;
    explicit SetReturnDecisionRequest(boost::property_tree::ptree const& pt);
    virtual ~SetReturnDecisionRequest() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// SetReturnDecisionRequest members

    /// <summary>
    /// Идентификатор товара в возврате.
    /// </summary>
    int64_t getReturnItemId() const;
    void setReturnItemId(int64_t value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ReturnRequestDecisionType> getDecisionType() const;
    void setDecisionType(std::shared_ptr<ReturnRequestDecisionType> value);

    /// <summary>
    /// Комментарий к решению. Укажите:  * для &#x60;REFUND_MONEY_INCLUDING_SHIPMENT&#x60;— стоимость обратной пересылки;  * для &#x60;REPAIR&#x60; — когда вы устраните недостатки товара;  * для &#x60;DECLINE_REFUND&#x60; — причину отказа;  * для &#x60;OTHER_DECISION&#x60; — какое решение вы предлагаете. 
    /// </summary>
    std::string getComment() const;
    void setComment(std::string value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    int64_t m_ReturnItemId = 0L;
    std::shared_ptr<ReturnRequestDecisionType> m_DecisionType = std::make_shared<ReturnRequestDecisionType>();
    std::string m_Comment = "";
};

std::vector<SetReturnDecisionRequest> createSetReturnDecisionRequestVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* SetReturnDecisionRequest_H_ */
