/*
 * OutletWorkingScheduleDTO.h
 *
 * Список режимов работы точки продаж. 
 */

#ifndef _OutletWorkingScheduleDTO_H_
#define _OutletWorkingScheduleDTO_H_


#include <string>
#include "OutletWorkingScheduleItemDTO.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Список режимов работы точки продаж. 
 *
 *  \ingroup Models
 *
 */

class OutletWorkingScheduleDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OutletWorkingScheduleDTO();
	OutletWorkingScheduleDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OutletWorkingScheduleDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Признак, работает ли точка продаж в дни государственных праздников.  Возможные значения:  * `false` — точка продаж не работает в дни государственных праздников. * `true` — точка продаж работает в дни государственных праздников. 
	 */
	bool getWorkInHoliday();

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
	bool workInHoliday;
	std::list <OutletWorkingScheduleItemDTO>scheduleItems;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OutletWorkingScheduleDTO_H_ */
