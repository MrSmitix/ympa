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

#ifndef OAI_OAIFeedsApiHandler_H
#define OAI_OAIFeedsApiHandler_H

#include <QObject>

#include "OAIApiClientDataErrorResponse.h"
#include "OAIApiForbiddenErrorResponse.h"
#include "OAIApiLimitErrorResponse.h"
#include "OAIApiLockedErrorResponse.h"
#include "OAIApiNotFoundErrorResponse.h"
#include "OAIApiServerErrorResponse.h"
#include "OAIApiUnauthorizedErrorResponse.h"
#include "OAIEmptyApiResponse.h"
#include "OAIFeedIndexLogsStatusType.h"
#include "OAIGetFeedIndexLogsResponse.h"
#include "OAIGetFeedResponse.h"
#include "OAIGetFeedsResponse.h"
#include "OAISetFeedParamsRequest.h"
#include <QString>

namespace OpenAPI {

class OAIFeedsApiHandler : public QObject
{
    Q_OBJECT

public:
    OAIFeedsApiHandler();
    virtual ~OAIFeedsApiHandler();


public Q_SLOTS:
    virtual void getFeed(qint64 campaign_id, qint64 feed_id);
    virtual void getFeedIndexLogs(qint64 campaign_id, qint64 feed_id, qint32 limit, QDateTime published_time_from, QDateTime published_time_to, OAIFeedIndexLogsStatusType status);
    virtual void getFeeds(qint64 campaign_id);
    virtual void refreshFeed(qint64 campaign_id, qint64 feed_id);
    virtual void setFeedParams(qint64 campaign_id, qint64 feed_id, OAISetFeedParamsRequest oai_set_feed_params_request);
    

};

}

#endif // OAI_OAIFeedsApiHandler_H
