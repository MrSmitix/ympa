/*
 * GenerateShelfsStatisticsRequest.h
 *
 * Данные, необходимые для генерации отчета. 
 */

#ifndef _GenerateShelfsStatisticsRequest_H_
#define _GenerateShelfsStatisticsRequest_H_


#include <string>
#include "Date.h"
#include "ShelfsStatisticsAttributionType.h"
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

class GenerateShelfsStatisticsRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GenerateShelfsStatisticsRequest();
	GenerateShelfsStatisticsRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GenerateShelfsStatisticsRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор бизнеса.
	 */
	long long getBusinessId();

	/*! \brief Set Идентификатор бизнеса.
	 */
	void setBusinessId(long long  businessId);
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
	ShelfsStatisticsAttributionType getAttributionType();

	/*! \brief Set 
	 */
	void setAttributionType(ShelfsStatisticsAttributionType  attributionType);

private:
	long long businessId;
	Date dateFrom;
	Date dateTo;
	ShelfsStatisticsAttributionType attributionType;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GenerateShelfsStatisticsRequest_H_ */
