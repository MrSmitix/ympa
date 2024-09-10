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
 * OAIWarehouseStockDTO.h
 *
 * Информация об остатках товара.
 */

#ifndef OAIWarehouseStockDTO_H
#define OAIWarehouseStockDTO_H

#include <QJsonObject>

#include "OAIWarehouseStockType.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIWarehouseStockDTO : public OAIObject {
public:
    OAIWarehouseStockDTO();
    OAIWarehouseStockDTO(QString json);
    ~OAIWarehouseStockDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIWarehouseStockType getType() const;
    void setType(const OAIWarehouseStockType &type);
    bool is_type_Set() const;
    bool is_type_Valid() const;

    qint64 getCount() const;
    void setCount(const qint64 &count);
    bool is_count_Set() const;
    bool is_count_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIWarehouseStockType type;
    bool m_type_isSet;
    bool m_type_isValid;

    qint64 count;
    bool m_count_isSet;
    bool m_count_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIWarehouseStockDTO)

#endif // OAIWarehouseStockDTO_H
