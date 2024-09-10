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
 * OAIGetCampaignSettingsResponse.h
 *
 * Ответ на запрос настроек магазина.
 */

#ifndef OAIGetCampaignSettingsResponse_H
#define OAIGetCampaignSettingsResponse_H

#include <QJsonObject>

#include "OAICampaignSettingsDTO.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAICampaignSettingsDTO;

class OAIGetCampaignSettingsResponse : public OAIObject {
public:
    OAIGetCampaignSettingsResponse();
    OAIGetCampaignSettingsResponse(QString json);
    ~OAIGetCampaignSettingsResponse() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAICampaignSettingsDTO getSettings() const;
    void setSettings(const OAICampaignSettingsDTO &settings);
    bool is_settings_Set() const;
    bool is_settings_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAICampaignSettingsDTO m_settings;
    bool m_settings_isSet;
    bool m_settings_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGetCampaignSettingsResponse)

#endif // OAIGetCampaignSettingsResponse_H
