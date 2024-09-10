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

#ifndef OAI_OAIOffersApi_H
#define OAI_OAIOffersApi_H

#include "OAIHelpers.h"
#include "OAIHttpRequest.h"
#include "OAIServerConfiguration.h"
#include "OAIOauth.h"

#include "OAIApiClientDataErrorResponse.h"
#include "OAIApiForbiddenErrorResponse.h"
#include "OAIApiLimitErrorResponse.h"
#include "OAIApiLockedErrorResponse.h"
#include "OAIApiNotFoundErrorResponse.h"
#include "OAIApiServerErrorResponse.h"
#include "OAIApiUnauthorizedErrorResponse.h"
#include "OAICurrencyType.h"
#include "OAIDeleteCampaignOffersRequest.h"
#include "OAIDeleteCampaignOffersResponse.h"
#include "OAIEmptyApiResponse.h"
#include "OAIGetAllOffersResponse.h"
#include "OAIGetCampaignOffersRequest.h"
#include "OAIGetCampaignOffersResponse.h"
#include "OAIGetOfferRecommendationsRequest.h"
#include "OAIGetOfferRecommendationsResponse.h"
#include "OAIGetOffersResponse.h"
#include "OAIUpdateCampaignOffersRequest.h"
#include <QString>

#include <QObject>
#include <QByteArray>
#include <QStringList>
#include <QList>
#include <QNetworkAccessManager>

namespace OpenAPI {

class OAIOffersApi : public QObject {
    Q_OBJECT

public:
    OAIOffersApi(const int timeOut = 0);
    ~OAIOffersApi();

    void initializeServerConfigs();
    int setDefaultServerValue(int serverIndex,const QString &operation, const QString &variable,const QString &val);
    void setServerIndex(const QString &operation, int serverIndex);
    void setApiKey(const QString &apiKeyName, const QString &apiKey);
    void setBearerToken(const QString &token);
    void setUsername(const QString &username);
    void setPassword(const QString &password);
    void setTimeOut(const int timeOut);
    void setWorkingDirectory(const QString &path);
    void setNetworkAccessManager(QNetworkAccessManager* manager);
    int addServerConfiguration(const QString &operation, const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables = QMap<QString, OAIServerVariable>());
    void setNewServerForAllOperations(const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables =  QMap<QString, OAIServerVariable>());
    void setNewServer(const QString &operation, const QUrl &url, const QString &description = "", const QMap<QString, OAIServerVariable> &variables =  QMap<QString, OAIServerVariable>());
    void addHeaders(const QString &key, const QString &value);
    void enableRequestCompression();
    void enableResponseCompression();
    void abortRequests();
    QString getParamStylePrefix(const QString &style);
    QString getParamStyleSuffix(const QString &style);
    QString getParamStyleDelimiter(const QString &style, const QString &name, bool isExplode);

    /**
    * @param[in]  campaign_id qint64 [required]
    * @param[in]  oai_delete_campaign_offers_request OAIDeleteCampaignOffersRequest [required]
    */
    void deleteCampaignOffers(const qint64 &campaign_id, const OAIDeleteCampaignOffersRequest &oai_delete_campaign_offers_request);

    /**
    * @param[in]  campaign_id qint64 [required]
    * @param[in]  feed_id qint64 [optional]
    * @param[in]  chunk qint32 [optional]
    */
    Q_DECL_DEPRECATED void getAllOffers(const qint64 &campaign_id, const ::OpenAPI::OptionalParam<qint64> &feed_id = ::OpenAPI::OptionalParam<qint64>(), const ::OpenAPI::OptionalParam<qint32> &chunk = ::OpenAPI::OptionalParam<qint32>());

    /**
    * @param[in]  campaign_id qint64 [required]
    * @param[in]  oai_get_campaign_offers_request OAIGetCampaignOffersRequest [required]
    * @param[in]  page_token QString [optional]
    * @param[in]  limit qint32 [optional]
    */
    void getCampaignOffers(const qint64 &campaign_id, const OAIGetCampaignOffersRequest &oai_get_campaign_offers_request, const ::OpenAPI::OptionalParam<QString> &page_token = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<qint32> &limit = ::OpenAPI::OptionalParam<qint32>());

    /**
    * @param[in]  business_id qint64 [required]
    * @param[in]  oai_get_offer_recommendations_request OAIGetOfferRecommendationsRequest [required]
    * @param[in]  page_token QString [optional]
    * @param[in]  limit qint32 [optional]
    */
    void getOfferRecommendations(const qint64 &business_id, const OAIGetOfferRecommendationsRequest &oai_get_offer_recommendations_request, const ::OpenAPI::OptionalParam<QString> &page_token = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<qint32> &limit = ::OpenAPI::OptionalParam<qint32>());

    /**
    * @param[in]  campaign_id qint64 [required]
    * @param[in]  query QString [optional]
    * @param[in]  feed_id qint64 [optional]
    * @param[in]  shop_category_id QString [optional]
    * @param[in]  currency OAICurrencyType [optional]
    * @param[in]  matched bool [optional]
    * @param[in]  page qint32 [optional]
    * @param[in]  page_size qint32 [optional]
    */
    Q_DECL_DEPRECATED void getOffers(const qint64 &campaign_id, const ::OpenAPI::OptionalParam<QString> &query = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<qint64> &feed_id = ::OpenAPI::OptionalParam<qint64>(), const ::OpenAPI::OptionalParam<QString> &shop_category_id = ::OpenAPI::OptionalParam<QString>(), const ::OpenAPI::OptionalParam<OAICurrencyType> &currency = ::OpenAPI::OptionalParam<OAICurrencyType>(), const ::OpenAPI::OptionalParam<bool> &matched = ::OpenAPI::OptionalParam<bool>(), const ::OpenAPI::OptionalParam<qint32> &page = ::OpenAPI::OptionalParam<qint32>(), const ::OpenAPI::OptionalParam<qint32> &page_size = ::OpenAPI::OptionalParam<qint32>());

