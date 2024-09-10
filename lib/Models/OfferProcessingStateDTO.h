
/*
 * OfferProcessingStateDTO.h
 *
 * Информация о статусе публикации товара на Маркете.
 */

#ifndef TINY_CPP_CLIENT_OfferProcessingStateDTO_H_
#define TINY_CPP_CLIENT_OfferProcessingStateDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OfferProcessingNoteDTO.h"
#include "OfferProcessingStatusType.h"
#include <list>

namespace Tiny {


/*! \brief Информация о статусе публикации товара на Маркете.
 *
 *  \ingroup Models
 *
 */

class OfferProcessingStateDTO{
public:

    /*! \brief Constructor.
	 */
    OfferProcessingStateDTO();
    OfferProcessingStateDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferProcessingStateDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::list<OfferProcessingNoteDTO> notes;
};
}

#endif /* TINY_CPP_CLIENT_OfferProcessingStateDTO_H_ */
