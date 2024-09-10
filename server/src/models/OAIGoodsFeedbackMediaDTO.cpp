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

#include "OAIGoodsFeedbackMediaDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIGoodsFeedbackMediaDTO::OAIGoodsFeedbackMediaDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIGoodsFeedbackMediaDTO::OAIGoodsFeedbackMediaDTO() {
    this->initializeModel();
}

OAIGoodsFeedbackMediaDTO::~OAIGoodsFeedbackMediaDTO() {}

void OAIGoodsFeedbackMediaDTO::initializeModel() {

    m_photos_isSet = false;
    m_photos_isValid = false;

    m_videos_isSet = false;
    m_videos_isValid = false;
}

void OAIGoodsFeedbackMediaDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIGoodsFeedbackMediaDTO::fromJsonObject(QJsonObject json) {

    m_photos_isValid = ::OpenAPI::fromJsonValue(photos, json[QString("photos")]);
    m_photos_isSet = !json[QString("photos")].isNull() && m_photos_isValid;

    m_videos_isValid = ::OpenAPI::fromJsonValue(videos, json[QString("videos")]);
    m_videos_isSet = !json[QString("videos")].isNull() && m_videos_isValid;
}

QString OAIGoodsFeedbackMediaDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIGoodsFeedbackMediaDTO::asJsonObject() const {
    QJsonObject obj;
    if (photos.size() > 0) {
        obj.insert(QString("photos"), ::OpenAPI::toJsonValue(photos));
    }
    if (videos.size() > 0) {
        obj.insert(QString("videos"), ::OpenAPI::toJsonValue(videos));
    }
    return obj;
}

QList<QString> OAIGoodsFeedbackMediaDTO::getPhotos() const {
    return photos;
}
void OAIGoodsFeedbackMediaDTO::setPhotos(const QList<QString> &photos) {
    this->photos = photos;
    this->m_photos_isSet = true;
}

bool OAIGoodsFeedbackMediaDTO::is_photos_Set() const{
    return m_photos_isSet;
}

bool OAIGoodsFeedbackMediaDTO::is_photos_Valid() const{
    return m_photos_isValid;
}

QList<QString> OAIGoodsFeedbackMediaDTO::getVideos() const {
    return videos;
}
void OAIGoodsFeedbackMediaDTO::setVideos(const QList<QString> &videos) {
    this->videos = videos;
    this->m_videos_isSet = true;
}

bool OAIGoodsFeedbackMediaDTO::is_videos_Set() const{
    return m_videos_isSet;
}

bool OAIGoodsFeedbackMediaDTO::is_videos_Valid() const{
    return m_videos_isValid;
}

bool OAIGoodsFeedbackMediaDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (photos.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (videos.size() > 0) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIGoodsFeedbackMediaDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return true;
}

} // namespace OpenAPI
