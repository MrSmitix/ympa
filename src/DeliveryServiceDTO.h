/*
 * DeliveryServiceDTO.h
 *
 * Служба доставки.
 */

#ifndef _DeliveryServiceDTO_H_
#define _DeliveryServiceDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Служба доставки.
 *
 *  \ingroup Models
 *
 */

class DeliveryServiceDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	DeliveryServiceDTO();
	DeliveryServiceDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DeliveryServiceDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Идентификатор службы доставки.
	 */
	long long getId();

	/*! \brief Set Идентификатор службы доставки.
	 */
	void setId(long long  id);
	/*! \brief Get Наименование службы доставки.
	 */
	std::string getName();

	/*! \brief Set Наименование службы доставки.
	 */
	void setName(std::string  name);

private:
	long long id;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DeliveryServiceDTO_H_ */
