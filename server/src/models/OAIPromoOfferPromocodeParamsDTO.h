/**
 * Партнерский API Маркета
 * API Яндекс Маркета помогает продавцам автоматизировать и упростить работу с маркетплейсом.  В числе возможностей интеграции:  * управление каталогом товаров и витриной,  * обработка заказов,  * изменение настроек магазина,  * получение отчетов. 
 *
 * The version of the OpenAPI document: LATEST
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * OAIPromoOfferPromocodeParamsDTO.h
 *
 * Параметры товара в акции с типом &#x60;MARKET_PROMOCODE&#x60;.
 */

#ifndef OAIPromoOfferPromocodeParamsDTO_H
#define OAIPromoOfferPromocodeParamsDTO_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIPromoOfferPromocodeParamsDTO : public OAIObject {
public:
    OAIPromoOfferPromocodeParamsDTO();
    OAIPromoOfferPromocodeParamsDTO(QString json);
    ~OAIPromoOfferPromocodeParamsDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint64 getMaxPrice() const;
    void setMaxPrice(const qint64 &max_price);
    bool is_max_price_Set() const;
    bool is_max_price_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint64 max_price;
    bool m_max_price_isSet;
    bool m_max_price_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIPromoOfferPromocodeParamsDTO)

#endif // OAIPromoOfferPromocodeParamsDTO_H
