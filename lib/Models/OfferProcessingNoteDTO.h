
/*
 * OfferProcessingNoteDTO.h
 *
 * Причины, по которым товар не прошел модерацию.
 */

#ifndef TINY_CPP_CLIENT_OfferProcessingNoteDTO_H_
#define TINY_CPP_CLIENT_OfferProcessingNoteDTO_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "OfferProcessingNoteType.h"

namespace Tiny {


/*! \brief Причины, по которым товар не прошел модерацию.
 *
 *  \ingroup Models
 *
 */

class OfferProcessingNoteDTO{
public:

    /*! \brief Constructor.
	 */
    OfferProcessingNoteDTO();
    OfferProcessingNoteDTO(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~OfferProcessingNoteDTO();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

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
    std::string payload{};
};
}

#endif /* TINY_CPP_CLIENT_OfferProcessingNoteDTO_H_ */
