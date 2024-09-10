/*
 * TurnoverDTO.h
 *
 * Информация об оборачиваемости товара.
 */

#ifndef _TurnoverDTO_H_
#define _TurnoverDTO_H_


#include <string>
#include "TurnoverType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация об оборачиваемости товара.
 *
 *  \ingroup Models
 *
 */

class TurnoverDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	TurnoverDTO();
	TurnoverDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~TurnoverDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	TurnoverType getTurnover();

	/*! \brief Set 
	 */
	void setTurnover(TurnoverType  turnover);
	/*! \brief Get Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)
	 */
	double getTurnoverDays();

	/*! \brief Set Значение в днях. [Что это за число?](https://yandex.ru/support/marketplace/analytics/turnover.html)
	 */
	void setTurnoverDays(double  turnoverDays);

private:
	TurnoverType turnover;
	double turnoverDays;
	void __init();
	void __cleanup();

};
}
}

#endif /* _TurnoverDTO_H_ */
