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
 * PromoParticipationType.h
 *
 * Какие акции вернутся:  * &#x60;PARTICIPATING_NOW&#x60; — текущие и будущие акции продавца.  * &#x60;PARTICIPATED&#x60; — завершенные акции продавца за последний год. Если за год их было меньше 15, в ответе придут 15 последних акций за все время. 
 */

#ifndef PromoParticipationType_H_
#define PromoParticipationType_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Какие акции вернутся:  * &#x60;PARTICIPATING_NOW&#x60; — текущие и будущие акции продавца.  * &#x60;PARTICIPATED&#x60; — завершенные акции продавца за последний год. Если за год их было меньше 15, в ответе придут 15 последних акций за все время. 
/// </summary>
class  PromoParticipationType
{
public:
    PromoParticipationType();
    virtual ~PromoParticipationType() = default;

    enum class ePromoParticipationType {
    // To have a valid default value.
    // Avoiding name clashes with user defined
    // enum values
    INVALID_VALUE_OPENAPI_GENERATED = 0,
    PARTICIPATING_NOW, 
    PARTICIPATED
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

    bool operator==(const PromoParticipationType& rhs) const;
    bool operator!=(const PromoParticipationType& rhs) const;

    /////////////////////////////////////////////
    /// PromoParticipationType members

    PromoParticipationType::ePromoParticipationType getValue() const;
    void setValue(PromoParticipationType::ePromoParticipationType value);
    
    friend  void to_json(nlohmann::json& j, const PromoParticipationType& o);
    friend  void from_json(const nlohmann::json& j, PromoParticipationType& o);
protected:
    PromoParticipationType::ePromoParticipationType m_value = PromoParticipationType::ePromoParticipationType::INVALID_VALUE_OPENAPI_GENERATED;
};

} // namespace org::openapitools::server::model

#endif /* PromoParticipationType_H_ */
