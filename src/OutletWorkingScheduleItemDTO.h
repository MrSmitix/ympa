/*
 * OutletWorkingScheduleItemDTO.h
 *
 * Расписание работы точки продаж.
 */

#ifndef _OutletWorkingScheduleItemDTO_H_
#define _OutletWorkingScheduleItemDTO_H_


#include <string>
#include "DayOfWeekType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Расписание работы точки продаж.
 *
 *  \ingroup Models
 *
 */

class OutletWorkingScheduleItemDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OutletWorkingScheduleItemDTO();
	OutletWorkingScheduleItemDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OutletWorkingScheduleItemDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	DayOfWeekType getStartDay();

	/*! \brief Set 
	 */
	void setStartDay(DayOfWeekType  startDay);
	/*! \brief Get 
	 */
	DayOfWeekType getEndDay();

	/*! \brief Set 
	 */
	void setEndDay(DayOfWeekType  endDay);
	/*! \brief Get Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. 
	 */
	std::string getStartTime();

	/*! \brief Set Точка продаж работает c указанного часа.  Формат: `ЧЧ:ММ`. 
	 */
	void setStartTime(std::string  startTime);
	/*! \brief Get Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. 
	 */
	std::string getEndTime();

	/*! \brief Set Точка продаж работает до указанного часа.  Формат: `ЧЧ:ММ`. 
	 */
	void setEndTime(std::string  endTime);

private:
	DayOfWeekType startDay;
	DayOfWeekType endDay;
	std::string startTime;
	std::string endTime;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OutletWorkingScheduleItemDTO_H_ */
