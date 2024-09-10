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
 * GetPriceWithDiscountDTO.h
 *
 * Цена с указанием скидки и времени последнего обновления.
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_GetPriceWithDiscountDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_GetPriceWithDiscountDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "ympa_cpp_restsdk_client/model/CurrencyType.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// Цена с указанием скидки и времени последнего обновления.
/// </summary>
class  GetPriceWithDiscountDTO
    : public ModelBase
{
public:
    GetPriceWithDiscountDTO();
    virtual ~GetPriceWithDiscountDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// GetPriceWithDiscountDTO members

    /// <summary>
    /// Значение.
    /// </summary>
    double getValue() const;
    bool valueIsSet() const;
    void unsetValue();

    void setValue(double value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<CurrencyType> getCurrencyId() const;
    bool currencyIdIsSet() const;
    void unsetCurrencyId();

    void setCurrencyId(const std::shared_ptr<CurrencyType>& value);

    /// <summary>
    /// Цена до скидки.  Число должно быть целым. Вы можете указать цену со скидкой от 5 до 99%.  Передавайте этот параметр при каждом обновлении цены, если предоставляете скидку на товар. 
    /// </summary>
    double getDiscountBase() const;
    bool discountBaseIsSet() const;
    void unsetDiscountBase();

    void setDiscountBase(double value);

    /// <summary>
    /// Время последнего обновления.
    /// </summary>
    utility::datetime getUpdatedAt() const;
    bool updatedAtIsSet() const;
    void unsetUpdatedAt();

    void setUpdatedAt(const utility::datetime& value);


protected:
    double m_Value;
    bool m_ValueIsSet;
    std::shared_ptr<CurrencyType> m_CurrencyId;
    bool m_CurrencyIdIsSet;
    double m_DiscountBase;
    bool m_DiscountBaseIsSet;
    utility::datetime m_UpdatedAt;
    bool m_UpdatedAtIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_GetPriceWithDiscountDTO_H_ */
