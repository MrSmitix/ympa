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
 * ApiServerErrorResponse.h
 *
 * Внутренняя ошибка сервера.
 */

#ifndef ApiServerErrorResponse_H_
#define ApiServerErrorResponse_H_



#include "ApiResponseStatusType.h"
#include "ApiErrorDTO.h"
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
/// Внутренняя ошибка сервера.
/// </summary>
class  ApiServerErrorResponse : public ApiErrorResponse
{
public:
    ApiServerErrorResponse() = default;
    explicit ApiServerErrorResponse(boost::property_tree::ptree const& pt);
    virtual ~ApiServerErrorResponse() = default;

    std::string toJsonString(bool prettyJson = false);
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree();
    void fromPropertyTree(boost::property_tree::ptree const& pt);

    /////////////////////////////////////////////
    /// ApiServerErrorResponse members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<ApiResponseStatusType> getStatus() const;
    void setStatus(std::shared_ptr<ApiResponseStatusType> value);

    /// <summary>
    /// Список ошибок.
    /// </summary>
    std::vector<std::shared_ptr<ApiErrorDTO>> getErrors() const;
    void setErrors(std::vector<std::shared_ptr<ApiErrorDTO>> value);

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
    std::vector<std::shared_ptr<ApiErrorDTO>> m_Errors;
};

std::vector<ApiServerErrorResponse> createApiServerErrorResponseVectorFromJsonString(const std::string& json);

}
}
}
}

#endif /* ApiServerErrorResponse_H_ */
