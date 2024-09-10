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
 * OrderBuyerType.h
 *
 * Тип покупателя:  * &#x60;PERSON&#x60; — физическое лицо.  * &#x60;BUSINESS&#x60; — организация. 
 */

#ifndef OrderBuyerType_H_
#define OrderBuyerType_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Тип покупателя:  * &#x60;PERSON&#x60; — физическое лицо.  * &#x60;BUSINESS&#x60; — организация. 
/// </summary>
class  OrderBuyerType
{
public:
    OrderBuyerType();
    virtual ~OrderBuyerType() = default;

    enum class eOrderBuyerType {
    // To have a valid default value.
    // Avoiding name clashes with user defined
    // enum values
    INVALID_VALUE_OPENAPI_GENERATED = 0,
    PERSON, 
    BUSINESS
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

    bool operator==(const OrderBuyerType& rhs) const;
    bool operator!=(const OrderBuyerType& rhs) const;

    /////////////////////////////////////////////
    /// OrderBuyerType members

    OrderBuyerType::eOrderBuyerType getValue() const;
    void setValue(OrderBuyerType::eOrderBuyerType value);
    
    friend  void to_json(nlohmann::json& j, const OrderBuyerType& o);
    friend  void from_json(const nlohmann::json& j, OrderBuyerType& o);
protected:
    OrderBuyerType::eOrderBuyerType m_value = OrderBuyerType::eOrderBuyerType::INVALID_VALUE_OPENAPI_GENERATED;
};

} // namespace org::openapitools::server::model

#endif /* OrderBuyerType_H_ */
