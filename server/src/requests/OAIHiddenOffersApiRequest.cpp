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
#include "OAIHiddenOffersApiRequest.h"

namespace OpenAPI {

OAIHiddenOffersApiRequest::OAIHiddenOffersApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIHiddenOffersApiHandler> hdl) : QObject(s), socket(s), handler(hdl) {
    auto headers = s->headers();
    for(auto itr = headers.begin(); itr != headers.end(); itr++) {
        requestHeaders.insert(QString(itr.key()), QString(itr.value()));
    }
}

OAIHiddenOffersApiRequest::~OAIHiddenOffersApiRequest(){
    disconnect(this, nullptr, nullptr, nullptr);
    qDebug() << "OAIHiddenOffersApiRequest::~OAIHiddenOffersApiRequest()";
}

QMap<QString, QString>
OAIHiddenOffersApiRequest::getRequestHeaders() const {
    return requestHeaders;
}

void OAIHiddenOffersApiRequest::setResponseHeaders(const QMultiMap<QString, QString>& headers){
    for(auto itr = headers.begin(); itr != headers.end(); ++itr) {
        responseHeaders.insert(itr.key(), itr.value());
    }
}


QHttpEngine::Socket* OAIHiddenOffersApiRequest::getRawSocket(){
    return socket;
}


void OAIHiddenOffersApiRequest::addHiddenOffersRequest(const QString& campaign_idstr){
    qDebug() << "/campaigns/{campaignId}/hidden-offers";
    connect(this, &OAIHiddenOffersApiRequest::addHiddenOffers, handler.data(), &OAIHiddenOffersApiHandler::addHiddenOffers);

    
    qint64 campaign_id;
    fromStringValue(campaign_idstr, campaign_id);
     
    
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIAddHiddenOffersRequest oai_add_hidden_offers_request;
    ::OpenAPI::fromJsonValue(oai_add_hidden_offers_request, obj);
    

    Q_EMIT addHiddenOffers(campaign_id, oai_add_hidden_offers_request);
}


void OAIHiddenOffersApiRequest::deleteHiddenOffersRequest(const QString& campaign_idstr){
    qDebug() << "/campaigns/{campaignId}/hidden-offers/delete";
    connect(this, &OAIHiddenOffersApiRequest::deleteHiddenOffers, handler.data(), &OAIHiddenOffersApiHandler::deleteHiddenOffers);

    
    qint64 campaign_id;
    fromStringValue(campaign_idstr, campaign_id);
     
    
    QJsonDocument doc;
    socket->readJson(doc);
    QJsonObject obj = doc.object();
    OAIDeleteHiddenOffersRequest oai_delete_hidden_offers_request;
    ::OpenAPI::fromJsonValue(oai_delete_hidden_offers_request, obj);
    

    Q_EMIT deleteHiddenOffers(campaign_id, oai_delete_hidden_offers_request);
}


void OAIHiddenOffersApiRequest::getHiddenOffersRequest(const QString& campaign_idstr){
    qDebug() << "/campaigns/{campaignId}/hidden-offers";
    connect(this, &OAIHiddenOffersApiRequest::getHiddenOffers, handler.data(), &OAIHiddenOffersApiHandler::getHiddenOffers);

    
    QList<QString> offer_id;
    if(socket->queryString().keys().contains("offer_id")){
        fromStringValue(socket->queryString().values("offer_id"), offer_id);
    }
    
    QString page_token;
    if(socket->queryString().keys().contains("page_token")){
        fromStringValue(socket->queryString().value("page_token"), page_token);
    }
    
    qint32 limit;
    if(socket->queryString().keys().contains("limit")){
        fromStringValue(socket->queryString().value("limit"), limit);
    }
    
    qint32 offset;
    if(socket->queryString().keys().contains("offset")){
        fromStringValue(socket->queryString().value("offset"), offset);
    }
    
    qint32 page;
    if(socket->queryString().keys().contains("page")){
        fromStringValue(socket->queryString().value("page"), page);
    }
    
    qint32 page_size;
    if(socket->queryString().keys().contains("page_size")){
        fromStringValue(socket->queryString().value("page_size"), page_size);
    }
    
    qint64 campaign_id;
    fromStringValue(campaign_idstr, campaign_id);
    

    Q_EMIT getHiddenOffers(campaign_id, offer_id, page_token, limit, offset, page, page_size);
}



void OAIHiddenOffersApiRequest::addHiddenOffersResponse(const OAIEmptyApiResponse& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIHiddenOffersApiRequest::deleteHiddenOffersResponse(const OAIEmptyApiResponse& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIHiddenOffersApiRequest::getHiddenOffersResponse(const OAIGetHiddenOffersResponse& res){
    setSocketResponseHeaders();
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIHiddenOffersApiRequest::addHiddenOffersError(const OAIEmptyApiResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIHiddenOffersApiRequest::deleteHiddenOffersError(const OAIEmptyApiResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIHiddenOffersApiRequest::getHiddenOffersError(const OAIGetHiddenOffersResponse& res, QNetworkReply::NetworkError error_type, QString& error_str){
    Q_UNUSED(error_type); // TODO: Remap error_type to QHttpEngine::Socket errors
    setSocketResponseHeaders();
    Q_UNUSED(error_str);  // response will be used instead of error string
    QJsonDocument resDoc(::OpenAPI::toJsonValue(res).toObject());
    socket->writeJson(resDoc);
    if(socket->isOpen()){
        socket->close();
    }
}


void OAIHiddenOffersApiRequest::sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type); // TODO
    socket->write(res);
    if(socket->isOpen()){
        socket->close();
    }
}

void OAIHiddenOffersApiRequest::sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type){
    Q_UNUSED(error_type);  // TODO
    socket->write(res->readAll());
    if(socket->isOpen()){
        socket->close();
    }
}

}
