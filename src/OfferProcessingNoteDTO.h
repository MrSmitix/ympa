/*
 * OfferProcessingNoteDTO.h
 *
 * Причины, по которым товар не прошел модерацию.
 */

#ifndef _OfferProcessingNoteDTO_H_
#define _OfferProcessingNoteDTO_H_


#include <string>
#include "OfferProcessingNoteType.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Причины, по которым товар не прошел модерацию.
 *
 *  \ingroup Models
 *
 */

class OfferProcessingNoteDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferProcessingNoteDTO();
	OfferProcessingNoteDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferProcessingNoteDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	OfferProcessingNoteType getType();

	/*! \brief Set 
	 */
	void setType(OfferProcessingNoteType  type);
	/*! \brief Get Дополнительная информация о причине отклонения товара. 
	 */
	std::string getPayload();

	/*! \brief Set Дополнительная информация о причине отклонения товара. 
	 */
	void setPayload(std::string  payload);

private:
	OfferProcessingNoteType type;
	std::string payload;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OfferProcessingNoteDTO_H_ */
