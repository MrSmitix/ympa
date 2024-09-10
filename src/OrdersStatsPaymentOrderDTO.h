/*
 * OrdersStatsPaymentOrderDTO.h
 *
 * Информация о платежном получении.
 */

#ifndef _OrdersStatsPaymentOrderDTO_H_
#define _OrdersStatsPaymentOrderDTO_H_


#include <string>
#include "Date.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о платежном получении.
 *
 *  \ingroup Models
 *
 */

class OrdersStatsPaymentOrderDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrdersStatsPaymentOrderDTO();
	OrdersStatsPaymentOrderDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrdersStatsPaymentOrderDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

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
	std::string id;
	Date date;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrdersStatsPaymentOrderDTO_H_ */
