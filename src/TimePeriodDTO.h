/*
 * TimePeriodDTO.h
 *
 * Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
 */

#ifndef _TimePeriodDTO_H_
#define _TimePeriodDTO_H_


#include <string>
#include "TimeUnitType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Временной отрезок с комментарием. Требования к содержанию комментария зависят от контекста использования параметра и указаны в описании поля, которое его содержит.
 *
 *  \ingroup Models
 *
 */

class TimePeriodDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	TimePeriodDTO();
	TimePeriodDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TimePeriodDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Продолжительность в указанных единицах.
	 */
	int getTimePeriod();

	/*! \brief Set Продолжительность в указанных единицах.
	 */
	void setTimePeriod(int  timePeriod);
	/*! \brief Get 
	 */
	TimeUnitType getTimeUnit();

	/*! \brief Set 
	 */
	void setTimeUnit(TimeUnitType  timeUnit);
	/*! \brief Get Комментарий.
	 */
	std::string getComment();

	/*! \brief Set Комментарий.
	 */
	void setComment(std::string  comment);

private:
	int timePeriod;
	TimeUnitType timeUnit;
	std::string comment;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TimePeriodDTO_H_ */
