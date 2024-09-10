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
 * GetPromoPromocodeInfoDTO.h
 *
 * Информация для типа &#x60;MARKET_PROMOCODE&#x60;.  Параметр заполняется только для этого типа акции. 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_GetPromoPromocodeInfoDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_GetPromoPromocodeInfoDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// Информация для типа &#x60;MARKET_PROMOCODE&#x60;.  Параметр заполняется только для этого типа акции. 
/// </summary>
class  GetPromoPromocodeInfoDTO
    : public ModelBase
{
public:
    GetPromoPromocodeInfoDTO();
    virtual ~GetPromoPromocodeInfoDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// GetPromoPromocodeInfoDTO members

    /// <summary>
    /// Промокод.
    /// </summary>
    utility::string_t getPromocode() const;
    bool promocodeIsSet() const;
    void unsetPromocode();

    void setPromocode(const utility::string_t& value);

    /// <summary>
    /// Процент скидки по промокоду.
    /// </summary>
    int32_t getDiscount() const;
    bool discountIsSet() const;
    void unsetDiscount();

    void setDiscount(int32_t value);


protected:
    utility::string_t m_Promocode;
    bool m_PromocodeIsSet;
    int32_t m_Discount;
    bool m_DiscountIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_GetPromoPromocodeInfoDTO_H_ */
