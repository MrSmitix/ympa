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
 * OAIGetPromoDTO.h
 *
 * Информация об акции.
 */

#ifndef OAIGetPromoDTO_H
#define OAIGetPromoDTO_H

#include <QJsonObject>

#include "OAIChannelType.h"
#include "OAIGetPromoAssortmentInfoDTO.h"
#include "OAIGetPromoBestsellerInfoDTO.h"
#include "OAIGetPromoConstraintsDTO.h"
#include "OAIGetPromoMechanicsInfoDTO.h"
#include "OAIPromoPeriodDTO.h"
#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIPromoPeriodDTO;
class OAIGetPromoAssortmentInfoDTO;
class OAIGetPromoMechanicsInfoDTO;
class OAIGetPromoBestsellerInfoDTO;
class OAIGetPromoConstraintsDTO;

class OAIGetPromoDTO : public OAIObject {
public:
    OAIGetPromoDTO();
    OAIGetPromoDTO(QString json);
    ~OAIGetPromoDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getId() const;
    void setId(const QString &id);
    bool is_id_Set() const;
    bool is_id_Valid() const;

    QString getName() const;
    void setName(const QString &name);
    bool is_name_Set() const;
    bool is_name_Valid() const;

    OAIPromoPeriodDTO getPeriod() const;
    void setPeriod(const OAIPromoPeriodDTO &period);
    bool is_period_Set() const;
    bool is_period_Valid() const;

    bool isParticipating() const;
    void setParticipating(const bool &participating);
    bool is_participating_Set() const;
    bool is_participating_Valid() const;

    OAIGetPromoAssortmentInfoDTO getAssortmentInfo() const;
    void setAssortmentInfo(const OAIGetPromoAssortmentInfoDTO &assortment_info);
    bool is_assortment_info_Set() const;
    bool is_assortment_info_Valid() const;

    OAIGetPromoMechanicsInfoDTO getMechanicsInfo() const;
    void setMechanicsInfo(const OAIGetPromoMechanicsInfoDTO &mechanics_info);
    bool is_mechanics_info_Set() const;
    bool is_mechanics_info_Valid() const;

    OAIGetPromoBestsellerInfoDTO getBestsellerInfo() const;
    void setBestsellerInfo(const OAIGetPromoBestsellerInfoDTO &bestseller_info);
    bool is_bestseller_info_Set() const;
    bool is_bestseller_info_Valid() const;

    QList<OAIChannelType> getChannels() const;
    void setChannels(const QList<OAIChannelType> &channels);
    bool is_channels_Set() const;
    bool is_channels_Valid() const;

    OAIGetPromoConstraintsDTO getConstraints() const;
    void setConstraints(const OAIGetPromoConstraintsDTO &constraints);
    bool is_constraints_Set() const;
    bool is_constraints_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_id;
    bool m_id_isSet;
    bool m_id_isValid;

    QString m_name;
    bool m_name_isSet;
    bool m_name_isValid;

    OAIPromoPeriodDTO m_period;
    bool m_period_isSet;
    bool m_period_isValid;

    bool m_participating;
    bool m_participating_isSet;
    bool m_participating_isValid;

    OAIGetPromoAssortmentInfoDTO m_assortment_info;
    bool m_assortment_info_isSet;
    bool m_assortment_info_isValid;

    OAIGetPromoMechanicsInfoDTO m_mechanics_info;
    bool m_mechanics_info_isSet;
    bool m_mechanics_info_isValid;

    OAIGetPromoBestsellerInfoDTO m_bestseller_info;
    bool m_bestseller_info_isSet;
    bool m_bestseller_info_isValid;

    QList<OAIChannelType> m_channels;
    bool m_channels_isSet;
    bool m_channels_isValid;

    OAIGetPromoConstraintsDTO m_constraints;
    bool m_constraints_isSet;
    bool m_constraints_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGetPromoDTO)

#endif // OAIGetPromoDTO_H
