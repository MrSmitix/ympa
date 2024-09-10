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
 * UpdateTimeDTO.h
 *
 * Время последнего обновления.
 */

#ifndef UpdateTimeDTO_H_
#define UpdateTimeDTO_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Время последнего обновления.
/// </summary>
class  UpdateTimeDTO
{
public:
    UpdateTimeDTO();
    virtual ~UpdateTimeDTO() = default;


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

    bool operator==(const UpdateTimeDTO& rhs) const;
    bool operator!=(const UpdateTimeDTO& rhs) const;

    /////////////////////////////////////////////
    /// UpdateTimeDTO members

    /// <summary>
    /// Время последнего обновления.
    /// </summary>
    std::string getUpdatedAt() const;
    void setUpdatedAt(std::string const& value);

    friend  void to_json(nlohmann::json& j, const UpdateTimeDTO& o);
    friend  void from_json(const nlohmann::json& j, UpdateTimeDTO& o);
protected:
    std::string m_UpdatedAt;

    
};

} // namespace org::openapitools::server::model

#endif /* UpdateTimeDTO_H_ */
