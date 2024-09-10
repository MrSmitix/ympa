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
 * OAIQuantumDTO.h
 *
 * Настройка продажи квантами.  Чтобы сбросить установленные ранее значения, передайте пустой параметр &#x60;quantum&#x60;.  {% cut \&quot;Пример\&quot; %}  &#x60;&#x60;&#x60;json {   \&quot;offers\&quot;: [     {       \&quot;offerId\&quot;: \&quot;08e35dc1-89a2-11e3-8055-0015e9b8c48d\&quot;,       \&quot;quantum\&quot;: {}     }   ] } &#x60;&#x60;&#x60;  {% endcut %} 
 */

#ifndef OAIQuantumDTO_H
#define OAIQuantumDTO_H

#include <QJsonObject>


#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIQuantumDTO : public OAIObject {
public:
    OAIQuantumDTO();
    OAIQuantumDTO(QString json);
    ~OAIQuantumDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint32 getMinQuantity() const;
    void setMinQuantity(const qint32 &min_quantity);
    bool is_min_quantity_Set() const;
    bool is_min_quantity_Valid() const;

    qint32 getStepQuantity() const;
    void setStepQuantity(const qint32 &step_quantity);
    bool is_step_quantity_Set() const;
    bool is_step_quantity_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint32 m_min_quantity;
    bool m_min_quantity_isSet;
    bool m_min_quantity_isValid;

    qint32 m_step_quantity;
    bool m_step_quantity_isSet;
    bool m_step_quantity_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIQuantumDTO)

#endif // OAIQuantumDTO_H
