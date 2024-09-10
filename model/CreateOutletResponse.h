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
 * CreateOutletResponse.h
 *
 * Ответ на запрос о создании точки продаж.
 */

#ifndef CreateOutletResponse_H_
#define CreateOutletResponse_H_



#include "ApiResponseStatusType.h"
#include "OutletResponseDTO.h"
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
/// Ответ на запрос о создании точки продаж.
/// </summary>
class  CreateOutletResponse : public ApiResponse
{
public:
    CreateOutletResponse() = default;
    explicit CreateOutletResponse(boost::property_tree::ptree const& pt);
    virtual ~CreateOutletResponse() = default;

    CreateOutletResponse(const CreateOutletResponse& other) = default; // copy constructor
    CreateOutletResponse(CreateOutletResponse&& other) noexcept = default; // move constructor

    CreateOutletResponse& operator=(const CreateOutletResponse& other) = default; // copy assignment
    CreateOutletResponse& operator=(CreateOutletResponse&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// CreateOutletResponse members

    /// <summary>
    /// 
    /// </summary>
    ApiResponseStatusType getStatus() const;
    void setStatus(ApiResponseStatusType value);

    /// <summary>
    /// 
    /// </summary>
    OutletResponseDTO getResult() const;
    void setResult(OutletResponseDTO value);

protected:
    ApiResponseStatusType m_Status = ApiResponseStatusType{};
    OutletResponseDTO m_Result;
};

std::vector<CreateOutletResponse> createCreateOutletResponseVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<CreateOutletResponse>(const CreateOutletResponse& val) {
    return val.toPropertyTree();
}

template<>
inline CreateOutletResponse fromPt<CreateOutletResponse>(const boost::property_tree::ptree& pt) {
    CreateOutletResponse ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* CreateOutletResponse_H_ */
