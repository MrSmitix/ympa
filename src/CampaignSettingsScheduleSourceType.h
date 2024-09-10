/*
 * CampaignSettingsScheduleSourceType.h
 *
 * Источник информации о расписании работы службы доставки. Возможные значения: * &#x60;WEB&#x60; — информация получена из настроек кабинета продавца на Маркете. * &#x60;YML&#x60; — информация получена из прайс-листа магазина. 
 */

#ifndef _CampaignSettingsScheduleSourceType_H_
#define _CampaignSettingsScheduleSourceType_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Источник информации о расписании работы службы доставки. Возможные значения: * `WEB` — информация получена из настроек кабинета продавца на Маркете. * `YML` — информация получена из прайс-листа магазина. 
 *
 *  \ingroup Models
 *
 */

class CampaignSettingsScheduleSourceType : public Object {
public:
	/*! \brief Constructor.
	 */
	CampaignSettingsScheduleSourceType();
	CampaignSettingsScheduleSourceType(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CampaignSettingsScheduleSourceType();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _CampaignSettingsScheduleSourceType_H_ */
