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
 * OAIUpdateBusinessOfferPriceDTO.h
 *
 * Товар с новой ценой.
 */

#ifndef OAIUpdateBusinessOfferPriceDTO_H
#define OAIUpdateBusinessOfferPriceDTO_H

#include <QJsonObject>

#include "OAIUpdatePriceWithDiscountDTO.h"
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIUpdateBusinessOfferPriceDTO : public OAIObject {
public:
    OAIUpdateBusinessOfferPriceDTO();
    OAIUpdateBusinessOfferPriceDTO(QString json);
    ~OAIUpdateBusinessOfferPriceDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getOfferId() const;
    void setOfferId(const QString &offer_id);
    bool is_offer_id_Set() const;
    bool is_offer_id_Valid() const;

    OAIUpdatePriceWithDiscountDTO getPrice() const;
    void setPrice(const OAIUpdatePriceWithDiscountDTO &price);
    bool is_price_Set() const;
    bool is_price_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString offer_id;
    bool m_offer_id_isSet;
    bool m_offer_id_isValid;

    OAIUpdatePriceWithDiscountDTO price;
    bool m_price_isSet;
    bool m_price_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIUpdateBusinessOfferPriceDTO)

#endif // OAIUpdateBusinessOfferPriceDTO_H
