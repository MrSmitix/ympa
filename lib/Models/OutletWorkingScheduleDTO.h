
/*
 * OutletWorkingScheduleDTO.h
 *
 * Список режимов работы точки продаж. 
 */

#ifndef TINY_CPP_CLIENT_OutletWorkingScheduleDTO_H_
#define TINY_CPP_CLIENT_OutletWorkingScheduleDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OutletWorkingScheduleItemDTO.h"
#include <list>

namespace Tiny {


/*! \brief Список режимов работы точки продаж. 
 *
 *  \ingroup Models
 *
 */

class OutletWorkingScheduleDTO{
public:

    /*! \brief Constructor.
	 */
    OutletWorkingScheduleDTO();
    OutletWorkingScheduleDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OutletWorkingScheduleDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * `false` — точка продаж не работает в дни государственных праздников. * `true` — точка продаж работает в дни государственных праздников. 
	 */
	bool isWorkInHoliday();

	/*! \brief Set Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * `false` — точка продаж не работает в дни государственных праздников. * `true` — точка продаж работает в дни государственных праздников. 
	 */
	void setWorkInHoliday(bool  workInHoliday);
	/*! \brief Get Список расписаний работы точки продаж. 
	 */
	std::list<OutletWorkingScheduleItemDTO> getScheduleItems();

	/*! \brief Set Список расписаний работы точки продаж. 
	 */
	void setScheduleItems(std::list <OutletWorkingScheduleItemDTO> scheduleItems);


    private:
    bool workInHoliday{};
    std::list<OutletWorkingScheduleItemDTO> scheduleItems;
};
}

#endif /* TINY_CPP_CLIENT_OutletWorkingScheduleDTO_H_ */
