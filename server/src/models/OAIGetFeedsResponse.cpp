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

#include "OAIGetFeedsResponse.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGetFeedsResponse::OAIGetFeedsResponse(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGetFeedsResponse::OAIGetFeedsResponse() {
    this->initializeModel();
}

OAIGetFeedsResponse::~OAIGetFeedsResponse() {}

void OAIGetFeedsResponse::initializeModel() {

    m_feeds_isSet = false;
    m_feeds_isValid = false;
}

void OAIGetFeedsResponse::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGetFeedsResponse::fromJsonObject(QJsonObject json) {

    m_feeds_isValid = ::OpenAPI::fromJsonValue(feeds, json[QString("feeds")]);
    m_feeds_isSet = !json[QString("feeds")].isNull() && m_feeds_isValid;
}

QString OAIGetFeedsResponse::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGetFeedsResponse::asJsonObject() const {
    QJsonObject obj;
    if (feeds.size() > 0) {
        obj.insert(QString("feeds"), ::OpenAPI::toJsonValue(feeds));
    }
    return obj;
}

QList<OAIFeedDTO> OAIGetFeedsResponse::getFeeds() const {
    return feeds;
}
void OAIGetFeedsResponse::setFeeds(const QList<OAIFeedDTO> &feeds) {
    this->feeds = feeds;
    this->m_feeds_isSet = true;
}

bool OAIGetFeedsResponse::is_feeds_Set() const{
    return m_feeds_isSet;
}

bool OAIGetFeedsResponse::is_feeds_Valid() const{
    return m_feeds_isValid;
}

bool OAIGetFeedsResponse::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (feeds.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGetFeedsResponse::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_feeds_isValid && true;
}

} // namespace OpenAPI
