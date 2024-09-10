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
 * LicenseCheckStatusType.h
 *
 * Статус проверки лицензии:  * &#x60;NEW&#x60; — лицензия проверяется. * &#x60;SUCCESS&#x60; — лицензия прошла проверку. * &#x60;FAIL&#x60; — лицензия не прошла проверку. 
 */

#ifndef LicenseCheckStatusType_H_
#define LicenseCheckStatusType_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Статус проверки лицензии:  * &#x60;NEW&#x60; — лицензия проверяется. * &#x60;SUCCESS&#x60; — лицензия прошла проверку. * &#x60;FAIL&#x60; — лицензия не прошла проверку. 
/// </summary>
class  LicenseCheckStatusType
{
public:
    LicenseCheckStatusType();
    virtual ~LicenseCheckStatusType() = default;

    enum class eLicenseCheckStatusType {
    // To have a valid default value.
    // Avoiding name clashes with user defined
    // enum values
    INVALID_VALUE_OPENAPI_GENERATED = 0,
    NEW, 
    SUCCESS, 
    FAIL, 
    REVOKE, 
    DONT_WANT, 
    FAIL_MANUAL
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

    bool operator==(const LicenseCheckStatusType& rhs) const;
    bool operator!=(const LicenseCheckStatusType& rhs) const;

    /////////////////////////////////////////////
    /// LicenseCheckStatusType members

    LicenseCheckStatusType::eLicenseCheckStatusType getValue() const;
    void setValue(LicenseCheckStatusType::eLicenseCheckStatusType value);
    
    friend  void to_json(nlohmann::json& j, const LicenseCheckStatusType& o);
    friend  void from_json(const nlohmann::json& j, LicenseCheckStatusType& o);
protected:
    LicenseCheckStatusType::eLicenseCheckStatusType m_value = LicenseCheckStatusType::eLicenseCheckStatusType::INVALID_VALUE_OPENAPI_GENERATED;
};

} // namespace org::openapitools::server::model

#endif /* LicenseCheckStatusType_H_ */
