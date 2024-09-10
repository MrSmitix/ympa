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
 * ValueRestrictionDTO.h
 *
 * Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: &#x60;S&#x60;, &#x60;M&#x60;, &#x60;L&#x60;, &#x60;44&#x60;, &#x60;46&#x60;, &#x60;48&#x60;, &#x60;42/164&#x60;, &#x60;46/176&#x60;, &#x60;44S&#x60;.  Если ограничивающая характеристика **размерная сетка** принимает значение &#x60;RU&#x60;, список возможных значений размера сокращается до &#x60;44&#x60;, &#x60;46&#x60;, &#x60;48&#x60;. 
 */

#ifndef ValueRestrictionDTO_H_
#define ValueRestrictionDTO_H_


#include "OptionValuesLimitedDTO.h"
#include <vector>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Ограничение на возможные значения, накладываемое другой характеристикой.  Если ограничивающая характеристика принимает определенное значение, список возможных значений ограничиваемой характеристики сокращается.  **Пример**  Характеристика **размер** сама по себе может принимать девять разных значений: &#x60;S&#x60;, &#x60;M&#x60;, &#x60;L&#x60;, &#x60;44&#x60;, &#x60;46&#x60;, &#x60;48&#x60;, &#x60;42/164&#x60;, &#x60;46/176&#x60;, &#x60;44S&#x60;.  Если ограничивающая характеристика **размерная сетка** принимает значение &#x60;RU&#x60;, список возможных значений размера сокращается до &#x60;44&#x60;, &#x60;46&#x60;, &#x60;48&#x60;. 
/// </summary>
class  ValueRestrictionDTO
{
public:
    ValueRestrictionDTO();
    virtual ~ValueRestrictionDTO() = default;


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

    bool operator==(const ValueRestrictionDTO& rhs) const;
    bool operator!=(const ValueRestrictionDTO& rhs) const;

    /////////////////////////////////////////////
    /// ValueRestrictionDTO members

    /// <summary>
    /// Идентификатор ограничивающей характеристики.
    /// </summary>
    int64_t getLimitingParameterId() const;
    void setLimitingParameterId(int64_t const value);
    /// <summary>
    /// Значения ограничивающей характеристики и соответствующие допустимые значения текущей характеристики.
    /// </summary>
    std::vector<org::openapitools::server::model::OptionValuesLimitedDTO> getLimitedValues() const;
    void setLimitedValues(std::vector<org::openapitools::server::model::OptionValuesLimitedDTO> const& value);

    friend  void to_json(nlohmann::json& j, const ValueRestrictionDTO& o);
    friend  void from_json(const nlohmann::json& j, ValueRestrictionDTO& o);
protected:
    int64_t m_LimitingParameterId;

    std::vector<org::openapitools::server::model::OptionValuesLimitedDTO> m_LimitedValues;

    
};

} // namespace org::openapitools::server::model

#endif /* ValueRestrictionDTO_H_ */
