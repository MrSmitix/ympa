/*
 * GenerateUnitedOrdersRequest.h
 *
 * Данные, необходимые для генерации отчета. 
 */

#ifndef _GenerateUnitedOrdersRequest_H_
#define _GenerateUnitedOrdersRequest_H_


#include <string>
#include "Date.h"
#include <list>
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

class GenerateUnitedOrdersRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GenerateUnitedOrdersRequest();
	GenerateUnitedOrdersRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GenerateUnitedOrdersRequest();

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
	/*! \brief Get Конец периода, включительно. Максимальный период — 1 год.
	 */
	Date getDateTo();

	/*! \brief Set Конец периода, включительно. Максимальный период — 1 год.
	 */
	void setDateTo(Date  dateTo);
	/*! \brief Get Список магазинов, которые нужны в отчете.
	 */
	std::list<long long> getCampaignIds();

	/*! \brief Set Список магазинов, которые нужны в отчете.
	 */
	void setCampaignIds(std::list <long long> campaignIds);
	/*! \brief Get Идентификатор акции, товары из которой нужны в отчете.
	 */
	std::string getPromoId();

	/*! \brief Set Идентификатор акции, товары из которой нужны в отчете.
	 */
	void setPromoId(std::string  promoId);

private:
	long long businessId;
	Date dateFrom;
	Date dateTo;
	std::list <long long>campaignIds;
	std::string promoId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GenerateUnitedOrdersRequest_H_ */
