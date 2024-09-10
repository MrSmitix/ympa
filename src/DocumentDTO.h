/*
 * DocumentDTO.h
 *
 * Информация о документе.
 */

#ifndef _DocumentDTO_H_
#define _DocumentDTO_H_


#include <string>
#include "Date.h"
#include "OrderDocumentStatusType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о документе.
 *
 *  \ingroup Models
 *
 */

class DocumentDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	DocumentDTO();
	DocumentDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~DocumentDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	OrderDocumentStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(OrderDocumentStatusType  status);
	/*! \brief Get Номер документа.
	 */
	std::string getNumber();

	/*! \brief Set Номер документа.
	 */
	void setNumber(std::string  number);
	/*! \brief Get Дата создания документа.
	 */
	Date getDate();

	/*! \brief Set Дата создания документа.
	 */
	void setDate(Date  date);

private:
	OrderDocumentStatusType status;
	std::string number;
	Date date;
	void __init();
	void __cleanup();

};
}
}

#endif /* _DocumentDTO_H_ */
