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
 * OAIFeedbackGradesDTO.h
 *
 * Информация об оценках, которые поставил автор отзыва магазину, и об оценках полезности отзыва от других пользователей Маркета.
 */

#ifndef OAIFeedbackGradesDTO_H
#define OAIFeedbackGradesDTO_H

#include <QJsonObject>

#include "OAIFeedbackFactorDTO.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIFeedbackFactorDTO;

class OAIFeedbackGradesDTO : public OAIObject {
public:
    OAIFeedbackGradesDTO();
    OAIFeedbackGradesDTO(QString json);
    ~OAIFeedbackGradesDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    double getAverage() const;
    void setAverage(const double &average);
    bool is_average_Set() const;
    bool is_average_Valid() const;

    qint64 getAgreeCount() const;
    void setAgreeCount(const qint64 &agree_count);
    bool is_agree_count_Set() const;
    bool is_agree_count_Valid() const;

    qint64 getRejectCount() const;
    void setRejectCount(const qint64 &reject_count);
    bool is_reject_count_Set() const;
    bool is_reject_count_Valid() const;

    QList<OAIFeedbackFactorDTO> getFactors() const;
    void setFactors(const QList<OAIFeedbackFactorDTO> &factors);
    bool is_factors_Set() const;
    bool is_factors_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    double m_average;
    bool m_average_isSet;
    bool m_average_isValid;

    qint64 m_agree_count;
    bool m_agree_count_isSet;
    bool m_agree_count_isValid;

    qint64 m_reject_count;
    bool m_reject_count_isSet;
    bool m_reject_count_isValid;

    QList<OAIFeedbackFactorDTO> m_factors;
    bool m_factors_isSet;
    bool m_factors_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIFeedbackGradesDTO)

#endif // OAIFeedbackGradesDTO_H
