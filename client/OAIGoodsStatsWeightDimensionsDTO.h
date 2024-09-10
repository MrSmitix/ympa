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
 * OAIGoodsStatsWeightDimensionsDTO.h
 *
 * Информация о весе и габаритах товара.  Если товар уже привязан к карточке (&#x60;marketSku&#x60;), в ответе вернутся габариты из карточки Маркета, а не размеры, которые вы передаете. 
 */

#ifndef OAIGoodsStatsWeightDimensionsDTO_H
#define OAIGoodsStatsWeightDimensionsDTO_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIGoodsStatsWeightDimensionsDTO : public OAIObject {
public:
    OAIGoodsStatsWeightDimensionsDTO();
    OAIGoodsStatsWeightDimensionsDTO(QString json);
    ~OAIGoodsStatsWeightDimensionsDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    double getLength() const;
    void setLength(const double &length);
    bool is_length_Set() const;
    bool is_length_Valid() const;

    double getWidth() const;
    void setWidth(const double &width);
    bool is_width_Set() const;
    bool is_width_Valid() const;

    double getHeight() const;
    void setHeight(const double &height);
    bool is_height_Set() const;
    bool is_height_Valid() const;

    double getWeight() const;
    void setWeight(const double &weight);
    bool is_weight_Set() const;
    bool is_weight_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    double m_length;
    bool m_length_isSet;
    bool m_length_isValid;

    double m_width;
    bool m_width_isSet;
    bool m_width_isValid;

    double m_height;
    bool m_height_isSet;
    bool m_height_isValid;

    double m_weight;
    bool m_weight_isSet;
    bool m_weight_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGoodsStatsWeightDimensionsDTO)

#endif // OAIGoodsStatsWeightDimensionsDTO_H
