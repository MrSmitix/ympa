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
 * OutletStatusType.h
 *
 * Статус точки продаж.  Возможные значения:  * &#x60;AT_MODERATION&#x60; — проверяется. * &#x60;FAILED&#x60; — не прошла проверку и отклонена модератором. * &#x60;MODERATED&#x60; — проверена и одобрена. * &#x60;NONMODERATED&#x60; — новая точка, нуждается в проверке. 
 */

#ifndef OutletStatusType_H_
#define OutletStatusType_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Статус точки продаж.  Возможные значения:  * &#x60;AT_MODERATION&#x60; — проверяется. * &#x60;FAILED&#x60; — не прошла проверку и отклонена модератором. * &#x60;MODERATED&#x60; — проверена и одобрена. * &#x60;NONMODERATED&#x60; — новая точка, нуждается в проверке. 
/// </summary>
class  OutletStatusType
{
public:
    OutletStatusType();
    virtual ~OutletStatusType() = default;

    enum class eOutletStatusType {
    // To have a valid default value.
    // Avoiding name clashes with user defined
    // enum values
    INVALID_VALUE_OPENAPI_GENERATED = 0,
    AT_MODERATION, 
    FAILED, 
    MODERATED, 
    NONMODERATED, 
    UNKNOWN
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

    bool operator==(const OutletStatusType& rhs) const;
    bool operator!=(const OutletStatusType& rhs) const;

    /////////////////////////////////////////////
    /// OutletStatusType members

    OutletStatusType::eOutletStatusType getValue() const;
    void setValue(OutletStatusType::eOutletStatusType value);
    
    friend  void to_json(nlohmann::json& j, const OutletStatusType& o);
    friend  void from_json(const nlohmann::json& j, OutletStatusType& o);
protected:
    OutletStatusType::eOutletStatusType m_value = OutletStatusType::eOutletStatusType::INVALID_VALUE_OPENAPI_GENERATED;
};

} // namespace org::openapitools::server::model

#endif /* OutletStatusType_H_ */
