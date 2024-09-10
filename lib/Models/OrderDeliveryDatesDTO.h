
/*
 * OrderDeliveryDatesDTO.h
 *
 * Диапазон дат доставки.
 */

#ifndef TINY_CPP_CLIENT_OrderDeliveryDatesDTO_H_
#define TINY_CPP_CLIENT_OrderDeliveryDatesDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"

namespace Tiny {


/*! \brief Диапазон дат доставки.
 *
 *  \ingroup Models
 *
 */

class OrderDeliveryDatesDTO{
public:

    /*! \brief Constructor.
	 */
    OrderDeliveryDatesDTO();
    OrderDeliveryDatesDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrderDeliveryDatesDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string fromDate{};
    std::string toDate{};
    std::string fromTime{};
    std::string toTime{};
    std::string realDeliveryDate{};
};
}

#endif /* TINY_CPP_CLIENT_OrderDeliveryDatesDTO_H_ */
