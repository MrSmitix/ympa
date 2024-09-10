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

#ifndef OAI_OAIPriceQuarantineApiHandler_H
#define OAI_OAIPriceQuarantineApiHandler_H

#include <QObject>

#include "OAIApiClientDataErrorResponse.h"
#include "OAIApiForbiddenErrorResponse.h"
#include "OAIApiLimitErrorResponse.h"
#include "OAIApiLockedErrorResponse.h"
#include "OAIApiNotFoundErrorResponse.h"
#include "OAIApiServerErrorResponse.h"
#include "OAIApiUnauthorizedErrorResponse.h"
#include "OAIConfirmPricesRequest.h"
#include "OAIEmptyApiResponse.h"
#include "OAIGetQuarantineOffersRequest.h"
#include "OAIGetQuarantineOffersResponse.h"
#include <QString>

namespace OpenAPI {

class OAIPriceQuarantineApiHandler : public QObject
{
    Q_OBJECT

public:
    OAIPriceQuarantineApiHandler();
    virtual ~OAIPriceQuarantineApiHandler();


public Q_SLOTS:
    virtual void confirmBusinessPrices(qint64 business_id, OAIConfirmPricesRequest oai_confirm_prices_request);
    virtual void confirmCampaignPrices(qint64 campaign_id, OAIConfirmPricesRequest oai_confirm_prices_request);
    virtual void getBusinessQuarantineOffers(qint64 business_id, OAIGetQuarantineOffersRequest oai_get_quarantine_offers_request, QString page_token, qint32 limit);
    virtual void getCampaignQuarantineOffers(qint64 campaign_id, OAIGetQuarantineOffersRequest oai_get_quarantine_offers_request, QString page_token, qint32 limit);
    

};

}

#endif // OAI_OAIPriceQuarantineApiHandler_H
