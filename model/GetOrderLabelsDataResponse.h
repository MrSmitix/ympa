/**
* Партнерский API Маркета
* API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
*
* The version of the OpenAPI document: LATEST
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * GetOrderLabelsDataResponse.h
 *
 * Ответ с информацией для печати ярлыков.
 */

#ifndef GetOrderLabelsDataResponse_H_
#define GetOrderLabelsDataResponse_H_


#include "ApiResponseStatusType.h"
#include "OrderLabelDTO.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Ответ с информацией для печати ярлыков.
/// </summary>
class  GetOrderLabelsDataResponse
{
public:
    GetOrderLabelsDataResponse();
    virtual ~GetOrderLabelsDataResponse() = default;


    /// <summary>
    /// Validate the current data in the model. Throws a ValidationException on failure.
    /// </summary>
    void validate() const;

    /// <summary>
    /// Validate the current data in the model. Returns false on error and writes an error
    /// message into the given stringstream.
    /// </summary>
    bool validate(std::stringstream& msg) const;

    /// <summary>
    /// Helper overload for validate. Used when one model stores another model and calls it's validate.
    /// Not meant to be called outside that case.
    /// </summary>
    bool validate(std::stringstream& msg, const std::string& pathPrefix) const;

    bool operator==(const GetOrderLabelsDataResponse& rhs) const;
    bool operator!=(const GetOrderLabelsDataResponse& rhs) const;

    /////////////////////////////////////////////
    /// GetOrderLabelsDataResponse members

    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::ApiResponseStatusType getStatus() const;
    void setStatus(org::openapitools::server::model::ApiResponseStatusType const& value);
    bool statusIsSet() const;
    void unsetStatus();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::OrderLabelDTO getResult() const;
    void setResult(org::openapitools::server::model::OrderLabelDTO const& value);
    bool resultIsSet() const;
    void unsetResult();

    friend  void to_json(nlohmann::json& j, const GetOrderLabelsDataResponse& o);
    friend  void from_json(const nlohmann::json& j, GetOrderLabelsDataResponse& o);
protected:
    org::openapitools::server::model::ApiResponseStatusType m_Status;
    bool m_StatusIsSet;
    org::openapitools::server::model::OrderLabelDTO m_Result;
    bool m_ResultIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* GetOrderLabelsDataResponse_H_ */
