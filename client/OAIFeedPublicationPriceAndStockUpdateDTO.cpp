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

#include "OAIFeedPublicationPriceAndStockUpdateDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIFeedPublicationPriceAndStockUpdateDTO::OAIFeedPublicationPriceAndStockUpdateDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIFeedPublicationPriceAndStockUpdateDTO::OAIFeedPublicationPriceAndStockUpdateDTO() {
    this->initializeModel();
}

OAIFeedPublicationPriceAndStockUpdateDTO::~OAIFeedPublicationPriceAndStockUpdateDTO() {}

void OAIFeedPublicationPriceAndStockUpdateDTO::initializeModel() {

    m_file_time_isSet = false;
    m_file_time_isValid = false;

    m_published_time_isSet = false;
    m_published_time_isValid = false;
}

void OAIFeedPublicationPriceAndStockUpdateDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIFeedPublicationPriceAndStockUpdateDTO::fromJsonObject(QJsonObject json) {

    m_file_time_isValid = ::OpenAPI::fromJsonValue(m_file_time, json[QString("fileTime")]);
    m_file_time_isSet = !json[QString("fileTime")].isNull() && m_file_time_isValid;

    m_published_time_isValid = ::OpenAPI::fromJsonValue(m_published_time, json[QString("publishedTime")]);
    m_published_time_isSet = !json[QString("publishedTime")].isNull() && m_published_time_isValid;
}

QString OAIFeedPublicationPriceAndStockUpdateDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIFeedPublicationPriceAndStockUpdateDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_file_time_isSet) {
        obj.insert(QString("fileTime"), ::OpenAPI::toJsonValue(m_file_time));
    }
    if (m_published_time_isSet) {
        obj.insert(QString("publishedTime"), ::OpenAPI::toJsonValue(m_published_time));
    }
    return obj;
}

QDateTime OAIFeedPublicationPriceAndStockUpdateDTO::getFileTime() const {
    return m_file_time;
}
void OAIFeedPublicationPriceAndStockUpdateDTO::setFileTime(const QDateTime &file_time) {
    m_file_time = file_time;
    m_file_time_isSet = true;
}

bool OAIFeedPublicationPriceAndStockUpdateDTO::is_file_time_Set() const{
    return m_file_time_isSet;
}

bool OAIFeedPublicationPriceAndStockUpdateDTO::is_file_time_Valid() const{
    return m_file_time_isValid;
}

QDateTime OAIFeedPublicationPriceAndStockUpdateDTO::getPublishedTime() const {
    return m_published_time;
}
void OAIFeedPublicationPriceAndStockUpdateDTO::setPublishedTime(const QDateTime &published_time) {
    m_published_time = published_time;
    m_published_time_isSet = true;
}

bool OAIFeedPublicationPriceAndStockUpdateDTO::is_published_time_Set() const{
    return m_published_time_isSet;
}

bool OAIFeedPublicationPriceAndStockUpdateDTO::is_published_time_Valid() const{
    return m_published_time_isValid;
}

bool OAIFeedPublicationPriceAndStockUpdateDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_file_time_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_published_time_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIFeedPublicationPriceAndStockUpdateDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
