/*
 * OfferErrorDTO.h
 *
 * Сообщение об ошибке, связанной с размещением товара.
 */

#ifndef _OfferErrorDTO_H_
#define _OfferErrorDTO_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Сообщение об ошибке, связанной с размещением товара.
 *
 *  \ingroup Models
 *
 */

class OfferErrorDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferErrorDTO();
	OfferErrorDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferErrorDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get Тип ошибки.
	 */
	std::string getMessage();

	/*! \brief Set Тип ошибки.
	 */
	void setMessage(std::string  message);
	/*! \brief Get Пояснение.
	 */
	std::string getComment();

	/*! \brief Set Пояснение.
	 */
	void setComment(std::string  comment);

private:
	std::string message;
	std::string comment;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OfferErrorDTO_H_ */
