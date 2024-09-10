/*
 * OfferProcessingStateDTO.h
 *
 * Информация о статусе публикации товара на Маркете.
 */

#ifndef _OfferProcessingStateDTO_H_
#define _OfferProcessingStateDTO_H_


#include <string>
#include "OfferProcessingNoteDTO.h"
#include "OfferProcessingStatusType.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Информация о статусе публикации товара на Маркете.
 *
 *  \ingroup Models
 *
 */

class OfferProcessingStateDTO : public Object {
public:
	/*! \brief Constructor.
	 */
	OfferProcessingStateDTO();
	OfferProcessingStateDTO(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OfferProcessingStateDTO();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	OfferProcessingStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(OfferProcessingStatusType  status);
	/*! \brief Get Причины, по которым товар не прошел модерацию.
	 */
	std::list<OfferProcessingNoteDTO> getNotes();

	/*! \brief Set Причины, по которым товар не прошел модерацию.
	 */
	void setNotes(std::list <OfferProcessingNoteDTO> notes);

private:
	OfferProcessingStatusType status;
	std::list <OfferProcessingNoteDTO>notes;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OfferProcessingStateDTO_H_ */
