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

#ifndef OAI_OAIReturnsApiHandler_H
#define OAI_OAIReturnsApiHandler_H

#include <QObject>

#include "OAIApiClientDataErrorResponse.h"
#include "OAIApiForbiddenErrorResponse.h"
#include "OAIApiLimitErrorResponse.h"
#include "OAIApiNotFoundErrorResponse.h"
#include "OAIApiServerErrorResponse.h"
#include "OAIApiUnauthorizedErrorResponse.h"
#include "OAIEmptyApiResponse.h"
#include "OAIGetReturnResponse.h"
#include "OAIGetReturnsResponse.h"
#include "OAIHttpFileElement.h"
#include "OAIRefundStatusType.h"
#include "OAIReturnType.h"
#include "OAISetReturnDecisionRequest.h"
#include <QList>
#include <QString>

namespace OpenAPI {

class OAIReturnsApiHandler : public QObject
{
    Q_OBJECT

public:
    OAIReturnsApiHandler();
    virtual ~OAIReturnsApiHandler();


public Q_SLOTS:
    virtual void getReturn(qint64 campaign_id, qint64 order_id, qint64 return_id);
    virtual void getReturnApplication(qint64 campaign_id, qint64 order_id, qint64 return_id);
    virtual void getReturnPhoto(qint64 campaign_id, qint64 order_id, qint64 return_id, qint64 item_id, QString image_hash);
    virtual void getReturns(qint64 campaign_id, QString page_token, qint32 limit, QList<qint64> order_ids, QList<OAIRefundStatusType> statuses, OAIReturnType type, QDate from_date, QDate to_date, QDate from_date2, QDate to_date2);
    virtual void setReturnDecision(qint64 campaign_id, qint64 order_id, qint64 return_id, OAISetReturnDecisionRequest oai_set_return_decision_request);
    virtual void submitReturnDecision(qint64 campaign_id, qint64 order_id, qint64 return_id);
    

};

}

#endif // OAI_OAIReturnsApiHandler_H
