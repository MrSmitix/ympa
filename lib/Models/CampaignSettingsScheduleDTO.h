
/*
 * CampaignSettingsScheduleDTO.h
 *
 * Расписание работы службы доставки в своем регионе.
 */

#ifndef TINY_CPP_CLIENT_CampaignSettingsScheduleDTO_H_
#define TINY_CPP_CLIENT_CampaignSettingsScheduleDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "CampaignSettingsTimePeriodDTO.h"
#include <list>

namespace Tiny {


/*! \brief Расписание работы службы доставки в своем регионе.
 *
 *  \ingroup Models
 *
 */

class CampaignSettingsScheduleDTO{
public:

    /*! \brief Constructor.
	 */
    CampaignSettingsScheduleDTO();
    CampaignSettingsScheduleDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~CampaignSettingsScheduleDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни. 
	 */
	bool isAvailableOnHolidays();

	/*! \brief Set Признак работы службы доставки в государственные праздники. Возможные значения. * `false` — служба доставки не работает в праздничные дни. * `true` — служба доставки работает в праздничные дни. 
	 */
	void setAvailableOnHolidays(bool  availableOnHolidays);
	/*! \brief Get Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.
	 */
	std::list<std::string> getCustomHolidays();

	/*! \brief Set Список дней, в которые служба доставки не работает. Дни магазин указал в кабинете продавца на Маркете.
	 */
	void setCustomHolidays(std::list <std::string> customHolidays);
	/*! \brief Get Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.
	 */
	std::list<std::string> getCustomWorkingDays();

	/*! \brief Set Список выходных и праздничных дней, в которые служба доставки работает. Дни магазин указал в кабинете продавца на Маркете.
	 */
	void setCustomWorkingDays(std::list <std::string> customWorkingDays);
	/*! \brief Get 
	 */
	CampaignSettingsTimePeriodDTO getPeriod();

	/*! \brief Set 
	 */
	void setPeriod(CampaignSettingsTimePeriodDTO  period);
	/*! \brief Get Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.
	 */
	std::list<std::string> getTotalHolidays();

	/*! \brief Set Итоговый список нерабочих дней службы доставки. Список рассчитывается с учетом выходных, нерабочих дней и государственных праздников. Информацию по ним магазин указывает в кабинете продавца на Маркете.
	 */
	void setTotalHolidays(std::list <std::string> totalHolidays);
	/*! \brief Get Список выходных дней недели и государственных праздников.
	 */
	std::list<int> getWeeklyHolidays();

	/*! \brief Set Список выходных дней недели и государственных праздников.
	 */
	void setWeeklyHolidays(std::list <int> weeklyHolidays);


    private:
    bool availableOnHolidays{};
    std::list<std::string> customHolidays;
    std::list<std::string> customWorkingDays;
    CampaignSettingsTimePeriodDTO period;
    std::list<std::string> totalHolidays;
    std::list<int> weeklyHolidays;
};
}

#endif /* TINY_CPP_CLIENT_CampaignSettingsScheduleDTO_H_ */
