
/*
 * GenerateShelfsStatisticsRequest.h
 *
 * Данные, необходимые для генерации отчета. 
 */

#ifndef TINY_CPP_CLIENT_GenerateShelfsStatisticsRequest_H_
#define TINY_CPP_CLIENT_GenerateShelfsStatisticsRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Date.h"
#include "ShelfsStatisticsAttributionType.h"

namespace Tiny {


/*! \brief Данные, необходимые для генерации отчета. 
 *
 *  \ingroup Models
 *
 */

class GenerateShelfsStatisticsRequest{
public:

    /*! \brief Constructor.
	 */
    GenerateShelfsStatisticsRequest();
    GenerateShelfsStatisticsRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GenerateShelfsStatisticsRequest();


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
	/*! \brief Get 
	 */
	ShelfsStatisticsAttributionType getAttributionType();

	/*! \brief Set 
	 */
	void setAttributionType(ShelfsStatisticsAttributionType  attributionType);


    private:
    long businessId{};
    Date dateFrom;
    Date dateTo;
    ShelfsStatisticsAttributionType attributionType;
};
}

#endif /* TINY_CPP_CLIENT_GenerateShelfsStatisticsRequest_H_ */
