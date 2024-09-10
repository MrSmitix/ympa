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
 * AffectedOrderQualityRatingComponentType.h
 *
 * Составляющие индекса качества.  **Для модели DBS:** * &#x60;DBS_CANCELLATION_RATE&#x60; — доля отмененных товаров. * &#x60;DBS_LATE_DELIVERY_RATE&#x60; — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * &#x60;FBS_CANCELLATION_RATE&#x60; — доля отмененных товаров. * &#x60;FBS_LATE_SHIP_RATE&#x60; — доля не вовремя отгруженных заказов. 
 */

#ifndef AffectedOrderQualityRatingComponentType_H_
#define AffectedOrderQualityRatingComponentType_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Составляющие индекса качества.  **Для модели DBS:** * &#x60;DBS_CANCELLATION_RATE&#x60; — доля отмененных товаров. * &#x60;DBS_LATE_DELIVERY_RATE&#x60; — доля заказов, доставленных после плановой даты.  **Для моделей FBS и Экспресс:** * &#x60;FBS_CANCELLATION_RATE&#x60; — доля отмененных товаров. * &#x60;FBS_LATE_SHIP_RATE&#x60; — доля не вовремя отгруженных заказов. 
/// </summary>
class  AffectedOrderQualityRatingComponentType
{
public:
    AffectedOrderQualityRatingComponentType();
    virtual ~AffectedOrderQualityRatingComponentType() = default;

    enum class eAffectedOrderQualityRatingComponentType {
    // To have a valid default value.
    // Avoiding name clashes with user defined
    // enum values
    INVALID_VALUE_OPENAPI_GENERATED = 0,
    DBS_CANCELLATION_RATE, 
    DBS_LATE_DELIVERY_RATE, 
    FBS_CANCELLATION_RATE, 
    FBS_LATE_SHIP_RATE
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

    bool operator==(const AffectedOrderQualityRatingComponentType& rhs) const;
    bool operator!=(const AffectedOrderQualityRatingComponentType& rhs) const;

    /////////////////////////////////////////////
    /// AffectedOrderQualityRatingComponentType members

    AffectedOrderQualityRatingComponentType::eAffectedOrderQualityRatingComponentType getValue() const;
    void setValue(AffectedOrderQualityRatingComponentType::eAffectedOrderQualityRatingComponentType value);
    
    friend  void to_json(nlohmann::json& j, const AffectedOrderQualityRatingComponentType& o);
    friend  void from_json(const nlohmann::json& j, AffectedOrderQualityRatingComponentType& o);
protected:
    AffectedOrderQualityRatingComponentType::eAffectedOrderQualityRatingComponentType m_value = AffectedOrderQualityRatingComponentType::eAffectedOrderQualityRatingComponentType::INVALID_VALUE_OPENAPI_GENERATED;
};

} // namespace org::openapitools::server::model

#endif /* AffectedOrderQualityRatingComponentType_H_ */
