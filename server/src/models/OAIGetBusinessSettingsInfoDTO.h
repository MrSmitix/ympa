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
 * OAIGetBusinessSettingsInfoDTO.h
 *
 * Информация о кабинете и его настройках.
 */

#ifndef OAIGetBusinessSettingsInfoDTO_H
#define OAIGetBusinessSettingsInfoDTO_H

#include <QJsonObject>

#include "OAIBusinessDTO.h"
#include "OAIBusinessSettingsDTO.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIGetBusinessSettingsInfoDTO : public OAIObject {
public:
    OAIGetBusinessSettingsInfoDTO();
    OAIGetBusinessSettingsInfoDTO(QString json);
    ~OAIGetBusinessSettingsInfoDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIBusinessDTO getInfo() const;
    void setInfo(const OAIBusinessDTO &info);
    bool is_info_Set() const;
    bool is_info_Valid() const;

    OAIBusinessSettingsDTO getSettings() const;
    void setSettings(const OAIBusinessSettingsDTO &settings);
    bool is_settings_Set() const;
    bool is_settings_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIBusinessDTO info;
    bool m_info_isSet;
    bool m_info_isValid;

    OAIBusinessSettingsDTO settings;
    bool m_settings_isSet;
    bool m_settings_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGetBusinessSettingsInfoDTO)

#endif // OAIGetBusinessSettingsInfoDTO_H
