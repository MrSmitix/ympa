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
 * OrderDocumentStatusType.h
 *
 * Статус документа:  * &#x60;READY&#x60; — готов. * &#x60;NOT_READY&#x60; — не готов. 
 */

#ifndef OrderDocumentStatusType_H_
#define OrderDocumentStatusType_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Статус документа:  * &#x60;READY&#x60; — готов. * &#x60;NOT_READY&#x60; — не готов. 
/// </summary>
class  OrderDocumentStatusType
{
public:
    OrderDocumentStatusType();
    virtual ~OrderDocumentStatusType() = default;

    enum class eOrderDocumentStatusType {
    // To have a valid default value.
    // Avoiding name clashes with user defined
    // enum values
    INVALID_VALUE_OPENAPI_GENERATED = 0,
    READY, 
    NOT_READY
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

    bool operator==(const OrderDocumentStatusType& rhs) const;
    bool operator!=(const OrderDocumentStatusType& rhs) const;

    /////////////////////////////////////////////
    /// OrderDocumentStatusType members

    OrderDocumentStatusType::eOrderDocumentStatusType getValue() const;
    void setValue(OrderDocumentStatusType::eOrderDocumentStatusType value);
    
    friend  void to_json(nlohmann::json& j, const OrderDocumentStatusType& o);
    friend  void from_json(const nlohmann::json& j, OrderDocumentStatusType& o);
protected:
    OrderDocumentStatusType::eOrderDocumentStatusType m_value = OrderDocumentStatusType::eOrderDocumentStatusType::INVALID_VALUE_OPENAPI_GENERATED;
};

} // namespace org::openapitools::server::model

#endif /* OrderDocumentStatusType_H_ */
