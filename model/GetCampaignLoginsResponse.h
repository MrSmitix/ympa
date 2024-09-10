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
 * GetCampaignLoginsResponse.h
 *
 * Ответ на запрос списка логинов, связанных с магазином.
 */

#ifndef GetCampaignLoginsResponse_H_
#define GetCampaignLoginsResponse_H_



#include <string>
#include <vector>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Ответ на запрос списка логинов, связанных с магазином.
/// </summary>
class  GetCampaignLoginsResponse 
{
public:
    GetCampaignLoginsResponse() = default;
    explicit GetCampaignLoginsResponse(boost::property_tree::ptree const& pt);
    virtual ~GetCampaignLoginsResponse() = default;

    GetCampaignLoginsResponse(const GetCampaignLoginsResponse& other) = default; // copy constructor
    GetCampaignLoginsResponse(GetCampaignLoginsResponse&& other) noexcept = default; // move constructor

    GetCampaignLoginsResponse& operator=(const GetCampaignLoginsResponse& other) = default; // copy assignment
    GetCampaignLoginsResponse& operator=(GetCampaignLoginsResponse&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// GetCampaignLoginsResponse members

    /// <summary>
    /// Список логинов.
    /// </summary>
    std::vector<std::string> getLogins() const;
    void setLogins(std::vector<std::string> value);

protected:
    std::vector<std::string> m_Logins;
};

std::vector<GetCampaignLoginsResponse> createGetCampaignLoginsResponseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<GetCampaignLoginsResponse>(const GetCampaignLoginsResponse& val) {
    return val.toPropertyTree();
}

template<>
inline GetCampaignLoginsResponse fromPt<GetCampaignLoginsResponse>(const boost::property_tree::ptree& pt) {
    GetCampaignLoginsResponse ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* GetCampaignLoginsResponse_H_ */
