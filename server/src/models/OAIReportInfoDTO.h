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
 * OAIReportInfoDTO.h
 *
 * Статус генерации и ссылка на готовый отчет.
 */

#ifndef OAIReportInfoDTO_H
#define OAIReportInfoDTO_H

#include <QJsonObject>

#include "OAIReportStatusType.h"
#include "OAIReportSubStatusType.h"
#include <QDateTime>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIReportInfoDTO : public OAIObject {
public:
    OAIReportInfoDTO();
    OAIReportInfoDTO(QString json);
    ~OAIReportInfoDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIReportStatusType getStatus() const;
    void setStatus(const OAIReportStatusType &status);
    bool is_status_Set() const;
    bool is_status_Valid() const;

    OAIReportSubStatusType getSubStatus() const;
    void setSubStatus(const OAIReportSubStatusType &sub_status);
    bool is_sub_status_Set() const;
    bool is_sub_status_Valid() const;

    QDateTime getGenerationRequestedAt() const;
    void setGenerationRequestedAt(const QDateTime &generation_requested_at);
    bool is_generation_requested_at_Set() const;
    bool is_generation_requested_at_Valid() const;

    QDateTime getGenerationFinishedAt() const;
    void setGenerationFinishedAt(const QDateTime &generation_finished_at);
    bool is_generation_finished_at_Set() const;
    bool is_generation_finished_at_Valid() const;

    QString getFile() const;
    void setFile(const QString &file);
    bool is_file_Set() const;
    bool is_file_Valid() const;

    qint64 getEstimatedGenerationTime() const;
    void setEstimatedGenerationTime(const qint64 &estimated_generation_time);
    bool is_estimated_generation_time_Set() const;
    bool is_estimated_generation_time_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIReportStatusType status;
    bool m_status_isSet;
    bool m_status_isValid;

    OAIReportSubStatusType sub_status;
    bool m_sub_status_isSet;
    bool m_sub_status_isValid;

    QDateTime generation_requested_at;
    bool m_generation_requested_at_isSet;
    bool m_generation_requested_at_isValid;

    QDateTime generation_finished_at;
    bool m_generation_finished_at_isSet;
    bool m_generation_finished_at_isValid;

    QString file;
    bool m_file_isSet;
    bool m_file_isValid;

    qint64 estimated_generation_time;
    bool m_estimated_generation_time_isSet;
    bool m_estimated_generation_time_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIReportInfoDTO)

#endif // OAIReportInfoDTO_H
