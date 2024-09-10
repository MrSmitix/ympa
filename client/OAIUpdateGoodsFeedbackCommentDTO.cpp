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

#include "OAIUpdateGoodsFeedbackCommentDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIUpdateGoodsFeedbackCommentDTO::OAIUpdateGoodsFeedbackCommentDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIUpdateGoodsFeedbackCommentDTO::OAIUpdateGoodsFeedbackCommentDTO() {
    this->initializeModel();
}

OAIUpdateGoodsFeedbackCommentDTO::~OAIUpdateGoodsFeedbackCommentDTO() {}

void OAIUpdateGoodsFeedbackCommentDTO::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_parent_id_isSet = false;
    m_parent_id_isValid = false;

    m_text_isSet = false;
    m_text_isValid = false;
}

void OAIUpdateGoodsFeedbackCommentDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIUpdateGoodsFeedbackCommentDTO::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(m_id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_parent_id_isValid = ::OpenAPI::fromJsonValue(m_parent_id, json[QString("parentId")]);
    m_parent_id_isSet = !json[QString("parentId")].isNull() && m_parent_id_isValid;

    m_text_isValid = ::OpenAPI::fromJsonValue(m_text, json[QString("text")]);
    m_text_isSet = !json[QString("text")].isNull() && m_text_isValid;
}

QString OAIUpdateGoodsFeedbackCommentDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIUpdateGoodsFeedbackCommentDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(m_id));
    }
    if (m_parent_id_isSet) {
        obj.insert(QString("parentId"), ::OpenAPI::toJsonValue(m_parent_id));
    }
    if (m_text_isSet) {
        obj.insert(QString("text"), ::OpenAPI::toJsonValue(m_text));
    }
    return obj;
}

qint64 OAIUpdateGoodsFeedbackCommentDTO::getId() const {
    return m_id;
}
void OAIUpdateGoodsFeedbackCommentDTO::setId(const qint64 &id) {
    m_id = id;
    m_id_isSet = true;
}

bool OAIUpdateGoodsFeedbackCommentDTO::is_id_Set() const{
    return m_id_isSet;
}

bool OAIUpdateGoodsFeedbackCommentDTO::is_id_Valid() const{
    return m_id_isValid;
}

qint64 OAIUpdateGoodsFeedbackCommentDTO::getParentId() const {
    return m_parent_id;
}
void OAIUpdateGoodsFeedbackCommentDTO::setParentId(const qint64 &parent_id) {
    m_parent_id = parent_id;
    m_parent_id_isSet = true;
}

bool OAIUpdateGoodsFeedbackCommentDTO::is_parent_id_Set() const{
    return m_parent_id_isSet;
}

bool OAIUpdateGoodsFeedbackCommentDTO::is_parent_id_Valid() const{
    return m_parent_id_isValid;
}

QString OAIUpdateGoodsFeedbackCommentDTO::getText() const {
    return m_text;
}
void OAIUpdateGoodsFeedbackCommentDTO::setText(const QString &text) {
    m_text = text;
    m_text_isSet = true;
}

bool OAIUpdateGoodsFeedbackCommentDTO::is_text_Set() const{
    return m_text_isSet;
}

bool OAIUpdateGoodsFeedbackCommentDTO::is_text_Valid() const{
    return m_text_isValid;
}

bool OAIUpdateGoodsFeedbackCommentDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_parent_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_text_isSet) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIUpdateGoodsFeedbackCommentDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_text_isValid && true;
}

} // namespace OpenAPI
