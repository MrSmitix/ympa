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
 * ApiErrorDTO.h
 *
 * Общий формат ошибки.
 */

#ifndef ApiErrorDTO_H_
#define ApiErrorDTO_H_



#include <string>
#include <memory>
#include <vector>
#include <boost/property_tree/ptree.hpp>
#include "helpers.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Общий формат ошибки.
/// </summary>
class  ApiErrorDTO 
{
public:
    ApiErrorDTO() = default;
    explicit ApiErrorDTO(boost::property_tree::ptree const& pt);
    virtual ~ApiErrorDTO() = default;

    ApiErrorDTO(const ApiErrorDTO& other) = default; // copy constructor
    ApiErrorDTO(ApiErrorDTO&& other) noexcept = default; // move constructor

    ApiErrorDTO& operator=(const ApiErrorDTO& other) = default; // copy assignment
    ApiErrorDTO& operator=(ApiErrorDTO&& other) noexcept = default; // move assignment

    std::string toJsonString(bool prettyJson = false) const;
    void fromJsonString(std::string const& jsonString);
    boost::property_tree::ptree toPropertyTree() const;
    void fromPropertyTree(boost::property_tree::ptree const& pt);


    /////////////////////////////////////////////
    /// ApiErrorDTO members

    /// <summary>
    /// Код ошибки.
    /// </summary>
    std::string getCode() const;
    void setCode(std::string value);

    /// <summary>
    /// Описание ошибки.
    /// </summary>
    std::string getMessage() const;
    void setMessage(std::string value);

protected:
    std::string m_Code = "";
    std::string m_Message = "";
};

std::vector<ApiErrorDTO> createApiErrorDTOVectorFromJsonString(const std::string& json);

template<>
inline boost::property_tree::ptree toPt<ApiErrorDTO>(const ApiErrorDTO& val) {
    return val.toPropertyTree();
}

template<>
inline ApiErrorDTO fromPt<ApiErrorDTO>(const boost::property_tree::ptree& pt) {
    ApiErrorDTO ret;
    ret.fromPropertyTree(pt);
    return ret;
}

}
}
}
}

#endif /* ApiErrorDTO_H_ */
