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
 * OAIOfferCampaignStatusDTO.h
 *
 * Статус товара в магазине.
 */

#ifndef OAIOfferCampaignStatusDTO_H
#define OAIOfferCampaignStatusDTO_H

#include <QJsonObject>

#include "OAIOfferCampaignStatusType.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIOfferCampaignStatusDTO : public OAIObject {
public:
    OAIOfferCampaignStatusDTO();
    OAIOfferCampaignStatusDTO(QString json);
    ~OAIOfferCampaignStatusDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint64 getCampaignId() const;
    void setCampaignId(const qint64 &campaign_id);
    bool is_campaign_id_Set() const;
    bool is_campaign_id_Valid() const;

    OAIOfferCampaignStatusType getStatus() const;
    void setStatus(const OAIOfferCampaignStatusType &status);
    bool is_status_Set() const;
    bool is_status_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint64 campaign_id;
    bool m_campaign_id_isSet;
    bool m_campaign_id_isValid;

    OAIOfferCampaignStatusType status;
    bool m_status_isSet;
    bool m_status_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIOfferCampaignStatusDTO)

#endif // OAIOfferCampaignStatusDTO_H
