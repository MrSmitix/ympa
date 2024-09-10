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
 * CalculateTariffsOfferDTO.h
 *
 * Параметры товара, для которого нужно рассчитать стоимость услуг.
 */

#ifndef CalculateTariffsOfferDTO_H_
#define CalculateTariffsOfferDTO_H_


#include <nlohmann/json.hpp>

namespace org::openapitools::server::model
{

/// <summary>
/// Параметры товара, для которого нужно рассчитать стоимость услуг.
/// </summary>
class  CalculateTariffsOfferDTO
{
public:
    CalculateTariffsOfferDTO();
    virtual ~CalculateTariffsOfferDTO() = default;


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

    bool operator==(const CalculateTariffsOfferDTO& rhs) const;
    bool operator!=(const CalculateTariffsOfferDTO& rhs) const;

    /////////////////////////////////////////////
    /// CalculateTariffsOfferDTO members

    /// <summary>
    /// Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
    /// </summary>
    int64_t getCategoryId() const;
    void setCategoryId(int64_t const value);
    /// <summary>
    /// Цена на товар в рублях.
    /// </summary>
    double getPrice() const;
    void setPrice(double const value);
    /// <summary>
    /// Длина товара в сантиметрах.
    /// </summary>
    double getLength() const;
    void setLength(double const value);
    /// <summary>
    /// Ширина товара в сантиметрах.
    /// </summary>
    double getWidth() const;
    void setWidth(double const value);
    /// <summary>
    /// Высота товара в сантиметрах.
    /// </summary>
    double getHeight() const;
    void setHeight(double const value);
    /// <summary>
    /// Вес товара в килограммах.
    /// </summary>
    double getWeight() const;
    void setWeight(double const value);
    /// <summary>
    /// Квант продажи — количество единиц товара в одном товарном предложении.
    /// </summary>
    int32_t getQuantity() const;
    void setQuantity(int32_t const value);
    bool quantityIsSet() const;
    void unsetQuantity();

    friend  void to_json(nlohmann::json& j, const CalculateTariffsOfferDTO& o);
    friend  void from_json(const nlohmann::json& j, CalculateTariffsOfferDTO& o);
protected:
    int64_t m_CategoryId;

    double m_Price;

    double m_Length;

    double m_Width;

    double m_Height;

    double m_Weight;

    int32_t m_Quantity;
    bool m_QuantityIsSet;
    
};

} // namespace org::openapitools::server::model

#endif /* CalculateTariffsOfferDTO_H_ */
