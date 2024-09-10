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
 * GetFeedResponse.h
 *
 * Ответ на запрос информации о прайс-листе.
 */

#ifndef GetFeedResponse_H_
#define GetFeedResponse_H_



#include "FeedDTO.h"
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Ответ на запрос информации о прайс-листе.
/// </summary>
class  GetFeedResponse 
{
public:
    GetFeedResponse() = default;
    explicit GetFeedResponse(boost::property_tree::ptree const& pt);
    virtual ~GetFeedResponse() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// GetFeedResponse members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<FeedDTO> getFeed() const;
    void setFeed(std::shared_ptr<FeedDTO> value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::shared_ptr<FeedDTO> m_Feed;
};

std::vector<GetFeedResponse> createGetFeedResponseVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* GetFeedResponse_H_ */
