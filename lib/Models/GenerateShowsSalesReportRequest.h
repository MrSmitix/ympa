
/*
 * GenerateShowsSalesReportRequest.h
 *
 * Данные, необходимые для генерации отчета.
 */

#ifndef TINY_CPP_CLIENT_GenerateShowsSalesReportRequest_H_
#define TINY_CPP_CLIENT_GenerateShowsSalesReportRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Date.h"
#include "ShowsSalesGroupingType.h"

namespace Tiny {


/*! \brief Данные, необходимые для генерации отчета.
 *
 *  \ingroup Models
 *
 */

class GenerateShowsSalesReportRequest{
public:

    /*! \brief Constructor.
	 */
    GenerateShowsSalesReportRequest();
    GenerateShowsSalesReportRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GenerateShowsSalesReportRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
	 */
	long getBusinessId();

	/*! \brief Set Идентификатор бизнеса.  Указывается, если нужно составить отчет по всем магазинам бизнеса. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
	 */
	void setBusinessId(long  businessId);
	/*! \brief Get Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
	 */
	long getCampaignId();

	/*! \brief Set Идентификатор кампании.  Указывается, если нужно составить отчет по конкретному магазину. В запросе обязательно должен быть либо `businessID`, либо `campaignId`, но не оба сразу. 
	 */
	void setCampaignId(long  campaignId);
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
    long businessId{};
    long campaignId{};
    Date dateFrom;
    Date dateTo;
    ShowsSalesGroupingType grouping;
};
}

#endif /* TINY_CPP_CLIENT_GenerateShowsSalesReportRequest_H_ */
