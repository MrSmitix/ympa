/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 7.8.0.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * CalculateTariffsOfferDTO.h
 *
 * Параметры товара, для которого нужно рассчитать стоимость услуг.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CalculateTariffsOfferDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CalculateTariffsOfferDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// Параметры товара, для которого нужно рассчитать стоимость услуг.
/// </summary>
class  CalculateTariffsOfferDTO
    : public ModelBase
{
public:
    CalculateTariffsOfferDTO();
    virtual ~CalculateTariffsOfferDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CalculateTariffsOfferDTO members

    /// <summary>
    /// Идентификатор категории товара на Маркете.  Для расчета стоимости услуг необходимо указать идентификатор листовой категории товара — той, которая не имеет дочерних категорий.  Чтобы узнать идентификатор категории, к которой относится товар, воспользуйтесь запросом [POST categories/tree](../../reference/categories/getCategoriesTree.md). 
    /// </summary>
    int64_t getCategoryId() const;
    bool categoryIdIsSet() const;
    void unsetCategoryId();

    void setCategoryId(int64_t value);

    /// <summary>
    /// Цена на товар в рублях.
    /// </summary>
    double getPrice() const;
    bool priceIsSet() const;
    void unsetPrice();

    void setPrice(double value);

    /// <summary>
    /// Длина товара в сантиметрах.
    /// </summary>
    double getLength() const;
    bool lengthIsSet() const;
    void unsetLength();

    void setLength(double value);

    /// <summary>
    /// Ширина товара в сантиметрах.
    /// </summary>
    double getWidth() const;
    bool widthIsSet() const;
    void unsetWidth();

    void setWidth(double value);

    /// <summary>
    /// Высота товара в сантиметрах.
    /// </summary>
    double getHeight() const;
    bool heightIsSet() const;
    void unsetHeight();

    void setHeight(double value);

    /// <summary>
    /// Вес товара в килограммах.
    /// </summary>
    double getWeight() const;
    bool weightIsSet() const;
    void unsetWeight();

    void setWeight(double value);

    /// <summary>
    /// Квант продажи — количество единиц товара в одном товарном предложении.
    /// </summary>
    int32_t getQuantity() const;
    bool quantityIsSet() const;
    void unsetQuantity();

    void setQuantity(int32_t value);


protected:
    int64_t m_CategoryId;
    bool m_CategoryIdIsSet;
    double m_Price;
    bool m_PriceIsSet;
    double m_Length;
    bool m_LengthIsSet;
    double m_Width;
    bool m_WidthIsSet;
    double m_Height;
    bool m_HeightIsSet;
    double m_Weight;
    bool m_WeightIsSet;
    int32_t m_Quantity;
    bool m_QuantityIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CalculateTariffsOfferDTO_H_ */
