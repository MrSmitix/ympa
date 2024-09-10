/*
 * GenerateBoostConsolidatedRequest.h
 *
 * Данные, необходимые для генерации отчета. 
 */

#ifndef _GenerateBoostConsolidatedRequest_H_
#define _GenerateBoostConsolidatedRequest_H_


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

class GenerateBoostConsolidatedRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GenerateBoostConsolidatedRequest();
	GenerateBoostConsolidatedRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GenerateBoostConsolidatedRequest();

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

private:
	long long businessId;
	Date dateFrom;
	Date dateTo;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GenerateBoostConsolidatedRequest_H_ */
