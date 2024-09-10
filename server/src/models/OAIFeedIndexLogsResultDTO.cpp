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

#include "OAIFeedIndexLogsResultDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIFeedIndexLogsResultDTO::OAIFeedIndexLogsResultDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIFeedIndexLogsResultDTO::OAIFeedIndexLogsResultDTO() {
    this->initializeModel();
}

OAIFeedIndexLogsResultDTO::~OAIFeedIndexLogsResultDTO() {}

void OAIFeedIndexLogsResultDTO::initializeModel() {

    m_feed_isSet = false;
    m_feed_isValid = false;

    m_index_log_records_isSet = false;
    m_index_log_records_isValid = false;

    m_total_isSet = false;
    m_total_isValid = false;
}

void OAIFeedIndexLogsResultDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIFeedIndexLogsResultDTO::fromJsonObject(QJsonObject json) {

    m_feed_isValid = ::OpenAPI::fromJsonValue(feed, json[QString("feed")]);
    m_feed_isSet = !json[QString("feed")].isNull() && m_feed_isValid;

    m_index_log_records_isValid = ::OpenAPI::fromJsonValue(index_log_records, json[QString("indexLogRecords")]);
    m_index_log_records_isSet = !json[QString("indexLogRecords")].isNull() && m_index_log_records_isValid;

    m_total_isValid = ::OpenAPI::fromJsonValue(total, json[QString("total")]);
    m_total_isSet = !json[QString("total")].isNull() && m_total_isValid;
}

QString OAIFeedIndexLogsResultDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIFeedIndexLogsResultDTO::asJsonObject() const {
    QJsonObject obj;
    if (feed.isSet()) {
        obj.insert(QString("feed"), ::OpenAPI::toJsonValue(feed));
    }
    if (index_log_records.size() > 0) {
        obj.insert(QString("indexLogRecords"), ::OpenAPI::toJsonValue(index_log_records));
    }
    if (m_total_isSet) {
        obj.insert(QString("total"), ::OpenAPI::toJsonValue(total));
    }
    return obj;
}

OAIFeedIndexLogsFeedDTO OAIFeedIndexLogsResultDTO::getFeed() const {
    return feed;
}
void OAIFeedIndexLogsResultDTO::setFeed(const OAIFeedIndexLogsFeedDTO &feed) {
    this->feed = feed;
    this->m_feed_isSet = true;
}

bool OAIFeedIndexLogsResultDTO::is_feed_Set() const{
    return m_feed_isSet;
}

bool OAIFeedIndexLogsResultDTO::is_feed_Valid() const{
    return m_feed_isValid;
}

QList<OAIFeedIndexLogsRecordDTO> OAIFeedIndexLogsResultDTO::getIndexLogRecords() const {
    return index_log_records;
}
void OAIFeedIndexLogsResultDTO::setIndexLogRecords(const QList<OAIFeedIndexLogsRecordDTO> &index_log_records) {
    this->index_log_records = index_log_records;
    this->m_index_log_records_isSet = true;
}

bool OAIFeedIndexLogsResultDTO::is_index_log_records_Set() const{
    return m_index_log_records_isSet;
}

bool OAIFeedIndexLogsResultDTO::is_index_log_records_Valid() const{
    return m_index_log_records_isValid;
}

qint64 OAIFeedIndexLogsResultDTO::getTotal() const {
    return total;
}
void OAIFeedIndexLogsResultDTO::setTotal(const qint64 &total) {
    this->total = total;
    this->m_total_isSet = true;
}

bool OAIFeedIndexLogsResultDTO::is_total_Set() const{
    return m_total_isSet;
}

bool OAIFeedIndexLogsResultDTO::is_total_Valid() const{
    return m_total_isValid;
}

bool OAIFeedIndexLogsResultDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (feed.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (index_log_records.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (m_total_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIFeedIndexLogsResultDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_index_log_records_isValid && true;
}

} // namespace OpenAPI
