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
 * OAIPriceSuggestOfferDTO.h
 *
 * Товар с ценами для продвижения.
 */

#ifndef OAIPriceSuggestOfferDTO_H
#define OAIPriceSuggestOfferDTO_H

#include <QJsonObject>

#include "OAIPriceSuggestDTO.h"
#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIPriceSuggestDTO;

class OAIPriceSuggestOfferDTO : public OAIObject {
public:
    OAIPriceSuggestOfferDTO();
    OAIPriceSuggestOfferDTO(QString json);
    ~OAIPriceSuggestOfferDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint64 getMarketSku() const;
    void setMarketSku(const qint64 &market_sku);
    bool is_market_sku_Set() const;
    bool is_market_sku_Valid() const;

    QString getOfferId() const;
    void setOfferId(const QString &offer_id);
    bool is_offer_id_Set() const;
    bool is_offer_id_Valid() const;

    QList<OAIPriceSuggestDTO> getPriceSuggestion() const;
    void setPriceSuggestion(const QList<OAIPriceSuggestDTO> &price_suggestion);
    bool is_price_suggestion_Set() const;
    bool is_price_suggestion_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint64 m_market_sku;
    bool m_market_sku_isSet;
    bool m_market_sku_isValid;

    QString m_offer_id;
    bool m_offer_id_isSet;
    bool m_offer_id_isValid;

    QList<OAIPriceSuggestDTO> m_price_suggestion;
    bool m_price_suggestion_isSet;
    bool m_price_suggestion_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIPriceSuggestOfferDTO)

#endif // OAIPriceSuggestOfferDTO_H
