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
 * OAIOfferCardDTO.h
 *
 * Информация о состоянии карточки товара.  Если поле &#x60;mapping&#x60; отсутствует в ответе, Маркет еще не успел обработать информацию о товаре. Чтобы определить категорию такого товара, повторите запрос через несколько минут. 
 */

#ifndef OAIOfferCardDTO_H
#define OAIOfferCardDTO_H

#include <QJsonObject>

#include "OAIGetMappingDTO.h"
#include "OAIOfferCardRecommendationDTO.h"
#include "OAIOfferCardStatusType.h"
#include "OAIOfferErrorDTO.h"
#include "OAIParameterValueDTO.h"
#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIGetMappingDTO;
class OAIParameterValueDTO;
class OAIOfferCardRecommendationDTO;
class OAIOfferErrorDTO;

class OAIOfferCardDTO : public OAIObject {
public:
    OAIOfferCardDTO();
    OAIOfferCardDTO(QString json);
    ~OAIOfferCardDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getOfferId() const;
    void setOfferId(const QString &offer_id);
    bool is_offer_id_Set() const;
    bool is_offer_id_Valid() const;

    OAIGetMappingDTO getMapping() const;
    void setMapping(const OAIGetMappingDTO &mapping);
    bool is_mapping_Set() const;
    bool is_mapping_Valid() const;

    QList<OAIParameterValueDTO> getParameterValues() const;
    void setParameterValues(const QList<OAIParameterValueDTO> &parameter_values);
    bool is_parameter_values_Set() const;
    bool is_parameter_values_Valid() const;

    OAIOfferCardStatusType getCardStatus() const;
    void setCardStatus(const OAIOfferCardStatusType &card_status);
    bool is_card_status_Set() const;
    bool is_card_status_Valid() const;

    qint32 getContentRating() const;
    void setContentRating(const qint32 &content_rating);
    bool is_content_rating_Set() const;
    bool is_content_rating_Valid() const;

    QList<OAIOfferCardRecommendationDTO> getRecommendations() const;
    void setRecommendations(const QList<OAIOfferCardRecommendationDTO> &recommendations);
    bool is_recommendations_Set() const;
    bool is_recommendations_Valid() const;

    QList<OAIOfferErrorDTO> getErrors() const;
    void setErrors(const QList<OAIOfferErrorDTO> &errors);
    bool is_errors_Set() const;
    bool is_errors_Valid() const;

    QList<OAIOfferErrorDTO> getWarnings() const;
    void setWarnings(const QList<OAIOfferErrorDTO> &warnings);
    bool is_warnings_Set() const;
    bool is_warnings_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString m_offer_id;
    bool m_offer_id_isSet;
    bool m_offer_id_isValid;

    OAIGetMappingDTO m_mapping;
    bool m_mapping_isSet;
    bool m_mapping_isValid;

    QList<OAIParameterValueDTO> m_parameter_values;
    bool m_parameter_values_isSet;
    bool m_parameter_values_isValid;

    OAIOfferCardStatusType m_card_status;
    bool m_card_status_isSet;
    bool m_card_status_isValid;

    qint32 m_content_rating;
    bool m_content_rating_isSet;
    bool m_content_rating_isValid;

    QList<OAIOfferCardRecommendationDTO> m_recommendations;
    bool m_recommendations_isSet;
    bool m_recommendations_isValid;

    QList<OAIOfferErrorDTO> m_errors;
    bool m_errors_isSet;
    bool m_errors_isValid;

    QList<OAIOfferErrorDTO> m_warnings;
    bool m_warnings_isSet;
    bool m_warnings_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIOfferCardDTO)

#endif // OAIOfferCardDTO_H
