
/*
 * CampaignSettingsScheduleSourceType.h
 *
 * Источник информации о расписании работы службы доставки. Возможные значения: * &#x60;WEB&#x60; — информация получена из настроек кабинета продавца на Маркете. * &#x60;YML&#x60; — информация получена из прайс-листа магазина. 
 */

#ifndef TINY_CPP_CLIENT_CampaignSettingsScheduleSourceType_H_
#define TINY_CPP_CLIENT_CampaignSettingsScheduleSourceType_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Источник информации о расписании работы службы доставки. Возможные значения: * `WEB` — информация получена из настроек кабинета продавца на Маркете. * `YML` — информация получена из прайс-листа магазина. 
 *
 *  \ingroup Models
 *
 */

class CampaignSettingsScheduleSourceType{
public:

    /*! \brief Constructor.
	 */
    CampaignSettingsScheduleSourceType();
    CampaignSettingsScheduleSourceType(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignSettingsScheduleSourceType();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);



    private:
};
}

#endif /* TINY_CPP_CLIENT_CampaignSettingsScheduleSourceType_H_ */
