
/*
 * UpdateOfferContentResponse.h
 *
 * Описывает проблемы, которые появились при сохранении товара.
 */

#ifndef TINY_CPP_CLIENT_UpdateOfferContentResponse_H_
#define TINY_CPP_CLIENT_UpdateOfferContentResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "UpdateOfferContentResultDTO.h"
#include <list>

namespace Tiny {


/*! \brief Описывает проблемы, которые появились при сохранении товара.
 *
 *  \ingroup Models
 *
 */

class UpdateOfferContentResponse{
public:

    /*! \brief Constructor.
	 */
    UpdateOfferContentResponse();
    UpdateOfferContentResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateOfferContentResponse();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get 
	 */
	ApiResponseStatusType getStatus();

	/*! \brief Set 
	 */
	void setStatus(ApiResponseStatusType  status);
	/*! \brief Get Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
	 */
	std::list<UpdateOfferContentResultDTO> getResults();

	/*! \brief Set Ошибки и предупреждения, которые появились при обработке переданных значений. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
	 */
	void setResults(std::list <UpdateOfferContentResultDTO> results);


    private:
    ApiResponseStatusType status;
    std::list<UpdateOfferContentResultDTO> results;
};
}

#endif /* TINY_CPP_CLIENT_UpdateOfferContentResponse_H_ */
