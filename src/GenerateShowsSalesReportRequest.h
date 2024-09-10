/*
 * GenerateShowsSalesReportRequest.h
 *
 * Данные, необходимые для генерации отчета.
 */

#ifndef _GenerateShowsSalesReportRequest_H_
#define _GenerateShowsSalesReportRequest_H_


#include <string>
#include "Date.h"
#include "ShowsSalesGroupingType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Данные, необходимые для генерации отчета.
 *
 *  \ingroup Models
 *
 */

class GenerateShowsSalesReportRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GenerateShowsSalesReportRequest();
	GenerateShowsSalesReportRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GenerateShowsSalesReportRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
	 */
	long long getBusinessId();

	/*! \brief Set Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
	 */
	void setBusinessId(long long  businessId);
	/*! \brief Get Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
	 */
	long long getCampaignId();

	/*! \brief Set Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
	 */
	void setCampaignId(long long  campaignId);
	/*! \brief Get Начало периода, включительно.
	 */
	Date getDateFrom();

	/*! \brief Set Начало периода, включительно.
	 */
	void setDateFrom(Date  dateFrom);
	/*! \brief Get Конец периода, включительно.
	 */
	Date getDateTo();

	/*! \brief Set Конец периода, включительно.
	 */
	void setDateTo(Date  dateTo);
	/*! \brief Get 
	 */
	ShowsSalesGroupingType getGrouping();

	/*! \brief Set 
	 */
	void setGrouping(ShowsSalesGroupingType  grouping);

private:
	long long businessId;
	long long campaignId;
	Date dateFrom;
	Date dateTo;
	ShowsSalesGroupingType grouping;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GenerateShowsSalesReportRequest_H_ */
