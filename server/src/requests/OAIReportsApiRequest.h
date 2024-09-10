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

#ifndef OAI_OAIReportsApiRequest_H
#define OAI_OAIReportsApiRequest_H

#include <QObject>
#include <QStringList>
#include <QMultiMap>
#include <QNetworkReply>
#include <QSharedPointer>

#include <qhttpengine/socket.h>
#include "OAIApiClientDataErrorResponse.h"
#include "OAIApiForbiddenErrorResponse.h"
#include "OAIApiLimitErrorResponse.h"
#include "OAIApiNotFoundErrorResponse.h"
#include "OAIApiServerErrorResponse.h"
#include "OAIApiUnauthorizedErrorResponse.h"
#include "OAIGenerateBoostConsolidatedRequest.h"
#include "OAIGenerateCompetitorsPositionReportRequest.h"
#include "OAIGenerateGoodsFeedbackRequest.h"
#include "OAIGenerateGoodsMovementReportRequest.h"
#include "OAIGenerateGoodsRealizationReportRequest.h"
#include "OAIGenerateGoodsTurnoverRequest.h"
#include "OAIGenerateMassOrderLabelsRequest.h"
#include "OAIGeneratePricesReportRequest.h"
#include "OAIGenerateReportResponse.h"
#include "OAIGenerateShelfsStatisticsRequest.h"
#include "OAIGenerateShipmentListDocumentReportRequest.h"
#include "OAIGenerateShowsSalesReportRequest.h"
#include "OAIGenerateStocksOnWarehousesReportRequest.h"
#include "OAIGenerateUnitedMarketplaceServicesReportRequest.h"
#include "OAIGenerateUnitedNettingReportRequest.h"
#include "OAIGenerateUnitedOrdersRequest.h"
#include "OAIGetReportInfoResponse.h"
#include "OAIPageFormatType.h"
#include "OAIReportFormatType.h"
#include <QString>
#include "OAIReportsApiHandler.h"

namespace OpenAPI {

class OAIReportsApiRequest : public QObject
{
    Q_OBJECT

public:
    OAIReportsApiRequest(QHttpEngine::Socket *s, QSharedPointer<OAIReportsApiHandler> handler);
    virtual ~OAIReportsApiRequest();

    void generateBoostConsolidatedReportRequest();
    void generateCompetitorsPositionReportRequest();
    void generateGoodsFeedbackReportRequest();
    void generateGoodsMovementReportRequest();
    void generateGoodsRealizationReportRequest();
    void generateGoodsTurnoverReportRequest();
    void generateMassOrderLabelsReportRequest();
    void generatePricesReportRequest();
    void generateShelfsStatisticsReportRequest();
    void generateShipmentListDocumentReportRequest();
    void generateShowsSalesReportRequest();
    void generateStocksOnWarehousesReportRequest();
    void generateUnitedMarketplaceServicesReportRequest();
    void generateUnitedNettingReportRequest();
    void generateUnitedOrdersReportRequest();
    void getReportInfoRequest(const QString& report_id);
    

    void generateBoostConsolidatedReportResponse(const OAIGenerateReportResponse& res);
    void generateCompetitorsPositionReportResponse(const OAIGenerateReportResponse& res);
    void generateGoodsFeedbackReportResponse(const OAIGenerateReportResponse& res);
    void generateGoodsMovementReportResponse(const OAIGenerateReportResponse& res);
    void generateGoodsRealizationReportResponse(const OAIGenerateReportResponse& res);
    void generateGoodsTurnoverReportResponse(const OAIGenerateReportResponse& res);
    void generateMassOrderLabelsReportResponse(const OAIGenerateReportResponse& res);
    void generatePricesReportResponse(const OAIGenerateReportResponse& res);
    void generateShelfsStatisticsReportResponse(const OAIGenerateReportResponse& res);
    void generateShipmentListDocumentReportResponse(const OAIGenerateReportResponse& res);
    void generateShowsSalesReportResponse(const OAIGenerateReportResponse& res);
    void generateStocksOnWarehousesReportResponse(const OAIGenerateReportResponse& res);
    void generateUnitedMarketplaceServicesReportResponse(const OAIGenerateReportResponse& res);
    void generateUnitedNettingReportResponse(const OAIGenerateReportResponse& res);
    void generateUnitedOrdersReportResponse(const OAIGenerateReportResponse& res);
    void getReportInfoResponse(const OAIGetReportInfoResponse& res);
    

