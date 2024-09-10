
/*
 * SetFeedParamsRequest.h
 *
 * Запрос на обновление изменение параметров прайс-листа.
 */

#ifndef TINY_CPP_CLIENT_SetFeedParamsRequest_H_
#define TINY_CPP_CLIENT_SetFeedParamsRequest_H_


#include <string>
#include "bourne/json.hpp"
#include "Helpers.h"
#include "FeedParameterDTO.h"
#include <list>

namespace Tiny {


/*! \brief Запрос на обновление изменение параметров прайс-листа.
 *
 *  \ingroup Models
 *
 */

class SetFeedParamsRequest{
public:

    /*! \brief Constructor.
	 */
    SetFeedParamsRequest();
    SetFeedParamsRequest(std::string jsonString);


    /*! \brief Destructor.
	 */
    virtual ~SetFeedParamsRequest();


    /*! \brief Retrieve a bourne JSON representation of this class.
	 */
    bourne::json toJson();


    /*! \brief Fills in members of this class from bourne JSON object representing it.
	 */
    void fromJson(std::string jsonObj);

	/*! \brief Get Параметры прайс-листа.  Обязательный параметр. 
	 */
	std::list<FeedParameterDTO> getParameters();

	/*! \brief Set Параметры прайс-листа.  Обязательный параметр. 
	 */
	void setParameters(std::list <FeedParameterDTO> parameters);


    private:
    std::list<FeedParameterDTO> parameters;
};
}

#endif /* TINY_CPP_CLIENT_SetFeedParamsRequest_H_ */
