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
 * GetOrdersStatsResponse.h
 *
 * Ответ на запрос информации по заказам.
 */

#ifndef GetOrdersStatsResponse_H_
#define GetOrdersStatsResponse_H_



#include "ApiResponseStatusType.h"
#include "OrdersStatsDTO.h"
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
/// Ответ на запрос информации по заказам.
/// </summary>
class  GetOrdersStatsResponse : public ApiResponse
{
public:
    GetOrdersStatsResponse() = default;
    explicit GetOrdersStatsResponse(boost::property_tree::ptree const& pt);
    virtual ~GetOrdersStatsResponse() = default;

    GetOrdersStatsResponse(const GetOrdersStatsResponse& other) = default; // copy constructor
    GetOrdersStatsResponse(GetOrdersStatsResponse&& other) noexcept = default; // move constructor

    GetOrdersStatsResponse& operator=(const GetOrdersStatsResponse& other) = default; // copy assignment
    GetOrdersStatsResponse& operator=(GetOrdersStatsResponse&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// GetOrdersStatsResponse members

    /// <summary>
    /// 
    /// </summary>
    ApiResponseStatusType getStatus() const;
    void setStatus(ApiResponseStatusType value);

    /// <summary>
    /// 
    /// </summary>
    OrdersStatsDTO getResult() const;
    void setResult(OrdersStatsDTO value);

protected:
    ApiResponseStatusType m_Status = ApiResponseStatusType{};
    OrdersStatsDTO m_Result;
};

std::vector<GetOrdersStatsResponse> createGetOrdersStatsResponseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<GetOrdersStatsResponse>(const GetOrdersStatsResponse& val) {
    return val.toPropertyTree();
}

template<>
inline GetOrdersStatsResponse fromPt<GetOrdersStatsResponse>(const boost::property_tree::ptree& pt) {
    GetOrdersStatsResponse ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* GetOrdersStatsResponse_H_ */
