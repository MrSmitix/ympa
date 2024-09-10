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
 * OAIGetCampaignsResponse.h
 *
 * Результаты поиска магазинов.
 */

#ifndef OAIGetCampaignsResponse_H
#define OAIGetCampaignsResponse_H

#include <QJsonObject>

#include "OAICampaignDTO.h"
#include "OAIFlippingPagerDTO.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAICampaignDTO;
class OAIFlippingPagerDTO;

class OAIGetCampaignsResponse : public OAIObject {
public:
    OAIGetCampaignsResponse();
    OAIGetCampaignsResponse(QString json);
    ~OAIGetCampaignsResponse() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<OAICampaignDTO> getCampaigns() const;
    void setCampaigns(const QList<OAICampaignDTO> &campaigns);
    bool is_campaigns_Set() const;
    bool is_campaigns_Valid() const;

    OAIFlippingPagerDTO getPager() const;
    void setPager(const OAIFlippingPagerDTO &pager);
    bool is_pager_Set() const;
    bool is_pager_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<OAICampaignDTO> m_campaigns;
    bool m_campaigns_isSet;
    bool m_campaigns_isValid;

    OAIFlippingPagerDTO m_pager;
    bool m_pager_isSet;
    bool m_pager_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGetCampaignsResponse)

#endif // OAIGetCampaignsResponse_H
