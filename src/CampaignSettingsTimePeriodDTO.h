/*
 * CampaignSettingsTimePeriodDTO.h
 *
 * Период, за который рассчитывается итоговый список нерабочих дней службы доставки.
 */

#ifndef _CampaignSettingsTimePeriodDTO_H_
#define _CampaignSettingsTimePeriodDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Период, за который рассчитывается итоговый список нерабочих дней службы доставки.
 *
 *  \ingroup Models
 *
 */

class CampaignSettingsTimePeriodDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignSettingsTimePeriodDTO();
	CampaignSettingsTimePeriodDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignSettingsTimePeriodDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Формат даты: `ДД-ММ-ГГГГ`. 
	 */
	std::string getFromDate();

	/*! \brief Set Формат даты: `ДД-ММ-ГГГГ`. 
	 */
	void setFromDate(std::string  fromDate);
	/*! \brief Get Формат даты: `ДД-ММ-ГГГГ`. 
	 */
	std::string getToDate();

	/*! \brief Set Формат даты: `ДД-ММ-ГГГГ`. 
	 */
	void setToDate(std::string  toDate);

private:
	std::string fromDate;
	std::string toDate;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignSettingsTimePeriodDTO_H_ */
