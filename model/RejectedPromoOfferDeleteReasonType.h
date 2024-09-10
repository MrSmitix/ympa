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
 * RejectedPromoOfferDeleteReasonType.h
 *
 * Описание ошибки:  * &#x60;OFFER_DOES_NOT_EXIST&#x60; — в кабинете нет товара с таким SKU. 
 */

#ifndef RejectedPromoOfferDeleteReasonType_H_
#define RejectedPromoOfferDeleteReasonType_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Описание ошибки:  * &#x60;OFFER_DOES_NOT_EXIST&#x60; — в кабинете нет товара с таким SKU. 
/// </summary>
class  RejectedPromoOfferDeleteReasonType
{
public:
    RejectedPromoOfferDeleteReasonType();
    virtual ~RejectedPromoOfferDeleteReasonType() = default;

    enum class eRejectedPromoOfferDeleteReasonType {
    // To have a valid default value.
    // Avoiding name clashes with user defined
    // enum values
    INVALID_VALUE_OPENAPI_GENERATED = 0,
    OFFER_DOES_NOT_EXIST
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

    bool operator==(const RejectedPromoOfferDeleteReasonType& rhs) const;
    bool operator!=(const RejectedPromoOfferDeleteReasonType& rhs) const;

    /////////////////////////////////////////////
    /// RejectedPromoOfferDeleteReasonType members

    RejectedPromoOfferDeleteReasonType::eRejectedPromoOfferDeleteReasonType getValue() const;
    void setValue(RejectedPromoOfferDeleteReasonType::eRejectedPromoOfferDeleteReasonType value);
    
    friend  void to_json(nlohmann::json& j, const RejectedPromoOfferDeleteReasonType& o);
    friend  void from_json(const nlohmann::json& j, RejectedPromoOfferDeleteReasonType& o);
protected:
    RejectedPromoOfferDeleteReasonType::eRejectedPromoOfferDeleteReasonType m_value = RejectedPromoOfferDeleteReasonType::eRejectedPromoOfferDeleteReasonType::INVALID_VALUE_OPENAPI_GENERATED;
};

} // namespace org::openapitools::server::model

#endif /* RejectedPromoOfferDeleteReasonType_H_ */
