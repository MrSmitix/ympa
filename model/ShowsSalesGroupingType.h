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
 * ShowsSalesGroupingType.h
 *
 * Группировка данных отчета. Возможные значения: * &#x60;CATEGORIES&#x60; — группировка по категориям. * &#x60;OFFERS&#x60; — группировка по товарам. 
 */

#ifndef ShowsSalesGroupingType_H_
#define ShowsSalesGroupingType_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Группировка данных отчета. Возможные значения: * &#x60;CATEGORIES&#x60; — группировка по категориям. * &#x60;OFFERS&#x60; — группировка по товарам. 
/// </summary>
class  ShowsSalesGroupingType
{
public:
    ShowsSalesGroupingType();
    virtual ~ShowsSalesGroupingType() = default;

    enum class eShowsSalesGroupingType {
    // To have a valid default value.
    // Avoiding name clashes with user defined
    // enum values
    INVALID_VALUE_OPENAPI_GENERATED = 0,
    CATEGORIES, 
    OFFERS
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

    bool operator==(const ShowsSalesGroupingType& rhs) const;
    bool operator!=(const ShowsSalesGroupingType& rhs) const;

    /////////////////////////////////////////////
    /// ShowsSalesGroupingType members

    ShowsSalesGroupingType::eShowsSalesGroupingType getValue() const;
    void setValue(ShowsSalesGroupingType::eShowsSalesGroupingType value);
    
    friend  void to_json(nlohmann::json& j, const ShowsSalesGroupingType& o);
    friend  void from_json(const nlohmann::json& j, ShowsSalesGroupingType& o);
protected:
    ShowsSalesGroupingType::eShowsSalesGroupingType m_value = ShowsSalesGroupingType::eShowsSalesGroupingType::INVALID_VALUE_OPENAPI_GENERATED;
};

} // namespace org::openapitools::server::model

#endif /* ShowsSalesGroupingType_H_ */
