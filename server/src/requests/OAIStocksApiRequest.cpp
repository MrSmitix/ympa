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

#include <QJsonArray>
#include <QJsonDocument>
#include <QJsonObject>
#include <QVariantMap>
#include <QDebug>

#include "OAIHelpers.h"
#include "OAIStocksApiRequest.h"

namespace OpenAPI {

OAIStocksApiRequest::OAIStocksApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIStocksApiHandler> hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAIStocksApiRequest::~OAIStocksApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAIStocksApiRequest::~OAIStocksApiRequest()";
}

QMap<QString, QString>
OAIStocksApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAIStocksApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAIStocksApiRequest::getRawSocket(){
    return socket;
}


void OAIStocksApiRequest::getStocksRequest(const QString& campaign_idstr){
    qDebug() << "/campaigns/{campaignId}/offers/stocks";
    connect(this, &OAIStocksApiRequest::getStocks, handler.data(), &OAIStocksApiHandler::getStocks);

    
    QString page_token;
    if(socket->queryString().keys().contains("page_token")){
        fromStringValue(socket->queryString().value("page_token"), page_token);
    }
    
    qint32 limit;
    if(socket->queryString().keys().contains("limit")){
        fromStringValue(socket->queryString().value("limit"), limit);
    }
    
    qint64 campaign_id;
    fromStringValue(campaign_idstr, campaign_id);
     
    
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIGetWarehouseStocksRequest oai_get_warehouse_stocks_request;
    ::OpenAPI::fromJsonValue(oai_get_warehouse_stocks_request, obj);
    

    Q_EMIT getStocks(campaign_id, page_token, limit, oai_get_warehouse_stocks_request);
}


void OAIStocksApiRequest::updateStocksRequest(const QString& campaign_idstr){
    qDebug() << "/campaigns/{campaignId}/offers/stocks";
    connect(this, &OAIStocksApiRequest::updateStocks, handler.data(), &OAIStocksApiHandler::updateStocks);

    
    qint64 campaign_id;
    fromStringValue(campaign_idstr, campaign_id);
     
    
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIUpdateStocksRequest oai_update_stocks_request;
    ::OpenAPI::fromJsonValue(oai_update_stocks_request, obj);
    

    Q_EMIT updateStocks(campaign_id, oai_update_stocks_request);
}



void OAIStocksApiRequest::getStocksResponse(const OAIGetWarehouseStocksResponse& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIStocksApiRequest::updateStocksResponse(const OAIEmptyApiResponse& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIStocksApiRequest::getStocksError(const OAIGetWarehouseStocksResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIStocksApiRequest::updateStocksError(const OAIEmptyApiResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIStocksApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIStocksApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}
