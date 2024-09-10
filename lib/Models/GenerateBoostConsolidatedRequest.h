
/*
 * GenerateBoostConsolidatedRequest.h
 *
 * Данные, необходимые для генерации отчета. 
 */

#ifndef TINY_CPP_CLIENT_GenerateBoostConsolidatedRequest_H_
#define TINY_CPP_CLIENT_GenerateBoostConsolidatedRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Date.h"

namespace Tiny {


/*! \brief Данные, необходимые для генерации отчета. 
 *
 *  \ingroup Models
 *
 */

class GenerateBoostConsolidatedRequest{
public:

    /*! \brief Constructor.
	 */
    GenerateBoostConsolidatedRequest();
    GenerateBoostConsolidatedRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GenerateBoostConsolidatedRequest();


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
	/*! \brief Get Конец периода, включительно.
	 */
	Date getDateTo();

	/*! \brief Set Конец периода, включительно.
	 */
	void setDateTo(Date  dateTo);


    private:
    long businessId{};
    Date dateFrom;
    Date dateTo;
};
}

#endif /* TINY_CPP_CLIENT_GenerateBoostConsolidatedRequest_H_ */
