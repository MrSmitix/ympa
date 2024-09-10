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

#ifndef OAI_OAIContentApiRequest_H
#define OAI_OAIContentApiRequest_H

#include <QObject>
#include <QStringList>
#include <QMultiMap>
#include <QNetworkReply>
#include <QSharedPointer>

#include <qhttpengine/socket.h>
#include "OAIApiClientDataErrorResponse.h"
#include "OAIApiForbiddenErrorResponse.h"
#include "OAIApiLimitErrorResponse.h"
#include "OAIApiLockedErrorResponse.h"
#include "OAIApiNotFoundErrorResponse.h"
#include "OAIApiServerErrorResponse.h"
#include "OAIApiUnauthorizedErrorResponse.h"
#include "OAIGetCategoryContentParametersResponse.h"
#include "OAIGetOfferCardsContentStatusRequest.h"
#include "OAIGetOfferCardsContentStatusResponse.h"
#include "OAIUpdateOfferContentRequest.h"
#include "OAIUpdateOfferContentResponse.h"
#include <QString>
#include "OAIContentApiHandler.h"

namespace OpenAPI {

class OAIContentApiRequest : public QObject
{
    Q_OBJECT

public:
    OAIContentApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIContentApiHandler> handler);
    virtual ~OAIContentApiRequest();

    void getCategoryContentParametersRequest(const QString& category_id);
    void getOfferCardsContentStatusRequest(const QString& business_id);
    void updateOfferContentRequest(const QString& business_id);
    

    void getCategoryContentParametersResponse(const OAIGetCategoryContentParametersResponse& res);
    void getOfferCardsContentStatusResponse(const OAIGetOfferCardsContentStatusResponse& res);
    void updateOfferContentResponse(const OAIUpdateOfferContentResponse& res);
    

    void getCategoryContentParametersError(const OAIGetCategoryContentParametersResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getOfferCardsContentStatusError(const OAIGetOfferCardsContentStatusResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void updateOfferContentError(const OAIUpdateOfferContentResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    

    void sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type);

    void sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type);

    QMap<QString, QString> getRequestHeaders() const;

    QHttpEngine::Socket* getRawSocket();

    void setResponseHeaders(const QMultiMap<QString,QString>& headers);

Q_SIGNALS:
    void getCategoryContentParameters(qint64 category_id);
    void getOfferCardsContentStatus(qint64 business_id, QString page_token, qint32 limit, OAIGetOfferCardsContentStatusRequest oai_get_offer_cards_content_status_request);
    void updateOfferContent(qint64 business_id, OAIUpdateOfferContentRequest oai_update_offer_content_request);
    

private:
    QMap<QString, QString> requestHeaders;
    QMap<QString, QString> responseHeaders;
    QHttpEngine::Socket  *socket;
    QSharedPointer<OAIContentApiHandler> handler;

    inline void setSocketResponseHeaders(){
        QHttpEngine::Socket::HeaderMap resHeaders;
        for(auto itr = responseHeaders.begin(); itr != responseHeaders.end(); ++itr) {
            resHeaders.insert(itr.key().toUtf8(), itr.value().toUtf8());
        }
        socket->setHeaders(resHeaders);
    }
};

}

#endif // OAI_OAIContentApiRequest_H
