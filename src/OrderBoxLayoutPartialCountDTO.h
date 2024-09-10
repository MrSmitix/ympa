/*
 * OrderBoxLayoutPartialCountDTO.h
 *
 * Информация о части товара в коробке.
 */

#ifndef _OrderBoxLayoutPartialCountDTO_H_
#define _OrderBoxLayoutPartialCountDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о части товара в коробке.
 *
 *  \ingroup Models
 *
 */

class OrderBoxLayoutPartialCountDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderBoxLayoutPartialCountDTO();
	OrderBoxLayoutPartialCountDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderBoxLayoutPartialCountDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Номер части, начиная с 1.
	 */
	int getCurrent();

	/*! \brief Set Номер части, начиная с 1.
	 */
	void setCurrent(int  current);
	/*! \brief Get На сколько всего частей разделен товар.
	 */
	int getTotal();

	/*! \brief Set На сколько всего частей разделен товар.
	 */
	void setTotal(int  total);

private:
	int current;
	int total;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderBoxLayoutPartialCountDTO_H_ */
