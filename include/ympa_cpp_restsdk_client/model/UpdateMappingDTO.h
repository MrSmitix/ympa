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
 * UpdateMappingDTO.h
 *
 * Карточка на Маркете, которая, с вашей точки зрения, подходит товару. Чтобы определить идентификатор подходящей карточки, воспользуйтесь поиском в кабинете (**Товары** → **Каталог** → **Загрузить товары**).  По результатам проверки Маркет может привязать товар к более подходящей карточке. 
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_UpdateMappingDTO_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_UpdateMappingDTO_H_


#include "ympa_cpp_restsdk_client/ModelBase.h"


namespace org {
namespace openapitools {
namespace client {
namespace model {



/// <summary>
/// Карточка на Маркете, которая, с вашей точки зрения, подходит товару. Чтобы определить идентификатор подходящей карточки, воспользуйтесь поиском в кабинете (**Товары** → **Каталог** → **Загрузить товары**).  По результатам проверки Маркет может привязать товар к более подходящей карточке. 
/// </summary>
class  UpdateMappingDTO
    : public ModelBase
{
public:
    UpdateMappingDTO();
    virtual ~UpdateMappingDTO();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    bool fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    bool fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// UpdateMappingDTO members

    /// <summary>
    /// SKU на Маркете.
    /// </summary>
    int64_t getMarketSku() const;
    bool marketSkuIsSet() const;
    void unsetMarketSku();

    void setMarketSku(int64_t value);


protected:
    int64_t m_MarketSku;
    bool m_MarketSkuIsSet;
};


}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_UpdateMappingDTO_H_ */
