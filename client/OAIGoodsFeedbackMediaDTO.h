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
 * OAIGoodsFeedbackMediaDTO.h
 *
 * Фото и видео.
 */

#ifndef OAIGoodsFeedbackMediaDTO_H
#define OAIGoodsFeedbackMediaDTO_H

#include <QJsonObject>

#include <QList>
#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIGoodsFeedbackMediaDTO : public OAIObject {
public:
    OAIGoodsFeedbackMediaDTO();
    OAIGoodsFeedbackMediaDTO(QString json);
    ~OAIGoodsFeedbackMediaDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<QString> getPhotos() const;
    void setPhotos(const QList<QString> &photos);
    bool is_photos_Set() const;
    bool is_photos_Valid() const;

    QList<QString> getVideos() const;
    void setVideos(const QList<QString> &videos);
    bool is_videos_Set() const;
    bool is_videos_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<QString> m_photos;
    bool m_photos_isSet;
    bool m_photos_isValid;

    QList<QString> m_videos;
    bool m_videos_isSet;
    bool m_videos_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGoodsFeedbackMediaDTO)

#endif // OAIGoodsFeedbackMediaDTO_H
