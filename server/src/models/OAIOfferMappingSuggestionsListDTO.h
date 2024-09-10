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
 * OAIOfferMappingSuggestionsListDTO.h
 *
 * Список рекомендованных карточек товара.
 */

#ifndef OAIOfferMappingSuggestionsListDTO_H
#define OAIOfferMappingSuggestionsListDTO_H

#include <QJsonObject>

#include "OAIEnrichedMappingsOfferDTO.h"
#include <QList>

#include "OAIEnum.h"
#include "OAIObject.h"

namespace OpenAPI {

class OAIOfferMappingSuggestionsListDTO : public OAIObject {
public:
    OAIOfferMappingSuggestionsListDTO();
    OAIOfferMappingSuggestionsListDTO(QString json);
    ~OAIOfferMappingSuggestionsListDTO() override;

    QString asJson() const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QList<OAIEnrichedMappingsOfferDTO> getOffers() const;
    void setOffers(const QList<OAIEnrichedMappingsOfferDTO> &offers);
    bool is_offers_Set() const;
    bool is_offers_Valid() const;

    virtual bool isSet() const override;
    virtual bool isValid() const override;

private:
    void initializeModel();

    QList<OAIEnrichedMappingsOfferDTO> offers;
    bool m_offers_isSet;
    bool m_offers_isValid;
};

} // namespace OpenAPI

Q_DECLARE_METATYPE(OpenAPI::OAIOfferMappingSuggestionsListDTO)

#endif // OAIOfferMappingSuggestionsListDTO_H
