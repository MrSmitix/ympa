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
 * OAIUpdateOfferMappingEntryRequest.h
 *
 * Запрос на обновление товаров.
 */

#ifndef OAIUpdateOfferMappingEntryRequest_H
#define OAIUpdateOfferMappingEntryRequest_H

#include <QJsonObject>

#include "OAIUpdateOfferMappingEntryDTO.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIUpdateOfferMappingEntryRequest : public OAIObject {
public:
    OAIUpdateOfferMappingEntryRequest();
    OAIUpdateOfferMappingEntryRequest(QString json);
    ~OAIUpdateOfferMappingEntryRequest() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<OAIUpdateOfferMappingEntryDTO> getOfferMappingEntries() const;
    void setOfferMappingEntries(const QList<OAIUpdateOfferMappingEntryDTO> &offer_mapping_entries);
    bool is_offer_mapping_entries_Set() const;
    bool is_offer_mapping_entries_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<OAIUpdateOfferMappingEntryDTO> offer_mapping_entries;
    bool m_offer_mapping_entries_isSet;
    bool m_offer_mapping_entries_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIUpdateOfferMappingEntryRequest)

#endif // OAIUpdateOfferMappingEntryRequest_H
