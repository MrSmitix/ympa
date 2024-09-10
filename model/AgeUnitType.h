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
 * AgeUnitType.h
 *
 * Единицы измерения возраста:  * &#x60;YEAR&#x60; — год. * &#x60;MONTH&#x60; — месяц. 
 */

#ifndef AgeUnitType_H_
#define AgeUnitType_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Единицы измерения возраста:  * &#x60;YEAR&#x60; — год. * &#x60;MONTH&#x60; — месяц. 
/// </summary>
class  AgeUnitType
{
public:
    AgeUnitType();
    virtual ~AgeUnitType() = default;

    enum class eAgeUnitType {
    // To have a valid default value.
    // Avoiding name clashes with user defined
    // enum values
    INVALID_VALUE_OPENAPI_GENERATED = 0,
    YEAR, 
    MONTH
    };

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

    bool operator==(const AgeUnitType& rhs) const;
    bool operator!=(const AgeUnitType& rhs) const;

    /////////////////////////////////////////////
    /// AgeUnitType members

    AgeUnitType::eAgeUnitType getValue() const;
    void setValue(AgeUnitType::eAgeUnitType value);
    
    friend  void to_json(nlohmann::json& j, const AgeUnitType& o);
    friend  void from_json(const nlohmann::json& j, AgeUnitType& o);
protected:
    AgeUnitType::eAgeUnitType m_value = AgeUnitType::eAgeUnitType::INVALID_VALUE_OPENAPI_GENERATED;
};

} // namespace org::openapitools::server::model

#endif /* AgeUnitType_H_ */
