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
 * GetWarehousesResponse.h
 *
 * 
 */

#ifndef GetWarehousesResponse_H_
#define GetWarehousesResponse_H_



#include "ApiResponseStatusType.h"
#include <vector>
#include "WarehousesDTO.h"
#include <memory>
#include <vector>
#include <array>
#include <boost/property_tree/ptree.hpp>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  GetWarehousesResponse : public ApiResponse
{
public:
    GetWarehousesResponse() = default;
    explicit GetWarehousesResponse(boost::property_tree::ptree const& pt);
    virtual ~GetWarehousesResponse() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// GetWarehousesResponse members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ApiResponseStatusType> getStatus() const;
    void setStatus(std::shared_ptr<ApiResponseStatusType> value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<WarehousesDTO> getResult() const;
    void setResult(std::shared_ptr<WarehousesDTO> value);

protected:
    //////////////////////////////////////
    // Override these for customization //
    //////////////////////////////////////

    virtual std::string toJsonString_internal(bool prettyJson = false);
    virtual void fromJsonString_internal(std::string const& jsonString);
    virtual boost::property_tree::ptree toPropertyTree_internal();
    virtual void fromPropertyTree_internal(boost::property_tree::ptree const& pt);


protected:
    std::shared_ptr<ApiResponseStatusType> m_Status = std::make_shared<ApiResponseStatusType>();
    std::shared_ptr<WarehousesDTO> m_Result;
};

std::vector<GetWarehousesResponse> createGetWarehousesResponseVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* GetWarehousesResponse_H_ */
