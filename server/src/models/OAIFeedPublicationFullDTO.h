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
 * OAIFeedPublicationFullDTO.h
 *
 * Информация о последней публикации предложений из прайс-листа на Маркете. 
 */

#ifndef OAIFeedPublicationFullDTO_H
#define OAIFeedPublicationFullDTO_H

#include <QJsonObject>

#include <QDateTime>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIFeedPublicationFullDTO : public OAIObject {
public:
    OAIFeedPublicationFullDTO();
    OAIFeedPublicationFullDTO(QString json);
    ~OAIFeedPublicationFullDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QDateTime getFileTime() const;
    void setFileTime(const QDateTime &file_time);
    bool is_file_time_Set() const;
    bool is_file_time_Valid() const;

    QDateTime getPublishedTime() const;
    void setPublishedTime(const QDateTime &published_time);
    bool is_published_time_Set() const;
    bool is_published_time_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QDateTime file_time;
    bool m_file_time_isSet;
    bool m_file_time_isValid;

    QDateTime published_time;
    bool m_published_time_isSet;
    bool m_published_time_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIFeedPublicationFullDTO)

#endif // OAIFeedPublicationFullDTO_H
