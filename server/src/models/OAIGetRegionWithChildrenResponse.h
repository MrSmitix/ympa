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
 * OAIGetRegionWithChildrenResponse.h
 *
 * 
 */

#ifndef OAIGetRegionWithChildrenResponse_H
#define OAIGetRegionWithChildrenResponse_H

#include <QJsonObject>

#include "OAIFlippingPagerDTO.h"
#include "OAIRegionDTO.h"

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIGetRegionWithChildrenResponse : public OAIObject {
public:
    OAIGetRegionWithChildrenResponse();
    OAIGetRegionWithChildrenResponse(QString json);
    ~OAIGetRegionWithChildrenResponse() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    OAIFlippingPagerDTO getPager() const;
    void setPager(const OAIFlippingPagerDTO &pager);
    bool is_pager_Set() const;
    bool is_pager_Valid() const;

    OAIRegionDTO getRegions() const;
    void setRegions(const OAIRegionDTO &regions);
    bool is_regions_Set() const;
    bool is_regions_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    OAIFlippingPagerDTO pager;
    bool m_pager_isSet;
    bool m_pager_isValid;

    OAIRegionDTO regions;
    bool m_regions_isSet;
    bool m_regions_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIGetRegionWithChildrenResponse)

#endif // OAIGetRegionWithChildrenResponse_H
