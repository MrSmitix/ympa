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

#include "OAIGenerateReportDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGenerateReportDTO::OAIGenerateReportDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGenerateReportDTO::OAIGenerateReportDTO() {
    this->initializeModel();
}

OAIGenerateReportDTO::~OAIGenerateReportDTO() {}

void OAIGenerateReportDTO::initializeModel() {

    m_report_id_isSet = false;
    m_report_id_isValid = false;

    m_estimated_generation_time_isSet = false;
    m_estimated_generation_time_isValid = false;
}

void OAIGenerateReportDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGenerateReportDTO::fromJsonObject(QJsonObject json) {

    m_report_id_isValid = ::OpenAPI::fromJsonValue(report_id, json[QString("reportId")]);
    m_report_id_isSet = !json[QString("reportId")].isNull() && m_report_id_isValid;

    m_estimated_generation_time_isValid = ::OpenAPI::fromJsonValue(estimated_generation_time, json[QString("estimatedGenerationTime")]);
    m_estimated_generation_time_isSet = !json[QString("estimatedGenerationTime")].isNull() && m_estimated_generation_time_isValid;
}

QString OAIGenerateReportDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGenerateReportDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_report_id_isSet) {
        obj.insert(QString("reportId"), ::OpenAPI::toJsonValue(report_id));
    }
    if (m_estimated_generation_time_isSet) {
        obj.insert(QString("estimatedGenerationTime"), ::OpenAPI::toJsonValue(estimated_generation_time));
    }
    return obj;
}

QString OAIGenerateReportDTO::getReportId() const {
    return report_id;
}
void OAIGenerateReportDTO::setReportId(const QString &report_id) {
    this->report_id = report_id;
    this->m_report_id_isSet = true;
}

bool OAIGenerateReportDTO::is_report_id_Set() const{
    return m_report_id_isSet;
}

bool OAIGenerateReportDTO::is_report_id_Valid() const{
    return m_report_id_isValid;
}

qint64 OAIGenerateReportDTO::getEstimatedGenerationTime() const {
    return estimated_generation_time;
}
void OAIGenerateReportDTO::setEstimatedGenerationTime(const qint64 &estimated_generation_time) {
    this->estimated_generation_time = estimated_generation_time;
    this->m_estimated_generation_time_isSet = true;
}

bool OAIGenerateReportDTO::is_estimated_generation_time_Set() const{
    return m_estimated_generation_time_isSet;
}

bool OAIGenerateReportDTO::is_estimated_generation_time_Valid() const{
    return m_estimated_generation_time_isValid;
}

bool OAIGenerateReportDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_report_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_estimated_generation_time_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGenerateReportDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_report_id_isValid && m_estimated_generation_time_isValid && true;
}

} // namespace OpenAPI
