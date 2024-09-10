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
 * OAIReturnItemDTO.h
 *
 * Список товаров в возврате.
 */

#ifndef OAIReturnItemDTO_H
#define OAIReturnItemDTO_H

#include <QJsonObject>

#include "OAIReturnDecisionDTO.h"
#include "OAIReturnInstanceDTO.h"
#include "OAITrackDTO.h"
#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIReturnItemDTO : public OAIObject {
public:
    OAIReturnItemDTO();
    OAIReturnItemDTO(QString json);
    ~OAIReturnItemDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint64 getMarketSku() const;
    void setMarketSku(const qint64 &market_sku);
    bool is_market_sku_Set() const;
    bool is_market_sku_Valid() const;

    QString getShopSku() const;
    void setShopSku(const QString &shop_sku);
    bool is_shop_sku_Set() const;
    bool is_shop_sku_Valid() const;

    qint64 getCount() const;
    void setCount(const qint64 &count);
    bool is_count_Set() const;
    bool is_count_Valid() const;

    QList<OAIReturnDecisionDTO> getDecisions() const;
    void setDecisions(const QList<OAIReturnDecisionDTO> &decisions);
    bool is_decisions_Set() const;
    bool is_decisions_Valid() const;

    QList<OAIReturnInstanceDTO> getInstances() const;
    void setInstances(const QList<OAIReturnInstanceDTO> &instances);
    bool is_instances_Set() const;
    bool is_instances_Valid() const;

    QList<OAITrackDTO> getTracks() const;
    void setTracks(const QList<OAITrackDTO> &tracks);
    bool is_tracks_Set() const;
    bool is_tracks_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint64 market_sku;
    bool m_market_sku_isSet;
    bool m_market_sku_isValid;

    QString shop_sku;
    bool m_shop_sku_isSet;
    bool m_shop_sku_isValid;

    qint64 count;
    bool m_count_isSet;
    bool m_count_isValid;

    QList<OAIReturnDecisionDTO> decisions;
    bool m_decisions_isSet;
    bool m_decisions_isValid;

    QList<OAIReturnInstanceDTO> instances;
    bool m_instances_isSet;
    bool m_instances_isValid;

    QList<OAITrackDTO> tracks;
    bool m_tracks_isSet;
    bool m_tracks_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIReturnItemDTO)

#endif // OAIReturnItemDTO_H
