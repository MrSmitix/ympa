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

#ifndef OAI_OAIBusinessOfferMappingsApiRequest_H
#define OAI_OAIBusinessOfferMappingsApiRequest_H

#include <QObject>
#include <QStringList>
#include <QMultiMap>
#include <QNetworkReply>
#include <QSharedPointer>

#include <qhttpengine/socket.h>
#include "OAIAddOffersToArchiveRequest.h"
#include "OAIAddOffersToArchiveResponse.h"
#include "OAIApiClientDataErrorResponse.h"
#include "OAIApiForbiddenErrorResponse.h"
#include "OAIApiLimitErrorResponse.h"
#include "OAIApiLockedErrorResponse.h"
#include "OAIApiNotFoundErrorResponse.h"
#include "OAIApiServerErrorResponse.h"
#include "OAIApiUnauthorizedErrorResponse.h"
#include "OAIDeleteOffersFromArchiveRequest.h"
#include "OAIDeleteOffersFromArchiveResponse.h"
#include "OAIDeleteOffersRequest.h"
#include "OAIDeleteOffersResponse.h"
#include "OAIGetOfferMappingsRequest.h"
#include "OAIGetOfferMappingsResponse.h"
#include "OAIGetSuggestedOfferMappingsRequest.h"
#include "OAIGetSuggestedOfferMappingsResponse.h"
#include "OAIUpdateOfferMappingsRequest.h"
#include "OAIUpdateOfferMappingsResponse.h"
#include <QString>
#include "OAIBusinessOfferMappingsApiHandler.h"

namespace OpenAPI {

class OAIBusinessOfferMappingsApiRequest : public QObject
{
    Q_OBJECT

public:
    OAIBusinessOfferMappingsApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIBusinessOfferMappingsApiHandler> handler);
    virtual ~OAIBusinessOfferMappingsApiRequest();

    void addOffersToArchiveRequest(const QString& business_id);
    void deleteOffersRequest(const QString& business_id);
    void deleteOffersFromArchiveRequest(const QString& business_id);
    void getOfferMappingsRequest(const QString& business_id);
    void getSuggestedOfferMappingsRequest(const QString& business_id);
    void updateOfferMappingsRequest(const QString& business_id);
    

    void addOffersToArchiveResponse(const OAIAddOffersToArchiveResponse& res);
    void deleteOffersResponse(const OAIDeleteOffersResponse& res);
    void deleteOffersFromArchiveResponse(const OAIDeleteOffersFromArchiveResponse& res);
    void getOfferMappingsResponse(const OAIGetOfferMappingsResponse& res);
    void getSuggestedOfferMappingsResponse(const OAIGetSuggestedOfferMappingsResponse& res);
    void updateOfferMappingsResponse(const OAIUpdateOfferMappingsResponse& res);
    

    void addOffersToArchiveError(const OAIAddOffersToArchiveResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void deleteOffersError(const OAIDeleteOffersResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void deleteOffersFromArchiveError(const OAIDeleteOffersFromArchiveResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getOfferMappingsError(const OAIGetOfferMappingsResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getSuggestedOfferMappingsError(const OAIGetSuggestedOfferMappingsResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void updateOfferMappingsError(const OAIUpdateOfferMappingsResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    

    void sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type);

    void sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type);

    QMap<QString, QString> getRequestHeaders() const;

    QHttpEngine::Socket* getRawSocket();

    void setResponseHeaders(const QMultiMap<QString,QString>& headers);

Q_SIGNALS:
    void addOffersToArchive(qint64 business_id, OAIAddOffersToArchiveRequest oai_add_offers_to_archive_request);
    void deleteOffers(qint64 business_id, OAIDeleteOffersRequest oai_delete_offers_request);
    void deleteOffersFromArchive(qint64 business_id, OAIDeleteOffersFromArchiveRequest oai_delete_offers_from_archive_request);
    void getOfferMappings(qint64 business_id, QString page_token, qint32 limit, OAIGetOfferMappingsRequest oai_get_offer_mappings_request);
    void getSuggestedOfferMappings(qint64 business_id, OAIGetSuggestedOfferMappingsRequest oai_get_suggested_offer_mappings_request);
    void updateOfferMappings(qint64 business_id, OAIUpdateOfferMappingsRequest oai_update_offer_mappings_request);
    

private:
    QMap<QString, QString> requestHeaders;
    QMap<QString, QString> responseHeaders;
    QHttpEngine::Socket  *socket;
    QSharedPointer<OAIBusinessOfferMappingsApiHandler> handler;

    inline void setSocketResponseHeaders(){
        QHttpEngine::Socket::HeaderMap resHeaders;
        for(auto itr = responseHeaders.begin(); itr != responseHeaders.end(); ++itr) {
            resHeaders.insert(itr.key().toUtf8(), itr.value().toUtf8());
        }
        socket->setHeaders(resHeaders);
    }
};

}

#endif // OAI_OAIBusinessOfferMappingsApiRequest_H
