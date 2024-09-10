/*
 * GenerateGoodsRealizationReportRequest.h
 *
 * Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
 */

#ifndef _GenerateGoodsRealizationReportRequest_H_
#define _GenerateGoodsRealizationReportRequest_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Данные, необходимые для генерации отчета: идентификатор магазина и период, за который нужен отчет. 
 *
 *  \ingroup Models
 *
 */

class GenerateGoodsRealizationReportRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GenerateGoodsRealizationReportRequest();
	GenerateGoodsRealizationReportRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GenerateGoodsRealizationReportRequest();

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
	/*! \brief Get Год.
	 */
	int getYear();

	/*! \brief Set Год.
	 */
	void setYear(int  year);
	/*! \brief Get Номер месяца.
	 */
	int getMonth();

	/*! \brief Set Номер месяца.
	 */
	void setMonth(int  month);

private:
	long long campaignId;
	int year;
	int month;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GenerateGoodsRealizationReportRequest_H_ */
