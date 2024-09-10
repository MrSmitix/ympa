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
 * OrderDeliveryEacType.h
 *
 * Тип кода подтверждения ЭАПП:  * &#x60;MERCHANT_TO_COURIER&#x60; — продавец передает код курьеру.  * &#x60;COURIER_TO_MERCHANT&#x60; — курьер передает код продавцу.  * &#x60;CHECKING_BY_MERCHANT&#x60; — продавец проверяет код на своей стороне. 
 */

#ifndef OrderDeliveryEacType_H_
#define OrderDeliveryEacType_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Тип кода подтверждения ЭАПП:  * &#x60;MERCHANT_TO_COURIER&#x60; — продавец передает код курьеру.  * &#x60;COURIER_TO_MERCHANT&#x60; — курьер передает код продавцу.  * &#x60;CHECKING_BY_MERCHANT&#x60; — продавец проверяет код на своей стороне. 
/// </summary>
class  OrderDeliveryEacType
{
public:
    OrderDeliveryEacType();
    virtual ~OrderDeliveryEacType() = default;

    enum class eOrderDeliveryEacType {
    // To have a valid default value.
    // Avoiding name clashes with user defined
    // enum values
    INVALID_VALUE_OPENAPI_GENERATED = 0,
    MERCHANT_TO_COURIER, 
    COURIER_TO_MERCHANT, 
    CHECKING_BY_MERCHANT
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

    bool operator==(const OrderDeliveryEacType& rhs) const;
    bool operator!=(const OrderDeliveryEacType& rhs) const;

    /////////////////////////////////////////////
    /// OrderDeliveryEacType members

    OrderDeliveryEacType::eOrderDeliveryEacType getValue() const;
    void setValue(OrderDeliveryEacType::eOrderDeliveryEacType value);
    
    friend  void to_json(nlohmann::json& j, const OrderDeliveryEacType& o);
    friend  void from_json(const nlohmann::json& j, OrderDeliveryEacType& o);
protected:
    OrderDeliveryEacType::eOrderDeliveryEacType m_value = OrderDeliveryEacType::eOrderDeliveryEacType::INVALID_VALUE_OPENAPI_GENERATED;
};

} // namespace org::openapitools::server::model

#endif /* OrderDeliveryEacType_H_ */
