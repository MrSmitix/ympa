/*
 * OrderParcelBoxDTO.h
 *
 * Информация о грузоместе.
 */

#ifndef _OrderParcelBoxDTO_H_
#define _OrderParcelBoxDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о грузоместе.
 *
 *  \ingroup Models
 *
 */

class OrderParcelBoxDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderParcelBoxDTO();
	OrderParcelBoxDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderParcelBoxDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор грузоместа.
	 */
	long long getId();

	/*! \brief Set Идентификатор грузоместа.
	 */
	void setId(long long  id);
	/*! \brief Get Идентификатор грузового места в информационной системе магазина.
	 */
	std::string getFulfilmentId();

	/*! \brief Set Идентификатор грузового места в информационной системе магазина.
	 */
	void setFulfilmentId(std::string  fulfilmentId);

private:
	long long id;
	std::string fulfilmentId;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderParcelBoxDTO_H_ */
