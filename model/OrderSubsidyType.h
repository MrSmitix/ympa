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
 * OrderSubsidyType.h
 *
 * Тип субсидии:  * &#x60;YANDEX_CASHBACK&#x60; — скидка по подписке Яндекс Плюс.  * &#x60;SUBSIDY&#x60; — скидка Маркета (по акциям, промокодам, купонам и т. д.)  * &#x60;DELIVERY&#x60; — скидка за доставку (DBS). 
 */

#ifndef OrderSubsidyType_H_
#define OrderSubsidyType_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Тип субсидии:  * &#x60;YANDEX_CASHBACK&#x60; — скидка по подписке Яндекс Плюс.  * &#x60;SUBSIDY&#x60; — скидка Маркета (по акциям, промокодам, купонам и т. д.)  * &#x60;DELIVERY&#x60; — скидка за доставку (DBS). 
/// </summary>
class  OrderSubsidyType
{
public:
    OrderSubsidyType();
    virtual ~OrderSubsidyType() = default;

    enum class eOrderSubsidyType {
    // To have a valid default value.
    // Avoiding name clashes with user defined
    // enum values
    INVALID_VALUE_OPENAPI_GENERATED = 0,
    YANDEX_CASHBACK, 
    SUBSIDY, 
    DELIVERY
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

    bool operator==(const OrderSubsidyType& rhs) const;
    bool operator!=(const OrderSubsidyType& rhs) const;

    /////////////////////////////////////////////
    /// OrderSubsidyType members

    OrderSubsidyType::eOrderSubsidyType getValue() const;
    void setValue(OrderSubsidyType::eOrderSubsidyType value);
    
    friend  void to_json(nlohmann::json& j, const OrderSubsidyType& o);
    friend  void from_json(const nlohmann::json& j, OrderSubsidyType& o);
protected:
    OrderSubsidyType::eOrderSubsidyType m_value = OrderSubsidyType::eOrderSubsidyType::INVALID_VALUE_OPENAPI_GENERATED;
};

} // namespace org::openapitools::server::model

#endif /* OrderSubsidyType_H_ */
