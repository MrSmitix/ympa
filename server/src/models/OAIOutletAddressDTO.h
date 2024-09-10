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
 * OAIOutletAddressDTO.h
 *
 * Адрес точки продаж. 
 */

#ifndef OAIOutletAddressDTO_H
#define OAIOutletAddressDTO_H

#include <QJsonObject>

#include <QString>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIOutletAddressDTO : public OAIObject {
public:
    OAIOutletAddressDTO();
    OAIOutletAddressDTO(QString json);
    ~OAIOutletAddressDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint64 getRegionId() const;
    void setRegionId(const qint64 &region_id);
    bool is_region_id_Set() const;
    bool is_region_id_Valid() const;

    QString getStreet() const;
    void setStreet(const QString &street);
    bool is_street_Set() const;
    bool is_street_Valid() const;

    QString getNumber() const;
    void setNumber(const QString &number);
    bool is_number_Set() const;
    bool is_number_Valid() const;

    QString getBuilding() const;
    void setBuilding(const QString &building);
    bool is_building_Set() const;
    bool is_building_Valid() const;

    QString getEstate() const;
    void setEstate(const QString &estate);
    bool is_estate_Set() const;
    bool is_estate_Valid() const;

    QString getBlock() const;
    void setBlock(const QString &block);
    bool is_block_Set() const;
    bool is_block_Valid() const;

    QString getAdditional() const;
    void setAdditional(const QString &additional);
    bool is_additional_Set() const;
    bool is_additional_Valid() const;

    qint32 getKm() const;
    void setKm(const qint32 &km);
    bool is_km_Set() const;
    bool is_km_Valid() const;

    QString getCity() const;
    void setCity(const QString &city);
    bool is_city_Set() const;
    bool is_city_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    qint64 region_id;
    bool m_region_id_isSet;
    bool m_region_id_isValid;

    QString street;
    bool m_street_isSet;
    bool m_street_isValid;

    QString number;
    bool m_number_isSet;
    bool m_number_isValid;

    QString building;
    bool m_building_isSet;
    bool m_building_isValid;

    QString estate;
    bool m_estate_isSet;
    bool m_estate_isValid;

    QString block;
    bool m_block_isSet;
    bool m_block_isValid;

    QString additional;
    bool m_additional_isSet;
    bool m_additional_isValid;

    qint32 km;
    bool m_km_isSet;
    bool m_km_isValid;

    QString city;
    bool m_city_isSet;
    bool m_city_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIOutletAddressDTO)

#endif // OAIOutletAddressDTO_H
