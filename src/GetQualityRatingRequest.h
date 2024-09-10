/*
 * GetQualityRatingRequest.h
 *
 * Запрос информации по индексу качества.
 */

#ifndef _GetQualityRatingRequest_H_
#define _GetQualityRatingRequest_H_


#include <string>
#include "Date.h"
#include "Set.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Запрос информации по индексу качества.
 *
 *  \ingroup Models
 *
 */

class GetQualityRatingRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	GetQualityRatingRequest();
	GetQualityRatingRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GetQualityRatingRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	Set<long long> getCampaignIds();

	/*! \brief Set Список идентификаторов магазинов.
	 */
	void setCampaignIds(Set <long long> campaignIds);

private:
	Date dateFrom;
	Date dateTo;
	Set <long long>campaignIds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GetQualityRatingRequest_H_ */
