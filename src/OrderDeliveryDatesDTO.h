/*
 * OrderDeliveryDatesDTO.h
 *
 * Диапазон дат доставки.
 */

#ifndef _OrderDeliveryDatesDTO_H_
#define _OrderDeliveryDatesDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Диапазон дат доставки.
 *
 *  \ingroup Models
 *
 */

class OrderDeliveryDatesDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderDeliveryDatesDTO();
	OrderDeliveryDatesDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderDeliveryDatesDTO();

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
	/*! \brief Get Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`. 
	 */
	std::string getFromTime();

	/*! \brief Set Начало интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Минимальное значение: `00:00`. 
	 */
	void setFromTime(std::string  fromTime);
	/*! \brief Get Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`. 
	 */
	std::string getToTime();

	/*! \brief Set Конец интервала времени доставки.  Передается только совместно с параметром `type=DELIVERY`.  Формат времени: 24-часовой, `ЧЧ:ММ`. В качестве минут всегда должно быть указано `00` (исключение — `23:59`).  Максимальное значение: `23:59`. 
	 */
	void setToTime(std::string  toTime);
	/*! \brief Get Формат даты: `ДД-ММ-ГГГГ`. 
	 */
	std::string getRealDeliveryDate();

	/*! \brief Set Формат даты: `ДД-ММ-ГГГГ`. 
	 */
	void setRealDeliveryDate(std::string  realDeliveryDate);

private:
	std::string fromDate;
	std::string toDate;
	std::string fromTime;
	std::string toTime;
	std::string realDeliveryDate;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderDeliveryDatesDTO_H_ */
