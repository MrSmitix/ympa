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
 * GetChatsRequest.h
 *
 * Фильтры по чатам, которые нужно вернуть. 
 */

#ifndef GetChatsRequest_H_
#define GetChatsRequest_H_



#include "ChatType.h"
#include <vector>
#include "ChatStatusType.h"
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Фильтры по чатам, которые нужно вернуть. 
/// </summary>
class  GetChatsRequest 
{
public:
    GetChatsRequest() = default;
    explicit GetChatsRequest(boost::property_tree::ptree const& pt);
    virtual ~GetChatsRequest() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// GetChatsRequest members

    /// <summary>
    /// Фильтр по идентификаторам заказов на Маркете.
    /// </summary>
    std::vector<int64_t> getOrderIds() const;
    void setOrderIds(std::vector<int64_t> value);

    /// <summary>
    /// Фильтр по типам чатов.
    /// </summary>
    std::vector<std::shared_ptr<ChatType>> getTypes() const;
    void setTypes(std::vector<std::shared_ptr<ChatType>> value);

    /// <summary>
    /// Фильтр по статусам чатов.
    /// </summary>
    std::vector<std::shared_ptr<ChatStatusType>> getStatuses() const;
    void setStatuses(std::vector<std::shared_ptr<ChatStatusType>> value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::vector<int64_t> m_OrderIds;
    std::vector<std::shared_ptr<ChatType>> m_Types;
    std::vector<std::shared_ptr<ChatStatusType>> m_Statuses;
};

std::vector<GetChatsRequest> createGetChatsRequestVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* GetChatsRequest_H_ */