    void generateBoostConsolidatedReportError(const OAIGenerateReportResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void generateCompetitorsPositionReportError(const OAIGenerateReportResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void generateGoodsFeedbackReportError(const OAIGenerateReportResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void generateGoodsMovementReportError(const OAIGenerateReportResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void generateGoodsRealizationReportError(const OAIGenerateReportResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void generateGoodsTurnoverReportError(const OAIGenerateReportResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void generateMassOrderLabelsReportError(const OAIGenerateReportResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void generatePricesReportError(const OAIGenerateReportResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void generateShelfsStatisticsReportError(const OAIGenerateReportResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void generateShipmentListDocumentReportError(const OAIGenerateReportResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void generateShowsSalesReportError(const OAIGenerateReportResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void generateStocksOnWarehousesReportError(const OAIGenerateReportResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void generateUnitedMarketplaceServicesReportError(const OAIGenerateReportResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void generateUnitedNettingReportError(const OAIGenerateReportResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void generateUnitedOrdersReportError(const OAIGenerateReportResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getReportInfoError(const OAIGetReportInfoResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    

    void sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type);

    void sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type);

    QMap<QString, QString> getRequestHeaders() const;

    QHttpEngine::Socket* getRawSocket();

    void setResponseHeaders(const QMultiMap<QString,QString>& headers);

Q_SIGNALS:
    void generateBoostConsolidatedReport(OAIGenerateBoostConsolidatedRequest oai_generate_boost_consolidated_request, OAIReportFormatType format);
    void generateCompetitorsPositionReport(OAIGenerateCompetitorsPositionReportRequest oai_generate_competitors_position_report_request, OAIReportFormatType format);
    void generateGoodsFeedbackReport(OAIGenerateGoodsFeedbackRequest oai_generate_goods_feedback_request, OAIReportFormatType format);
    void generateGoodsMovementReport(OAIGenerateGoodsMovementReportRequest oai_generate_goods_movement_report_request, OAIReportFormatType format);
    void generateGoodsRealizationReport(OAIGenerateGoodsRealizationReportRequest oai_generate_goods_realization_report_request, OAIReportFormatType format);
    void generateGoodsTurnoverReport(OAIGenerateGoodsTurnoverRequest oai_generate_goods_turnover_request, OAIReportFormatType format);
    void generateMassOrderLabelsReport(OAIGenerateMassOrderLabelsRequest oai_generate_mass_order_labels_request, OAIPageFormatType format);
    void generatePricesReport(OAIGeneratePricesReportRequest oai_generate_prices_report_request, OAIReportFormatType format);
    void generateShelfsStatisticsReport(OAIGenerateShelfsStatisticsRequest oai_generate_shelfs_statistics_request, OAIReportFormatType format);
    void generateShipmentListDocumentReport(OAIGenerateShipmentListDocumentReportRequest oai_generate_shipment_list_document_report_request);
    void generateShowsSalesReport(OAIGenerateShowsSalesReportRequest oai_generate_shows_sales_report_request, OAIReportFormatType format);
    void generateStocksOnWarehousesReport(OAIGenerateStocksOnWarehousesReportRequest oai_generate_stocks_on_warehouses_report_request, OAIReportFormatType format);
    void generateUnitedMarketplaceServicesReport(OAIGenerateUnitedMarketplaceServicesReportRequest oai_generate_united_marketplace_services_report_request, OAIReportFormatType format);
    void generateUnitedNettingReport(OAIGenerateUnitedNettingReportRequest oai_generate_united_netting_report_request, OAIReportFormatType format);
    void generateUnitedOrdersReport(OAIGenerateUnitedOrdersRequest oai_generate_united_orders_request, OAIReportFormatType format);
    void getReportInfo(QString report_id);
    

private:
    QMap<QString, QString> requestHeaders;
    QMap<QString, QString> responseHeaders;
    QHttpEngine::Socket  *socket;
    QSharedPointer<OAIReportsApiHandler> handler;

    inline void setSocketResponseHeaders(){
        QHttpEngine::Socket::HeaderMap resHeaders;
        for(auto itr = responseHeaders.begin(); itr != responseHeaders.end(); ++itr) {
            resHeaders.insert(itr.key().toUtf8(), itr.value().toUtf8());
        }
        socket->setHeaders(resHeaders);
    }
};

}

#endif // OAI_OAIReportsApiRequest_H
