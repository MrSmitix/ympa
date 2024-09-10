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
 * GetFulfillmentWarehousesResponse.h
 *
 * 
 */

#ifndef GetFulfillmentWarehousesResponse_H_
#define GetFulfillmentWarehousesResponse_H_



#include "ApiResponseStatusType.h"
#include "FulfillmentWarehousesDTO.h"
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
class  GetFulfillmentWarehousesResponse : public ApiResponse
{
public:
    GetFulfillmentWarehousesResponse() = default;
    explicit GetFulfillmentWarehousesResponse(boost::property_tree::ptree const& pt);
    virtual ~GetFulfillmentWarehousesResponse() = default;

    GetFulfillmentWarehousesResponse(const GetFulfillmentWarehousesResponse& other) = default; // copy constructor
    GetFulfillmentWarehousesResponse(GetFulfillmentWarehousesResponse&& other) noexcept = default; // move constructor

    GetFulfillmentWarehousesResponse& operator=(const GetFulfillmentWarehousesResponse& other) = default; // copy assignment
    GetFulfillmentWarehousesResponse& operator=(GetFulfillmentWarehousesResponse&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// GetFulfillmentWarehousesResponse members

    /// <summary>
    /// 
    /// </summary>
    ApiResponseStatusType getStatus() const;
    void setStatus(ApiResponseStatusType value);

    /// <summary>
    /// 
    /// </summary>
    FulfillmentWarehousesDTO getResult() const;
    void setResult(FulfillmentWarehousesDTO value);

protected:
    ApiResponseStatusType m_Status = ApiResponseStatusType{};
    FulfillmentWarehousesDTO m_Result;
};

std::vector<GetFulfillmentWarehousesResponse> createGetFulfillmentWarehousesResponseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<GetFulfillmentWarehousesResponse>(const GetFulfillmentWarehousesResponse& val) {
    return val.toPropertyTree();
}

template<>
inline GetFulfillmentWarehousesResponse fromPt<GetFulfillmentWarehousesResponse>(const boost::property_tree::ptree& pt) {
    GetFulfillmentWarehousesResponse ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* GetFulfillmentWarehousesResponse_H_ */
