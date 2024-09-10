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
 * GetWarehouseStocksResponse.h
 *
 * 
 */

#ifndef GetWarehouseStocksResponse_H_
#define GetWarehouseStocksResponse_H_



#include "ApiResponseStatusType.h"
#include "GetWarehouseStocksDTO.h"
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
class  GetWarehouseStocksResponse : public ApiResponse
{
public:
    GetWarehouseStocksResponse() = default;
    explicit GetWarehouseStocksResponse(boost::property_tree::ptree const& pt);
    virtual ~GetWarehouseStocksResponse() = default;

    GetWarehouseStocksResponse(const GetWarehouseStocksResponse& other) = default; // copy constructor
    GetWarehouseStocksResponse(GetWarehouseStocksResponse&& other) noexcept = default; // move constructor

    GetWarehouseStocksResponse& operator=(const GetWarehouseStocksResponse& other) = default; // copy assignment
    GetWarehouseStocksResponse& operator=(GetWarehouseStocksResponse&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// GetWarehouseStocksResponse members

    /// <summary>
    /// 
    /// </summary>
    ApiResponseStatusType getStatus() const;
    void setStatus(ApiResponseStatusType value);

    /// <summary>
    /// 
    /// </summary>
    GetWarehouseStocksDTO getResult() const;
    void setResult(GetWarehouseStocksDTO value);

protected:
    ApiResponseStatusType m_Status = ApiResponseStatusType{};
    GetWarehouseStocksDTO m_Result;
};

std::vector<GetWarehouseStocksResponse> createGetWarehouseStocksResponseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<GetWarehouseStocksResponse>(const GetWarehouseStocksResponse& val) {
    return val.toPropertyTree();
}

template<>
inline GetWarehouseStocksResponse fromPt<GetWarehouseStocksResponse>(const boost::property_tree::ptree& pt) {
    GetWarehouseStocksResponse ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* GetWarehouseStocksResponse_H_ */
