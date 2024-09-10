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
 * SkuBidItemDTO.h
 *
 * Список товаров и ставок на них.
 */

#ifndef SkuBidItemDTO_H_
#define SkuBidItemDTO_H_


#include <string>
#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Список товаров и ставок на них.
/// </summary>
class  SkuBidItemDTO
{
public:
    SkuBidItemDTO();
    virtual ~SkuBidItemDTO() = default;


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

    bool operator==(const SkuBidItemDTO& rhs) const;
    bool operator!=(const SkuBidItemDTO& rhs) const;

    /////////////////////////////////////////////
    /// SkuBidItemDTO members

    /// <summary>
    /// Ваш SKU — идентификатор товара в вашей системе.  Разрешена любая последовательность длиной до 255 знаков.  Правила использования SKU:  * У каждого товара SKU должен быть свой.  * SKU товара нельзя менять — можно только удалить товар и добавить заново с новым SKU.  * Уже заданный SKU нельзя освободить и использовать заново для другого товара. Каждый товар должен получать новый идентификатор, до того никогда не использовавшийся в вашем каталоге.  [Что такое SKU и как его назначать](https://yandex.ru/support/marketplace/assortment/add/index.html#fields) 
    /// </summary>
    std::string getSku() const;
    void setSku(std::string const& value);
    /// <summary>
    /// Значение ставки.
    /// </summary>
    int32_t getBid() const;
    void setBid(int32_t const value);

    friend  void to_json(nlohmann::json& j, const SkuBidItemDTO& o);
    friend  void from_json(const nlohmann::json& j, SkuBidItemDTO& o);
protected:
    std::string m_Sku;

    int32_t m_Bid;

    
};

} // namespace org::openapitools::server::model

#endif /* SkuBidItemDTO_H_ */
