
/*
 * GenerateUnitedOrdersRequest.h
 *
 * Данные, необходимые для генерации отчета. 
 */

#ifndef TINY_CPP_CLIENT_GenerateUnitedOrdersRequest_H_
#define TINY_CPP_CLIENT_GenerateUnitedOrdersRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Date.h"
#include <list>

namespace Tiny {


/*! \brief Данные, необходимые для генерации отчета. 
 *
 *  \ingroup Models
 *
 */

class GenerateUnitedOrdersRequest{
public:

    /*! \brief Constructor.
	 */
    GenerateUnitedOrdersRequest();
    GenerateUnitedOrdersRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GenerateUnitedOrdersRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Идентификатор бизнеса.
	 */
	long getBusinessId();

	/*! \brief Set Идентификатор бизнеса.
	 */
	void setBusinessId(long  businessId);
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
	std::list<long> getCampaignIds();

	/*! \brief Set Список магазинов, которые нужны в отчете.
	 */
	void setCampaignIds(std::list <long> campaignIds);
	/*! \brief Get Идентификатор акции, товары из которой нужны в отчете.
	 */
	std::string getPromoId();

	/*! \brief Set Идентификатор акции, товары из которой нужны в отчете.
	 */
	void setPromoId(std::string  promoId);


    private:
    long businessId{};
    Date dateFrom;
    Date dateTo;
    std::list<long> campaignIds;
    std::string promoId{};
};
}

#endif /* TINY_CPP_CLIENT_GenerateUnitedOrdersRequest_H_ */
