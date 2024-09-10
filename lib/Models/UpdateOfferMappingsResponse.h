
/*
 * UpdateOfferMappingsResponse.h
 *
 * Описывает проблемы, возникшие при сохранении товара.
 */

#ifndef TINY_CPP_CLIENT_UpdateOfferMappingsResponse_H_
#define TINY_CPP_CLIENT_UpdateOfferMappingsResponse_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "ApiResponseStatusType.h"
#include "UpdateOfferMappingResultDTO.h"
#include <list>

namespace Tiny {


/*! \brief Описывает проблемы, возникшие при сохранении товара.
 *
 *  \ingroup Models
 *
 */

class UpdateOfferMappingsResponse{
public:

    /*! \brief Constructor.
	 */
    UpdateOfferMappingsResponse();
    UpdateOfferMappingsResponse(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~UpdateOfferMappingsResponse();


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
	/*! \brief Get Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
	 */
	std::list<UpdateOfferMappingResultDTO> getResults();

	/*! \brief Set Ошибки и предупреждения, которые появились при обработке списка характеристик. Каждый элемент списка соответствует одному товару.  Если ошибок и предупреждений нет, поле не передается. 
	 */
	void setResults(std::list <UpdateOfferMappingResultDTO> results);


    private:
    ApiResponseStatusType status;
    std::list<UpdateOfferMappingResultDTO> results;
};
}

#endif /* TINY_CPP_CLIENT_UpdateOfferMappingsResponse_H_ */