    /**
    * @param[in]  campaign_id qint64 [required]
    * @param[in]  oai_update_campaign_offers_request OAIUpdateCampaignOffersRequest [required]
    */
    void updateCampaignOffers(const qint64 &campaign_id, const OAIUpdateCampaignOffersRequest &oai_update_campaign_offers_request);


private:
    QMap<QString,int> _serverIndices;
    QMap<QString,QList<OAIServerConfiguration>> _serverConfigs;
    QMap<QString, QString> _apiKeys;
    QString _bearerToken;
    QString _username;
    QString _password;
    int _timeOut;
    QString _workingDirectory;
    QNetworkAccessManager* _manager;
    QMap<QString, QString> _defaultHeaders;
    bool _isResponseCompressionEnabled;
    bool _isRequestCompressionEnabled;
    OAIHttpRequestInput _latestInput;
    OAIHttpRequestWorker *_latestWorker;
    QStringList _latestScope;
    OauthCode _authFlow;
    OauthImplicit _implicitFlow;
    OauthCredentials _credentialFlow;
    OauthPassword _passwordFlow;
    int _OauthMethod = 0;

    void deleteCampaignOffersCallback(OAIHttpRequestWorker *worker);
    void getAllOffersCallback(OAIHttpRequestWorker *worker);
    void getCampaignOffersCallback(OAIHttpRequestWorker *worker);
    void getOfferRecommendationsCallback(OAIHttpRequestWorker *worker);
    void getOffersCallback(OAIHttpRequestWorker *worker);
    void updateCampaignOffersCallback(OAIHttpRequestWorker *worker);

Q_SIGNALS:

    void deleteCampaignOffersSignal(OAIDeleteCampaignOffersResponse summary);
    void getAllOffersSignal(OAIGetAllOffersResponse summary);
    void getCampaignOffersSignal(OAIGetCampaignOffersResponse summary);
    void getOfferRecommendationsSignal(OAIGetOfferRecommendationsResponse summary);
    void getOffersSignal(OAIGetOffersResponse summary);
    void updateCampaignOffersSignal(OAIEmptyApiResponse summary);


    void deleteCampaignOffersSignalFull(OAIHttpRequestWorker *worker, OAIDeleteCampaignOffersResponse summary);
    void getAllOffersSignalFull(OAIHttpRequestWorker *worker, OAIGetAllOffersResponse summary);
    void getCampaignOffersSignalFull(OAIHttpRequestWorker *worker, OAIGetCampaignOffersResponse summary);
    void getOfferRecommendationsSignalFull(OAIHttpRequestWorker *worker, OAIGetOfferRecommendationsResponse summary);
    void getOffersSignalFull(OAIHttpRequestWorker *worker, OAIGetOffersResponse summary);
    void updateCampaignOffersSignalFull(OAIHttpRequestWorker *worker, OAIEmptyApiResponse summary);

    Q_DECL_DEPRECATED_X("Use deleteCampaignOffersSignalError() instead")
    void deleteCampaignOffersSignalE(OAIDeleteCampaignOffersResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void deleteCampaignOffersSignalError(OAIDeleteCampaignOffersResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use getAllOffersSignalError() instead")
    void getAllOffersSignalE(OAIGetAllOffersResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getAllOffersSignalError(OAIGetAllOffersResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use getCampaignOffersSignalError() instead")
    void getCampaignOffersSignalE(OAIGetCampaignOffersResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getCampaignOffersSignalError(OAIGetCampaignOffersResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use getOfferRecommendationsSignalError() instead")
    void getOfferRecommendationsSignalE(OAIGetOfferRecommendationsResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getOfferRecommendationsSignalError(OAIGetOfferRecommendationsResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use getOffersSignalError() instead")
    void getOffersSignalE(OAIGetOffersResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void getOffersSignalError(OAIGetOffersResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use updateCampaignOffersSignalError() instead")
    void updateCampaignOffersSignalE(OAIEmptyApiResponse summary, QNetworkReply::NetworkError error_type, QString error_str);
    void updateCampaignOffersSignalError(OAIEmptyApiResponse summary, QNetworkReply::NetworkError error_type, const QString &error_str);

    Q_DECL_DEPRECATED_X("Use deleteCampaignOffersSignalErrorFull() instead")
    void deleteCampaignOffersSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void deleteCampaignOffersSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use getAllOffersSignalErrorFull() instead")
    void getAllOffersSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getAllOffersSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use getCampaignOffersSignalErrorFull() instead")
    void getCampaignOffersSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getCampaignOffersSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use getOfferRecommendationsSignalErrorFull() instead")
    void getOfferRecommendationsSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getOfferRecommendationsSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use getOffersSignalErrorFull() instead")
    void getOffersSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void getOffersSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);
    Q_DECL_DEPRECATED_X("Use updateCampaignOffersSignalErrorFull() instead")
    void updateCampaignOffersSignalEFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, QString error_str);
    void updateCampaignOffersSignalErrorFull(OAIHttpRequestWorker *worker, QNetworkReply::NetworkError error_type, const QString &error_str);

    void abortRequestsSignal();
    void allPendingRequestsCompleted();

public Q_SLOTS:
    void tokenAvailable();
};

} // namespace OpenAPI
#endif
