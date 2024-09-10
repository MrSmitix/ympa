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
 * OAICalculateTariffsOfferDTO.h
 *
 * Параметры товара, для которого нужно рассчитать стоимость услуг.
 */

#ifndef OAICalculateTariffsOfferDTO_H
#define OAICalculateTariffsOfferDTO_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAICalculateTariffsOfferDTO : public OAIObject {
public:
    OAICalculateTariffsOfferDTO();
    OAICalculateTariffsOfferDTO(QString json);
    ~OAICalculateTariffsOfferDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint64 getCategoryId() const;
    void setCategoryId(const qint64 &category_id);
    bool is_category_id_Set() const;
    bool is_category_id_Valid() const;

    double getPrice() const;
    void setPrice(const double &price);
    bool is_price_Set() const;
    bool is_price_Valid() const;

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

    qint32 getQuantity() const;
    void setQuantity(const qint32 &quantity);
    bool is_quantity_Set() const;
    bool is_quantity_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint64 category_id;
    bool m_category_id_isSet;
    bool m_category_id_isValid;

    double price;
    bool m_price_isSet;
    bool m_price_isValid;

    double length;
    bool m_length_isSet;
    bool m_length_isValid;

    double width;
    bool m_width_isSet;
    bool m_width_isValid;

    double height;
    bool m_height_isSet;
    bool m_height_isValid;

    double weight;
    bool m_weight_isSet;
    bool m_weight_isValid;

    qint32 quantity;
    bool m_quantity_isSet;
    bool m_quantity_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAICalculateTariffsOfferDTO)

#endif // OAICalculateTariffsOfferDTO_H
