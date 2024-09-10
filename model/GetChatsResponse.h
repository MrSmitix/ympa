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
 * GetChatsResponse.h
 *
 * 
 */

#ifndef GetChatsResponse_H_
#define GetChatsResponse_H_



#include "ApiResponseStatusType.h"
#include "GetChatsInfoDTO.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>
#include "ApiResponse.h"
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  GetChatsResponse : public ApiResponse
{
public:
    GetChatsResponse() = default;
    explicit GetChatsResponse(boost::property_tree::ptree const& pt);
    virtual ~GetChatsResponse() = default;

    GetChatsResponse(const GetChatsResponse& other) = default; // copy constructor
    GetChatsResponse(GetChatsResponse&& other) noexcept = default; // move constructor

    GetChatsResponse& operator=(const GetChatsResponse& other) = default; // copy assignment
    GetChatsResponse& operator=(GetChatsResponse&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// GetChatsResponse members

    /// <summary>
    /// 
    /// </summary>
    ApiResponseStatusType getStatus() const;
    void setStatus(ApiResponseStatusType value);

    /// <summary>
    /// 
    /// </summary>
    GetChatsInfoDTO getResult() const;
    void setResult(GetChatsInfoDTO value);

protected:
    ApiResponseStatusType m_Status = ApiResponseStatusType{};
    GetChatsInfoDTO m_Result;
};

std::vector<GetChatsResponse> createGetChatsResponseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<GetChatsResponse>(const GetChatsResponse& val) {
    return val.toPropertyTree();
}

template<>
inline GetChatsResponse fromPt<GetChatsResponse>(const boost::property_tree::ptree& pt) {
    GetChatsResponse ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* GetChatsResponse_H_ */
