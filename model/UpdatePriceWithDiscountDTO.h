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
 * UpdatePriceWithDiscountDTO.h
 *
 * Цена с указанием скидки.
 */

#ifndef UpdatePriceWithDiscountDTO_H_
#define UpdatePriceWithDiscountDTO_H_


#include "CurrencyType.h"
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Цена с указанием скидки.
/// </summary>
class  UpdatePriceWithDiscountDTO
{
public:
    UpdatePriceWithDiscountDTO();
    virtual ~UpdatePriceWithDiscountDTO() = default;


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

    bool operator==(const UpdatePriceWithDiscountDTO& rhs) const;
    bool operator!=(const UpdatePriceWithDiscountDTO& rhs) const;

    /////////////////////////////////////////////
    /// UpdatePriceWithDiscountDTO members

    /// <summary>
    /// Значение.
    /// </summary>
    double getValue() const;
    void setValue(double const value);
    /// <summary>
    /// 
    /// </summary>
    org::openapitools::server::model::CurrencyType getCurrencyId() const;
    void setCurrencyId(org::openapitools::server::model::CurrencyType const& value);
    /// <summary>
    /// Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
    /// </summary>
    double getDiscountBase() const;
    void setDiscountBase(double const value);
    bool discountBaseIsSet() const;
    void unsetDiscountBase();

    friend  void to_json(nlohmann::json& j, const UpdatePriceWithDiscountDTO& o);
    friend  void from_json(const nlohmann::json& j, UpdatePriceWithDiscountDTO& o);
protected:
    double m_Value;

    org::openapitools::server::model::CurrencyType m_CurrencyId;

    double m_DiscountBase;
    bool m_DiscountBaseIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* UpdatePriceWithDiscountDTO_H_ */
