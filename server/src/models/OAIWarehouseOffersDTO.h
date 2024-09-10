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
 * OAIWarehouseOffersDTO.h
 *
 * Информация об остатках товаров на складе.
 */

#ifndef OAIWarehouseOffersDTO_H
#define OAIWarehouseOffersDTO_H

#include <QJsonObject>

#include "OAIWarehouseOfferDTO.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIWarehouseOffersDTO : public OAIObject {
public:
    OAIWarehouseOffersDTO();
    OAIWarehouseOffersDTO(QString json);
    ~OAIWarehouseOffersDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint64 getWarehouseId() const;
    void setWarehouseId(const qint64 &warehouse_id);
    bool is_warehouse_id_Set() const;
    bool is_warehouse_id_Valid() const;

    QList<OAIWarehouseOfferDTO> getOffers() const;
    void setOffers(const QList<OAIWarehouseOfferDTO> &offers);
    bool is_offers_Set() const;
    bool is_offers_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint64 warehouse_id;
    bool m_warehouse_id_isSet;
    bool m_warehouse_id_isValid;

    QList<OAIWarehouseOfferDTO> offers;
    bool m_offers_isSet;
    bool m_offers_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIWarehouseOffersDTO)

#endif // OAIWarehouseOffersDTO_H
