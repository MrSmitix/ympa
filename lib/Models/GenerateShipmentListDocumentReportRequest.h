
/*
 * GenerateShipmentListDocumentReportRequest.h
 *
 * Данные, необходимые для генерации документа. 
 */

#ifndef TINY_CPP_CLIENT_GenerateShipmentListDocumentReportRequest_H_
#define TINY_CPP_CLIENT_GenerateShipmentListDocumentReportRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include <list>

namespace Tiny {


/*! \brief Данные, необходимые для генерации документа. 
 *
 *  \ingroup Models
 *
 */

class GenerateShipmentListDocumentReportRequest{
public:

    /*! \brief Constructor.
	 */
    GenerateShipmentListDocumentReportRequest();
    GenerateShipmentListDocumentReportRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GenerateShipmentListDocumentReportRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор кампании.
	 */
	long getCampaignId();

	/*! \brief Set Идентификатор кампании.
	 */
	void setCampaignId(long  campaignId);
	/*! \brief Get Идентификатор отгрузки.
	 */
	long getShipmentId();

	/*! \brief Set Идентификатор отгрузки.
	 */
	void setShipmentId(long  shipmentId);
	/*! \brief Get Фильтр по идентификаторам заказа в отгрузке.
	 */
	std::list<long> getOrderIds();

	/*! \brief Set Фильтр по идентификаторам заказа в отгрузке.
	 */
	void setOrderIds(std::list <long> orderIds);


    private:
    long campaignId{};
    long shipmentId{};
    std::list<long> orderIds;
};
}

#endif /* TINY_CPP_CLIENT_GenerateShipmentListDocumentReportRequest_H_ */
