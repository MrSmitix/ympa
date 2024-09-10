/*
 * GenerateShipmentListDocumentReportRequest.h
 *
 * Данные, необходимые для генерации документа. 
 */

#ifndef _GenerateShipmentListDocumentReportRequest_H_
#define _GenerateShipmentListDocumentReportRequest_H_


#include <string>
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Данные, необходимые для генерации документа. 
 *
 *  \ingroup Models
 *
 */

class GenerateShipmentListDocumentReportRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GenerateShipmentListDocumentReportRequest();
	GenerateShipmentListDocumentReportRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GenerateShipmentListDocumentReportRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор кампании.
	 */
	long long getCampaignId();

	/*! \brief Set Идентификатор кампании.
	 */
	void setCampaignId(long long  campaignId);
	/*! \brief Get Идентификатор отгрузки.
	 */
	long long getShipmentId();

	/*! \brief Set Идентификатор отгрузки.
	 */
	void setShipmentId(long long  shipmentId);
	/*! \brief Get Фильтр по идентификаторам заказа в отгрузке.
	 */
	std::list<long long> getOrderIds();

	/*! \brief Set Фильтр по идентификаторам заказа в отгрузке.
	 */
	void setOrderIds(std::list <long long> orderIds);

private:
	long long campaignId;
	long long shipmentId;
	std::list <long long>orderIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GenerateShipmentListDocumentReportRequest_H_ */
