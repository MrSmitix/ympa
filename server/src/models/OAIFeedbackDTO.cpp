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

#include "OAIFeedbackDTO.h"

#include <QDebug>
#include <QJsonArray>
#include <QJsonDocument>
#include <QObject>

#include "OAIHelpers.h"

namespace OpenAPI {

OAIFeedbackDTO::OAIFeedbackDTO(QString json) {
    this->initializeModel();
    this->fromJson(json);
}

OAIFeedbackDTO::OAIFeedbackDTO() {
    this->initializeModel();
}

OAIFeedbackDTO::~OAIFeedbackDTO() {}

void OAIFeedbackDTO::initializeModel() {

    m_id_isSet = false;
    m_id_isValid = false;

    m_created_at_isSet = false;
    m_created_at_isValid = false;

    m_text_isSet = false;
    m_text_isValid = false;

    m_state_isSet = false;
    m_state_isValid = false;

    m_author_isSet = false;
    m_author_isValid = false;

    m_pro_isSet = false;
    m_pro_isValid = false;

    m_contra_isSet = false;
    m_contra_isValid = false;

    m_comments_isSet = false;
    m_comments_isValid = false;

    m_shop_isSet = false;
    m_shop_isValid = false;

    m_resolved_isSet = false;
    m_resolved_isValid = false;

    m_verified_isSet = false;
    m_verified_isValid = false;

    m_recommend_isSet = false;
    m_recommend_isValid = false;

    m_grades_isSet = false;
    m_grades_isValid = false;

    m_order_isSet = false;
    m_order_isValid = false;
}

void OAIFeedbackDTO::fromJson(QString jsonString) {
    QByteArray array(jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void OAIFeedbackDTO::fromJsonObject(QJsonObject json) {

    m_id_isValid = ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    m_id_isSet = !json[QString("id")].isNull() && m_id_isValid;

    m_created_at_isValid = ::OpenAPI::fromJsonValue(created_at, json[QString("createdAt")]);
    m_created_at_isSet = !json[QString("createdAt")].isNull() && m_created_at_isValid;

    m_text_isValid = ::OpenAPI::fromJsonValue(text, json[QString("text")]);
    m_text_isSet = !json[QString("text")].isNull() && m_text_isValid;

    m_state_isValid = ::OpenAPI::fromJsonValue(state, json[QString("state")]);
    m_state_isSet = !json[QString("state")].isNull() && m_state_isValid;

    m_author_isValid = ::OpenAPI::fromJsonValue(author, json[QString("author")]);
    m_author_isSet = !json[QString("author")].isNull() && m_author_isValid;

    m_pro_isValid = ::OpenAPI::fromJsonValue(pro, json[QString("pro")]);
    m_pro_isSet = !json[QString("pro")].isNull() && m_pro_isValid;

    m_contra_isValid = ::OpenAPI::fromJsonValue(contra, json[QString("contra")]);
    m_contra_isSet = !json[QString("contra")].isNull() && m_contra_isValid;

    m_comments_isValid = ::OpenAPI::fromJsonValue(comments, json[QString("comments")]);
    m_comments_isSet = !json[QString("comments")].isNull() && m_comments_isValid;

    m_shop_isValid = ::OpenAPI::fromJsonValue(shop, json[QString("shop")]);
    m_shop_isSet = !json[QString("shop")].isNull() && m_shop_isValid;

    m_resolved_isValid = ::OpenAPI::fromJsonValue(resolved, json[QString("resolved")]);
    m_resolved_isSet = !json[QString("resolved")].isNull() && m_resolved_isValid;

    m_verified_isValid = ::OpenAPI::fromJsonValue(verified, json[QString("verified")]);
    m_verified_isSet = !json[QString("verified")].isNull() && m_verified_isValid;

    m_recommend_isValid = ::OpenAPI::fromJsonValue(recommend, json[QString("recommend")]);
    m_recommend_isSet = !json[QString("recommend")].isNull() && m_recommend_isValid;

    m_grades_isValid = ::OpenAPI::fromJsonValue(grades, json[QString("grades")]);
    m_grades_isSet = !json[QString("grades")].isNull() && m_grades_isValid;

    m_order_isValid = ::OpenAPI::fromJsonValue(order, json[QString("order")]);
    m_order_isSet = !json[QString("order")].isNull() && m_order_isValid;
}

QString OAIFeedbackDTO::asJson() const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject OAIFeedbackDTO::asJsonObject() const {
    QJsonObject obj;
    if (m_id_isSet) {
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    if (m_created_at_isSet) {
        obj.insert(QString("createdAt"), ::OpenAPI::toJsonValue(created_at));
    }
    if (m_text_isSet) {
        obj.insert(QString("text"), ::OpenAPI::toJsonValue(text));
    }
    if (state.isSet()) {
        obj.insert(QString("state"), ::OpenAPI::toJsonValue(state));
    }
    if (author.isSet()) {
        obj.insert(QString("author"), ::OpenAPI::toJsonValue(author));
    }
    if (m_pro_isSet) {
        obj.insert(QString("pro"), ::OpenAPI::toJsonValue(pro));
    }
    if (m_contra_isSet) {
        obj.insert(QString("contra"), ::OpenAPI::toJsonValue(contra));
    }
    if (comments.size() > 0) {
        obj.insert(QString("comments"), ::OpenAPI::toJsonValue(comments));
    }
    if (shop.isSet()) {
        obj.insert(QString("shop"), ::OpenAPI::toJsonValue(shop));
    }
    if (m_resolved_isSet) {
        obj.insert(QString("resolved"), ::OpenAPI::toJsonValue(resolved));
    }
    if (m_verified_isSet) {
        obj.insert(QString("verified"), ::OpenAPI::toJsonValue(verified));
    }
    if (m_recommend_isSet) {
        obj.insert(QString("recommend"), ::OpenAPI::toJsonValue(recommend));
    }
    if (grades.isSet()) {
        obj.insert(QString("grades"), ::OpenAPI::toJsonValue(grades));
    }
    if (order.isSet()) {
        obj.insert(QString("order"), ::OpenAPI::toJsonValue(order));
    }
    return obj;
}

qint64 OAIFeedbackDTO::getId() const {
    return id;
}
void OAIFeedbackDTO::setId(const qint64 &id) {
    this->id = id;
    this->m_id_isSet = true;
}

bool OAIFeedbackDTO::is_id_Set() const{
    return m_id_isSet;
}

bool OAIFeedbackDTO::is_id_Valid() const{
    return m_id_isValid;
}

QDateTime OAIFeedbackDTO::getCreatedAt() const {
    return created_at;
}
void OAIFeedbackDTO::setCreatedAt(const QDateTime &created_at) {
    this->created_at = created_at;
    this->m_created_at_isSet = true;
}

bool OAIFeedbackDTO::is_created_at_Set() const{
    return m_created_at_isSet;
}

bool OAIFeedbackDTO::is_created_at_Valid() const{
    return m_created_at_isValid;
}

QString OAIFeedbackDTO::getText() const {
    return text;
}
void OAIFeedbackDTO::setText(const QString &text) {
    this->text = text;
    this->m_text_isSet = true;
}

bool OAIFeedbackDTO::is_text_Set() const{
    return m_text_isSet;
}

bool OAIFeedbackDTO::is_text_Valid() const{
    return m_text_isValid;
}

OAIFeedbackStateType OAIFeedbackDTO::getState() const {
    return state;
}
void OAIFeedbackDTO::setState(const OAIFeedbackStateType &state) {
    this->state = state;
    this->m_state_isSet = true;
}

bool OAIFeedbackDTO::is_state_Set() const{
    return m_state_isSet;
}

bool OAIFeedbackDTO::is_state_Valid() const{
    return m_state_isValid;
}

OAIFeedbackAuthorDTO OAIFeedbackDTO::getAuthor() const {
    return author;
}
void OAIFeedbackDTO::setAuthor(const OAIFeedbackAuthorDTO &author) {
    this->author = author;
    this->m_author_isSet = true;
}

bool OAIFeedbackDTO::is_author_Set() const{
    return m_author_isSet;
}

bool OAIFeedbackDTO::is_author_Valid() const{
    return m_author_isValid;
}

QString OAIFeedbackDTO::getPro() const {
    return pro;
}
void OAIFeedbackDTO::setPro(const QString &pro) {
    this->pro = pro;
    this->m_pro_isSet = true;
}

bool OAIFeedbackDTO::is_pro_Set() const{
    return m_pro_isSet;
}

bool OAIFeedbackDTO::is_pro_Valid() const{
    return m_pro_isValid;
}

QString OAIFeedbackDTO::getContra() const {
    return contra;
}
void OAIFeedbackDTO::setContra(const QString &contra) {
    this->contra = contra;
    this->m_contra_isSet = true;
}

bool OAIFeedbackDTO::is_contra_Set() const{
    return m_contra_isSet;
}

bool OAIFeedbackDTO::is_contra_Valid() const{
    return m_contra_isValid;
}

QList<OAIFeedbackCommentDTO> OAIFeedbackDTO::getComments() const {
    return comments;
}
void OAIFeedbackDTO::setComments(const QList<OAIFeedbackCommentDTO> &comments) {
    this->comments = comments;
    this->m_comments_isSet = true;
}

bool OAIFeedbackDTO::is_comments_Set() const{
    return m_comments_isSet;
}

bool OAIFeedbackDTO::is_comments_Valid() const{
    return m_comments_isValid;
}

OAIFeedbackShopDTO OAIFeedbackDTO::getShop() const {
    return shop;
}
void OAIFeedbackDTO::setShop(const OAIFeedbackShopDTO &shop) {
    this->shop = shop;
    this->m_shop_isSet = true;
}

bool OAIFeedbackDTO::is_shop_Set() const{
    return m_shop_isSet;
}

bool OAIFeedbackDTO::is_shop_Valid() const{
    return m_shop_isValid;
}

bool OAIFeedbackDTO::isResolved() const {
    return resolved;
}
void OAIFeedbackDTO::setResolved(const bool &resolved) {
    this->resolved = resolved;
    this->m_resolved_isSet = true;
}

bool OAIFeedbackDTO::is_resolved_Set() const{
    return m_resolved_isSet;
}

bool OAIFeedbackDTO::is_resolved_Valid() const{
    return m_resolved_isValid;
}

bool OAIFeedbackDTO::isVerified() const {
    return verified;
}
void OAIFeedbackDTO::setVerified(const bool &verified) {
    this->verified = verified;
    this->m_verified_isSet = true;
}

bool OAIFeedbackDTO::is_verified_Set() const{
    return m_verified_isSet;
}

bool OAIFeedbackDTO::is_verified_Valid() const{
    return m_verified_isValid;
}

bool OAIFeedbackDTO::isRecommend() const {
    return recommend;
}
void OAIFeedbackDTO::setRecommend(const bool &recommend) {
    this->recommend = recommend;
    this->m_recommend_isSet = true;
}

bool OAIFeedbackDTO::is_recommend_Set() const{
    return m_recommend_isSet;
}

bool OAIFeedbackDTO::is_recommend_Valid() const{
    return m_recommend_isValid;
}

OAIFeedbackGradesDTO OAIFeedbackDTO::getGrades() const {
    return grades;
}
void OAIFeedbackDTO::setGrades(const OAIFeedbackGradesDTO &grades) {
    this->grades = grades;
    this->m_grades_isSet = true;
}

bool OAIFeedbackDTO::is_grades_Set() const{
    return m_grades_isSet;
}

bool OAIFeedbackDTO::is_grades_Valid() const{
    return m_grades_isValid;
}

OAIFeedbackOrderDTO OAIFeedbackDTO::getOrder() const {
    return order;
}
void OAIFeedbackDTO::setOrder(const OAIFeedbackOrderDTO &order) {
    this->order = order;
    this->m_order_isSet = true;
}

bool OAIFeedbackDTO::is_order_Set() const{
    return m_order_isSet;
}

bool OAIFeedbackDTO::is_order_Valid() const{
    return m_order_isValid;
}

bool OAIFeedbackDTO::isSet() const {
    bool isObjectUpdated = false;
    do {
        if (m_id_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_created_at_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_text_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (state.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (author.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_pro_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_contra_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (comments.size() > 0) {
            isObjectUpdated = true;
            break;
        }

        if (shop.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (m_resolved_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_verified_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (m_recommend_isSet) {
            isObjectUpdated = true;
            break;
        }

        if (grades.isSet()) {
            isObjectUpdated = true;
            break;
        }

        if (order.isSet()) {
            isObjectUpdated = true;
            break;
        }
    } while (false);
    return isObjectUpdated;
}

bool OAIFeedbackDTO::isValid() const {
    // only required properties are required for the object to be considered valid
    return m_comments_isValid && true;
}

} // namespace OpenAPI
