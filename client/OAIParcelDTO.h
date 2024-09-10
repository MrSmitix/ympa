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
 * OAIParcelDTO.h
 *
 * Информация о грузовых местах в заказе.
 */

#ifndef OAIParcelDTO_H
#define OAIParcelDTO_H

#include <QJsonObject>

#include "OAIParcelBoxDTO.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {
class OAIParcelBoxDTO;

class OAIParcelDTO : public OAIObject {
public:
    OAIParcelDTO();
    OAIParcelDTO(QString json);
    ~OAIParcelDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<OAIParcelBoxDTO> getBoxes() const;
    void setBoxes(const QList<OAIParcelBoxDTO> &boxes);
    bool is_boxes_Set() const;
    bool is_boxes_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<OAIParcelBoxDTO> m_boxes;
    bool m_boxes_isSet;
    bool m_boxes_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIParcelDTO)

#endif // OAIParcelDTO_H
