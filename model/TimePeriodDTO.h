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
 * TimePeriodDTO.h
 *
 * Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
 */

#ifndef TimePeriodDTO_H_
#define TimePeriodDTO_H_


#include <string>
#include "TimeUnitType.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
/// </summary>
class  TimePeriodDTO
{
public:
    TimePeriodDTO();
    virtual ~TimePeriodDTO() = default;


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

    bool operator==(const TimePeriodDTO& rhs) const;
    bool operator!=(const TimePeriodDTO& rhs) const;

    /////////////////////////////////////////////
    /// TimePeriodDTO members

    /// <summary>
    /// Продолжительность в указанных единицах.
    /// </summary>
    int32_t getTimePeriod() const;
    void setTimePeriod(int32_t const value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::TimeUnitType getTimeUnit() const;
    void setTimeUnit(org::openapitools::server::model::TimeUnitType const& value);
    /// <summary>
    /// Комментарий.
    /// </summary>
    std::string getComment() const;
    void setComment(std::string const& value);
    bool commentIsSet() const;
    void unsetComment();

    friend  void to_json(nlohmann::json& j, const TimePeriodDTO& o);
    friend  void from_json(const nlohmann::json& j, TimePeriodDTO& o);
protected:
    int32_t m_TimePeriod;

    org::openapitools::server::model::TimeUnitType m_TimeUnit;

    std::string m_Comment;
    bool m_CommentIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* TimePeriodDTO_H_ */
