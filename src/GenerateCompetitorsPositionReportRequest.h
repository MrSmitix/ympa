/*
 * GenerateCompetitorsPositionReportRequest.h
 *
 * Данные, необходимые для генерации отчета.
 */

#ifndef _GenerateCompetitorsPositionReportRequest_H_
#define _GenerateCompetitorsPositionReportRequest_H_


#include <string>
#include "Date.h"
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

class GenerateCompetitorsPositionReportRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GenerateCompetitorsPositionReportRequest();
	GenerateCompetitorsPositionReportRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GenerateCompetitorsPositionReportRequest();

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
	/*! \brief Get Идентификатор категории.
	 */
	long long getCategoryId();

	/*! \brief Set Идентификатор категории.
	 */
	void setCategoryId(long long  categoryId);
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

private:
	long long businessId;
	long long categoryId;
	Date dateFrom;
	Date dateTo;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GenerateCompetitorsPositionReportRequest_H_ */
