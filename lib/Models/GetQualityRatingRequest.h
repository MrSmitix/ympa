
/*
 * GetQualityRatingRequest.h
 *
 * Запрос информации по индексу качества.
 */

#ifndef TINY_CPP_CLIENT_GetQualityRatingRequest_H_
#define TINY_CPP_CLIENT_GetQualityRatingRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Date.h"
#include "Set.h"

namespace Tiny {


/*! \brief Запрос информации по индексу качества.
 *
 *  \ingroup Models
 *
 */

class GetQualityRatingRequest{
public:

    /*! \brief Constructor.
	 */
    GetQualityRatingRequest();
    GetQualityRatingRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~GetQualityRatingRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Начало периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть раньше 30 дней от текущей даты. 
	 */
	Date getDateFrom();

	/*! \brief Set Начало периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть раньше 30 дней от текущей даты. 
	 */
	void setDateFrom(Date  dateFrom);
	/*! \brief Get Конец периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть позже текущей даты. 
	 */
	Date getDateTo();

	/*! \brief Set Конец периода.  Формат даты: `ГГГГ‑ММ‑ДД`.  Не может быть позже текущей даты. 
	 */
	void setDateTo(Date  dateTo);
	/*! \brief Get Список идентификаторов магазинов.
	 */
	Set<long> getCampaignIds();

	/*! \brief Set Список идентификаторов магазинов.
	 */
	void setCampaignIds(Set <long> campaignIds);


    private:
    Date dateFrom;
    Date dateTo;
    Set<long> campaignIds;
};
}

#endif /* TINY_CPP_CLIENT_GetQualityRatingRequest_H_ */
