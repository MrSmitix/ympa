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
 * OAIGenerateReportDTO.h
 *
 * Идентификатор, который понадобится для отслеживания статуса генерации и получения готового отчета.
 */

#ifndef OAIGenerateReportDTO_H
#define OAIGenerateReportDTO_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIGenerateReportDTO : public OAIObject {
public:
    OAIGenerateReportDTO();
    OAIGenerateReportDTO(QString json);
    ~OAIGenerateReportDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getReportId() const;
    void setReportId(const QString &report_id);
    bool is_report_id_Set() const;
    bool is_report_id_Valid() const;

    qint64 getEstimatedGenerationTime() const;
    void setEstimatedGenerationTime(const qint64 &estimated_generation_time);
    bool is_estimated_generation_time_Set() const;
    bool is_estimated_generation_time_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QString report_id;
    bool m_report_id_isSet;
    bool m_report_id_isValid;

    qint64 estimated_generation_time;
    bool m_estimated_generation_time_isSet;
    bool m_estimated_generation_time_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGenerateReportDTO)

#endif // OAIGenerateReportDTO_H
