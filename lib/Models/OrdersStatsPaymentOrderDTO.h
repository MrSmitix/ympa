
/*
 * OrdersStatsPaymentOrderDTO.h
 *
 * Информация о платежном получении.
 */

#ifndef TINY_CPP_CLIENT_OrdersStatsPaymentOrderDTO_H_
#define TINY_CPP_CLIENT_OrdersStatsPaymentOrderDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "Date.h"

namespace Tiny {


/*! \brief Информация о платежном получении.
 *
 *  \ingroup Models
 *
 */

class OrdersStatsPaymentOrderDTO{
public:

    /*! \brief Constructor.
	 */
    OrdersStatsPaymentOrderDTO();
    OrdersStatsPaymentOrderDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OrdersStatsPaymentOrderDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Номер платежного поручения.
	 */
	std::string getId();

	/*! \brief Set Номер платежного поручения.
	 */
	void setId(std::string  id);
	/*! \brief Get Дата платежного поручения.  Формат даты: `ГГГГ‑ММ‑ДД`. 
	 */
	Date getDate();

	/*! \brief Set Дата платежного поручения.  Формат даты: `ГГГГ‑ММ‑ДД`. 
	 */
	void setDate(Date  date);


    private:
    std::string id{};
    Date date;
};
}

#endif /* TINY_CPP_CLIENT_OrdersStatsPaymentOrderDTO_H_ */
