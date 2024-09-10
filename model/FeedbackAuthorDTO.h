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
 * FeedbackAuthorDTO.h
 *
 * Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. 
 */

#ifndef FeedbackAuthorDTO_H_
#define FeedbackAuthorDTO_H_


#include <string>
#include "RegionDTO.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Информация об авторе отзыва.  Если отзыв оставлен анонимно, параметр не возвращается. 
/// </summary>
class  FeedbackAuthorDTO
{
public:
    FeedbackAuthorDTO();
    virtual ~FeedbackAuthorDTO() = default;


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

    bool operator==(const FeedbackAuthorDTO& rhs) const;
    bool operator!=(const FeedbackAuthorDTO& rhs) const;

    /////////////////////////////////////////////
    /// FeedbackAuthorDTO members

    /// <summary>
    /// Имя автора отзыва.
    /// </summary>
    std::string getName() const;
    void setName(std::string const& value);
    bool nameIsSet() const;
    void unsetName();
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::RegionDTO getRegion() const;
    void setRegion(org::openapitools::server::model::RegionDTO const& value);
    bool regionIsSet() const;
    void unsetRegion();

    friend  void to_json(nlohmann::json& j, const FeedbackAuthorDTO& o);
    friend  void from_json(const nlohmann::json& j, FeedbackAuthorDTO& o);
protected:
    std::string m_Name;
    bool m_NameIsSet;
    org::openapitools::server::model::RegionDTO m_Region;
    bool m_RegionIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* FeedbackAuthorDTO_H_ */
